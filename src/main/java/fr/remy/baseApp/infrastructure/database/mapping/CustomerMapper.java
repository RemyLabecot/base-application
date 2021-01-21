package fr.remy.baseApp.infrastructure.database.mapping;

import fr.remy.baseApp.domain.entity.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements RowMapper<Customer> {


    public Customer mapRow(ResultSet resultSet, int i) throws SQLException {

        return new Customer(resultSet.getLong("cust_id"), resultSet.getString("name"), resultSet.getInt("age"));
    }
}