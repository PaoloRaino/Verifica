/**
 * versione 2:GitHub
 * @author Paolo
 * <html><h1>Classe per il calcolo del fattoriale</h1>
 * <b>Rainò Paolo</b>
 * <U>Classe 4ai</U>
 * <i>04/05/2022</i>
 * </html>
 */
public class RainòPaoloClass {
/**
 * Costruttore senza parametri
 */
	public RainòPaoloClass(){};
/**
 * 
 * @param n: numero da cui fare il fattoriale
 * @return fattoriale di n
 */
	public int rainòMet(int n) {
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
		RainòPaoloClass r= new RainòPaoloClass();
		System.out.println(r.rainòMet(6));
	}
}
