package principal;

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
    public Persona(){

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


    public void mayorEdad(){

        if(this.edad>=18){

            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
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
