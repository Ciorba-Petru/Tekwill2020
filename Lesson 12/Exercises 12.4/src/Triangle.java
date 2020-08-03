public class Triangle extends Shape{
    double height;
    double base;
    Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }
    @Override
    public double area(){
       return height *base/2;
    }
}
