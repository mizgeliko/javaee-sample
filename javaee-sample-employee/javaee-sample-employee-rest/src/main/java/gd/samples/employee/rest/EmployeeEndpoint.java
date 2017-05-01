package gd.samples.employee.rest;

import gd.sample.employee.service.EmployeeService;
import gd.samples.employee.model.Employee;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/emp")
@RequestScoped
public class EmployeeEndpoint {

    @Inject
    private EmployeeService employeeService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GET
    @Path("/{employeeId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee findById(@PathParam("employeeId") Long employeeId) {
        return employeeService.findEmployeeById(employeeId);
    }

}
