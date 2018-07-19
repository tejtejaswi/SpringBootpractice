	package com.teju.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "designationToSalary")
public class ApplicationConnectivityConfig {
	private String PROGRAMMER;
	private String BA;
	private String HR;

}
