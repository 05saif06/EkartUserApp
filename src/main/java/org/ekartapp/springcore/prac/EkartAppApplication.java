package org.ekartapp.springcore.prac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableWebMvc
public class EkartAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EkartAppApplication.class, args);
	}

	
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("org.ekartapp.springcore.prac.controller")).build();                                           
    }
 
 @Bean
 public InternalResourceViewResolver defaultViewResolver() {
 return new InternalResourceViewResolver();
 }
}
