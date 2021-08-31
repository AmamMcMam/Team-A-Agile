import com.kainos.ea.resources.Band;
import com.kainos.ea.resources.BandService;
import com.kainos.ea.resources.BandsController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertSame;

@RunWith(MockitoJUnitRunner.class)
public class BandsControllerTest {
    @Mock
    private BandService mockService;

    @Test
    public void controllerReturnsSameBandAsServiceProvides(){
        //arrange
        BandsController controller = new BandsController(mockService);
        Band bandObj = new Band();
        int bandID = 1;
        Mockito.when(mockService.getBand(bandID)).thenReturn(bandObj);

        //act
        Band band = controller.getBand(bandID);

        //assert
        Mockito.verify(mockService).getBand(bandID);
        assertSame(band, bandObj);
    }
}
