package sg.ctx.sso.client.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yu.miao
 */
@RestController
public class UserController {

    @GetMapping("user")
    public Authentication user(Authentication authentication) {
        return authentication;
    }
}