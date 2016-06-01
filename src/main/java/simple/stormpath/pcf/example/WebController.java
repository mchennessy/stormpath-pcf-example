package simple.stormpath.pcf.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/")
    String home() {
        return "index";
    }
    
    @RequestMapping("/details")
    String scoreboard() {
        return "details";
    }
}

