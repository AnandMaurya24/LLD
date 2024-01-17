package decoratorPattern;

public class main {
    public static void main(String[] args) {
        BasePizza pizza = new FarmHousePizza();
        System.out.println(pizza.cost());
        pizza = new ExtraCheese(pizza);
        System.out.println(pizza.cost());
        pizza = new Mushroom(pizza);
        System.out.println(pizza.cost());
    }
}
