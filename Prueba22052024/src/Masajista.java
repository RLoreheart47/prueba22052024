public class Masajista extends Personass {
    private int aniosexperencia;
    
    public Masajista(int aniosexperencia) {
        
        this.aniosexperencia = aniosexperencia;
    }
       public int getAniosexperencia() {
        return aniosexperencia;
    }
    public void setAniosexperencia(int aniosexperencia) {
        this.aniosexperencia = aniosexperencia;
    }
    public Masajista(int id, String nombre, String apellido, int edad, String nombre2, int aniosexperencia) {
        super(id, nombre, apellido, edad);
        nombre = nombre2;
        this.aniosexperencia = aniosexperencia;
    }



    @Override
    public void Concentracion(){
        System.out.println("Se deben de Concentrar el Masajista");
    }

    @Override
    public void Viajar(){
        System.out.println("Deben de Vijar el Masajista");
    }

    public void darMasaje(){
        System.out.println("Da Masaje");
    }
}
