/**
 * Created by andrey on 16.10.2015.
 */
import java.util.logging .*;
public class logginging {
    private static void logginging() {
        Logger LoggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
        Logger LoggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
        Logger LoggerC = Logger.getLogger("org.stepic.java");
        LoggerA.setLevel(Level.ALL);
        LoggerB.setLevel(Level.WARNING);
        Handler h = new ConsoleHandler();
        Formatter f = new XMLFormatter();
        h.setLevel(Level.ALL);
        h.setFormatter(f);
        LoggerC.addHandler(h);
    }
}
