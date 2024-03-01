public class test27 {
    public static void main(String[] args) {
        Baitap27 hd = new Baitap27("Trung Nguyen", 100000, 1.5);
        Baitap27 hd2 = new Baitap27("Trung Nguyen", 100000, 5.5);
        System.out.println("Tong tien Hd: " + hd.tinhtongtien());
        System.out.println("Tong tien Hd2: " + hd2.tinhtongtien());
        System.out.println("Kiem tra khoi luong > 2kg "+ hd.kiemtrakhoiluonglonhon(2));
        System.out.println("Kiem tra khoi luong > 1kg "+ hd.kiemtrakhoiluonglonhon(1));
        System.out.println("Kiem tra tong tien > 500k "+ hd.kiemtratongtienlonhon500k());
        System.out.println("Giam gia cua Hd: "+ hd.giamgia(10));
        System.out.println("Giam gia cua Hd2: "+ hd2.giamgia(10));
        System.out.println("Sau giam gia cua Hd: "+ hd.giasaukhigiam(10));
        System.out.println("Sau giam gia cua Hd2: "+ hd2.giasaukhigiam(10));
    }
}

