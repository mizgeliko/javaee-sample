package gd.sample.employee;

import gd.sample.employee.annotation.EmployeeQualifier;
import gd.sample.employee.repository.entities.EmployeeEntity;
import gd.sample.employee.repository.entities.PhoneEntity;
import gd.samples.employee.model.Employee;
import gd.samples.employee.model.Phone;
import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.Type;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Logger;

public class Configuration {

    @Produces
    @EmployeeQualifier
    @PersistenceContext(unitName = "employee-module")
    // @PersistenceContext(unitName = "employee-module", type = EXTENDED)
    private EntityManager manager;

    @Produces
    public Logger produceLog(InjectionPoint injectionPoint) {
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }

    @Produces
    @ApplicationScoped
    public MapperFactory mapperFactory() {
        DefaultMapperFactory.Builder factoryBuilder = new DefaultMapperFactory.Builder();
        return factoryBuilder.build();
    }

    @Produces
    @ApplicationScoped
    public MapperFacade mapperFacade(MapperFactory mapperFactory) {
        mapperFactory.classMap(Employee.class, EmployeeEntity.class).byDefault().register();
        mapperFactory.classMap(Phone.class, PhoneEntity.class).byDefault().register();
        mapperFactory.getConverterFactory().registerConverter(new CustomConverter<Date, LocalDate>() {
            @Override
            public LocalDate convert(Date source, Type<? extends LocalDate> type, MappingContext mappingContext) {
                return Instant.ofEpochMilli(source.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
            }
        });
        mapperFactory.getConverterFactory().registerConverter(new CustomConverter<LocalDate, Date>() {
            @Override
            public Date convert(LocalDate source, Type<? extends Date> type, MappingContext mappingContext) {
                return Date.from(Instant.from(source));
            }
        });
        return mapperFactory.getMapperFacade();
    }


}
