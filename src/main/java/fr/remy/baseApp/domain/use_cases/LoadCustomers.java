package fr.remy.baseApp.domain.use_cases;

import fr.remy.baseApp.domain.entity.Customer;
import fr.remy.baseApp.domain.repository.CustomerRepository;

import java.util.List;

public class LoadCustomers {

    private final CustomerRepository customerRepository;

    public LoadCustomers(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> loadCustomers() {
        return customerRepository.loadAllCustomer();
    }
}
