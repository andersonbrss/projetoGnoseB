package com.projeto.gnose.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.projeto.gnose.config.AppConfig;
import com.projeto.gnose.config.WebConfig;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { AppConfig.class };
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebConfig.class };
	}
	
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}
