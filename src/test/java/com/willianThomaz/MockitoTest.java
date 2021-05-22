package com.willianThomaz;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class MockitoTest {

    @Test
    public void primeiroTestMockito(){
        List<String> list = Mockito.mock(ArrayList.class);

        Mockito.when(list.size()).thenReturn(20);

        int size = list.size();

        Assertions.assertThat(size).isEqualTo(20);

    }
}
