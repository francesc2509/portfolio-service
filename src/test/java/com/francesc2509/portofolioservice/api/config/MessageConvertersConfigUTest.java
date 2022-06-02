package com.francesc2509.portofolioservice.api.config;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class MessageConvertersConfigUTest {

    @Mock
    private MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter;

    @InjectMocks
    private MessageConvertersConfig testObj;

    @Mock
    private HttpMessageConverter<?> converter;
    @Mock
    private HttpMessageConverter<?> converter2;

    @Test
    public void configureMessageConverters_ok() {
        List<HttpMessageConverter<?>> converters = Stream.of(converter, converter2).collect(Collectors.toList());

        testObj.configureMessageConverters(converters);

        assertThat(converters)
                .hasSize(1)
                .contains(mappingJackson2HttpMessageConverter);
    }
}
