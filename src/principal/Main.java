package principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Persona> personas = new ArrayList<>();
        Persona p1 = new Persona("Caballo", 17, "asdfaf", Genero.H, 1.67, 57 );
        Persona p2 = new Persona("Burro", 25, "63684as", Genero.H, 1.89, 80 );
        Persona p3 = new Persona("Luis", 8, "5684418s", Genero.M, 1.5, 20 );
        Persona p4 = new Persona("Ruben", 18, "9648s", Genero.M, 2.67, 75 );
        Persona p5 = new Persona("Angel", 29, "iaf89", Genero.O, 1.7, 150 );


        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);

        Collections.sort(personas);

        for(Persona x : personas) {
            System.out.println(x.getNombre());

        }


    }
}
