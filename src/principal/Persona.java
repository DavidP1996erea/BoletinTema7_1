package principal;

import java.util.Scanner;

enum Genero{
    H, M, O
}

public  class Persona implements  Comparable<Persona> {


    /**
     * Programa que estudia el diseño para un tipo de persona, del que se recoge diferentes atributos.
     *  Atributos de la clase Persona:
     *      - nombre (String)
     *      - edad (int)
     *      - DNI (String)
     *      - género (que será un enum)
     *      - peso (double)
     *      - altura (double)
     *
     *
     * Métodos:
     *
     * - Calcular IMC
     * - Saber si es mayor de edad
     */


    private String nombre;
    private int edad;
    private String dni;
    private Genero genero;
    private double altura;
    private double peso;

    // Constructor por defecto
    public Persona( int edad){

        this.edad=edad;
    }

    /**
     * @param nombre
     * @param edad
     * @param dni
     * @param genero
     * @param altura
     * @param peso
     */

    // Constructor con valores

    public Persona(String nombre, int edad, String dni, Genero genero, double altura, double peso){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
        this.genero=genero;
        this.altura=altura;
        this.peso=peso;

    }

    /**
     * Constructor copia, asigna los atributos de la clase al objeto creado.
     * @param persona
     */
    public Persona( Persona persona){
        this.nombre=persona.nombre;
        this.edad=persona.edad;
        this.dni=persona.dni;
        this.genero=persona.genero;
        this.altura=persona.altura;
        this.peso=persona.peso;
    }

    /**
     * Método que no necesita valores de entrada, que calcula el IMC de la persona
     * que llame al método. Su salida es 1 en caso de que sea sobrepeso, -1 que sea
     * delgadez y 0 en caso de que sea saludable.
     *
     * @return imc
     */
    public int IMC(){
        int imc;

        if(this.peso/Math.pow(this.altura,2) < 18.5){

            imc=-1;
        }else if(this.peso/Math.pow(this.altura,2) > 25){

            imc=1;

        }else {
            imc=0;
        }
        return imc;
    }


    /**
     * Método sin valores de entrada que devuelve si la persona que llama al objeto es mayor
     * o menor de edad.
     */
    public void mayorEdad(){

        if(this.edad>=18){

            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }


    public static void pesoMedio(Persona[] listaPersonas){


        double pesoTotal=0;

        for (Persona x:listaPersonas){

            pesoTotal=pesoTotal+x.getPeso();
        }
        pesoTotal=pesoTotal/ listaPersonas.length;

        System.out.println("El peso medio es: " + pesoTotal);

    }

    public static void alturaMedia(Persona[] listaPersonas){

        double alturaTotal=0;

        for (Persona x:listaPersonas){

            alturaTotal=alturaTotal+x.getAltura();
        }
        alturaTotal=alturaTotal/ listaPersonas.length;

        System.out.println("La altura media es: " + alturaTotal);

    }


    public static void edadMedia(Persona[] listaPersona){
        int edadTotal=0;

        for (Persona x:listaPersona){

            edadTotal=edadTotal+x.getEdad();
        }
        edadTotal=edadTotal/ listaPersona.length;

        System.out.println("La edad media es: " + edadTotal);

    }


    public static void genero(Persona[] listaPersonas){

        int contadorH=0;
        int contadorM=0;

        for (Persona x:listaPersonas){
            if(x.getGenero()==Genero.H){
                contadorH++;
            }else if(x.getGenero()==Genero.M){
                contadorM++;
            }

        }

        System.out.println("La cantidad de hombres es: " + contadorH);
        System.out.println("La cantidad de mujeres es: " + contadorM);

    }


    public static void menu(Persona [] personas){

        Scanner sc = new Scanner(System.in);
        int opcion=0;
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

                    pesoMedio(personas);

                    break;

                case 2:

                    alturaMedia(personas);

                    break;

                case 3:

                    edadMedia(personas);

                    break;

                case 4:

                    genero(personas);

                    break;

                default:

                    if(opcion!=5) {
                        System.out.println("Opción equivocada");
                    }
            }
        }
    }



    public void anadirPersonas(Persona [] personas){

        Scanner sc = new Scanner(System.in);

        Persona dasdas = null;
        System.out.println("Introduce la cantidad de personas a introducir");
        int persona=sc.nextInt();

        for(int i =persona; i>0  ;i--){

            System.out.println("Introduzca la edad");
            dasdas.setEdad(sc.nextInt());


            personas[i]= dasdas;



        }



    }

    // Métodos Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public int compareTo(Persona o) {

        if(this.nombre.compareTo(o.getNombre())<0){

            return -1;
        }else if(this.nombre.compareTo(o.getNombre())==0){

            return 0;
        }else {
            return 1;
        }
    }
}
