import java.util.*;
/**
 * Programa que permite generar e imprimir primeros N terminos serie Fibonacci
 * 
 * @author Juan León - Jose Sotelo
 */
public class Fibonacci
{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero, entrada1,entrada2,i;

        System.out.print("Cantidad de terminos deseados ");
        numero = sc.nextInt();
        
        entrada1=1;
        entrada2=1; 

        System.out.print(entrada1 + " ");
        for(i=2;i<=numero;i++){
             System.out.print(entrada2 + " ");
             entrada2 = entrada1 + entrada2;
             entrada1 = entrada2 - entrada1;
        }
        System.out.println();
    }
}