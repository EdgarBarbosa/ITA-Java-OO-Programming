package producao;

import java.util.ArrayList;
import java.util.List;

public class FabricaDeMecanicaDoJogo {
 private List<MecanicaDoJogo> listaDeMecanicasDeJogo;
 public MecanicaDoJogo getMecanicaDoJogo(int tipoDeMecanica){
	 
	 listaDeMecanicasDeJogo = new ArrayList<MecanicaDoJogo>();
	 listaDeMecanicasDeJogo.add(new MecanicaModoVidas());
	 listaDeMecanicasDeJogo.add(new MecanicaModoTempo());
	 
	 return listaDeMecanicasDeJogo.get(tipoDeMecanica);
 }
}
