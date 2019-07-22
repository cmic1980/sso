package sg.ctx.sso.server.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yu.miao
 */
@RestController
public class UserController {
    @GetMapping("index")
    public Object index(Authentication authentication){
        return authentication;
    }
}
