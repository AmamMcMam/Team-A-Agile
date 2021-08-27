import com.kainos.ea.resources.Roles;
import com.kainos.ea.resources.WebService;

import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import static junit.framework.TestCase.*;

public class US001UnitTests {
    //do more unit tests in USCASE 12 for less flakey tests
    @Test
    public void rolesArePresent(){
        WebService webService = new WebService();
        List<Roles> roles = webService.getJobRoles();
        Roles role = roles.get(0);
        assertEquals(role.getRoleID(),1);
    }

}
