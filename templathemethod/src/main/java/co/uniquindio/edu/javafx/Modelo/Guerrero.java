package co.uniquindio.edu.javafx.Modelo;

public class Guerrero extends EnemigoPlantilla {

    @Override
    public void setSkills() {
        System.out.println("Health: 150, Mana: 0, Stamina: 150");
    }

    @Override
    public void ataque() {
        System.out.println("Warrior attack");
    }

    @Override
    public void proteccion() {
        System.out.println("Warrior protect");
    }

    @Override
    public void resultado() {
        System.out.println("Warrior has survived");
    }
}
