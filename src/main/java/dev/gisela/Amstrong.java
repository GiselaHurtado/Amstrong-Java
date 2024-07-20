package dev.gisela;

public class Amstrong {

    public static void main(String[] args) {
        int num = 371; 
        if (isAmstrong(num)) {
            System.out.println(num + " es un número de Amstrong");
        } else {
            System.out.println(num + " no es un número de Amstrong");
        }
    }
    public static boolean isAmstrong(int num) {
        int numOriginal = num;
        int ultimoDigito;
        double cantidadDigitos = Math.floor(Math.log10(num)) + 1;
        double suma = 0;

        while (num > 0) {
            ultimoDigito = num % 10;
            suma += Math.pow(ultimoDigito, cantidadDigitos);
            num /= 10;
        }

        return numOriginal == suma;
    }
}
        
    
