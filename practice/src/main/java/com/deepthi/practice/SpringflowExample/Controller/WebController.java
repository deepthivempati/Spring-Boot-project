package com.deepthi.practice.SpringflowExample.Controller;

import com.deepthi.practice.SpringflowExample.Data.DataLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebController {
    @Autowired
    private DataLayer dataLayer; // kind of autowiring service class to this class by variable declaration. since DependencyFlowController is the dependent on BussinessLogic.

    public Integer getDataFromBussinessLogic() {
        return dataLayer.calulateSum();
    }
}