
import garden_planner.model.RectBed;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectBedTest {

    @Test
    void testGetArea() {
        RectBed rBed = new RectBed();

        Assertions.assertEquals(1, rBed.getArea());

        rBed.setWidth(2);
        rBed.setHeight(3);
        assertEquals(6, rBed.getArea());
    }

    @Test
    void testGetPerimeter() {
        RectBed rBed2 = new RectBed();

        rBed2.setWidth(6);
        rBed2.setHeight(7);
        assertEquals(26, rBed2.getPerimeter());
    }

    @Test
    void testToString()  {
        RectBed rBed3 = new RectBed();

        rBed3.setTop(2);
        rBed3.setLeft(4);
        rBed3.setWidth(5);
        rBed3.setHeight(10);
        assertEquals("Rectangle 4.00 2.00 5.00 10.00", rBed3.toString());

    }

}
