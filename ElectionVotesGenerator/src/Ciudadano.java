
public class Ciudadano {
	   protected int posici�n;
	   protected String cedula;
	   protected String nombreCompleto;
	   protected boolean haVotado;

	   public Ciudadano(int posici�n, String cedula, String nombreCompleto) {
	       this.posici�n = posici�n;
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

	   public int getPosici�n() {
	       return posici�n;
	   }

	   @Override
	   public String toString() {
	       return "Ciudadano " + '\n' +
	               "C�dula: " + cedula + '\n' +
	               "Nombre Completo: " + nombreCompleto + '\n' +
	               "Ha votado? " + haVotado + '\n';
	   }
	}
