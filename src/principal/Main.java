package principal;
import java.util.Arrays;

import static principal.Persona.*;

public class Main {

    public static void main(String[] args) {
	// write your code here




        Persona p1 = new Persona("Caballo", 17, "asdfaf", Genero.H, 1.67, 57 );
        Persona p2 = new Persona("Burro", 25, "63684as", Genero.H, 1.89, 80 );
        Persona p3 = new Persona("Luis", 8, "5684418s", Genero.M, 1.5, 60 );
        Persona p4 = new Persona("Ruben", 18, "9648s", Genero.M, 2.67, 75 );
        Persona p5 = new Persona("Angel", 29, "iaf89", Genero.O, 1.7, 74 );

        Persona [] personas= {p1,p2,p3,p4,p5};

        p5.mayorEdad();
        p3.mayorEdad();


        Arrays.sort(personas);
        for(Persona x : personas) {
            System.out.println(x.getNombre());

        }
        menu(personas);







    }


}
