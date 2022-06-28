import java.sql.SQLOutput;

public class Mainclass {
    public static void main(String[] args) {
        System.out.println("헬로 월드");

        Nameset ns = new Nameset();
        ns.setName(); // 이름을 설정
        // 이름을 출력해보자\
//        System.out.println(ns.name + "저리가");
//        ns.name = "점심";
//        System.out.println(ns.name + "저리가");
        String name = ns.getName(); // 설정된 이름을 받을 수 있음.
        //플레이 클래스
        Playclass pc = new Playclass();
        pc.play1(name);
    }
}
