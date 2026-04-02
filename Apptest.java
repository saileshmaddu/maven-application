package com.result;
import static.org.junit.Assert.*;
import org.junit.Test;
public class Apptest{
    @Test
    public void testResult(){
        int[] marks={ 80,80,80,80,80};
        String[] result=App.calculateResult(marks);
        AssertEquals("400",result[0]);
        AssertEquals("80.0",result[1]);
        AssertEquals("A",result[2]);
        AssertEquals("pass",result[0]);
    }
}