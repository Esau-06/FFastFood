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

    public ObjVillalobos[][] FucionarMatrices(ObjVillalobos[][] m, ObjVillalobos[][] m2, ObjVillalobos[][] mr) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                for (int i1 = 0; i1 < m.length; i1++) {
                    for (int j1 = 0; j1 < m.length; j1++) {
                        if (m[i][j].getNombre().equalsIgnoreCase(m2[i1][j1].getNombre())) {
                            m[i][j].setStock(m[i][j].getStock() + m2[i1][j1].getStock());
                        }
                    }
                }
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j].setStock(m[i][j].getStock());
                m[i][j].setNombre(m[i][j].getNombre());
                m[i][j].setPrecio(m[i][j].getPrecio());
            }
        }
        return m;
    }
    
}
