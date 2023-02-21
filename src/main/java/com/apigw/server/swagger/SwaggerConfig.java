package com.apigw.server.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.context.annotation.Configuration;
@Configuration
@OpenAPIDefinition(info = @io.swagger.v3.oas.annotations.info.Info(
        title = "${api-doc.title}",
        version = "${api-doc.version}" ))
public class SwaggerConfig{
}
