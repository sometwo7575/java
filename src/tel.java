import java.util.Scanner;

public class tel {
    public static void main(String[] args){
        System.out.print("이름 입력 : ");

        Scanner sc = new Scanner(System.in); // 키보드로 부터 입력받기 준비
        String name = sc.next(); // 키보드로 부터 글자동를 입력받기
        // 위에 name은 사용자가 입력한 글자가 저장이 된다.
        //name에 저장된 글을 출력을 해보자
        System.out.println("캐릭터의 이름이 " + name + "(이)로 설정됨." );
        System.out.println(name + "(이)가 호캉스를 떠나게 되었다." );
        System.out.println(name + "(이)가 목적지로 운전 중 어떤 차가 내 차 앞으로 무리하게 추월하여 들어왔다." );
        System.out.println("당신의 대처는? 1. 기분이 매우 나빠 크락션을 10초간 울린다. 2. 크락션을 짧게 울려 상황이 위험했음을 알린다." );
        System.out.print("선택: ");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("기분이 매우 나빠 크락션을 10초간 울렸더니 상대방이 갑자기 보복운전을 시작하였다.");
            System.out.println("당신의 선택은? 1. 한 번 해보자 생각하며 나도 보복운전을 시작한다. 2. 당황하지 않고 경찰에 신고한다." );
            System.out.print("선택: ");
            int num1 = sc.nextInt();
                if (num1 == 1){
                    System.out.println("서로 보복 운전을 하다, 결국 사고가 발생하여 여행이 엉망이 되었다. <게임 오버>");

                } else if (num1 == 2){
                    System.out.println("경찰에 신고를 하고 약 10분 뒤 근처 순찰차가 출동하여 보복 운전자를 체포해 갔다..");
                    System.out.println("그때의 기분은 좋지 않았지만, 다행히 여행은 즐겁게 보내고 왔다.");
                }

        } else if (num == 2){
            System.out.println("크락션을 짧게 울려 위험했음을 알렸더니 상대방이 사과의 의미로 비상 깜빡이를 점등 하였다.");
            System.out.println("나도 사과를 받아들여 평화롭고 즐거운 여행이 되었다.");
        } else {
            System.out.println("1번, 2번 중 선택을 하지 않아 상대방 차를 그냥 지나치게 되어 평화로운 여행이 되었다.");
        }

        //캐릭터 이름 설정
        //호캉스를 떠나게 되었다
        //목적지로 운전 중 어떤 차가 내 차 앞으로 무리하게 추월하여 들어왔다.
        //1. 크락션을 10초간 울린다. 2. 크락션을 짧게 2초간 울려 위험했음을 알린다.
        //만약에 1번을 입력하면
        //상대방이 기분이 나빠 보복운전을 시작하였다.
        //2번을 입력하면
        //상대방이 비상깜빡이를 켜고 사과의 의미를 표시하였다.
        //
        //
    }
}
