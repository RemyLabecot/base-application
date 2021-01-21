package fr.remy.baseApp.domain.repository;

import fr.remy.baseApp.domain.entity.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> loadAllCustomer();
    Customer findCustomerById(long cust_id);
    String findNameById(long cust_id);
    int getTotalNumberCustomer();
}
