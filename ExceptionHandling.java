
public class ExceptionHandling {
    public static void main(String[] args) {
        int width = 10;
        int height = -5;
        int area = Rectangle.area();
        System.out.println(area);
    }
}

class Rectangle{
    public static int width, height;
    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }
    public static int area (){
        int area = width;
        return area;
    }
}