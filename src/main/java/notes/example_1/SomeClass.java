package notes.example_1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SomeClass {
    public void setName(Car car, Class<?> carClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method setName = carClass.getDeclaredMethod("setName", String.class);
        setName.invoke(car, "Lamborgini");
    }
}
