import com.kainos.ea.resources.Roles;
import com.kainos.ea.resources.WebService;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;
import static junit.framework.TestCase.*;


public class CapabilityTest {
    @Test
    public void testEngineeringCapability(){
        WebService webService = new WebService();
        List<Roles> roles = webService.getRolesForCapability(2);
        String test = roles.get(0).getRoleName();
        assertEquals(test,"Market Intelligence Analyst");
    }

}
