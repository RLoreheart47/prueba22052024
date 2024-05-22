public class App {
    public static void main(String[] args) throws Exception {
        

        Futbolista futbolista = new Futbolista(1, "Juan", "Amlo", 19, 20, "Central");
        Entrenador entrenador = new Entrenador(2, "Emiliano", "Hernandez", 13, 1);
       Masajista masajista = new Masajista(1, "Julian", "Suarez", 20, null, 2020);


        System.out.println("Su nombre del futbolista es " + futbolista.getNombre()+ " y tiene que ");
        futbolista.Concentracion();

        System.out.println("Su nombre del entrenador es " + entrenador.getNombre()+ " y tiene que ");
        entrenador.Viajar();

        System.out.println("Su nombre del masajista es " + masajista.getNombre()+ " y tiene que ");
        masajista.darMasaje();
        
        
    }
}
