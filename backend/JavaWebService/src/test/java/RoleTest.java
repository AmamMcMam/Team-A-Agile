import com.fasterxml.jackson.databind.ObjectMapper;
import com.kainos.ea.resources.Band;
import io.dropwizard.jackson.Jackson;
import static io.dropwizard.testing.FixtureHelpers.fixture;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class RoleTest {
    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();

    @Test
    public void getJobRoleFromJsonSuccess() throws Exception {
        final Band band = new Band(1, "Apprentice", "Understands own strengths and areas of development. Self-aware of own wellbeingand seeks support where appropriate.");
        assertThat(MAPPER.readValue(fixture("fixtures/Band.json"), Band.class));
    }
}
