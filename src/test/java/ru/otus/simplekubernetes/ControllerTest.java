package ru.otus.simplekubernetes;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(Controller.class)
class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetHealth() throws Exception {
        String responseBody = this.mockMvc.perform(MockMvcRequestBuilders.get("/health"))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();

        ObjectMapper reader = new ObjectMapper();
        Health health = reader.readValue(responseBody, Health.class);

        assertThat(health).isEqualTo(new Health());
    }
}
