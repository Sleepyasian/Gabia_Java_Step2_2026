package queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain_02 {

    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<Message>();

        Message lee = new Message("sendMail", "이호준 ");
        messageQueue.offer(lee);
        messageQueue.offer(new Message("sendSNS", "김호준"));
        messageQueue.offer(new Message("sendKakao", "김호준"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll(); // 출력 Queue -> 선입선술 FIFO

            switch (message.Command) {
                case "sendMail":{
                    System.out.println(message.to+"님에게 메일을 보냈습니다.");
                    break;
                }
                case "sendSNS":{
                    System.out.println(message.to+"님에게 SNS을 보냈습니다");
                    break;
                    
                }
                case "sendKakao":{
                    System.out.println(message.to+"님에게 SNS을 보냈습니다");
                    break;
                }      
            }


        }
    }
}
