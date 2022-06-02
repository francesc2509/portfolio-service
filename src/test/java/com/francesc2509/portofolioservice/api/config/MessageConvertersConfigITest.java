package com.francesc2509.portofolioservice.api.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MessageConvertersConfigITest {

    @Autowired
    List<HttpMessageConverter<?>> converters;

    @Autowired
    MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter;

    @Autowired
    private MessageConvertersConfig testObj;

    @Test
    public void configureMessageConverters_ok() {
        testObj.configureMessageConverters(converters);

        assertThat(converters)
                .hasSize(1)
                .contains(mappingJackson2HttpMessageConverter);
    }
}
