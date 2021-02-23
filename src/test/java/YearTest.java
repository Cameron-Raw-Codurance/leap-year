import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YearTest {

    Year year;

    @BeforeEach
    void SetUp(){
        this.year = new Year();
    }
    @Test
    void Is_A_Leap_Year_If_Divisible_By_Four(){
        assertEquals(true, year.isLeapYear(1996));
    }
    @Test
    void Is_A_Leap_Year_If_Divisible_By_Four_Hundred(){
        assertEquals(true, year.isLeapYear(1600));
    }
    @Test
    void Is_Not_A_Leap_Year_If_Divisible_By_100_But_Not_400(){
        assertEquals(false, year.isLeapYear(1800));
    }
}
