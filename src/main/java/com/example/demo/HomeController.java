import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";  // Return the name of the HTML file (no need to include .html)
    }
}

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome To Sen DevOps");
        return "home";
    }
}
