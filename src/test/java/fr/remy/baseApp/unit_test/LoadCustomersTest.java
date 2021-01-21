package fr.remy.baseApp.unit_test;

import fr.remy.baseApp.domain.entity.Customer;
import fr.remy.baseApp.domain.use_cases.LoadCustomers;
import fr.remy.baseApp.unit_test.stub.CustomerRepositoryStub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LoadCustomersTest {

    private LoadCustomers loadCustomers;

    @BeforeEach
    void setUp() {
        CustomerRepositoryStub customerRepositoryStub = new CustomerRepositoryStub();
        loadCustomers = new LoadCustomers(customerRepositoryStub);
    }

    @Test
    void should_return_all_customers() {

        List<Customer> customers = loadCustomers.loadCustomers();
        assertThat(customers).hasSize(3);
    }
}
