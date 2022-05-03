
public class Candidato {
	   protected String nombreCompleto;
	   protected String partido;
	   protected int casilla;
	   protected int votos;

	   public Candidato(String nombreCompleto, String partido, int casilla, int votos) {
	       this.nombreCompleto = nombreCompleto;
	       this.partido = partido;
	       this.casilla = casilla;
	       this.votos = votos;
	   }

	   public String getNombreCompleto() {
	       return nombreCompleto;
	   }

	   public void setNombreCompleto(String nombreCompleto) {
	       this.nombreCompleto = nombreCompleto;
	   }

	   public String getPartido() {
	       return partido;
	   }

	   public void setPartido(String partido) {
	       this.partido = partido;
	   }

	   public int getCasilla() {
	       return casilla;
	   }

	   public void setCasilla(int casilla) {
	       this.casilla = casilla;
	   }

	   public int getVotos() {
	       return votos;
	   }

	   public void setVotos(int votos) {
	       this.votos = votos;
	   }

	   @Override
	   public String toString() {
	       return "\nCasilla (" + casilla + ')' + '\n' +
	               "Nombre Completo: " + nombreCompleto + '\n' +
	               "Partido: " + partido + '\n' +
	               "Votos: " + votos + '\n';
	   }
	}
