
public class Ciudadano {
	   protected int posición;
	   protected String cedula;
	   protected String nombreCompleto;
	   protected boolean haVotado;

	   public Ciudadano(int posición, String cedula, String nombreCompleto) {
	       this.posición = posición;
	       this.cedula = cedula;
	       this.nombreCompleto = nombreCompleto;
	   }

	   public String getCedula() {
	       return cedula;
	   }

	   public void setCedula(String cedula) {
	       this.cedula = cedula;
	   }

	   public String getNombreCompleto() {
	       return nombreCompleto;
	   }

	   public void setNombreCompleto(String nombreCompleto) {
	       this.nombreCompleto = nombreCompleto;
	   }

	   public boolean haVotado() {
	       return haVotado;
	   }

	   public void setHaVotado(boolean haVotado) {
	       this.haVotado = haVotado;
	   }

	   public int getPosición() {
	       return posición;
	   }

	   @Override
	   public String toString() {
	       return "Ciudadano " + '\n' +
	               "Cédula: " + cedula + '\n' +
	               "Nombre Completo: " + nombreCompleto + '\n' +
	               "Ha votado? " + haVotado + '\n';
	   }
	}
