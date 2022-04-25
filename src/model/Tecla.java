package model;
import java.util.HashMap;

public class Tecla {
    private HashMap<String, String> teclas = new HashMap<>();
    
    public Tecla(){
        this.setUp();
    }


    public String calcularSecuenciasTeclas(String mensaje){
            Integer teclaActual           = 0;
            String  letrasActual          = this.teclas.get(teclaActual.toString());
            Integer lenMensaje            = mensaje.length();
            Integer n                     = 0;
            String  secuenciaTeclas       = "";
            Integer ultimaTeclaInsertada  = 0;
            while (n< lenMensaje){
                if(this.stringContainsChar(letrasActual,mensaje.charAt(n))){
                        secuenciaTeclas = secuenciaTeclas.concat(secuenciaTeclasConPausa(teclaActual,ultimaTeclaInsertada,letrasActual,mensaje,n));

                    n++;
                    ultimaTeclaInsertada = teclaActual;
                    teclaActual = 0;
                    letrasActual = this.teclas.get("0");

                }else {
                    teclaActual += 1;
                    letrasActual = this.teclas.get(teclaActual.toString());

                }
            }
            return secuenciaTeclas;
    }

   private String secuenciaTeclasConPausa(Integer teclaActual, Integer ultimaTeclaInsertada,String letrasActual,String mensaje, Integer n){
        if(ultimaTeclaInsertada == teclaActual)
            return " ".concat(this.duplicarTecla(teclaActual.toString(),letrasActual.indexOf(mensaje.charAt(n)) + 1));
        return  this.duplicarTecla(teclaActual.toString(),letrasActual.indexOf(mensaje.charAt(n)) + 1);
    }

    private Boolean stringContainsChar(String s, char c){
        return s.indexOf(c) != -1;

    }



    public void setUp(){
        this.teclas.put("1","");
        this.teclas.put("2","ABC");
        this.teclas.put("3","DEF");
        this.teclas.put("4","GHI");
        this.teclas.put("5","JKL");
        this.teclas.put("6","MNO");
        this.teclas.put("7","PQRS");
        this.teclas.put("8","TUV");
        this.teclas.put("9","XWYZ");
        this.teclas.put("0"," ");
    }




    public String duplicarTecla(String tecla,Integer n){
        return tecla.repeat(n);
    }
    
}
