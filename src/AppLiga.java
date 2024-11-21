
public class AppLiga {

	public AppLiga() {
		
	}
	public static void main(String[] args) {
		
		//---------------------------------Entrenador---------------------------------
			//mario
		Entrenador en1_1 = new Entrenador();
		en1_1.setnombre("Mario");
		en1_1.setedad(43);
		en1_1.setnTitulos(200);
			//sonic
		Entrenador en1_2 = new Entrenador ("Sonic", 33, 30);
		
		//---------------------------------Jugadores---------------------------------
			//mario
		Jugador j1_1=new Jugador ("Luigi", Posicion.DELANTERO, 10, 25, 2, true);
		Jugador j2_1=new Jugador ("Peach", Posicion.CENTRAL, 8, 21, 1, true);
		Jugador j3_1=new Jugador ("Yoshi", Posicion.PORTERO, 1, 24, 0, true);
		Jugador j4_1=new Jugador ("Daisy", Posicion.DELANTERO, 20, 18, 3, true);
		Jugador j5_1=new Jugador ("Bowser", Posicion.DEFENSA, 66, 34, 0, true);
		Jugador j6_1=new Jugador ("Toad", Posicion.CENTRAL, 9, 18, 2, true);
		Jugador j7_1=new Jugador ("Todette", Posicion.PORTERO, 6, 15, 0, true);
		Jugador j8_1=new Jugador ("Pauline", Posicion.DEFENSA, 28, 40, 1, true);
		Jugador j9_1=new Jugador ("Wario", Posicion.DEFENSA, 50, 45, 0, true);
		Jugador j10_1=new Jugador ("Waluigi", Posicion.CENTRAL, 51, 44, 1, true);
			//sonic
		Jugador j1_2=new Jugador ("Tails", Posicion.CENTRAL, 2, 8, 1, true);
		Jugador j2_2=new Jugador ("Amy", Posicion.DELANTERO, 5, 9, 4, true);
		Jugador j3_2=new Jugador ("Knuckels", Posicion.DEFENSA, 8, 12, 0, true);
		Jugador j4_2=new Jugador ("Shadow", Posicion.DELANTERO, 10, 15, 3, true);
		Jugador j5_2=new Jugador ("Rouge", Posicion.DEFENSA, 11, 11, 2, true);
		Jugador j6_2=new Jugador ("Blaze", Posicion.CENTRAL, 9, 9, 1, true);
		Jugador j7_2=new Jugador ("EggMan", Posicion.PORTERO, 1, 50, 0, true);
		Jugador j8_2=new Jugador ("Big", Posicion.DEFENSA, 7, 8, 1, true);
		Jugador j9_2=new Jugador ("Caotix", Posicion.CENTRAL, 123, 12, 2, true);
		Jugador j10_2=new Jugador ("Charmy", Posicion.PORTERO, 13, 10, 0, true);
		
		//---------------------------------Equipos---------------------------------
		 Equipo eq1 = new Equipo("MarioBros", "MushrromKindom");

		 Equipo eq2 = new Equipo("Sonic", "GreenHills");
		 eq2.jugadores[0]=j1_2;
		 
		 Equipo eq3 = new Equipo();
		 eq3.setnombre("Pokemon");
		 eq3.setestadio("Region");
		 
		 //---------------------------------FicharEntrenadores---------------------------------
		 	//1 a 1
		 eq1.entrenadores[0]=en1_1;
		 
		 eq2.entrenadores[0]=en1_2;
		 	//todos
		 Entrenador[] cjto1en = {en1_1};
		 
		 //---------------------------------FicharJugadores---------------------------------
		 	//1 a 1
		 eq1.jugadores[0]=j1_1;
		 eq1.jugadores[1]=j2_1;
		 
		 eq2.jugadores[0]=j1_2;
		 eq2.jugadores[1]=j2_2;
		 	//todos a la vez, tb se puede usar el metodo constructor para cear uno nuevo
		 Jugador[] cjto_1j = {j1_1, j2_1, j3_1, j4_1, j5_1, j6_1,j7_1, j8_1, j9_1, j10_1};
		 eq1.jugadores = cjto_1j;
		 Jugador[] cjto_2j = {j1_2, j2_2, j3_2, j4_2, j5_2, j6_2,j7_2, j8_2, j9_2, j10_2};
		 eq2.jugadores = cjto_2j;

	}//main

}//class
