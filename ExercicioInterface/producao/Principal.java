
public class Principal {

	public static void main(String[] args) {
		Autoridade autoridadeInformal = new Autoridade("Jos�","Ningu�m");
		Autoridade autoridadeRespeitoso = new Autoridade("Eufr�sio","Bustamante",'M');
		Autoridade autoridadeRespeitosa = new Autoridade("Elizabete","Mascarenhas",'F');
		Autoridade autoridadeComTitulo = new Autoridade("C�ndido","Rondon","Marechal");
		
		System.out.println(autoridadeInformal.getTratamento());
		System.out.println(autoridadeRespeitoso.getTratamento());
		System.out.println(autoridadeRespeitosa.getTratamento());
		System.out.println(autoridadeComTitulo.getTratamento());
	}

}
