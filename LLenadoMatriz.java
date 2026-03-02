import java.util.Scanner;

public class LLenadoMatriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Metodos M = new Metodos();

        System.out.println("Ingrese la dimension del almacen:");
        int n = sc.nextInt();

        ObjVillalobos[][] tienda1 = new ObjVillalobos[n][n];
        ObjVillalobos[][] tienda2 = new ObjVillalobos[n][n];

        System.out.println("Vamos a llenar la primera tienda:");
        tienda1 = M.LLenarMatriz(tienda1, sc);

        System.out.println("Primera tienda:");
        M.MostrarMatriz(tienda1);

        System.out.println("Vamos a llenar la segunda tienda:");
        tienda2 = M.LLenarMatriz(tienda2, sc);

        System.out.println("Segunda tienda:");
        M.MostrarMatriz(tienda2);

        ObjVillalobos[][] resultado =
                M.FusionarMatrices(tienda1, tienda2);

        System.out.println("Matriz fusionada:");
        M.MostrarMatriz(resultado);
    }
}