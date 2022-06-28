import java.util.Scanner;

/**
 *
 */

public class Nameset {

    private String name;

    // 메소드
    public void setName() {
        System.out.println("이름 설정 기능");
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 설정: ");
        name = sc.next();
    }

    public String getName() {
        System.out.print(name + "아 안녕!");
        return name;

//        System.out.println(ns.name + "저리가");

    }
}
