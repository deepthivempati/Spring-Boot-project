package com.mainpackage.modelpackage;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "person-details")
public class PersonDetailsConfiguration {
    private String name;
    private String address;

}
