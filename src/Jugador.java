
public class Jugador {
	
	private String nombre;
	private Posicion posicion;
	private int dorsal;
	private int edad;
	private int goal = 0;
	private boolean activo = true;
	
	public Jugador() {}
	
	public Jugador (String _nombre, Posicion _posicion, int _dorsal, int _edad, int _goal, boolean _activo) {
		this.nombre = _nombre;
		this.posicion = _posicion;
		this.dorsal = _dorsal;
		this.edad = _edad;
		this.goal = _goal;
		this.activo = _activo;
	}
	
	public Jugador (String _nombre, Posicion _posicion, int _dorsal, int _edad, int _goal) {
		this.nombre = _nombre;
		this.posicion = _posicion;
		this.dorsal = _dorsal;
		this.edad = _edad;
		this.goal = _goal;
	}
	
	//getters
	public String getnombre() {return this.nombre;}
    public Posicion getposicion() {return this.posicion;}
    public int getdorsal() {return this.dorsal;}
    public int getedad() {return this.edad;}
    public int getgoal() {return this.goal;}
    public boolean isactivo() {return this.activo;}
	//setters
    public void setnombre(String nombre) {this.nombre = nombre;}
    public void setposicion(Posicion posicion) {this.posicion = posicion;}
    public void setdorsal(int dorsal) {this.dorsal = dorsal;}
    public void setedad(int edad) {this.edad = edad;}
    public void set(int goal) {this.goal = goal;}
    public void set(boolean activo) {this.activo = activo;}
    
}
