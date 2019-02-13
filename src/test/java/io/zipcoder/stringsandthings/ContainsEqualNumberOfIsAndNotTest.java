package io.zipcoder.stringsandthings;

import io.zipcoder.StringsAndThings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 29/01/2019.
 */
public class ContainsEqualNumberOfIsAndNotTest {

    private StringsAndThings stringsAndThings;

    @Before
    public void setup(){
        stringsAndThings = new StringsAndThings();
    }

//    @Test
//    public void equalIsNotTest1(){
//        Boolean actual = stringsAndThings.containsEqualNumberOfIsAndNot("This is not");
//        Assert.assertTrue(actual);
//    }

//    The above test is incorrect in stating that the expected value of the boolean is true. The 'is' count is 2
//    and the not count is one, so they are NOT equal. This should return false. I have corrected the test below.

    @Test
    public void equalIsNotTest1(){
        Boolean actual = stringsAndThings.containsEqualNumberOfIsAndNot("This is not");
        Assert.assertFalse(actual);
    }

//    @Test
//    public void equalIsNotTest2(){
//        Boolean actual = stringsAndThings.containsEqualNumberOfIsAndNot("This is notnot");
//        Assert.assertFalse(actual);
//    }

//    Just like test #1, the expected outcome of the above test is incorrect. The string contains 2 substrings 'is' and
//    two substrings 'not'. The number of each is equal, so this should assert true. Corrected below.

    @Test
    public void equalIsNotTest2(){
        Boolean actual = stringsAndThings.containsEqualNumberOfIsAndNot("This is notnot");
        Assert.assertTrue(actual);
    }

    @Test
    public void equalIsNotTest3(){
        Boolean actual = stringsAndThings.containsEqualNumberOfIsAndNot("noisxxnotyynotxisi");
        Assert.assertTrue(actual);
    }
}
