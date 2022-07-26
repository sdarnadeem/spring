package d.n.hibernate.dao;

import dev.nasyxnadeem.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

    // define field for entity manager
    private EntityManager entityManager;

    // set up constructor injection
    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {

        /// get the current hibernate session

        Session currentSession =
                entityManager.unwrap(Session.class);


        // create a query
        Query<Employee> theQuery =
                currentSession.createQuery(
                        "from Employee",
                        Employee.class);

        // execute query and get result list

        List<Employee> employees =
                theQuery.getResultList();

        // return the results
        return employees;
    }

    @Override
    public Employee findById(int theId) {

        // get the current hibernate session
        Session currentSession =
                entityManager.unwrap(Session.class);

        // get the employee
        Employee theEmployee =
                currentSession.get(Employee.class, theId);


        return theEmployee;
    }

    @Override
    public void save(Employee theEmployee) {
        Session currentSession =
                entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        Session currentSession =
                entityManager.unwrap(Session.class);

        Query theQuery = currentSession.createQuery(
                "delete from Employee where " +
                        "id=:employeeId"
        );
        theQuery.setParameter(
                "employeeId", theId);
        theQuery.executeUpdate();

    }
}
