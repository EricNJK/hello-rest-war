package com.tutorialspoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HelloRestWarApplication extends SpringBootServletInitializer implements ApplicationRunner {

    @Value("${myspace.property}")
    String myProperty;

    public static void main(String[] args) {
        SpringApplication.run(HelloRestWarApplication.class, args);

        // logging: slf4j
        Logger LOG = LoggerFactory.getLogger(HelloRestWarApplication.class);
        LOG.info("this is an info log");
        LOG.warn("this is a warn level log");
        LOG.error("this is definitely an error");
        
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(HelloRestWarApplication.class);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Hello from spring web application"
                + "\nAlso the value is: " + myProperty);
    }
}
