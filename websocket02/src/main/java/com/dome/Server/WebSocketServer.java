package com.dome.Server;

import com.dome.log.TailLogUtil;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import org.slf4j.Logger;

@ServerEndpoint("/wsServer")
@Component
public class WebSocketServer {

    private static Logger logger= LoggerFactory.getLogger(WebSocketServer.class);

    @OnOpen
    public void onOpen(Session session,@PathParam(value = "traceId") String traceId) {
        TailLogUtil.pushLog(session,traceId);
    }

    @OnClose
    public void onClose() {

        logger.info("【websocket消息】连接断开");
    }

    @OnError
    public void onError(Throwable e) {
        e.printStackTrace();
    }

}

