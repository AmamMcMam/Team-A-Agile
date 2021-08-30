import com.kainos.ea.resources.JobRolesController;
import com.kainos.ea.resources.Role;
import com.kainos.ea.resources.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class JobRolesControllerTest {
    @Mock
    private RoleService mockService;

    @Test
    public void controllerReturnsSameRolesAsServiceProvides(){
        //arrange
        JobRolesController controller = new JobRolesController(mockService);
        List<Role> roleList = List.of(new Role());
        Mockito.when(mockService.getRoles()).thenReturn(roleList);

        //act
        List<Role> roles = controller.getJobRoles();

        //assert
        assertTrue(roles == roleList);
        Mockito.verify(mockService).getRoles();
    }
}
