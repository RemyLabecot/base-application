package fr.remy.baseApp.integration_test;

import fr.remy.baseApp.domain.entity.Customer;
import fr.remy.baseApp.infrastructure.database.repository.JdbcTemplateCustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class LoadCustomersTestIT extends AbstractIntegrationTest {

    @Autowired
    JdbcTemplateCustomerRepository jdbcTemplateCustomerRepository;

    @Test
    public void should_load_customers() throws Exception {

        MvcResult result = mockMvc.perform(get("/customer/all"))
                .andReturn();

        assertThat(result).isNotNull();
        String content = result.getResponse().getContentAsString();
        List customers = objectMapper.readValue(content, List.class);

        assertThat(customers)
                .isNotEmpty()
                .hasSize(4);
    }
}
