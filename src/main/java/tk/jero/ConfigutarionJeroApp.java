package tk.jero;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@PropertySources({
	@PropertySource("classpath:/Properties/JeroApp.properties")
})
public class ConfigutarionJeroApp {

}
