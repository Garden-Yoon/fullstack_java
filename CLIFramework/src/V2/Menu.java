package CLIFramework.src.V2;

public class Menu {
    String[] menus = {"학생수", "점수입력", "점수리스트", "분석", "종료"};

    public void printMenu(){
        System.out.println("-------------------------------------------------------");
        // 배열로 일반화
        for (int i = 0; i < menus.length; i++) {
            System.out.printf("%d.%s | " , i+1 , menus[i]);
        }
        System.out.println();
        System.out.println("-------------------------------------------------------");
    }

    public int getSelect() {
        int selectNo = Input.getInt("선택> ");
        // 올바른 범위인지 체크 필
        return selectNo;
    }
}