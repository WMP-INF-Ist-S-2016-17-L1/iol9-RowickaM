public class Main {
    public static void main(String[] args) {
        Director szef = new Director();
        PizzaBuilder builder = new PizzaHawajska();
        PizzaBuilder builder2 = new PizzaPeperoni();
        System.out.println("\nPizza Hawajska");
        szef.setBuilder(builder);
        szef.zrob();
        Pizza zestaw1 = szef.getZestaw();
        System.out.println("\nPizza Peperoni");
        szef.setBuilder(builder2);
        szef.zrob();

        Pizza zestaw2 = szef.getZestaw();

        System.out.println("\nPizza Hawajska");
        System.out.println(zestaw1.toString());
        System.out.println("Pizza Peperoni");
        System.out.println(zestaw2.toString());
    }
}