
import com.kainos.ea.controllers.BandsController;
import com.kainos.ea.models.Band;
import com.kainos.ea.models.CompetencyElement;
import com.kainos.ea.services.BandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
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
    @Test
    public void controllerReturnsCompetencyElementList(){
        //arrange
        BandsController controller = new BandsController(mockService);
        List<CompetencyElement> competencyElementList = Arrays.asList(new CompetencyElement());
        int bandID = 1;
        Mockito.when(mockService.getCompetencyPerBand(bandID)).thenReturn(competencyElementList);

        //act
        List<CompetencyElement> elements = controller.getCompetencyPerBand(bandID);

        //assert
        Mockito.verify(mockService).getCompetencyPerBand(bandID);
        assertSame(competencyElementList, elements);
    }
}
