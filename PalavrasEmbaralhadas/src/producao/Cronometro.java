package producao;

import java.util.TimerTask;

public class Cronometro {
 public boolean iniciaCronometro(MecanicaModoTempoLimitado mecanicaDoJogo){
	 new java.util.Timer().schedule(new TimerTask() {
		 
		    @Override
		    public void run() {
		        mecanicaDoJogo.setIsTerminadoJogo(true);
		        
		    }
		}, 120000);
	 return true;
 }
}
