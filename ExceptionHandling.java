
public class ExceptionHandling {
    public static void main(String[] args) {
        int width = 10;
        int height = -5;
        int area = Rectangle.area(width,height);
        System.out.println(area);
    }
}

class Rectangle{
    public int width, height;
    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }
    public int area (int width, int height){
        this.width = width;
        this.height = height;
        int area = width*height;
        return area;
    }
}