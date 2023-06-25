package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private final CarServiceImpl csi;

    @Autowired
    public CarController(CarServiceImpl csi) {
        this.csi = csi;
    }

    @GetMapping(value = "/cars")
    public String getCarList(@RequestParam(value = "count", required = false) String count, ModelMap model) {
        model.addAttribute("count", count);
        if (count != null) {
            model.addAttribute("cars", csi.getCarList(Integer.parseInt(count)));
        } else {
            model.addAttribute("cars", csi.getCarList());
        }
        return "cars";
    }
}
