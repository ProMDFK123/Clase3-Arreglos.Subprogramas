import java.util.*;

public class Tarea {
    /*
    Ejercicio diapo 6, 14 o 15
    pablo.salas@ce.ucn.cl
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double valor;
        double[] serie = new double[9999];
        System.out.println("Ingrese un valor para x: ");
        int x = in.nextInt();
        int posicion = 0;
        int indice = 1;
        valor = x;

        while (valor>=0.00001){
            serie[posicion] = valor;
            posicion++;
            indice+=2;
            valor = (x^indice)/indice;
        }

        for (int i = 0; i < serie.length; i++) {
            System.out.println(serie[i]);
        }
    }
}
