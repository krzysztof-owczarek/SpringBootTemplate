package app.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloEndpoint {

    @GetMapping
    public HelloResponse hello() {
        return HelloResponse.builder().body("Hello!").build();
    }

}
