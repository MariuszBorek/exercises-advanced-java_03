package notes.example_generic_type;

public class App {
    public static void main(String[] args) {

        Box box = new Box();
        box.addObject(new Car("Lambo"));
        box.addObject(new Car("Porche"));
        box.addObject(new Car("Fiat"));
        box.addObject(new Car("Daewoo"));

        box.display();

    }
}
