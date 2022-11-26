package com.deepthi.practice.SpringflowExample.Service;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


    @Component
    public class ServiceLayer {
        public List<Integer> getData() {
            List<Integer> intList = Arrays.asList(6, 9, 20, 9, 6);
            return intList;
        }
    }
