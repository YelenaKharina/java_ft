import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class SecondTask {

  public static void main (String[] arg) {
    Point p1 = new Point(1,1);
    Point p2 = new Point(2,1);
    System.out.println("Расстояние между точками с координатами (" + p1.x + ";" + p1.y  + ") и (" + p2.x + ";" + p2.y   + ") = " + p1.distance(p2));

  }
}