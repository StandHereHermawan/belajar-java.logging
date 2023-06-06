package arief.belajar.java.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LevelTest {

    private static final Logger log = LoggerFactory.getLogger(LevelTest.class);

    @Test
    void testLevel() {

        log.trace("Trace level");
        log.debug("Debug level");
        log.info("Info Level");
        log.warn("Warn level");
        log.error("Error level");

    }
}
