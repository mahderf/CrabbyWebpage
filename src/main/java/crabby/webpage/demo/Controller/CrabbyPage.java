package crabby.webpage.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrabbyPage {

    @GetMapping("/")

    public String homeCrabby(Model model)
    {
        String  msg= "Wellcome to Crabby Page";
        model.addAttribute("message", msg);
        return "home";
    }
}
