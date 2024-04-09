package BasicProblems;

public class AreaOfCircle {
    public double findArea(double r){
        if(r <= 0)
            return -1;
        double pie = 3.14;
        double area = pie*r*r;
        return area;
    }
    public static void main(String[] args) {
        AreaOfCircle ac = new AreaOfCircle();
        double radius = 100;
        double area =ac.findArea(radius);
        String string = (area == -1) ? "Invalid radius" : "Area : "+area;

        System.out.println(string);
    }
}
