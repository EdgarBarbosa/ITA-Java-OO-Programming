
public class Principal {

	public static void main(String[] args) {
		Autoridade autoridadeInformal = new Autoridade("José","Ninguém");
		Autoridade autoridadeRespeitoso = new Autoridade("Eufrásio","Bustamante",'M');
		Autoridade autoridadeRespeitosa = new Autoridade("Elizabete","Mascarenhas",'F');
		Autoridade autoridadeComTitulo = new Autoridade("Cândido","Rondon","Marechal");
		
		System.out.println(autoridadeInformal.getTratamento());
		System.out.println(autoridadeRespeitoso.getTratamento());
		System.out.println(autoridadeRespeitosa.getTratamento());
		System.out.println(autoridadeComTitulo.getTratamento());
	}

}
