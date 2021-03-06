package com.easy.config;
import com.easy.context.Platform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description: Description
 * @Author: jp
 * @CreateDate: 2018/8/31 16:32
 * @Version: 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Autowired
    private Platform platform;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {

        System.out.println("platform:");
        System.out.println(platform);

        return new ApiInfoBuilder()
                .title(platform.getName())
                .description(platform.getDescription())
                .termsOfServiceUrl(platform.getAddress())
                .contact(new Contact("com/easy","www.soeasydo.cn","465567773@qq.com"))
                .version(platform.getVersion())
                .build();
    }

}

