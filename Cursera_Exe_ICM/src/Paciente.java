package src;

public class Paciente {
// atributos
public double peso;
public double altura;

//contrutores
public Paciente(double kilos, double altura){
	this.peso = kilos;
	this.altura = altura;
		
}
//metodos

//Metodo que retorna numero real que representa o indice de massa corporea(ICM)
public double calcularIMC() {
	
	return peso/(altura*altura);
}

//metodo que diagnostica de forma descritica o ICM
public Object diagnostico() {
	String resposta="";
	double icm = this.calcularIMC();
	if(icm < 16 ){
		resposta = "Baixo peso muito grave";
		
	}else if(icm >= 16 && icm < 17){
		resposta = "Baixo peso grave";
	}	else if(icm >= 17 && icm < 18.5){
		resposta = "Baixo peso";
	}		else if(icm >= 18.5 && icm < 25){
		resposta = "Peso normal";
	}			else if(icm >= 25 && icm < 30){
		resposta = "Sobrepeso";
	}					else if(icm >= 30 && icm < 35){
		resposta = "Obesidade grau I";
	}						else if(icm >= 35 && icm < 40){
		resposta = "Obesidade grau II";
	}
		else{
		resposta = "Obesidade grau III (obesidade mórbida)";
	}
	
	return resposta;
}

}
