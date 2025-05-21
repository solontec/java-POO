public class triangule {

    public double a;
    public double b;
    public double c;

    public double area(){
       double p = (a + b + c) / 2;
       double result = (p * (p - a) * (p- b) * (p - c));

       return result;
    }
}
