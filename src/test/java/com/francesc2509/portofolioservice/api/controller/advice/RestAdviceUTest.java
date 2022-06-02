package com.francesc2509.portofolioservice.api.controller.advice;

import com.francesc2509.portofolioservice.model.GenericResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServletServerHttpResponse;

import javax.servlet.http.HttpServletResponse;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class RestAdviceUTest {

    @Mock
    private StringHttpMessageConverter converter;
    @Mock
    private MethodParameter methodParameter;

    private final RestAdvice testObj = new RestAdvice();

    @Test
    public void supports_ok() {
        boolean actual = testObj.supports(methodParameter, converter.getClass());

        assertThat(actual).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {503, 502, 500, 422, 418, 409, 405, 404, 403, 401, 400, 204, 201, 200})
    public void supports_ok(int statusCode) {

        Object body = mock(Object.class);
        MediaType selectedContentType = mock(MediaType.class);
        ServerHttpRequest request = mock(ServerHttpRequest.class);
        ServletServerHttpResponse response = mock(ServletServerHttpResponse.class);
        HttpServletResponse servletResponse = mock(HttpServletResponse.class);

        when(servletResponse.getStatus()).thenReturn(statusCode);
        when(response.getServletResponse()).thenReturn(servletResponse);

        GenericResponse expected = new GenericResponse(!HttpStatus.resolve(statusCode).isError(), body);

        GenericResponse actual = testObj.beforeBodyWrite(body, methodParameter, selectedContentType,
                converter.getClass(), request, response);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void supports_invalidStatusCode_throwNullPointerException() {

        Object body = mock(Object.class);
        MediaType selectedContentType = mock(MediaType.class);
        ServerHttpRequest request = mock(ServerHttpRequest.class);
        ServletServerHttpResponse response = mock(ServletServerHttpResponse.class);
        HttpServletResponse servletResponse = mock(HttpServletResponse.class);

        when(servletResponse.getStatus()).thenReturn(1);
        when(response.getServletResponse()).thenReturn(servletResponse);

        assertThatThrownBy(() -> testObj.beforeBodyWrite(body, methodParameter, selectedContentType,
                converter.getClass(), request, response)).isExactlyInstanceOf(NullPointerException.class);
    }
}
