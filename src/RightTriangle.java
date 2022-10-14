public class RightTriangle {
    //instance variables
    private double base;
    private double height;

    //constructor
    public RightTriangle (double base, double height){
        this.base = base;
        this.height = height;
    }
    public double hypotenuse (){
        double hypotenuse = Math.sqrt(Math.pow(base,2)+ Math.pow(height,2));
        return hypotenuse;
    }
}
