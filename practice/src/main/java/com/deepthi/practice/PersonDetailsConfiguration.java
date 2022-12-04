package com.deepthi.practice;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Configuration
@ConfigurationProperties(prefix = "person-details")
public class PersonDetailsConfiguration {
    private String name;
    private String address;

}
