import models.Complemento;
import models.Heroe;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Heroe heroe1 = new Heroe("Equilibrado", "Equilibrado", 5, 5, 5, 5);
        Heroe heroe2 = new Heroe("Ataque", "Ataque", 3, 8, 4, 5);
        Heroe heroe3 = new Heroe("Defensa", "Defensa", 6, 4, 6, 6);
        Heroe heroe4 = new Heroe("Veloz", "Veloz", 4, 3, 5, 8);
        Complemento c1 = new Complemento("anillo", "anillo", 0, 2, 3, 0);
        Complemento c2 = new Complemento("espada", "espada", 0, 3, 0, 2);

        int op = 0, conf = 0, opCom = 0, conFin = 0;


        System.out.println("             HEROES");
        System.out.println("================================");
        System.out.println(heroe1);
        System.out.println();
        System.out.println();
        System.out.println(heroe2);
        System.out.println();
        System.out.println();
        System.out.println(heroe3);
        System.out.println();
        System.out.println();
        System.out.println(heroe4);
        System.out.println();
        System.out.println();



        do {

            do { //Recogida y validación del heroe
                System.out.print("Seleccione un heroe: ");
                op = Integer.parseInt(s.nextLine());
                if (op == 1) System.out.println("Has seleccionado el heroe equilibrado");
                if (op == 2) System.out.println("Has seleccionado el heroe ataque");
                if (op == 3) System.out.println("Has seleccionado el heroe defensa");
                if (op == 4) System.out.println("Has seleccionado el heroe veloz");
                if (op > 0 && op < 5) {
                    System.out.print("¿Desea continuar con este heroe?(1 para confirmar, 2 para volver a selccionar el heroe): ");
                    conf = Integer.parseInt(s.nextLine());
                } else System.out.println("Esa opción no es valida");
            } while (op < 1 || op > 4 || conf != 1);

            System.out.println();
            System.out.println();
            System.out.println(c1);
            System.out.println();
            System.out.println();
            System.out.println(c2);
            System.out.println();
            System.out.println();

            do { //Recogida y validación del complemento
                System.out.print("Seleccione un complemento para su heroe: ");
                opCom = Integer.parseInt(s.nextLine());
                if (opCom == 1) System.out.println("Has seleccionado el complemento anillo");
                if (opCom == 2) System.out.println("Has seleccionado el complemento espada");
                if (opCom > 0 && op < 2) {
                    conf = 0;
                    System.out.print("¿Desea continuar con este heroe?(1 para confirmar, 2 para volver a seleccionar el complemento): ");
                    conf = Integer.parseInt(s.nextLine());
                } else System.out.println("Esa opción no es valida");
            } while (opCom < 1 || opCom > 2 || conf != 1);

            do{
                System.out.println();
                System.out.print("Pulse 1 para confirmar la creación de personaje, pulsa 2 para volver a crear el personaje: ");
                conFin = Integer.parseInt(s.nextLine());
                if (conFin < 1 || conFin > 2) System.out.println("Opcion no valida");
            } while (conFin < 1 || conFin > 2);

        }while (conFin != 1);


        heroe1.calcularVidaTotal();
        heroe1.calcularDefensaTotal();
        heroe1.calcularFuerzaTotal();
        heroe1.calcularVelocidadTotal();
        heroe2.calcularVidaTotal();
        heroe2.calcularDefensaTotal();
        heroe2.calcularFuerzaTotal();
        heroe2.calcularVelocidadTotal();





    }
}
