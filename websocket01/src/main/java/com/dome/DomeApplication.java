package com.dome;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;



@SpringBootApplication
@EnableWebSocketMessageBroker  //启动websocket服务
public class DomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DomeApplication.class,args);
    }


}