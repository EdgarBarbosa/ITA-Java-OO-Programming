package producao;

import java.sql.Date;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1,pessoa2,pessoa3;
		
		pessoa1 = new Pessoa(new Date(81,0,21));
		pessoa2 = new Pessoa(new Date(100,6,2));
		pessoa3 = new Pessoa(new Date(95,10,29));
		
		System.out.println("pessoa1 idade = " +pessoa1.getIdade() + " Signo: " + pessoa1.getSigno());
		System.out.println("pessoa2 idade = " +pessoa2.getIdade() + " Signo: " + pessoa2.getSigno());
		System.out.println("pessoa3 idade = " +pessoa3.getIdade() + " Signo: " + pessoa3.getSigno());
	}

}
