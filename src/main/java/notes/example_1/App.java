package notes.example_1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        SomeClass someClass = new SomeClass();

        Animal cat = new Cat();
        Animal cow = new Cow();

        Car car = Car.class.getConstructor(String.class, String.class).newInstance("noname", "noname");

        Class<?> carClass = Class.forName("notes.example_1.Car");

        someClass.setName(car, carClass);

        System.out.println(car.getName());


//        doSomething(Car.class);


    }



    public static void doSomething(Class<?> clazz) {
        for (Method m : clazz.getMethods())
            System.out.println(m);
    }

}
