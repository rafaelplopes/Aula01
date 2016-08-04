import javax.swing.JOptionPane;
import java.util.Scanner;
class Retangulo {
    
    public static void main(String args[]){
     
      Scanner entrada = new Scanner(System.in);
      int base ;
      int altura ;
      
      /*//primeira maneira de criar o calculo
      System.out.println("Calculando area do triangulo: ");
      System.out.print("Digite a Base: ");
      base = Integer.parseInt(entrada.nextLine());
      System.out.print("Digite a Altura: ");
      altura = Integer.parseInt(entrada.nextLine());
      int area = (base * altura)/2;
      System.out.println( "Resultado: " + area);*/

      System.out.println("Calculando area do triangulo: ");
      System.out.print("Digite a Base: ");
      base = entrada.nextInt();
      System.out.print("Digite a Altura: ");
      altura = entrada.nextInt();
      double area = (base * altura)/2d;
      System.out.printf("Resultado: %.2f\n",area);
    }
}