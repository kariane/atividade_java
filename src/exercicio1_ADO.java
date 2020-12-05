/*exercicio1-Criar um programa que leia um número inteiro N maior do que zero e calcule o fatorial
desse número.*/
//Aluna: Kariane Coura BSI-1°semestre
import java.util.Scanner;
public class exercicio1_ADO {
    public static void main(String[] args){   
Scanner leitor= new Scanner(System.in);
        System.out.println("==FATORANDO==");
        System.out.println("Digite um número: ");
float numero=leitor.nextFloat();
        System.out.println("O número fatorial é: "+ numero+ "!");
int fatoração=1;
while(numero>0){
  fatoração=(int)(fatoração*numero);  
  numero--;
} System.out.println("O resultado da fatoração é: " + fatoração);
    }}