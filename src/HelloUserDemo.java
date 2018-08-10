import java.util.Scanner;

public class HelloUserDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tên của bạn:");
        String name = scanner.next();

        System.out.println("Xin chào " + name + "!");
    }
}
