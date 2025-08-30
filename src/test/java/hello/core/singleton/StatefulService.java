package hello.core.singleton;

public class StatefulService {

    // private int price; //상태유지필드

    public int order(String name, int price) {
        System.out.println("name = " + name + ", price = " + price);
        return price; //여기가문제
    }


}
