package gd.sample.employee;

import gd.sample.employee.annotation.EmployeeQualifier;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.logging.Logger;

public class Resources {

    @Produces
    @EmployeeQualifier
    @PersistenceContext(unitName = "employee-module")
    private EntityManager manager;

    @Produces
    public Logger produceLog(InjectionPoint injectionPoint) {
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }

}
