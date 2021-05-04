public class persona {
    int pisoFinal;
    int pisoSeleccionado;

    public int getPisoFinal() {
        return pisoFinal;
    }

    public int getPisoSeleccionado() {
        return pisoSeleccionado;
    }

    public void PisoAleatorio() {
        this.pisoFinal = (int) (Math.random() * 3 + 1);
    }

    public int CrearPersona(){
        pisoSeleccionado = (int) (Math.random() * 3 + 1);
        if (pisoSeleccionado < 1 || pisoSeleccionado > 3 ) {
            System.out.print("Este piso no existe");
        }
        return pisoSeleccionado;
    }

    public void llamarAlElevador() {
        PisoAleatorio();
        if (CrearPersona() == pisoFinal) {
            System.out.print("Se encuentra en su piso");
        }
    }
}
