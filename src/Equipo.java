import java.util.Arrays;

public class Equipo {

	public final int Total_J=10;
	public final int Total_E=1;

	private String nombre;
    private String estadio;
    public Jugador [] jugadores= new Jugador[Total_J];
    public Entrenador [] entrenadores = new Entrenador[Total_E];

    
    public Equipo() {}
    
    public Equipo(String _nombre, String _estadio) {
    	this.nombre = _nombre;
    	this.estadio = _estadio;
    }
    
    public Equipo(String _nombre, String _estadio, Jugador[] _jugadores, Entrenador[] _entrenadores) {
    	this.nombre = _nombre;
    	this.estadio = _estadio;
    	this.jugadores = _jugadores;
    	this.entrenadores = _entrenadores;
    }
    
  //getters
    public String getnombre() {return this.nombre;}
    public String getestadio() {return this.estadio;}
    public Jugador[] getjugadores() {return this.jugadores;}
    public Entrenador[] getentrenadores() {return this.entrenadores;}
//setters
    public void setnombre(String nombre) {this.nombre = nombre;}
    public void setestadio(String estadio) {this.estadio = estadio;}
    public void setjugadores(Jugador[] jugadores) {this.jugadores = jugadores;}
    public void setentrenadores(Entrenador[] entrenadores) {this.entrenadores = entrenadores;}
}
