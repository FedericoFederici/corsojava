import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {
        
    String percorsoRobot="a:100;s;a:100;d;a:100;s;a:100;d;a:100;s;a:100;d;a:100;s;a:100;d;a:100;s;a:100;d;";
    StringTokenizer percorsoRobotToken=new StringTokenizer(percorsoRobot,";"); 
    while (percorsoRobotToken.hasMoreTokens()) {
        String istruzioniPercorso= percorsoRobotToken.nextToken();
        if (istruzioniPercorso.startsWith("s")) {
            Robot ruotasx=new Robot();
            ruotasx.setAltezzaLame(4);
            ruotasx.setDirezzioneAttuale("direzione a sinistra");
            System.out.println("il robot cambia "+ruotasx.getDirezzioneAttuale()+"l'altezza delle lame è settata "+ruotasx.getAltezzaLame());
            
            
                
        
        }
        else if (istruzioniPercorso.startsWith("d")) {
         Robot ruotadx=new Robot();
         ruotadx.setAltezzaLame(2);
         ruotadx.setDirezzioneAttuale("direzione a destra");
           System.out.println("il robot cambia "+ruotadx.getDirezzioneAttuale()+"l'altezza delle lame è settata "+ruotadx.getAltezzaLame()); 
           
            
        }
        else if (istruzioniPercorso.startsWith("a")){
            String [] movimento=istruzioniPercorso.split(":");
            Robot avanza=new Robot(); 
            avanza.setNumeroStep(Integer.valueOf(movimento[1]));
            for(int i=0;i<avanza.getNumeroStep();i++) {
                System.out.println("il robot avanza di un passo");
            }
    
        }
    }

}
}