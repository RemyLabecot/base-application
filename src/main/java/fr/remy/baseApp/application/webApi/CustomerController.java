package fr.remy.baseApp.application.webApi;

import fr.remy.baseApp.domain.entity.Customer;
import fr.remy.baseApp.domain.use_cases.LoadCustomers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final LoadCustomers loadCustomers;

    public CustomerController(LoadCustomers loadCustomers) {
        this.loadCustomers = loadCustomers;
    }

    @GetMapping(value = "/all", produces = "application/json")
    List<Customer> loadCustomers() {
        return loadCustomers.loadCustomers();
    }
}
