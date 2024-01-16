package br.com.dontstarve.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Don't Starve Together API")
                        .version("v1")
                        .description("This API provides game information related to Don't Starve Together")
                        .license(new License()
                                .name("MIT")
                                .url("https://www.mit.edu/~amini/LICENSE.md"))
                );
    }

}
