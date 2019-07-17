package tallerenclasepoo;
/**
 *
 * @author Leonardo Barona
 * @author Jhoinner Constante
 */
public class Monovolumenes extends vehiculo {
    private int Npuertas,Nasientos,capcarga;
    private boolean Platerales;
    private String Tmotor;

    public Monovolumenes(String marca, String placa, int numeroSe, double kilometrosR, String cantcombus,int Npuertas,boolean Platerales, int Nasientos,String Tmotor,int capcarga) {
        super(marca, placa, numeroSe, kilometrosR, cantcombus);
        this.Nasientos=Nasientos;
        this.Npuertas=Npuertas;
        this.capcarga=capcarga;
        this.Platerales=Platerales;
        this.Tmotor=Tmotor;
        
    }

    public String mostrar(){
       String resultado;
       resultado = mostrarinfo()+"\t"+Integer.toString(Npuertas)+"\t"+Boolean.toString(Platerales)+"\t"+Integer.toString(Nasientos)+"\t"+Tmotor+"\t"+Integer.toString(capcarga);
       return resultado;
    }
    
    public void setcantcombus(String cantcombus){
        this.cantcombus=cantcombus;
    }
    public void setTmotor(String motor){
        this.Tmotor=motor;
    }
}
