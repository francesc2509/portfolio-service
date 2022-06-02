package com.francesc2509.portofolioservice;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.stream.IntStream;

import static org.mockito.Mockito.mock;

public class TestUtils {

    public static <T> List<T> createMockList(Class<T> clazz, int quantity) {
        ImmutableList.Builder<T> builder = ImmutableList.builder();

        IntStream.range(0, quantity).forEach(i -> builder.add(mock(clazz)));

        return builder.build();
    }
}
