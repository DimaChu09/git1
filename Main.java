public class Main {
    public static void main(String[] args) {
        int [] sales = {1, 20, 50, 60, 50, 40};
        SalesManager manager = new SalesManager(sales);
        System.out.println(manager.max());
    }
}
