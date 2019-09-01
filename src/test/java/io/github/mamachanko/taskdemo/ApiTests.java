package io.github.mamachanko.taskdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
public class ApiTests {

    @Test
    public void shouldReturn200Ok() throws Exception {
        MockMvcBuilders
                .standaloneSetup(new Api())
                .build()
                .perform(get("/api"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("hello").value("there"));
    }
}