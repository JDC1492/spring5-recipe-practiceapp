package cohen.recipe.practiceapp.demospring5recipepracticeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//The next line, the @Controller annotation makes this controller a spring bean causing it to get picked up by the spring boot default package scan. 
@Controller
public class IndexController {
    @RequestMapping({"/", "", "/index"})
    public String getIndexPage(){
        return "index";
    }
    
}
