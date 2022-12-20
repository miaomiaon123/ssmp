package com.miao.ssmp;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class SsmpApplicationTests {
    @Test
  public void testWeb(@Autowired MockMvc mvc) throws Exception {
      MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/empRR");
      ResultActions perform = mvc.perform(builder);
        System.out.println(perform);
  }

}
