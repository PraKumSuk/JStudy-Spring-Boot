package com.spk.rest.demo;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	/*
	 * Method to specify package which contains all services and docs all paths as
	 * any is selected and no specific path is given Note : This creates doc in a
	 * more default way
	 */
	@Bean
	public Docket userApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.spk.rest.demo")).paths(PathSelectors.any()) // any path
				/*.build();*/ //Just with Defaults i.e. without metadata
				.build().apiInfo(metaData()); //Appending metadata
	}

	/**
	 * Adding optional metadata to make the Docs more detailed along with our
	 * customer information about service or app
	 * Note : This appears at the top of Swagger doc as headings
	 * @return
	 */
	private ApiInfo metaData() {
		ApiInfo apiInfo = new ApiInfo("spk-rest-swagger-demo-d2", "SPK RESTful User App showing demo of Swagger2",
				"1.0", "Terms of service", new Contact("Mr SPK", "https://spk.com/", "theboss@spk.com"),
				"Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0");
		return apiInfo;
	}

}
