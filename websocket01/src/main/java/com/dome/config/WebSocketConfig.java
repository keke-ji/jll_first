package com.dome.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    // 添加这个Endpoint，这样在网页中就可以通过websocket连接上服务,也就是我们配置websocket的服务地址,
    // 并且可以指定是否使用socketjs
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry){
        //表示添加了一个 /ws 端点，客户端可以通过这个端点来进行连接
        registry.addEndpoint("/ws")
                // 允许不同源访问
                .setAllowedOriginPatterns("*")
                // 有的浏览器不支持websocket，使用sockjs作为备选项
                .withSockJS();
    }
}
