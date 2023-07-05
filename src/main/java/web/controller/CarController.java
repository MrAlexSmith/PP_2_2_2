package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarSerice;

/**
 * Класс создан согласно пп. 1, 6 задания к данной задаче:
 *  1. Создайте ещё один контроллер, замаппленый на '/cars'.
 *  6. При запросе '/cars' выводить весь список. При запросе '/cars?count=2' должен отобразиться список из 2 машин,
 *      при '/cars?count=3 -- из трёх, и т. д. При 'count >= 5' выводить весь список машин.
 */
@Controller
public class CarController {
    private CarSerice carSerice;

    @Autowired
    public CarController(CarSerice carSerice) {
        this.carSerice = carSerice;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("messages", carSerice.getCars(count));
        return "cars";
    }
}
