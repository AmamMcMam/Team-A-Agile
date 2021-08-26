import com.kainos.ea.db.TestMapper;
import com.kainos.ea.resources.Roles;
import com.kainos.ea.resources.WebService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
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
    @Test
    public void localRoleIsCreated(){
        Roles role = new Roles(1,"test", "PlaceHolder", "2021-07-13",
                "Full Time", "Birmingham", 1, 1);
        assertEquals(role.getRoleID(),1);
        assertEquals(role.getRoleDesc(),"PlaceHolder");
        assertEquals(role.getRoleName(),"test");
        assertEquals(role.getDatePosted(),"2021-07-13");
        assertEquals(role.getHours(),"Full Time");
        assertEquals(role.getLocation(),"Birmingham");
        assertEquals(role.getBandID(),1);
        assertEquals(role.getCapabilityID(),1);
    }



}
