package com.tts.TechTalentTwitter.configuration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;

@SpringBootApplication

@Configuration
public class ThymeleafConfiguration {
	@Bean
	public SpringSecurityDialect springSecurityDialaect () {
		return new SpringSecurityDialect();
	}

}
