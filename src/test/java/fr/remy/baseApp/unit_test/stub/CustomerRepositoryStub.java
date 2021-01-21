package fr.remy.baseApp.unit_test.stub;

import fr.remy.baseApp.domain.entity.Customer;
import fr.remy.baseApp.domain.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryStub implements CustomerRepository {

    @Override
    public List<Customer> loadAllCustomer() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "remy", 33));
        customers.add(new Customer(2, "arno", 12));
        customers.add(new Customer(3, "stephane", 44));

        return customers;
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
