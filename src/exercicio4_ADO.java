/*Criar um algoritmo que leiao sexo(M ou F), a idade e o tempo de carteira de habilitação de várias
pessoas. Ao final, apresentar na tela a quantidade de mulheres(F) com idade entre 24 e 30 anos com 
tempo de carteira de habilitação superior a 3 anos.Para encerrar a entrada de dados o usuário deve
digitar uma idade menor ou igual a zero
 */ //Aluna: Kariane Coura BSI-1°Semestre
import java.util.Scanner;
public class exercicio4_ADO {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        int num = 1, temp=0, idade=0,  qtd=0;
        String se;
           System.out.println("Qual o sexo da "+num+"° pessoa(F/M)?"); 
           se=leitor.next();
           System.out.println("Qual a idade da "+ num+"° pessoa?");
           idade=leitor.nextInt();
           while(idade>0){
           if (se.equalsIgnoreCase("F")||se.equalsIgnoreCase("M")){
              System.out.println("Quanto tempo de carteira você tem?");
             temp=leitor.nextInt();
            }  if(se.equalsIgnoreCase("F")&&idade>24&&idade<30&&temp>3){
                qtd++;
            } 
            num++;
            System.out.println("Qual o sexo da "+num+" pessoa(F/M)?"); 
           se=leitor.next();
            System.out.println("Qual a idade da "+ num+" pessoa?");
           idade=leitor.nextInt();
             if(idade<=0){
           System.out.println("A quantidade de mulheres que possuem idade entre 24 e 30 anoos e carteira "
                   + "de habilitação superior a 3 anos é/são:" +(qtd) );
           break;
       }   
    }
    }
}



