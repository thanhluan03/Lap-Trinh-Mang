import java.util.Scanner;

public class BaiTap22 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so nguyen n>0");
        n = sc.nextInt();

        String nhiphan = "";
        while(n>0) {
            nhiphan = (n%2) + nhiphan;
            n = n/2;
        }
        System.out.println("So he nhi phan la: " + nhiphan);
    }
}
