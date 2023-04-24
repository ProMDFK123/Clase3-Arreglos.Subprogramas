package ResumenPpt;

public class Subprograma {
    public static void main(String[] args) {
        saludar(26112022, "Cata");
        float division = dividir(23,432);
        float division2 = dividir(5,0);
        if(division==-1||division2==-1){
            System.out.println("No fue posible realizar la division por 0.");
        }
        System.out.println(division);
    }

    public static void saludar(int x,String nombre){
        System.out.println("Hola "+ nombre);
    }

    public static float dividir(float x, float y){
        if(y==0){
            System.out.println("No se puede dividir por 0.");
            return -1;
        }
        return x/y;
    }
}
