package atividade1;

public class VerificaNumeroPrimo {

    public static void main(String[] args) {
        System.out.println("Ola mundo!");
        int resultado = verificaNumeroPrimo(1232132131);
        System.out.println("Resultado: " + resultado);
    }

    public static int verificaNumeroPrimo(Integer n) {
        boolean isPrimo = true;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrimo = false;
                break;
            }
        }

        if (isPrimo) {
            return 1;
        } else {
            return 0;
        }
    }
}
