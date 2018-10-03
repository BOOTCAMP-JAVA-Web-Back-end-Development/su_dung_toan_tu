import java.util.Scanner;

public class su_dung_toan_tu {
    public static void main(String[] args) {
        float w, h;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài: ");
        w = sc.nextFloat();
        System.out.print("Nhập vào chiều rộng: ");
        h = sc.nextFloat();
        double area = ((double) w * h);
        System.out.println("Diện tích của hình chữ nhật là: " + area);
    }
}
