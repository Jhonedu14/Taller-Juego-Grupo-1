/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1_juegoderoles;

public class Problema1_EstadoEnvenenado implements Problema1_IEstadoAlternado {
    private int turnos = 3;
    @Override
    public void aplicarEfecto(Problema1_Personaje p) {
        if (turnos > 0) {
            p.recibirDanoDirecto(5);
            System.out.println("! " + p.getNombre() + " sufre 5 de daño por veneno.");
            turnos--;
        }
    }
    @Override public boolean haTerminado() { return turnos <= 0; }
}