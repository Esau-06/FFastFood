import java.util.Scanner;

public class Metodos {
     public int[][] LlenarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int) (Math.random() * 100 + 1);

            }
        }
        return m;
    }

    public void MostrarMatriz(int[][] m) {
        System.out.println("mostremos la matriz");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " - ");
            }
            System.out.println();
        }
    }

    public ObjVillalobos[][] LLenarMatriz(ObjVillalobos[][] m, Scanner sc) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjVillalobos o = new ObjVillalobos();
                System.out.println("Ingrese el Nombre");
                o.setNombre(sc.next());
                System.out.println("ingrese el Stock ");
                o.setStock(sc.nextInt());
                System.out.println("Ingrese el precio ");
                o.setPrecio(sc.nextDouble());
                m[i][j] = o;
            }
        }
        return m;
    }

    public void MostrarMatriz(ObjVillalobos[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Nombre: " + m[i][j].getNombre());
                System.out.println("Stock: " + m[i][j].getStock());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("'----------------------------------------- '\n");
            }

        }
    }

    public ObjVillalobos[][] FusionarMatrices(ObjVillalobos[][] m1,ObjVillalobos[][] m2) {

    int n = m1.length;
    ObjVillalobos[][] resultado = new ObjVillalobos[n][n];

    // 1️⃣ Copiar primera tienda
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            resultado[i][j] = m1[i][j];
        }
    }

    // 2️⃣ Recorrer segunda tienda
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {

            ObjVillalobos producto2 = m2[i][j];
            boolean encontrado = false;

            // Buscar si ya existe en resultado
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < n; y++) {

                    if (resultado[x][y] != null && resultado[x][y].getNombre().equalsIgnoreCase(producto2.getNombre())) {

                        // Si existe → sumar stock
                        int nuevoStock =
                                resultado[x][y].getStock() +
                                producto2.getStock();

                        resultado[x][y].setStock(nuevoStock);
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado) break;
            }

            // Si no existe → agregarlo en la misma posición
            if (!encontrado) {
                resultado[i][j] = producto2;
            }
        }
    }

    return resultado;
    }
}