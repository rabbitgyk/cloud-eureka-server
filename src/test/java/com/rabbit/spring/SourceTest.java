package com.rabbit.spring;

import org.junit.Test;

import com.netflix.eureka.DefaultEurekaServerConfig;

public class SourceTest {
	
	@Test
	public void test1(){
		DefaultEurekaServerConfig config = new DefaultEurekaServerConfig();
		System.out.println(config.shouldEnableSelfPreservation());
	}

}
