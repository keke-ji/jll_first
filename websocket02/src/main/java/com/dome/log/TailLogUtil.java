package com.dome.log;

import javax.websocket.Session;
import java.io.IOException;
import java.util.List;

public class TailLogUtil {
    public static void pushLog(Session session,String tranceId)  {
            List<String> fileContent = ReaderFileLine.getFileContent("log01.txt");
            for (String content : fileContent) {
                try {
                    session.getBasicRemote().sendText(content+ "<br />");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
    }
}
 //WS.session.getBasicRemote().sendText(message);
