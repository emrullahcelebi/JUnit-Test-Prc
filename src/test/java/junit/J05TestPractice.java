package junit;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class J05TestPractice {

    @ParameterizedTest
    @ValueSource(strings={"qwert","wert","null","qwe"})
    void testLength(String str){
        assertTrue(str.length()>0);
    }

    @ParameterizedTest
    @CsvSource(value={"true,junit, u","false,mvc,z"})//comma-separated values annotations
    //iki "" tirnak arasinda 3 parametre var countains mantigi ile test eder
    void testCsvSource(Boolean b, String s1, String s2){
        assertEquals(b,s1.contains(s2));
    }

    @RepeatedTest(10)
    void testRepeat(){
        String[]arr={"hibernate", "mvc", "boot", "junit", "mongodb"};
        //assertEquals("mvc","mvc spring bir framework".substring(0,3));
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[0],arr[i]);
        }
    }

}
