package tallerenclasepoo;
/**
 *
 * @author Leonardo Barona
 * @author Jhoinner Constante
 */
public class Carrodeportivo extends vehiculo{
    private String cabpotencia;
    private int Npuertas,Nasientos;
    private boolean turbo;

    public Carrodeportivo(String marca, String placa, int numeroSe, double kilometrosR, String cantcombus,String cabpotencia,boolean turbo,int Npuertas,int Nasientos) {
        super(marca, placa, numeroSe, kilometrosR, cantcombus);
        this.cabpotencia=cabpotencia;
        this.Npuertas=Npuertas;
        this.Nasientos=Nasientos;
        this.turbo=turbo;
    }

    
    
   
    public String mostrar(){
     String resultado;
     resultado = mostrarinfo()+"\t"+cabpotencia+"\t"+Boolean.toString(turbo)+"\t"+Integer.toString(Npuertas)+"\t"+Integer.toString(Nasientos);
     return resultado;
   }
    public void setcabpotencia(String potencia){
        this.cantcombus=potencia;
    }
    public void setcantcombus(String cantcombus){
        this.cantcombus=cantcombus;
    }
    
}
