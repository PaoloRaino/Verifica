/**
 * versione 2:GitHub
 * @author Paolo
 * <html><h1>Classe per il calcolo del fattoriale</h1>
 * <b>Rain� Paolo</b>
 * <U>Classe 4ai</U>
 * <i>04/05/2022</i>
 * </html>
 */
public class Rain�PaoloClass {
/**
 * Costruttore senza parametri
 */
	public Rain�PaoloClass(){};
/**
 * 
 * @param n: numero da cui fare il fattoriale
 * @return fattoriale di n
 */
	public int rain�Met(int n) {
		int fatt;
		int i;
		fatt =1;
		for(i=1; i<=n; i++)
		{
			fatt=fatt*i;// l'errore era che il programma doveva moltiplicare per "i" e non sommare per "i";
		}
		return fatt;
	}
/**
 * Main di classe per provare
 * 
 */
	public static void main(String[] args) {
		Rain�PaoloClass r= new Rain�PaoloClass();
		System.out.println(r.rain�Met(6));
	}
}
