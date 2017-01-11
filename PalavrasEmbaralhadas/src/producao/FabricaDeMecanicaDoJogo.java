package producao;

import java.util.ArrayList;
import java.util.List;

public class FabricaDeMecanicaDoJogo {
 private List<MecanicaDoJogo> listaDeMecanicasDeJogo;
 public MecanicaDoJogo getMecanicaDoJogo(char tipoDeMecanica){
	 
	 listaDeMecanicasDeJogo = new ArrayList<MecanicaDoJogo>();
	 listaDeMecanicasDeJogo.add(new MecanicaModoVidas());
	 listaDeMecanicasDeJogo.add(new MecanicaModoTempoLimitado());
	 
	 return listaDeMecanicasDeJogo.get(tipoDeMecanica-48);
 }
}
