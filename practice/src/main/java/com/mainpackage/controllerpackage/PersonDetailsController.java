package com.mainpackage.controllerpackage;

import com.mainpackage.modelpackage.PersonDetailsConfiguration;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@AllArgsConstructor
@Configuration
public class PersonDetailsController {
    private PersonDetailsConfiguration configuration;
    /*@Value("${learn.daily-hour}")
    private String dailyHour;*/
    @GetMapping("/person-info")
    public PersonDetailsConfiguration getDetails(){
       // System.out.println(dailyHour);
        return configuration;
    }
}
