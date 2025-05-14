import java.util.Scanner;

public class TesteSemPOO {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os lados do triangulo X");
        double lado1= scanner.nextDouble();
        System.out.println("");
        double lado2 = scanner.nextDouble();
        System.out.println("");
        double lado3 = scanner.nextDouble();

        double somaX = lado1 + lado2 + lado3;
        System.out.println(somaX);
        
         System.out.println("Digite os lados do triangulo Y");
        double ladoUm= scanner.nextDouble();
        System.out.println("");
        double ladoDois = scanner.nextDouble();
        System.out.println("");
        double ladoTres = scanner.nextDouble();


        double somaY = ladoUm + ladoDois + ladoTres;
        System.out.println(somaY);

        if(somaX > somaY){
            System.out.println("O mairo é o X");
        } else{
            System.out.println("Maior é Y");
        }

        




    }
}
