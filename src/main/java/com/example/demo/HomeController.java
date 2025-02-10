@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";  // Return the name of the HTML file (no need to include .html)
    }
}
