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
    public void shouldReturnII() {
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(2);

        assertEquals("II", romanNumber);
    }
    @Test
    public void shouldReturnIII() {
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(3);

        assertEquals("III", romanNumber);
    }
    @Test
    public void shouldReturnIV() {
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(4);

        assertEquals("IV", romanNumber);
    }
    @Test
    public void shouldReturnVI(){
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(6);

        assertEquals("VI", romanNumber);
    }
    @Test
    public void shouldReturnVII(){
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(7);

        assertEquals("VII", romanNumber);
    }
    @Test
    public void shouldReturnIX(){
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(9);

        assertEquals("IX", romanNumber);
    }
    @Test
    public void shouldReturnXI(){
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(11);

        assertEquals("XI", romanNumber);
    }
    @Test
    public void shouldReturnXII(){
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(12);

        assertEquals("XII", romanNumber);
    }
    @Test
    public void shouldReturnXIII(){
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(13);

        assertEquals("XIII", romanNumber);
    }
    @Test
    public void shouldReturnXIV(){
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(14);

        assertEquals("XIV", romanNumber);
    }
    @Test
    public void shouldReturnXIX(){
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(19);

        assertEquals("XIX", romanNumber);
    }
    @Test
    public void shouldReturnXX(){
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(20);

        assertEquals("XX", romanNumber);
    }
    @Test
    public void shouldReturnXXI(){
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(21);

        assertEquals("XXI", romanNumber);
    }
    @Test
    public void shouldReturnXXIX(){
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(29);

        assertEquals("XXIX", romanNumber);
    }
    @Test
    public void shouldReturnLX(){
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(60);

        assertEquals("LX", romanNumber);
    }
    @Test
    public void shouldReturnLXXIII(){
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(73);

        assertEquals("LXXIII", romanNumber);
    }
    @Test
    public void shouldReturnLXXXIV(){
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(84);

        assertEquals("LXXXIV", romanNumber);
    }
    @Test
    public void shouldReturnXCV(){
        ConvertToRomanNumber convertToRomanNumber = new ConvertToRomanNumber();
        String romanNumber = convertToRomanNumber.convert(95);

        assertEquals("XCV", romanNumber);
    }
}