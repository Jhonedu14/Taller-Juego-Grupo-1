/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Agrege clase Invetario
package problema1_juegoderoles;
public class Problema1_Inventario { 
    private Problema1_Arma arma;
    private Problema1_Armadura armadura;

    public void equipar(Problema1_Arma arma) { this.arma = arma; }
    public void equipar(Problema1_Armadura armadura) { this.armadura = armadura; }
    
    public int getBonoAtaque() { return (arma != null) ? arma.getModificador() : 0; }
    public int getBonoDefensa() { return (armadura != null) ? armadura.getModificador() : 0; }
}