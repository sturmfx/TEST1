import java.util.ArrayList;
import java.util.Random;
public class Point
{
    int x;
    int y;
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int X()
    {
        return x;
    }
    public int Y()
    {
        return y;
    }
    public static ArrayList<Point> generate(int n, int max_x, int max_y)
    {
        ArrayList<Point> result = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < n; i++)
        {
            result.add(new Point(random.nextInt(max_x), random.nextInt(max_y)));
        }
        return result;
    }
}
