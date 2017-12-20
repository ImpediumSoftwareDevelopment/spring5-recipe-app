package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Syrius on 12/19/2017.
 */
@Controller
public class IndexController {
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        System.out.println("Some message to say...1234333 4444555");
        return "index";
    }
}
