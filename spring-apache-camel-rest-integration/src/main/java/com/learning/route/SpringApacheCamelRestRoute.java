package com.learning.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SpringApacheCamelRestRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("direct:commonCamelRoute")
                .log("Received message: ${body}");
    }
}
