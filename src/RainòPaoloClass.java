/**
 * versione 0:errata
 * @author Paolo
 * <html><h1>Classe per il calcolo del fattoriale</h1>
 * <S>Classe 4ai</S>
 * <c>04/05/2022</c>
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
			fatt=fatt+1;
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
