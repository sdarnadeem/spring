package d.n.hibernate.rest;


import d.n.hibernate.dao.EmployeeDAO;
import dev.nasyxnadeem.hibernate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    // quick and dirty inject tht dao
    private EmployeeDAO employeeDAO;
    @Autowired
    public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    @GetMapping("/")
    public String testing() {
        return "Hello World!";
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    // expose "/employee" and return list of
    // employees
}
