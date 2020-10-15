package kr.ensueno;

import kr.ensueno.annotation.DevkOnlineLog;
import kr.ensueno.model.User;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        Thread.sleep(3000);
        main.myLog();
    }

    @DevkOnlineLog
    public void myLog(){
        User user = new User();
        user.setName("seongkwon");
        user.setAddress("seoul gangseo");
        System.out.println(user.getAddress() + " " + user.getName());
        System.out.println("My Log Demo");
    }
}
