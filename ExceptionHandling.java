
public class ExceptionHandling {
    public static void main(String[] args) throws Exception {
        int width = 10;
        int height = 0;
        Rectangle rect = new Rectangle(width,height);
        int area = rect.area();
        System.out.println(area);
    }
}
class Rectangle{
    public int width, height;
    public Rectangle(int width, int height) throws ArithmeticException {
        this.height = height;
        this.width = width;
    }
    public int area (){
        int area = width/height;
        return area;
    }
}