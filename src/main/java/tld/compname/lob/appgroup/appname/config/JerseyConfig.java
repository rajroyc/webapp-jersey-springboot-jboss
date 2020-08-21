package tld.compname.lob.appgroup.appname.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import tld.compname.lob.appgroup.appname.resource.AuthResource;
import tld.compname.lob.appgroup.appname.resource.BillingResource;
import tld.compname.lob.appgroup.appname.resource.ProductInfoResource;

@Configuration
@ComponentScan({
	"tld.domain.lob.appgroup.app1",
	"tld.domain.lob.appgroup.app2",
	"tld.domain.lob.appgroup.app3.config"
})
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		super();
		register(AuthResource.class);
		register(BillingResource.class);
		register(ProductInfoResource.class);
		property(ServletProperties.FILTER_FORWARD_ON_404, true);
	}
	
}
