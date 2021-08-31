import com.kainos.ea.resources.Band;
import com.kainos.ea.resources.JobSpecification;
import com.kainos.ea.resources.JobSpecificationService;
import com.kainos.ea.resources.JobSpecificationController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class JobSpecificationControllerTest {
    @Mock
    private JobSpecificationService mockService;

    @Test
    public void controllerReturnsSameSpecificationAsServiceProvides(){
        //arrange
        JobSpecificationController controller = new JobSpecificationController(mockService);
        JobSpecification jobSpecificationObj = new JobSpecification();
        int roleID = 1;
        Mockito.when(mockService.getJobSpecification(roleID)).thenReturn(jobSpecificationObj);

        //act
        JobSpecification jobSpecification = controller.getJobSpecification(roleID);

        //assert
        Mockito.verify(mockService).getJobSpecification(roleID);
        assertTrue(jobSpecification == jobSpecificationObj);
    }
}
