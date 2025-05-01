import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {
    public void guardarJson(Pelicula pelicula) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Limpia el nombre del archivo
        String nombreArchivo = pelicula.title()
                .replaceAll("[^a-zA-Z0-9\\s]", "") // Quita caracteres especiales
                .replaceAll("\\s+", "_");         // Reemplaza espacios por "_"

        FileWriter escritura = new FileWriter(nombreArchivo + ".json");
        escritura.write(gson.toJson(pelicula));
        escritura.close();
    }
}
