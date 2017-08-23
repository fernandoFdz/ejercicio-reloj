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
    
    /*public int ticToc(){
        if(minuto<60){
                minuto+
            }
    }*/
}