import java.util.Scanner;

public class teste{
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        triangule x, y;

        x = new triangule();
        y = new triangule();

        System.out.println("Digite os 3 lados do X");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Digite os 3 lados do Y");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();


        double p = (x.a + x.b + x.c ) / 2;
        double areaX = Math.sqrt(p * (p - x.a) * (p-x.b) * (p - x.c));

         p = (y.a + y.b + y.c ) / 2;
        double areaY = Math.sqrt(p * (p - y.a) * (p-y.b) * (p - y.c));


        System.out.println(areaX);
        System.out.println(areaY);


        if(areaX > areaY){
            System.out.println("X é maior");
        } else{
            System.out.println("Y é maior");
        }

    }
    
}