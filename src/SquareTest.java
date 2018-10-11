import static org.junit.Assert.*;

public class SquareTest {

    @org.junit.Test
    public void getArea() {
        Square humor = new Square(5, 10);
        assertEquals(50,humor.getArea(), 0.1);

        Square humor1 = new Square(10000, 0);
        assertEquals(0,humor1.getArea(), 0.1);

        Square humor2 = new Square(6, -4);
        assertEquals(-24,humor2.getArea(), 0.1);

        Square humor3 = new Square(1, 1);
        assertEquals(1,humor3.getArea(), 0.1);

    }

    @org.junit.Test
    public void getPerimeter() {
        Square humor = new Square(5, 10);
        assertEquals(30,humor.getPerimeter(), 0.1);

        Square humor1 = new Square(10000, 0);
        assertEquals(0,humor1.getArea(), 0.1);

        Square humor2 = new Square(6, -4);
        assertEquals(-24,humor2.getArea(), 0.1);

        Square humor3 = new Square(1, 1);
        assertEquals(1,humor3.getArea(), 0.1);

    }
}