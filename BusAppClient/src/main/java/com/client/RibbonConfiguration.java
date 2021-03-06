package com.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;

@Configuration
public class RibbonConfiguration {

	@Bean
	public IRule ribbonRule() {
	    return new BestAvailableRule();
	}
	
	
	@Bean
	public IPing ribbonPing() {
	    return new PingUrl();
	}
	
}
