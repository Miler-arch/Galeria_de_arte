import sun.security.jca.GetInstance;

import java.util.Calendar;

public class Main {
    private static Object Exposiciones;
    private static Object Obras;
    private static Object Propietarios;

    public static void main(String[] args) {
        //Exposiciones
        Exposiciones cuento= new Exposiciones("El cuento del tio","Ficticia",Calendar.getInstance().getTime(),Calendar.getInstance().getTime() );
        Exposiciones roca= new Exposiciones("La Roca de la suerte","Real",Calendar.getInstance().getTime(),Calendar.getInstance().getTime() );
        Exposiciones magica= new Exposiciones("La cascada magica","Real",Calendar.getInstance().getTime(),Calendar.getInstance().getTime() );
        //Obras
        Obras chaski= new Obras(766,"El chaski","Roberto Gonzales Huallpa","Dramatico",1100);
        Obras mujer= new Obras(855,"La mujer envenenada","Mario Rosales","Edad Media",5000);
        Obras carpintero= new Obras(994,"El carpintero","Matias Perez","Edad Moderna",7000);
        //Propietarios
        Propietarios luis= new Propietarios("Luis Rodriguez",8000);
        Propietarios marco= new Propietarios("Marco Ponce Guevara",7500);
        Propietarios jose= new Propietarios("Jose Alvarez Soto",8900);
        //Exposiciones
        System.out.println(cuento);
        System.out.println(roca);
        System.out.println(magica);
        //Obras
        System.out.println(chaski);
        System.out.println(mujer);
        System.out.println(carpintero);
        //Propietrarios
        System.out.println(luis);
        System.out.println(marco);
        System.out.println(jose);

    }
}
