package pl.edu.atena.cd1.produces;

import java.util.logging.Logger;

import javax.enterprise.inject.Produces;

public class LoggerProduces {
	
	@Produces
	public Logger produce() {
		return Logger.getLogger("CDI1");
	}

}
