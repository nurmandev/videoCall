package com.video.apis;

import com.video.apis.USER.User;
import com.video.apis.USER.UserService;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Video Call Application APIs",
				description = "Bankend Rest APIs for Video Call application",
				version = "v1.0",
				contact = @Contact(
						name = "MUSTAPHA NURUDEEN",
						email = "adebayour66265@gmail.com",
						url = "https://github.com/Adebayour66265/videoCall"
				),
				license = @License(
						name = "Video Call Application",
						url = "https://github.com/Adebayour66265/videoCall"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Video Call Application Backend APIs documentation",
				url = "https://github.com/Adebayour66265/videoCall"
		)
)
public class ApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApisApplication.class, args);
		System.out.println("Video Call Application connected");
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserService service){
		return args -> {
			service.register(User.builder()
					.userName("Nurudeen")
					.email("Adebayour@gmail.com")
					.password("1234")
					.build());

			service.register(User.builder()
					.userName("Adebayour")
					.email("Ade@gmail.com")
					.password("12345")
					.build());

			service.register(User.builder()
					.userName("Ayinla")
					.email("nman@gmail.com")
					.password("12345")
					.build());
		};
	}
}
