import com.divisiblenumber.services.NumberService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


/**
 * Copyright
 * User: Ganzf
 * Date: 2019/8/22
 * Description:
 */
public class DivisibleNumberTest {

    private List numberlist = new ArrayList();

    @BeforeEach
    public void init() {
        for(int i=1; i<26; i++){
            numberlist.add(i);
        }
    }

    @Test
    public void testDivisibleByNumber(){
        Object newNumberList[] =  NumberService.divisibleByNumber(numberlist).toArray();
        Object expectStr[] = {1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz",
                13, 14, "FizzBuzz",16, 17, "Fizz", 19, "Buzz", "Fizz", 22, 23, "Fizz", "Buzz"};
        assertArrayEquals(expectStr,newNumberList);
    }

    @Test
    public void divisibleAndExistNumber(){
        Object newNumberList[] =  NumberService.divisibleAndExistNumber(numberlist).toArray();
        Object expectStr[] = {1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", "Fizz",
                14, "FizzBuzz", 16, 17, "Fizz", 19, "Buzz", "Fizz", 22, "Fizz", "Fizz", "Buzz"};
        assertArrayEquals(expectStr,newNumberList);
    }

}
