@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello SP pratice! Your application is running";
    }
}