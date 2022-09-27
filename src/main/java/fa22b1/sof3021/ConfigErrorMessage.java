package fa22b1.sof3021;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class ConfigErrorMessage {
	public MessageSource getMessageSource()
	{
		ReloadableResourceBundleMessageSource
			rrbm = new ReloadableResourceBundleMessageSource();
		rrbm.setBasename("classpath:messages/register");
		rrbm.setDefaultEncoding("utf-8");
		return rrbm;
	}
}
