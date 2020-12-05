/*Criar um programa que leia a idade de 15 pessoas e apresente na tela a média dos pesos das pessoas da
mesma faixa etária são: de 1 a 10 anos, de 11 a 20, de 21 a 30 e maiores de 30 anos.
*/ //Aluna: Kariane Coura BSI-1°Semestre
import java.util.Scanner;
public class exercicio3_ADO {
    public static void main(String[] args) {
       Scanner leitor=new Scanner(System.in);            
    float media=0, media1=0, media2=0, media3=0;
       for(int num=1; num<=15; num++){
           System.out.println("Qual a idade da "+num+"° pessoa?"); 
           int idade=leitor.nextInt();
           System.out.println("Qual o peso da "+num+"° pessoa?");
           float peso=leitor.nextFloat();
          if(idade<=10&&idade>=1){
            float p=0;
            float f=0;
            p+=1;
            f+=peso;
            media= f/p;
           }else if (idade<=20&&idade>=11){
            float p1=0;
            float f1=0;
            p1+=1;
            f1+=peso;
            media1= f1/p1;
        } else if (idade<=30&&idade>=21){
           float p2=0;
            float f2=0;
            p2+=1;
            f2+=peso;
            media2= f2/p2;  
          }else if(idade>30){
            float p3=0;
            float f3=0;
            p3+=1;
            f3+=peso;
            media3= f3/p3;
          }}
          System.out.println("A media dos pesos de 1 a 10 anos é:"+ media);
          System.out.println("A media dos pesos de 11 a 20 anos é:"+ media1);
          System.out.println("A media dos pesos de 21 a 30 anos é:"+ media2);
          System.out.println("A media dos pesos acima dos 30 é:"+ media3);
    }  }

