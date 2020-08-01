package notes.example_adnotacje;

import java.lang.annotation.Repeatable;

public @interface Some {
    int intValue() default 2;
}
