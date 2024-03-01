public class Baitap27 {
    private String tenloaicafe;
    private double giatien1kg, khoiluong;

    public Baitap27 (String ten, double gia, double kl)
    {
        this.tenloaicafe = ten;
        this.giatien1kg = gia;
        this.khoiluong = kl;
    }

    public double tinhtongtien(){
        return this.giatien1kg * this.khoiluong;
    }

    public boolean kiemtrakhoiluonglonhon(double kl){
        return this.khoiluong > kl;
    }

    public boolean kiemtratongtienlonhon500k(){
        return this.tinhtongtien() > 500000;
    }

    public double giamgia(double x){
        if (this.tinhtongtien() > 500000) {
            return (x / 100 * this.tinhtongtien());
        }else {
            return  0;
        }
    }

    public double giasaukhigiam(double x){
        return this.tinhtongtien() - this.giamgia(x);
    }
}
