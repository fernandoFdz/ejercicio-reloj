public class reloj{
    private int minuto;
    private int hora;
    
    /*
     * constructor 
     */
    public reloj(){
        hora=0;
        minuto=0;
    }
    
    /*
     * metodo que muestra la hora
     */
    public String dimeTuTiempo(){
            String cadResultado="0";
            cadResultado+=hora;
            cadResultado+=":0";
            cadResultado+="";
            cadResultado+=minuto;
            return cadResultado;
    }
    
    /*
     * metodo que aumenta un minuto cada vez que se utiliza 
     */
    public void ticToc(){

                if(minuto<60){ 
                    minuto=minuto+1;
                    
                }
                else{
                    if(hora<24){
                        hora=hora+1;
                    }
                    else{
                        hora=0;
                }
                    minuto=0;
                }
                
                
    } 
}