package collections;

public class ArrayExample {

    public static void main(String[] args) {
        System.out.println("La cantidad de notas requerida es " + sumatoriaNotas());

    }

    public static int sumatoriaNotas(){

        double notas[] = new double [10];
        notas[0] = 4.0;notas[5] = 3.0;
        notas[1] = 5.0;notas[6] = 5.0;
        notas[2] = 4.5;notas[7] = 2.7;
        notas[3] = 4.6;notas[8] = 1.5;
        notas[4] = 5.4;notas[9] = 4.2;

        double sumatoria = 0.0;
        int sumaAlcanzada = -1;
        int cantidadNotas = 0;
        for (int i = 0; i < notas.length && sumaAlcanzada==-1; i++){
            sumatoria = sumatoria + notas[i];
            cantidadNotas++;
            if (sumatoria > 30.0){
                sumaAlcanzada = cantidadNotas;
            }
        }
        return sumaAlcanzada;
    }



}
