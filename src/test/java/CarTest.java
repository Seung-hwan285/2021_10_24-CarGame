import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.awt.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
public class CarTest {

    public Car c;
    private RacingGame r;


    @BeforeEach
    void 초기(){
        c=new Car();
        r=new RacingGame();
    }

    @Test
    void 공백값_빈문자() {

        String car[]={" d,fd"};
        assertFalse(r.BlankName(car));

        String car2[]={""};
        assertFalse(r.BlankName(car2));
    }

//    @Test
////    void 이름체크(){
////    }
}
