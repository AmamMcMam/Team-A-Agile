import com.kainos.ea.controllers.JobRolesController;
import com.kainos.ea.models.Role;
import com.kainos.ea.services.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertSame;

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
        assertSame(roles, roleList);
        Mockito.verify(mockService).getRoles();
    }
}
