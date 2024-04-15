package fidanhykolli.u5d11.controllers;

import fidanhykolli.u5d11.payloads.WorkerLoginDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody WorkerLoginDTO payload) {
        return "token";
    }
}
