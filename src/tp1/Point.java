package tp1;


public class Point {
	
	private String  Nom;
	private int   Abscisse ;
	private int Ordonnée;
	public Point(int i, int j) {
		Abscisse = i;
		Ordonnée=j;
		
	}
	public Point(String ch) {
		// TODO Auto-generated constructor stub
		Nom = ch;
	}
	public Point(String ch, int i, int j) {
		Abscisse = i;
		Ordonnée=j;
		Nom = ch;

	}
	public void Affiche() {
		// TODO Auto-generated method stub
		System.out.println(Nom +" ( " + Abscisse +" , "+ Ordonnée +")" );
	}
	public void Translation(int i, int j) {
		Abscisse =  Abscisse+i;
		Ordonnée= Ordonnée+j;
		
	}
	public void TranslHoriz(int i) {
		Abscisse =  Abscisse+i;
		
	}
	public void TranslVert(int j) {
		Ordonnée= Ordonnée+j;
		
	}
	public void setAbscisse(int i) {
		Abscisse = i;
		
	}
	public void setNom(String ch) {
		Nom = ch;
		
	}
	public void setOrdonnée(int j) {
		Ordonnée=j;
		
	}
	public int getAbscisse() {
		
		return Abscisse;
	}
	public String getNom() {
		// TODO Auto-generated method stub
		return Nom;
	}
	public int getOrdonnée() {
		// TODO Auto-generated method stub
		return Ordonnée;
	}
	
}

