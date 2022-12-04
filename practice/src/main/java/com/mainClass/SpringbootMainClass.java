package com.mainClass;
import com.mainClass.modelClasses.PersonDetailsConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(PersonDetailsConfiguration.class)
public class SpringbootMainClass {
    public static void main(String[] args) {
       SpringApplication.run(SpringbootMainClass.class, args);
    }
}
