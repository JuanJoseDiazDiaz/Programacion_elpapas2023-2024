package Boletin1;

public class Ej9 {
    public static void main(String[] args) {
        System.out.println(esPerfecto(6));
        for (int i = 1; i < 100; i++){
            if (esPerfecto(i)){
                System.out.printf("EL NUMERO %d es perfecto\n", i );
            }
        }


    }




    public static boolean esPerfecto(int num ) {
        int suma = 0;
        for (int i = 1 ; i < num/2; i++){
            if (num % i == 0){
                suma +=i ;
            }
        }
        return suma == num;
    }

}
