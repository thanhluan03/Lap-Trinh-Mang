public class test30 {
    public static void main(String[] args) {
        Baitap30 md1 = new Baitap30(11, 8, 2003);
        Baitap30 md2 = new Baitap30(17, 11, 2005);
        Baitap30 md3 = new Baitap30(3, 8, 2005);

        System.out.println(md1); // 15/5/2021
        System.out.println(md2);
        System.out.println(md3);

        System.out.println("md1 so sanh bang md2: "
                + md1.equals(md2));

        System.out.println("md1 so sanh bang md3: "
                + md1.equals(md3));

        System.out.println("Hashcode md1 " + md1.hashCode());
        System.out.println("Hashcode md2 " + md2.hashCode());
        System.out.println("Hashcode md3 " + md3.hashCode());
    }
}
