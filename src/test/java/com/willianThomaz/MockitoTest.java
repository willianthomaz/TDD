package com.willianThomaz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
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
