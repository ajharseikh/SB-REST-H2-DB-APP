package in.hero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

// @OpenAPIDefinition(servers = {@Server(url = "${server.servlet.context-path}", description = "Default Server URL")})

//@OpenAPIDefinition(
//	    servers = arrayOf(Server(url = "/"))
//	)
// @OpenAPIDefinition(servers = {@Server(url = "/", description = "https://sb-rest-h2-db-app-production.up.railway.app")})

@OpenAPIDefinition(servers = {
		@Server(url = "https://sb-rest-h2-db-app-production.up.railway.app", description = "Production Server") })

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
