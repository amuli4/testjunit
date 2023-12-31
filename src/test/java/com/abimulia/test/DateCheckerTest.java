package com.abimulia.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class DateCheckerTest {
    DateChecker dateChecker = new DateChecker();

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"JANUARY","MARCH","MAY","JULY","AUGUST","OCTOBER","DECEMBER"})
    public void testHas31Days(DateChecker.Month month){
        assertTrue(dateChecker.has31Days(month));

    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"FEBRUARY","APRIL","JUNE","SEPTEMBER","NOVEMBER"})
  
    public void testDoesNotHave31Days(DateChecker.Month month){
        assertFalse(dateChecker.has31Days(month));

    }

    
}
