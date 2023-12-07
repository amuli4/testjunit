package com.abimulia.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import com.abimulia.Calculator;
import com.abimulia.test.HairSalon.Day;

public class HairSalonTest {

    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays(){
        Day[] expected =new Day[]{HairSalon.Day.MONDAY,HairSalon.Day.TUESDAY};
        Day[] actual = hairSalon.getOpeningDays();
        assertArrayEquals(expected, actual);

    }

    @ParameterizedTest
    @EnumSource(value= HairSalon.Day.class, names = {"MONDAY","TUESDAY"})
    // public void testSalonIsOpenOnMonday(){
    public void testSalonIsOpen(HairSalon.Day day){
        // assertTrue(hairSalon.isOpen("Monday"));
        // assertTrue(hairSalon.isOpen(HairSalon.Day.MONDAY));
         assertTrue(hairSalon.isOpen(day));

    }

    // @Test
    // public void testSalonIsCloseOnWednesday(){
    //     // assertFalse(hairSalon.isOpen("Wednesday"));
    //     assertFalse(hairSalon.isOpen(HairSalon.Day.WEDNESDAY));

    // }
     @ParameterizedTest
    @EnumSource(value= HairSalon.Day.class, names = {"WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"})
    // public void testSalonIsClosed(){
    public void testSalonIsClosed(HairSalon.Day day){
        // assertTrue(hairSalon.isOpen("Monday"));
        // assertTrue(hairSalon.isOpen(HairSalon.Day.MONDAY));
         assertFalse(hairSalon.isOpen(day));

    }

    // @Test
    // public void testExceptionIsThrownIfWeekdayDoesNotEndInDay(){
    //     Exception exception = assertThrows(IllegalArgumentException.class,() -> hairSalon.isOpen() );
    //     String expected = "The weekday argument must end in the letter 'day'";
    //     String actual = exception.getMessage();
    //     assertEquals(expected, actual);


    // }

    @Test
    public void testApplyDiscount(){
        Calculator calculator = new Calculator();
        assumeTrue(calculator.divide(hairSalon.getHaircutPrice(),2)== 15);
        int expected = 20;
        int actual = hairSalon.applyDiscount();
        assertEquals(expected, actual);
    }

    
}
