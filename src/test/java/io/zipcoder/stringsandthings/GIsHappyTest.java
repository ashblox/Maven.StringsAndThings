package io.zipcoder.stringsandthings;

import io.zipcoder.StringsAndThings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 29/01/2019.
 */
public class GIsHappyTest {

    private StringsAndThings stringsAndThings;

    @Before
    public void setup(){
        stringsAndThings = new StringsAndThings();
    }


    @Test
    public void gIsHappyTest1(){
        Boolean actual = stringsAndThings.gIsHappy("xxggxx");
        Assert.assertTrue(actual);
    }

    @Test
    public void gIsHappyTest2(){
        Boolean actual = stringsAndThings.gIsHappy("xxgxx");
        Assert.assertFalse(actual);
    }

//    @Test
//    public void gIsHappyTest3(){
//        Boolean actual = stringsAndThings.gIsHappy("xxggyygxx");
//        Assert.assertTrue(actual);
//    }

//    The above test shows the expected value of the boolean is true, but in fact it is false. The first set of 'g's in
//    the expression are happy but the second instance of a g is unhappy. I have corrected the test below.

    @Test
    public void gIsHappyTest3(){
        Boolean actual = stringsAndThings.gIsHappy("xxggyygxx");
        Assert.assertFalse(actual);
    }

}
