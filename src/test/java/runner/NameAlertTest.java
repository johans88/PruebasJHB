package runner;

import com.nivelics.commons.utils.Hooks;
import org.testng.annotations.Test;
import pages.NameAlert;

public class NameAlertTest extends Hooks {
    ThreadLocal<NameAlert> login = ThreadLocal.withInitial(NameAlert::new);

    @Test
    public void testAlert(){
        login.get().registerAlert();
    }
}
