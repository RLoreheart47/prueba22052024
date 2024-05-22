public class Entrenador extends Personass{
    private int idFederacion;

    public Entrenador(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void Concentracion(){
        System.out.println("Se deben de Concentrar el Entrenador");
    }

    @Override
    public void Viajar(){
        System.out.println("Deben de Vijar el Entrenador");
    }
    
    public void dirijirPartido(){
        System.out.println("Entrenador dirige el partido");
    }

    public void dirijirEntrenamiento(){
        System.out.println("Entrenador dirige el entrenamiento");
    }

    

}
