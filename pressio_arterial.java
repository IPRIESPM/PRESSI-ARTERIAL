import java.util.Scanner;

/**
 * pressió-arterial
 */

public class pressio_arterial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int auxIntInput, parella = 0, totalParelles = 0;
        boolean parellaValida = true;

        int[] sistolica = new int[10];
        int[] diastolica = new int[10];

        int sistolicaAux = 0, diastolicaAux = 0;

        boolean semafor = false;

        System.out.println("Benvingut al programa de pressió arterial");
        System.out.println("----------------------------------------");
        System.out.print("Introdueix les mesures: ");
        while (!semafor) {
            if (scanner.hasNextInt()) {
                auxIntInput = scanner.nextInt();

                System.out.println("Numero introduït: " + auxIntInput + " Posició de la parella ");
                System.out.print(parella + " ¿es valida? " + parellaValida + "");

                if (auxIntInput >= 3 && auxIntInput <= 22) {
                    if (parella == 0) {
                        diastolicaAux = auxIntInput;
                    } else {
                        sistolicaAux = auxIntInput;
                    }
                } else {
                    System.out.println(" dada incorrecta");
                    parellaValida = false;
                    sistolicaAux = 0;
                    diastolicaAux = 0;
                }

                parella++;

                if (parella == 2) {
                    if (parellaValida) {
                        System.out.println(" parella valida");
                        sistolica[totalParelles] = sistolicaAux;
                        diastolica[totalParelles] = diastolicaAux;
                        totalParelles++;
                    } else {
                        System.out.println(" parella invalida");
                    }
                    parella = 0;
                    parellaValida = true;
                }

                if (totalParelles >= 2 && auxIntInput == 0 || totalParelles >= 10) {
                    semafor = true;
                    System.out.println("S'ha acabat el programa");
                }

            } else {
                scanner.next();
            }
        }
        scanner.close();

        System.out.println("total parelles: " + totalParelles);
        System.out.println("diastolica: ");
        for (int i : diastolica) {
            System.out.print(" " + i);
        }
        System.out.println("");
        System.out.println("sistolica: ");
        for (int i : sistolica) {
            System.out.print(" " + i);
        }
        System.out.println("");
    }
}