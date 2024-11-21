
public class Entrenador {

	 private String nombre;
	 private int edad;
	 private int nTitulos;
	 
	 public Entrenador() {}
	    
	 public Entrenador(String _nombre, int _edad, int _nTitulos) {
		 this.nombre = _nombre;
		 this.edad = _edad;
		 this.nTitulos = _nTitulos;
	 }
	    
	//getters
	    public String getnombre() {return this.nombre;}
	    public int getedad() {return this.edad;}
	    public int getnTitulos() {return this.nTitulos;}
	//setters
	    public void setnombre(String nombre) {this.nombre = nombre;}
	    public void setedad(int edad) {this.edad = edad;}
	    public void setnTitulos(int nTitulos) {this.nTitulos = nTitulos;}
}
