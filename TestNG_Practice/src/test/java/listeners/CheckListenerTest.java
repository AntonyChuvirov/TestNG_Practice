package listeners;

import listeners.listener.MyListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class CheckListenerTest {

    @Test
    public void listenerTest() {
        System.out.println("Running Test: listenerTest");
    }
}
