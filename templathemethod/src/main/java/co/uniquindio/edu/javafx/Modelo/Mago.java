package co.uniquindio.edu.javafx.Modelo;

public class Mago extends EnemigoPlantilla{

    @Override
    public void setSkills() {
        System.out.println("Health: 100, Mana: 100, Stamina: 50");
    }

    @Override
    public void ataque() {
        System.out.println("Mage attack");
    }

    @Override
    public void proteccion() {
        System.out.println("Mage protect");
    }

    @Override
    public void resultado() {
        System.out.println("Mage has survived");
    }
}
