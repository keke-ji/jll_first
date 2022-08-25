package com.dome.Controller;

import com.dome.config.WebsocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/log")
public class SendLogsController {

    @Autowired
    private WebsocketServer websocketServer;

    @GetMapping("/pushlogs")
    public String pushLogs(){
        websocketServer.sendLog();
        return "index";
    }

    /*@GetMapping("/startPush")
    @ResponseBody
    public String startPush(){
        websocketServer.sendLog();
        return "开始启动";
    }*/
}
