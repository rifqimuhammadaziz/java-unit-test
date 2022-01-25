package rifqimuhammadaziz.test.mock;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class MockTest {

    @Test
    void testMock() {
        List<String> list = Mockito.mock(List.class); // create mock object (object tiruan)
        Mockito.when(list.get(0)).thenReturn("Xenosty");
        Mockito.when(list.get(100)).thenReturn("Rifqi");
        System.out.println(list.get(0));
        System.out.println(list.get(0));
        System.out.println(list.get(100));

        // verify that object list (index 0) executed 1 times
        Mockito.verify(list, Mockito.times(1)).get(0);
    }
}
