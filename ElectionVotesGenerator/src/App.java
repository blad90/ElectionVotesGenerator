import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
	
	public static void main(String[] args){
	    Candidato gonzalo = new Candidato("Gonzalo Castillo", "PLD", 1, 0);
	    Candidato luis = new Candidato("Luis Abinader", "PRM", 2, 0);
	    Candidato guillermo = new Candidato("Guillermo Moreno", "ALPAIS", 8,0);
	    Candidato leonel = new Candidato("Leonel Fernández", "FP", 18, 0);
	    Candidato ismael = new Candidato("Ismael Reyes", "PDI", 23,0);
	    Candidato juan = new Candidato("Juan Cohen Sander", "PNVC",26,0);
	
	    Stack<Candidato> boleta = new Stack();
	    boleta.push(gonzalo);
	    boleta.push(luis);
	    boleta.push(guillermo);
	    boleta.push(leonel);
	    boleta.push(ismael);
	    boleta.push(juan);
	
	    Ciudadano c1 = new Ciudadano(1,"402-939393-5","José Pérez");
	    Ciudadano c2 = new Ciudadano(2,"402-223344-4","María López");
	    Ciudadano c3 = new Ciudadano(3,"402-123456-3","Rosa Mateo");
	    Ciudadano c4 = new Ciudadano(4,"402-654321-2","Jorge Mendez");
	    Ciudadano c5 = new Ciudadano(5,"402-112233-1","Pedro Moya");
	    Ciudadano c6 = new Ciudadano(6,"402-888888-6","John Pérez");
	    Ciudadano c7 = new Ciudadano(7,"402-333333-7","Reinaldo Gómez");
	    Ciudadano c8 = new Ciudadano(8,"402-222222-8","John Tejeda");
	    Ciudadano c9 = new Ciudadano(9,"402-111111-9","Félix Moreno");
	    Ciudadano c10 = new Ciudadano(10,"402-555555-9","Amilcar Beroa");
	
	    Queue<Ciudadano> votantes = new LinkedList<>();
	    votantes.add(c1);
	    votantes.add(c2);
	    votantes.add(c3);
	    votantes.add(c4);
	    votantes.add(c5);
	    votantes.add(c6);
	    votantes.add(c7);
	    votantes.add(c8);
	    votantes.add(c9);
	    votantes.add(c10);
	
	    Queue<Ciudadano> votantesOficiales = new LinkedList<>();
	
	    int conteo;
	    int votosEmitidos = 0;
	
	    for (int i = 1; i <= votantes.size(); i++) {
	        while(votantes.size() > 0){
	            conteo = (int) (Math.random() * 12);
	            if(conteo >= 0 && conteo <= 3){
	                gonzalo.votos++;
	                votosEmitidos++;
	                votantesOficiales.add(votantes.poll());
	            } else if(conteo >= 4 && conteo <= 7){
	                luis.votos++;
	                votosEmitidos++;
	                votantesOficiales.add(votantes.poll());
	            } else if(conteo >= 8 && conteo <= 11){
	                leonel.votos++;
	                votosEmitidos++;
	                votantesOficiales.add(votantes.poll());
	            }
	        }
	    }
	
	    System.err.println("NO votaron: " + votantes.size() + " personas.\n");
	    System.err.println("Votaron: " + votantesOficiales.size() + " personas.\n");
	    for (Ciudadano v : votantesOficiales) {
	        System.out.println(v.nombreCompleto + " : " + v.cedula);
	    }
	
	    double totalGonzalo = (double)gonzalo.votos/votosEmitidos * 100;
	    double totalLuis = (double)luis.votos/votosEmitidos * 100;
	    double totalLeonel = (double)leonel.votos/votosEmitidos * 100;
	
	    System.out.println("\n***RESULTADOS COMICIOS***");
	    System.out.println("GONZALO CASTILLO: " + gonzalo.votos + " votos." + "(" + (Math.round(totalGonzalo) + "%)"));
	    System.out.println("LUIS ABINADER: " + luis.votos + " votos." + "(" + (Math.round(totalLuis) + "%)"));
	    System.out.println("LEONEL FERNANDEZ: " + leonel.votos + " votos." + "(" + (Math.round(totalLeonel) + "%)"));
	    System.out.println("*** VOTOS EMITIDOS: " + votosEmitidos);
		}
}