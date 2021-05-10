package com.gw.boot.springboot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static  org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
@WebMvcTest
public class StartControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void hellReturnTest() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

    @Test
    public void helloDtoTest() throws Exception{
        String name = "test";
        int amount = 10000;

        mvc.perform(get("/hello/dto")
                    .param("name",name)
                    .param("amount",String.valueOf(amount))
                    ).andExpect(status().isOk())
                     .andExpect(jsonPath("$.name", is(name)))
                     .andExpect(jsonPath("$.amount", is(amount)));

    }
}
