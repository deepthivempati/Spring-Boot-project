package com.deepthi.practice.SpringflowExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DependencyFlowController {
    @Autowired
    private BussinessLogic bussinessLogic; // kind of autowiring service class to this class by variable declaration. since DependencyFlowController is the dependent on BussinessLogic.

    public Integer getDataFromBussinessLogic() {
        return bussinessLogic.calulateSum();
    }
    @Component
    public class BussinessLogic {
        @Autowired
        private Service service; // autowiring service class to this class by variable declaration.since BussinessLogic is the dependent on Service.
        public Integer calulateSum() {
            List<Integer> data = service.getData();
            Integer total = data.stream().reduce(Integer::sum).get(); // functional style programming
            return total;
        }
    }
    @Component
    public class Service {
        public List<Integer> getData() {
            List<Integer> intList = Arrays.asList(6, 9, 9, 6);
            return intList;
        }
    }

}
// Separating the classes is the best practice.