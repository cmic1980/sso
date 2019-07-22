package sg.ctx.sso;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author yu.miao
 */
@EnableOAuth2Sso
@SpringBootApplication
public class SsoApplicationOne {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SsoApplicationOne.class).run(args);
    }
}
