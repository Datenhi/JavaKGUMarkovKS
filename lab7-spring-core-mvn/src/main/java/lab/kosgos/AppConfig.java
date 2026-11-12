package lab.kosgos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

	@Bean
	public HelloWorldService helloWorldService() {

			HelloWorldService service = new HelloWorldService();
			service.setMessage("Hello World");
			return service;
	
	}

}