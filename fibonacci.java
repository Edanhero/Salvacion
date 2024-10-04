public class fibonacci {
    public static void main(String[] args) {
        int numero_1=0;
        int numero_2=1;

        //Hasta 25, porque es mucha vaina
        for (int i=0; i<=25; i++){
            int numero_3=numero_1;
            numero_1=numero_2 + numero_3;
            numero_2=numero_3;

            System.out.println(numero_3);
        }
    }
}
