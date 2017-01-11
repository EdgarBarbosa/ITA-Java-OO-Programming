package producao;

import java.util.Date;

public class Pessoa {
	
	Date dataDeNascimento;
	
	public int getIdade(){
		// convers�o da diferen�a de duas em milisegundos para anos
		return  (int) ( (Relogio.agora() - this.dataDeNascimento.getTime() )/1000/60/60/24/365 );
	};

	public Pessoa(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public  Date getDataNascimento(){
		
		return this.dataDeNascimento;
	}

	public String getSigno() {
		if((this.dataDeNascimento.getDate() >= 20 &&
				this.dataDeNascimento.getMonth() == 1) 
				||(this.dataDeNascimento.getDate() <= 20 
				&& this.dataDeNascimento.getMonth() == 2))
		return "Peixes";
		
		if((this.dataDeNascimento.getDate() >= 21 &&
				this.dataDeNascimento.getMonth() == 0) 
				||(this.dataDeNascimento.getDate() <= 19 
				&& this.dataDeNascimento.getMonth() == 1))
		return "Aqu�rio";
		
		if((this.dataDeNascimento.getDate() >= 22 &&
				this.dataDeNascimento.getMonth() == 11) 
				||(this.dataDeNascimento.getDate() <= 20 
				&& this.dataDeNascimento.getMonth() == 0))
		return "Capric�rnio";
		
		if((this.dataDeNascimento.getDate() >= 22 &&
				this.dataDeNascimento.getMonth() == 10) 
				||(this.dataDeNascimento.getDate() <= 21 
				&& this.dataDeNascimento.getMonth() == 11))
		return "Sagit�rio";
		
		if((this.dataDeNascimento.getDate() >= 23 &&
				this.dataDeNascimento.getMonth() == 9) 
				||(this.dataDeNascimento.getDate() <= 21 
				&& this.dataDeNascimento.getMonth() == 10))
		return "Escorpi�o";
		
		if((this.dataDeNascimento.getDate() >= 23 &&
				this.dataDeNascimento.getMonth() == 8) 
				||(this.dataDeNascimento.getDate() <= 22 
				&& this.dataDeNascimento.getMonth() == 9))
		return "Libra";
		
		if((this.dataDeNascimento.getDate() >= 23 &&
				this.dataDeNascimento.getMonth() == 7) 
				||(this.dataDeNascimento.getDate() <= 22 
				&& this.dataDeNascimento.getMonth() == 8))
		return "Virgem";
		
		if((this.dataDeNascimento.getDate() >= 22 &&
				this.dataDeNascimento.getMonth() == 6) 
				||(this.dataDeNascimento.getDate() <= 22 
				&& this.dataDeNascimento.getMonth() == 7))
		return "Le�o";
		
		if((this.dataDeNascimento.getDate() >= 21 &&
				this.dataDeNascimento.getMonth() == 5) 
				||(this.dataDeNascimento.getDate() <= 21 
				&& this.dataDeNascimento.getMonth() == 6))
		return "C�ncer";
		
		if((this.dataDeNascimento.getDate() >= 21 &&
				this.dataDeNascimento.getMonth() == 4) 
				||(this.dataDeNascimento.getDate() <= 20 
				&& this.dataDeNascimento.getMonth() == 5))
		return "G�meos";
		
		if((this.dataDeNascimento.getDate() >= 21 &&
				this.dataDeNascimento.getMonth() == 3) 
				||(this.dataDeNascimento.getDate() <= 20 
				&& this.dataDeNascimento.getMonth() == 4))
		return "Touro";
		
		else return "�ries";
	}
}
