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

        double areaX = x.area();
        double areaY= y.area();

        System.out.println(areaX);
        System.out.println(areaY);


        if(areaX > areaY){
            System.out.println("X é maior");
        } else{
            System.out.println("Y é maior");
        }

    }
    
}