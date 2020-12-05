    /*O número 3025 possui a seguinte caracteristica 30+25= 55 e 55^2=3025. Criar algoritmo que apresente 
na tela todos os numeros positivos de quatro algoritmos que possuem a caracteristica citada*/
//Aluna: Kariane Coura BSI-1°semestre
public class exercicio2_ADO {
    public static void main(String[] args) {
        System.out.println("==Valores==");
        int num=1000;
   while(num<9999){
    int num1=num/100;
    int num2=num-num1*100;
    int num3=num2+num1;
  if(Math.pow(num3, 2)==num){
          System.out.println("Os números possiveis são:"+ num);
      }
      num++;
}}}
           
    

