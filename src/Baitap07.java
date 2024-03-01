import java.util.Scanner;

public class Baitap07 {
    public static void main(String[] args) {
        //Khai bao bien de doc du lieu
        Scanner sc = new Scanner(System.in);

        // Mot so vidu
        System.out.println("Nhap vao ho va ten : ");
        String hovaten = sc.nextLine();

        System.out.println("Nhap Ma Sinh Vien: ");
        long masinhvien = sc.nextLong();

        System.out.println("Nhap vao diem thi: ");
        float diemthi = sc.nextFloat();

        System.out.println("------");
        System.out.println("Ho va ten: "+ hovaten);
        System.out.println("Ma sinh vien: "+ masinhvien);
        System.out.println("Diem thi: "+ diemthi);
    }


}
