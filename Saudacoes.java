import javax.swing.JOptionPane;
import java.util.Scanner;
class Saudacao {
    
    public static void main(String args[]){
      System.out.print("Digite o nome do aluno: ");

      Scanner entrada = new Scanner(System.in);

      //Aqui criamos um objeto que ira receber o nome do aluno
      /*
       comentario em bloco
      */
      //String nome = entrada.nextLine();
      String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
      System.out.println(nome
      	+" Benvindo ao Curso");
    }
}