import leetcode.solution.ValidParentheses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    @Test
    public void canCreate(){
        new ValidParentheses();
    }
    @Test
    public void givenNullString_whenCallIsValidMethod_thenFailed(){
        NullPointerException exception = Assertions.assertThrows(NullPointerException.class, () -> new ValidParentheses().isValid(null));
        Assertions.assertEquals("string is null !!",exception.getMessage());
    }
    @Test
    public void givenEmptyString_whenCallIsValidMethod_thenFailed(){
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new ValidParentheses().isValid(""));
        Assertions.assertEquals("string is empty !!",exception.getMessage());
    }
    @Test
    public void givenString_whenCallIsValidMethod_thenSuccess(){
        ValidParentheses validParentheses = new ValidParentheses();
        boolean example1 = validParentheses.isValid("()");
        Assertions.assertEquals(true,example1);
        Assertions.assertTrue(example1);

        boolean example2 = validParentheses.isValid("()[]{}");
        Assertions.assertEquals(true,example2);
        Assertions.assertTrue(example2);

        boolean example3 = validParentheses.isValid("(]");
        Assertions.assertEquals(false,example3);
        Assertions.assertFalse(example3);

    }
}
