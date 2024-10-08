package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceAndDaoTogetherImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    ServiceAndDaoTogetherImp serviceAndDaoTogether;

    @Autowired
    public CarController(ServiceAndDaoTogetherImp serviceAndDaoTogether) {
        this.serviceAndDaoTogether = serviceAndDaoTogether;
    }

    @GetMapping(value = "/car")
    public String printWelcome(ModelMap model, @RequestParam(name = "quantity", required = false) String name) {


        Integer cars = Integer.valueOf(name);
        List<String> list = serviceAndDaoTogether.getListCars1();
        List<String> listSend = serviceAndDaoTogether.checkQuantity(cars, list);


        model.addAttribute("list", listSend);
        return "car";
    }
}
