/*Uma loja está levantando o valor total de todas as mercadorias em estoque. Criar um algoritmo que 
leia o valor da mercadoria e pergunte "Mais mercadorias (S/N)?". Ao final, apresente na tela o 
total em estoque e a média de valores das mercadorias em estoque.
 */ //Aluna: Kariane Coura BSI-1°Semestre

 import java.util.Scanner;


public class exercicio5_ADO {

        public static void main(String[] args) {

        Scanner leitor=new Scanner(System.in);
        String simounao; 
        float valor, media = 0;
        int mercadoria=1, me = 0; 
        
        System.out.println("Qual o valor da  mercadoria "+mercadoria+"?");
        valor=leitor.nextFloat();
        System.out.println("Mais mercadoria (S/N)?");
        simounao=leitor.next();
        
        while(mercadoria>0){
             
         if(simounao.equals("s")){
             
            mercadoria++;
            System.out.println("Qual o valor da  mercadoria "+mercadoria+"?");
            valor=leitor.nextFloat()+valor;
            System.out.println("Mais mercadoria (S/N)?");
            simounao=leitor.next();

            }else if(simounao.equals("n")){
            
            me=mercadoria;
            media=valor/mercadoria;
            System.out.println("A media de valores dos produtos em estoque é:"+media+
                 "\nA quantidade de produtos é:"+me);
            mercadoria=0;
            }
        }
          
    }

}