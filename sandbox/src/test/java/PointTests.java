import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
  @Test
  public void testDistance1() {

    Point p1 = new Point(1,1);
    Point p2 = new Point(1,2);
    Assert.assertEquals(p1.distance(p2),1.0);
  }


  @Test
  public void testDistance2() {

    Point p1 = new Point(-4,1);
    Point p2 = new Point(-5,0);
    Assert.assertTrue(p1.distance(p2) > 0);
  }

  @Test
  public void testDistance3() {

    Point p1 = new Point(101,1);
    Point p2 = new Point(25,1);
    Assert.assertEquals(p1.distance(p2),p1.x - p2.x);
  }

  @Test
  public void testDistance4() {

    Point p1 = new Point(2,1);
    Point p2 = new Point(25,25);
    Assert.assertEquals(p1.distance(p1),0);
  }
}