package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@SpringBootApplication
public class Demo05WebContainerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo05WebContainerApplication.class, args);
    }
    @Bean
    public RouterFunction<ServerResponse> hell(){
        return route(GET("/helle"),
                serverRequest -> ok().body(Mono.just("Hello world"),String.class));
    }

}
