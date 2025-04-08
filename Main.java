// importo o scanner para conseguir pegar o valor digitado pelo usuario
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //definindo o scanner como entrada
        int op=0;// variavel de controle 
        int a=0; // variavel para sair do loop do while
        Quadrado quadrado = new Quadrado(); // objeto
        Triangulo triangulo = new Triangulo(); // objeto
        do { 
            
            
            System.out.println("Qual figura você está utilizando?");
            System.out.println("1- Triangulo");
            System.out.println("2- Quadrado");
            System.out.println("3- Sair");
            op= entrada.nextInt();
            entrada.nextLine();
            switch (op) {
                case 1:
                int base;
                int ladoB;
                int ladoC;
                System.out.println("Digite o lado A do triangulo (Base)");
                base= entrada.nextInt();
                System.out.println("Digite o lado B do triangulo (Altura)");
                ladoB= entrada.nextInt();
                System.out.println("Digite o lado C do triangulo (Lado)");
                ladoC= entrada.nextInt();
                
            
                // bloco que calcula e já atribui o resultado a funcao area triangulo
                float areaTriangulo=triangulo.calcularArea(base, ladoB);
                float perimetroTriangulo=triangulo.calcularPerimetro(base, ladoB, ladoC);
                System.out.println("A área do seu triangulo é : " + areaTriangulo);
                System.out.println("O perimetro do seu triangulo é :" + perimetroTriangulo);
                System.out.println("Aperte qualquer tecla para prosseguir");
                entrada.nextLine();
                break;
                case 2:
                float lado;
                System.out.println("Digite o lado do seu quadrado.");
                lado = entrada.nextInt();
                // parte para atribuir o valor de cada lado/ printar o resultado
                quadrado.setBase(lado);
                quadrado.setLado1(lado);
                quadrado.setLado1(lado);
                quadrado.setLado1(lado);
                float areaQuadrado=quadrado.calcularArea(lado);
                float perimetroQuadrado=quadrado.calcularPerimetro(lado);
                System.out.println("Quadrado " + lado +"\n"+" a area desse quadrado é de : " + areaQuadrado + "\n e o perimetro do quadrado é de :" + perimetroQuadrado);
                System.out.println("Aperte qualquer tecla para prosseguir");
                entrada.nextLine();
                break;
                case 3:
                System.out.println("Adeus até a próxima..");
                a=3;
                System.out.println("Aperte qualquer tecla para sair do programa..");
                entrada.nextLine();
                break;
                default:
                System.out.println("Selecione uma das opções citadas a cima.");
                break;
            }
        } while (a==0);
        }
    }
