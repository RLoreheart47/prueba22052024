public class Futbolista extends Personass {
    private int dorsal;
    private String demarcacion;
   
   

    public Futbolista(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
   
    @Override
    public void Concentracion(){
        System.out.println("Se deben de Concentrar el jugador");
    }

    @Override
    public void Viajar(){
        System.out.println("Deben de Vijar el jugador");
    }

    public void jugarPartido(){
        System.out.println("El futbolista juega partido");
    }

    public void entrenar(){
        System.out.println("El futbolista entrena");
    }

    
}
