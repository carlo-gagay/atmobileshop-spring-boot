package com.atmobileshop.atmobileshoppsql.filters;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilterChain;

import reactor.core.publisher.Mono;

@Configuration
@Component
public class ResponseHeaderFilter implements org.springframework.web.server.WebFilter {
    
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        exchange.getResponse()
        .getHeaders()
        .add("Access-Control-Allow-Origin", "/*");
        return chain.filter(exchange);
    }

}
