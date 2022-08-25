package com.dome.Controller;


import com.dome.Server.WebSocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.Session;

@RestController
@RequestMapping("/log")
public class WebSocketController {

    /*@Autowired
    private WebSocketServer websocketServer;

    @GetMapping("/pushlogs")
    public void pushLogs(Session session){

        websocketServer.onOpen(session);
        //return "index";
    }
*/
}
