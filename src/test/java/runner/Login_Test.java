package runner;

import com.nivelics.commons.utils.Hooks;
import org.testng.annotations.Test;
import pages.Login;

public class Login_Test extends Hooks {
    ThreadLocal<Login> login = ThreadLocal.withInitial(Login::new);

    @Test
    public void testRegister(){
        login.get().register();
    }

}
