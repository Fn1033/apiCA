package com.ca.apiCA;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		servers = {@Server(url = "/", description = "Default Server URL")},
		info = @Info(title = "apiCA", version = "1", description = "API desenvolvida para o Cento Acadêmico do campus VII da UEPB."))
public class ApiCaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCaApplication.class, args);
	}

}
