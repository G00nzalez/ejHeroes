import models.Complemento;
import models.Heroe;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Heroe heroe1 = new Heroe("Primero", "PRIMERO", 5, 5, 5, 5);
        Heroe heroe2 = new Heroe("Segundo", "SEGUNDO", 3, 8, 4, 7);
        Complemento c1 = new Complemento("anillo", "anillo", 5, 5, 5, 5);

        heroe1.setComplemento(c1);
        heroe2.setComplemento(null);


        heroe1.calcularVidaTotal();
        heroe1.calcularDefensaTotal();
        heroe1.calcularFuerzaTotal();
        heroe1.calcularVelocidadTotal();
        heroe2.calcularVidaTotal();
        heroe2.calcularDefensaTotal();
        heroe2.calcularFuerzaTotal();
        heroe2.calcularVelocidadTotal();



        System.out.println(heroe1);
        System.out.println();
        System.out.println(heroe2);







    }
}
