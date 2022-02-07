package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);

        int opcion=0;

        ArrayList<Persona> personas = new ArrayList<>();
        Persona p1 = new Persona("Caballo", 17, "asdfaf", Genero.H, 1.67, 57 );
        Persona p2 = new Persona("Burro", 25, "63684as", Genero.H, 1.89, 80 );
        Persona p3 = new Persona("Luis", 8, "5684418s", Genero.M, 1.5, 60 );
        Persona p4 = new Persona("Ruben", 18, "9648s", Genero.M, 2.67, 75 );
        Persona p5 = new Persona("Angel", 29, "iaf89", Genero.M, 1.7, 74 );


        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);

        p5.mayorEdad();
        p3.mayorEdad();


        Collections.sort(personas);

        for(Persona x : personas) {
            System.out.println(x.getNombre());

        }


        while (opcion!=5) {
            System.out.println("Introduce el número de la tarea a realizar:");
            System.out.println("1. Peso medio");
            System.out.println("2. Altura media");
            System.out.println("3. Edad media");
            System.out.println("4. Cantidad de hombres y mujeres");
            System.out.println("5. Salir ");
            opcion=sc.nextInt();



            switch (opcion) {

                case 1:

                    double pesoTotal=0;

                    for (Persona x:personas){

                        pesoTotal=pesoTotal+x.getPeso();
                    }
                    pesoTotal=pesoTotal/ personas.size();

                    System.out.println("El peso medio es: " + pesoTotal);

                    break;

                case 2:
                    double alturaTotal=0;

                    for (Persona x:personas){

                        alturaTotal=alturaTotal+x.getAltura();
                    }
                    alturaTotal=alturaTotal/ personas.size();

                    System.out.println("La altura media es: " + alturaTotal);

                    break;

                case 3:

                    int edadTotal=0;

                    for (Persona x:personas){

                        edadTotal=edadTotal+x.getEdad();
                    }
                    edadTotal=edadTotal/ personas.size();

                    System.out.println("La edad media es: " + edadTotal);

                    break;

                case 4:
                    int contadorH=0;
                    int contadorM=0;
                    for (Persona x:personas){

                        if(x.getGenero()==Genero.H){
                            contadorH++;
                        }else if(x.getGenero()==Genero.M){
                            contadorM++;
                        }

                    }

                    System.out.println("La cantidad de hombres es: " + contadorH);
                    System.out.println("La cantidad de mujeres es: " + contadorM);
                    break;

            }

        }


    }
}
