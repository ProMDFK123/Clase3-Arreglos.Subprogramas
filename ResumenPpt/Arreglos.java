package ResumenPpt;

public class Arreglos {
    /*
    ====================
    = Unidimensionales =
    ====================

    -Se conocen como vectores.
    -Tienen un solo indice.
    -Cada componente del vector se direcciona mediante el
     nombre delarreglo seguido del numero correspondiente a
     la posicion.
     vector[n];
    -La primera posicion es 0.
     */
    public static void main(String[] args) {
        int[] fibonacci = new int[10]; //dato[] vector = new dato[n] -> inicializacion de arreglo
        fibonacci[0]=0;
        fibonacci[1]=1;

        for(int i = 2;i<fibonacci.length;i++){ //vector.length -> acceso al tamaño de la lista.
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }

        for (int i = 0; i < fibonacci.length; i++) {
            System.out.println(fibonacci[i]);
        }
    }

    /*
    ===================
    = Bidimensionales =
    ===================

    -Se les suele llamar Matrices.
    -Poseen 2 indices.
    -Se accede a una posicion dando el nombre de la matriz, seguido de 2 indices,
     que representan las filas y columnas, respectivamente.
     */
}
