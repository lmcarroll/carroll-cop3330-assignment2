package ex25;

import ex24.AnagramChecker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnagramCheckerTest {

    @Test

    public void testIsAnagram(){

        AnagramChecker underTest = new AnagramChecker();

        String str1 = "earth";
        String str2 = "heart";

        boolean result = underTest.isAnagram(str1, str2);

        assertEquals(true, result);

    }
}
