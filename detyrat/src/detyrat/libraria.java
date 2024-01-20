package detyrat;

public class libraria { 
	   class Libri {//kemi krijuar variablat
	        String Titulli;
	        String Autori;
	        String ISBN;
	        int vitiBotimit;

	        public void vendosInfo(String titulli, String autori, String isbn, int Vitibotimit) { //i kemi lidhur variablat dhe ja kemi dhente te njejtat element
	            Titulli = titulli;
	            Autori = autori;
	            ISBN = isbn;
	            vitiBotimit = Vitibotimit;
	        }

	        public void tregoInfo() { // e kemi krijuar se si printin se si do te shfaqen ne console
	            System.out.println("Titulli: " + Titulli);
	            System.out.println("Autori: " + Autori);
	            System.out.println("ISBN: " + ISBN);
	            System.out.println("Viti i Botimit: " + vitiBotimit);
	        }
	    }

	    class Libraria {
	        Libri[] librat; // kemi krijuat array librat

	        public Libraria() {
	            // kemi inicializuar gjatesin e elementeve ne array
	            librat = new Libri[3];
	            // kemi krjuar se ku do te ruhen array
	            librat[0] = new Libri();
	            librat[1] = new Libri();
	            librat[2] = new Libri();
	            // i kemi vendosur variablave elemente
	            librat[0].vendosInfo("Art Of War", "Sun Tzu", "9781599869773", 1080);
	            librat[1].vendosInfo("Meditation", "Marcus Aurelius", "1503280462", 1080);
	            librat[2].vendosInfo("The Prince", "Machiavellie", "0140447520", 1080);
	        }

	        public void shfaqLibrat() {
	            // ju kemi derguar elementet ne metoden tregoInfo
	            librat[0].tregoInfo();
	            System.out.println("");
	            librat[1].tregoInfo();
	            System.out.println("");
	            librat[2].tregoInfo();
	        }
	    }

	    	public static void main(String[] args) {
	        libraria instance = new libraria();
	        Libraria librariaInstance = instance.new Libraria();
	        librariaInstance.shfaqLibrat();
	    }
}
