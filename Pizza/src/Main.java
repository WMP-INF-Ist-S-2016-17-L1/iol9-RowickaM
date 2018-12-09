public class Main {
    public static void main(String[] args) {
        Kelner kelner = new Kelner();
        PizzaBuilder builder = new PizzaHawajska();
        System.out.println("\nZamów: Pizza Hawajska");
        kelner.setBuilder(builder);
        kelner.zamow();
        Pizza pizza = kelner.getZestaw();


        System.out.println("\nOdbierz zamówienie: Pizza Hawajska");
        System.out.println(pizza.toString());

    }
}