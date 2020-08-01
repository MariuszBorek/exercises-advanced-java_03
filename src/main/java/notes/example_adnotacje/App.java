package notes.example_adnotacje;

public class App {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.someMethod();
        someClass.someMethodSecond();





        App app = new App();
        app.doSomething();

        String[] array = new String[3];
        array[0] = "hej";
        array[1] = "co";
        array[2] = "robisz";

//        App.main(array);

        class SomeName {
            private String name;

            public SomeName() {
                this.name = "Elo";
            }

            public String getName() {
                return name;
            }

            public void something() {
                System.out.println("hehehe");
            }
        }


    }

    public void doSomething() {
        System.out.println("voila!");
    }
}
