package kz.adam.ukhayev.distributor.configuration;

//import kz.adam.ukhayev.distributor.component.aspect.LoggingAspect;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {

//    @Bean
//    public LoggingAspect accessLoggerAspect() {
//        return new LoggingAspect();
//    }
}
