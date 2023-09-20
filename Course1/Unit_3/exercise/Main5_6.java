package Unit_3.exercise;

import java.util.Scanner;

public class Main5_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sentNumber = "010-1234-5678"; // 발신자의 전화번호 초기화

        System.out.println("받는 사람의 이름과 메시지를 입력하세요. ");

        String code = sc.nextLine();
        String text = sc.nextLine();

        MessageText messageText = new MessageText(code, text);


        System.out.println("수신자의 전화번호를 입력하세요. ");

        String toNumber = sc.next();

        Message message = new Message(messageText, toNumber, sentNumber);

        message.printMessage();

        // 3-6
        Book book = Book.keyboardInput(sc);

        book.printBook();

        book.windowBook();

        MessageText messageText1 = MessageText.keyboardInput(sc);

        messageText1.printMessageText();


    }
}
