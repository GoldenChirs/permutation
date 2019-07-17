import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class TestStringPermutations {

    //TEST CASES: null, empty string , duplicate string , long string

    @Test
    public void testNullPermutations() {
        Set<String> perms = StringPermutations.generatePermutations(null);
        assertEquals( perms, null );
    }

    @Test
    public void testEmptyStringPermutations() {
        Set<String> perms = StringPermutations.generatePermutations("");
        assertEquals( perms, null );
    }

    @Test
    public void testSingleLetterStringPermutations() {
        Set<String> perms = StringPermutations.generatePermutations("a");
        Set<String> answer = new HashSet<>();
        answer.add("a");
        assertEquals( perms, answer );
    }

    @Test
    public void testDuplicationStringPermutations() {
        Set<String> perms = StringPermutations.generatePermutations("aa");
        Set<String> answer = new HashSet<>();
        answer.add("aa");
        assertEquals( perms, answer );
    }

    @Test
    public void testStringPermutations() {
        Set<String> perms = StringPermutations.generatePermutations("god");
        Set<String> answer = new HashSet<>();
        answer.add("god");
        answer.add("gdo");
        answer.add("ogd");
        answer.add("odg");
        answer.add("dgo");
        answer.add("dog");
        assertEquals( perms, answer );
    }
}
