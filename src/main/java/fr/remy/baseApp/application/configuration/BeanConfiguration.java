package fr.remy.baseApp.application.configuration;

import fr.remy.baseApp.domain.use_cases.LoadCustomers;
import fr.remy.baseApp.infrastructure.database.repository.JdbcTemplateCustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    LoadCustomers loadCustomers(JdbcTemplateCustomerRepository jdbcTemplateCustomerRepository) {
        return new LoadCustomers(jdbcTemplateCustomerRepository);
    }
}
