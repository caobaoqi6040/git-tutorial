package backend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GitTutorialApplicationTests {

    @LocalServerPort
    private Integer port;

    @Test
    void contextLoads() {
        Assertions.assertNotNull(port);
    }

}
