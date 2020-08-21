package tld.compname.lob.appgroup.appname;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ConfigurationProperties
@ComponentScan("tld.domain.lob.otherappgroup")
public class WebProjectApp extends SpringBootServletInitializer {

	/*
	 * This method is required to run spring-boot app in a servlet container like
	 * JBoss
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(WebProjectApp.class);
	}

	/*
	 * This method is required to run spring-boot app in a container like Docker or
	 * from the command-line
	 */
	public static void main(String[] args) {
		SpringApplication.run(WebProjectApp.class, args);
	}

}
