package refactor.ref2;

/*
Tarea: Reemplazar el número mágico 86400 con una constante descriptiva.
 */
public class Timer {
    void startTimer() {
        // Espera 86400 segundos (24 horas)

        final int ConstTiempoEspera1DiaEnSegundos = 86400;

        Thread.sleep(ConstTiempoEspera1DiaEnSegundos);
    }
}
