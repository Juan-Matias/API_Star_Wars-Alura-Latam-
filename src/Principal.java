import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();

        System.out.println("Escriba el número de la película de Star Wars (1 al 6):");
        try {
            int numeroDePelicula = Integer.parseInt(lectura.nextLine());

            if (numeroDePelicula < 1 || numeroDePelicula > 6) {
                System.out.println("Solo hay 6 películas numeradas disponibles.");
                return;
            }

            Pelicula pelicula = consulta.buscaPelicula(numeroDePelicula);
            System.out.println(pelicula);

            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            generador.guardarJson(pelicula);

            System.out.println("Película guardada exitosamente en un archivo JSON.");
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido.");
        } catch (RuntimeException | IOException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Finalizando la aplicación.");
        }
    }
}
