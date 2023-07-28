package pro.sky.hwexceptions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping
    public String hello() {
        return "Hello!";
    }

    User user1 = new User("Ivanov", "Qwert12", "Qwert12");
    User user2 = new User("Sidorov", "123_qw", "123_qw");




}
