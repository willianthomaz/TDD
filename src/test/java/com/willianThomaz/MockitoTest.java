package com.willianThomaz;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {

    @Mock
    List<String> list;

    @Test
    public void primeiroTestMockito(){
//        Mockito.when(list.size()).thenReturn(2);

//       int size = 0;
//       if (1 == 1){
//           size = list.size();
//           size = list.size();
//       }
        list.size();
        list.add("");

        InOrder inOrder = Mockito.inOrder(list);
        inOrder.verify(list).size();
        inOrder.verify(list).add("");


//        Mockito.verify(list).size();
//        Mockito.verify(list, Mockito.times(1)).size();
//        Assertions.assertThat(size).isEqualTo(2);

    }
}
