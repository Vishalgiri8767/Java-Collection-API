package BasicProblems;

public class AreaOfCircle {
    public double findArea(double r){
        double pie = 3.14;
        double area = pie*r*r;
        return area;
    }
    public static void main(String[] args) {
        AreaOfCircle ac = new AreaOfCircle();
        int radius = 5;
        double area =ac.findArea(radius);
        System.out.println("area :"+area);
    }
}
