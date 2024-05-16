package co.uniquindio.edu.javafx.Modelo;

public class Guerrero extends EnemigoPlantilla {

    @Override
    public String setHabilidades() {
        String mensajeHabilidades = "Salud: 150, Mana: 0, Stamina: 150";
        return mensajeHabilidades;
    }

    @Override
    public String ataque() {
        String mensajeAtaque = ". El guerreo atacó";
        return mensajeAtaque;
    }

    @Override
    public String proteccion() {
        String mensajeProteccion =", se protegió";
        return mensajeProteccion;
    }

    @Override
    public String resultado() {
        String mensajeResultado = ", ha sobrevivido";
        return mensajeResultado;
    }
}
