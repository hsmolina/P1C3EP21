
package actividad2pooe21;

//Importamos el java.lang.Math.sqrt para calcular la raiz
import static java.lang.Math.sqrt;
//Importamos el java.util.Scanner para registrar los datos escritos
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        
        //Título y datos
        System.out.println("Ejercicio propuesto #21");
        
        //Definimos la variable scanner de tipo Scanner para que registre las entradas
        Scanner scanner = new Scanner(System.in);

        //Pedimos al usuario digitar la medida de los lados A, B y C del triángulo equilatero
        System.out.print("Ingrese la medida del Lado A del triángulo: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entradaA = scanner.nextLine();
        double ladoA = Double.parseDouble(entradaA);
        
        System.out.print("Ingrese la medida del Lado B del triángulo: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entradaB = scanner.nextLine();
        double ladoB = Double.parseDouble(entradaB);
        
        System.out.print("Ingrese la medida del Lado C del triángulo: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entradaC = scanner.nextLine();
        double ladoC = Double.parseDouble(entradaC);
        
        //Operaciones
        double perimetro = ladoA+ladoB+ladoC;
        double semiperimetro = perimetro/2;
        double area = sqrt(semiperimetro*(semiperimetro-ladoA)*(semiperimetro-ladoB)*(semiperimetro-ladoC));     
        
        //Enseñar al usuario los valores de perimetro, altura y area del triángulo, indicando además que se muestre solo con 2 decimales
        System.out.println("El perimetro del triángulo es: " + perimetro);
        System.out.println("El semi perímetro del triángulo es: " + semiperimetro);
        System.out.println("El área del triángulo es: " + area);
        
    }
    
}
