package com.tcs.OperationWithDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
/*@EnableDiscoveryClient
@EnableAutoConfiguration
@EntityScan(basePackages="com.tcs.OperationWithDatabase")
@ComponentScan(basePackages="com.tcs.OperationWithDatabase") */
public class OperationWithDatabaseApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(OperationWithDatabaseApplication.class, args);
		//run method of SpringApplication class will return Application context
		// based on classpath given in run method
		
	}

}
