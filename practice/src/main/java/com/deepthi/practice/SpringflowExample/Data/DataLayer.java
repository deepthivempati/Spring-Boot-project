package com.deepthi.practice.SpringflowExample.Data;

import com.deepthi.practice.SpringflowExample.Service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

    @Component
    public class DataLayer {
        @Autowired
        private ServiceLayer serviceLayer; // autowiring service class to this class by variable declaration.since BussinessLogic is the dependent on Service.
        public Integer calulateSum() {
            List<Integer> data = serviceLayer.getData();
            Integer total = data.stream().reduce(Integer::sum).get(); // functional style programming
            return total;
        }
    }