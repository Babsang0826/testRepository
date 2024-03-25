package dev.babsang.testjenkins;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

        @GetMapping("/test")
        public String test(){
                int a = 0;
                return "박상우";
        }
}
