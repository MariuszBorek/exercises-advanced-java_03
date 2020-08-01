package notes.example_adnotacje;

@Some(intValue = 3)
public class SomeClass {

    @Deprecated
    public void someMethod() {
        System.out.println("nieaktualna metoda");
    }

    @SuppressWarnings({"jakies info"})
    public void someMethodSecond() {
        System.out.println("cos sobie tu robie");
    }

}
