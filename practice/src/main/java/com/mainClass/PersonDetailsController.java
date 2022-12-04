package com.mainClass;

import com.deepthi.practice.PersonDetailsConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PersonDetailsController {
    private PersonDetailsConfiguration configuration;

    @RequestMapping("/person-info")
    public PersonDetailsConfiguration getDetails(){
        return configuration;

    }
}
