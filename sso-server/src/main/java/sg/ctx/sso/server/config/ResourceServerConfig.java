package sg.ctx.sso.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author yu.miao
 */
@Configuration
@EnableResourceServer
@Order(3)
public class ResourceServerConfig {

}
