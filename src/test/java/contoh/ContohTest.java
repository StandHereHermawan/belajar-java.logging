package contoh;

import arief.belajar.java.logging.LevelTest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContohTest {

    private static final Logger log = LoggerFactory.getLogger(ContohTest.class);

    @Test
    void testLog() {
        log.error("error");
        log.info("Contoh info");
    }
}
