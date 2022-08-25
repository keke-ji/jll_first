package com.dome.config;


import com.dome.log.ReaderFileLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.websocket.server.ServerEndpoint;
import java.util.List;

@Component
@ServerEndpoint("/websocket")
public class WebsocketServer {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

//    @PostConstruct
    public void sendLog() {
        new Thread(() -> {
            List<String> fileContent = ReaderFileLine.getFileContent("log01.txt");
            for (String content : fileContent) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                messagingTemplate.convertAndSend("/topic/pullLogger", content);
//                System.out.println(content + " 已经推送完成");
            }
        }).start();
        System.out.println("推送线程已启动");
    }
}
