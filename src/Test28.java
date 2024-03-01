public class Test28 {
    public static void main(String[] args) {
        Baitap28 md = new Baitap28(28, 2, 2024);
        System.out.println("Day = "+ md.getDay());
        md.setDay(35);
        System.out.println("Day = "+ md.getDay());
        md.setDay(30);
        System.out.println("Day = "+ md.getDay());

        System.out.println("Month = "+ md.getMonth());
        md.setMonth(13);
        System.out.println("Month = "+ md.getMonth());
        md.setMonth(5);
        System.out.println("Month = "+ md.getMonth());
    }
}