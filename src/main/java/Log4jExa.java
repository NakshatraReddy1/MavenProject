//import java.util.logging.Logger;

//import org.apache.logging.log4j.core.Logger;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Log4jExa {
	WebDriver driver;
	Logger log=Logger.getLogger(Log4jExa.class);
@Test
public void setu() throws InterruptedException {
	
	DOMConfigurator.configure("C:\\Users\\HP\\eclipse-workspace\\MavenProject\\src\\main\\source\\lo4j2.xml");
	log.debug("set up gecho");
	log.info("open browser");
	log.debug("set up gecho");
	log.info("open browser");
	log.debug("set up gecho");
	log.error("error browser");
	log.debug("set up gecho");
	log.info("open browser");
	log.debug("set up gecho");
	log.warn("ward browser");
	log.fatal("fatal up gecho");
	log.info("open browser");
	log.error("ghjjhjhjh");
	
	
}
}
	

