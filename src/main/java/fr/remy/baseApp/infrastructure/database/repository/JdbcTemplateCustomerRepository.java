package fr.remy.baseApp.infrastructure.database.repository;

import fr.remy.baseApp.domain.entity.Customer;
import fr.remy.baseApp.domain.repository.CustomerRepository;
import fr.remy.baseApp.infrastructure.database.mapping.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class JdbcTemplateCustomerRepository implements CustomerRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Customer> loadAllCustomer() {
        String SQL_GET_ALL = "select * from customer";
        return jdbcTemplate.query(SQL_GET_ALL, new CustomerMapper());
    }

    @Override
    public Customer findCustomerById(long cust_id) {
        return null;
    }

    @Override
    public String findNameById(long cust_id) {
        return null;
    }

    @Override
    public int getTotalNumberCustomer() {
        return 0;
    }
}
