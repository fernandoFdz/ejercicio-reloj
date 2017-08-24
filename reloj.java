public class reloj{
    private int minuto;
    private int hora;
    
    public void define(){
        hora=0;
        minuto=0;
    }
    
    public String dimeTuTiempo(){
        String cadResultado="";
            cadResultado+=hora;
            cadResultado+=":";
            cadResultado+=minuto;
            return cadResultado;
    }
    
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