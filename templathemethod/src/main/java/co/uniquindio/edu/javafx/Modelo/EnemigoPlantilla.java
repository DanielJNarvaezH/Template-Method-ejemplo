package co.uniquindio.edu.javafx.Modelo;

public abstract class EnemigoPlantilla {

    public abstract void setSkills();
    public abstract void ataque();
    public abstract void proteccion();
    public abstract void resultado();

    public final void template() {
        setSkills();
        ataque();
        proteccion();
        resultado();
    }
}
