package junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class J04TestPractice {
//Test ettğimiz kodun bizim beklediğimiz excetionu fırlattı mı test örneği gosteriniz?

    @Test
    @DisplayName("test exception hata firlatma si kontrol ediliyor")
    void testException(){
        String str="Java";

        assertThrows(Exception.class,()->{
            Integer.valueOf(str);
        });
    }

    @Test
    @DisplayName("test Arithmatic  hata firlatma si kontrol ediliyor")
    void testException2(){
        int x=21;
        int y=0;
        assertThrows(ArithmeticException.class,()->bolumIslem(x,y));
    }

    private int bolumIslem(int x, int y) {
        return x/y;
    }
}
