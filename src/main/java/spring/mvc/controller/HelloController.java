package spring.mvc.controller;

/**
 * Created by Денис on 28.02.2015.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spring.mvc.domain.User;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
     public String printWelcome(ModelMap model) {

        model.addAttribute("message", "Spring 3 MVC - Hello World");
        User user = new User(1, "Denis");
        model.put("user",user);
        return "hello";

    }
    @RequestMapping(value = "/bye",method = RequestMethod.GET)
    public String printBye(ModelMap model) {

        model.addAttribute("message", "Spring 3 MVC - Have a nice day !!!");
        return "bye";

    }
}