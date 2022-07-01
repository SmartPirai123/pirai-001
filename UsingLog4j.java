package Log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class UsingLog4j {
	static Logger log= Logger.getLogger(UsingLog4j.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("pirai");
		log.warn("siva");
		log.error("adhisha");
		log.fatal("raj");
		log.debug("rahul");
	}

}
