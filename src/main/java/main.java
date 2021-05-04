public class main {

    int pisoActual = 1;
    boolean elevadorAbierto = false;
    int pisos = 3;
    int capacidadDelElevador = 0;
    int personas = 0;


    public void personaSubiendoAlElevador(){
        personas++;
        if (personas > 1){

        }else{
            System.out.print("solo puede entrar una persona");
        }


    }

    void personaEnElElevador(int persona) {
        capacidadDelElevador += persona;
        if (capacidadDelElevador == 1) {
            System.out.println("Se encuentra en el elevador");
        } else if (capacidadDelElevador == 0) {
            System.out.println("Elevador vacio");
        } else {
            System.out.println("No se permite mas personas");
        }
    }


    public int movimientoDelElevador(int pisoActual, int pisoFinal) {
        int aux;
        if (pisoActual < pisoFinal && pisoActual != pisoFinal) {
            aux = pisoFinal - pisoActual;
            pisoActual += aux;
        } else {
            aux = pisoActual - pisoFinal;
            pisoActual -= aux;
        }
        return pisoActual;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public boolean isElevadorAbierto() {
        return elevadorAbierto;
    }

    public int getPisos() {
        return pisos;
    }

    public int getCapacidadDelElevador() {
        return capacidadDelElevador;
    }

    public int getPersonas() {
        return personas;
    }

    public boolean getEstadoDelElevador() {
        return elevadorAbierto;
    }


}

