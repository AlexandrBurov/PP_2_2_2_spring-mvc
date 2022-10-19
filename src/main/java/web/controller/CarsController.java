package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
@RequestMapping("/cars")
public class CarsController {
//============================================
    private final CarDao carDao;

    public CarsController(CarDao carDao) {
        this.carDao = carDao;
    }
//============================================

    @GetMapping
    public String showLimitCars(@RequestParam(defaultValue = "5")int count, Model model){

        model.addAttribute("cars", carDao.showLimitCar(count));

        return "cars";

    }


}
