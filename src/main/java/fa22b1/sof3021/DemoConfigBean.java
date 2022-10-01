package fa22b1.sof3021;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import fa22b1.sof3021.beans.Register;

@Configuration
public class DemoConfigBean {
	@Bean("dungna30")
	// C1: @Primary
	public Register getRegisterBean1()
	{
		Register r = new Register();
		r.setHoTen("Dũng NA 30");
		return r;
	}
	
	@Bean("tiennh21")
	public Register getRegisterBean2()
	{
		Register r = new Register();
		r.setHoTen("Tiến NH 21");
		return r;
	}
}
