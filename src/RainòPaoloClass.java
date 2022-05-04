/**
 * versione 0:errata
 * @author Paolo
 * <html><h1>Classe per il calcolo del fattoriale</h1>
 * <S>Classe 4ai</S>
 * <c>04/05/2022</c>
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
			fatt=fatt+1;
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
