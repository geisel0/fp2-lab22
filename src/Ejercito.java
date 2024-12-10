import java.util.ArrayList;

public class Ejercito {
    private String reino;
    private ArrayList<Soldado> soldados;

    public Ejercito(String reino, Tablero tablero, String tipoTerritorio) {
        this.reino = reino;
        this.soldados = new ArrayList<>();
        generarSoldados(tablero, tipoTerritorio);
    }

    private void generarSoldados(Tablero tablero, String tipoTerritorio) {
        // Generar soldados aleatorios y colocarlos en el tablero
    }

    public boolean estaVacio() {
        return soldados.isEmpty();
    }

    public String getReino() {
        return reino;
    }
}

