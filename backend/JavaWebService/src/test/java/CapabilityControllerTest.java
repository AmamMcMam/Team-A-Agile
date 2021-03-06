import com.kainos.ea.controllers.CapabilitiesController;
import com.kainos.ea.services.CapabilitiesService;
import com.kainos.ea.models.Capability;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertSame;

@RunWith(MockitoJUnitRunner.class)
public class CapabilityControllerTest {
    @Mock
    private CapabilitiesService mockService;

    @Test
    public void controllerReturnsSameCapabilityAsServiceProvides(){
        //arrange
        CapabilitiesController controller = new CapabilitiesController(mockService);
        List<Capability> capList = List.of(new Capability());
        Mockito.when(mockService.getCapabilities()).thenReturn(capList);

        //act
        List<Capability> caps = controller.getCapabilities();

        //assert
        assertSame(caps, capList);
        Mockito.verify(mockService).getCapabilities();
    }

    @Test
    public void controllerReturnsCapabilityLeadInformationPerCapability(){
        //arrange
        CapabilitiesController controller = new CapabilitiesController(mockService);
        Capability capability = new Capability();
        Mockito.when(mockService.getLeadPerCapability(1)).thenReturn(capability);

        //act
        Capability caps = controller.getLeadPerCapability(1);

        //assert
        assertSame(caps, capability);
        Mockito.verify(mockService).getLeadPerCapability(1);
    }
}
