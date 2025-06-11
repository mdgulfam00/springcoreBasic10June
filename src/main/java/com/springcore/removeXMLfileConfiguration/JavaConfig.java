package com.springcore.removeXMLfileConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//If we dont want to use XML file for configuration then we declare a seprate with @Configuration annotation

@Configuration      //to tell compiler that this class is for configuration
@ComponentScan(basePackages = "com.springcore.removeXMLfileConfiguration")  //to give configuration package path
public class JavaConfig {

}
