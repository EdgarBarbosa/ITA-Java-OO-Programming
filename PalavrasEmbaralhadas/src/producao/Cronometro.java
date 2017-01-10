package producao;

import java.util.TimerTask;

public class Cronometro {
 public boolean iniciaCronometro(MecanicaModoTempo mecanicaDoJogo){
	 new java.util.Timer().schedule(new TimerTask() {
		 
		    @Override
		    public void run() {
		        mecanicaDoJogo.setTerminado(true);
		        
		    }
		}, 60000);
	 return true;
 }
}
