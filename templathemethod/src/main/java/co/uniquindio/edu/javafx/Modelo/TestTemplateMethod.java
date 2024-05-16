package co.uniquindio.edu.javafx.Modelo;

public class TestTemplateMethod { 
    public static void main(String[] args) {
       EnemigoPlantilla guerrero = new Guerrero();
       EnemigoPlantilla mago = new Mago();
       guerrero.template();
       mago.template();
    }

}
