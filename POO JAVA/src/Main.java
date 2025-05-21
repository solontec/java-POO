import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Scanner scanner =  new Scanner(System.in);

        Product um, dois, estoqueTotal;
        um = new Product();
        dois = new Product();



        int adicionar = 1 ;
        int encerrar ;


            while(adicionar == 1) {



            System.out.println("Digite o nome do produto: ");
            um.name = scanner.next();
            System.out.println("Digite o valor do produto");
            um.price = scanner.nextDouble();
            System.out.println("Digite o quantidade do produto");
            um.quantity = scanner.nextInt();


            System.out.println("Carrinho : " + "Nome do produto " + um.name + " Preço " + um.price + " Quantidade " + um.quantity + " Preço total " + um.valorTotal());
            System.out.println("Deseja adicionar mais produtos no estoque?" + "Digite 1 para sim e 2 para não");
            adicionar = scanner.nextInt();



            if(adicionar == 2) {
                System.out.println("Encerrado");
                break;
            }


        }







            }
        }


