package com.dome;

import com.dome.log.ReaderFileLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 */

/*
@RestController
public class LogController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @GetMapping("/start")
    public String pushLog() {
        List<String> fileContent = ReaderFileLine.getFileContent("log01.txt");
        for (String value : fileContent) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
            messagingTemplate.convertAndSend("/topic/pullLogger", value);
            System.out.println(value + "已经推送完成");
        }
        return "success";
    }
}
*/
