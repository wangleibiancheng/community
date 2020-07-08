package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//controller负责处理浏览器的访问，HTTP请求由控制器处理，可以通过@Controller注释轻松识别控制器
@Controller
public class HelloController {
    //所述@GetMapping注释可以确保HTTP GET请求到/greeting被映射到greeting()方法。
    @GetMapping("/hello")
    //@RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method.
    public String hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name",name);
        //hello是一个页面，他是model类。
        //Thymeleaf parses the greeting.html template and evaluates the th:
        // text expression to render the value of the ${name} parameter that was set in the controller.
        return "hello";
    }
}
