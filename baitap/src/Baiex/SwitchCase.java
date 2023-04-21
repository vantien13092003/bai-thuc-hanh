package Baiex;
public class SwitchCase {
    public static void main(String[] args) {
        int number = 2;

        switch (number) {
            case 1:
                System.out.println("Đây là số 1");
                break;
            case 2:
                System.out.println("Đây là số 2");
                break;
            case 3:
                System.out.println("Đây là số 3");
                break;
            case 4:
                System.out.println("Đây là số 4");
                break;
            case 5:
                System.out.println("Đây là số 5");
                break;

            default:
                System.out.println("Chạy vào khối default");
                break;
        }
    }
}