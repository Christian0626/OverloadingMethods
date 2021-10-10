import org.w3c.dom.ls.LSOutput;

public class OverloadingMethods {

    public static void main(String[] args) {
        System.out.println(volume(3));
        System.out.println(volume(102,102,102));
        System.out.println(volume(100,18));
    }

    public static int volume(int cube )
    {
        return cube * cube * cube;
    }

    public static int volume(int length, int height, int width)
    {
        return length * height * width;
    }

    public static double volume(double base, double height)
    {
        return (Math.round(.33333333333 * base * height));
    }

}
