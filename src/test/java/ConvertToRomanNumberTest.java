import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class ConvertToRomanNumberTest{

    @Test
    public void shouldReturnI() {
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(1);

        assertEquals("I", romanNumber);
    }
    @Test
    public void shouldReturnV() {
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(5);

        assertEquals("V", romanNumber);
    }
    // Faltarían los test de los X, L, D , M
    @Test
    public void shoulReturnII() {
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(2);

        assertEquals("II", romanNumber);
    }
    @Test
    public void shoulReturnIII() {
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(3);

        assertEquals("III", romanNumber);
    }
    @Test
    public void shoulReturnIV() {
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(4);

        assertEquals("IV", romanNumber);
    }
}