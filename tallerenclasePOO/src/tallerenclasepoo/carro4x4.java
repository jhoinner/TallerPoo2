package tallerenclasepoo;
/**
 *
 * @author Leonardo Barona
 * @author Jhoinner Constante
 */
public class carro4x4 extends vehiculo{
    
    private String Tmotor;
    private int Nasientos;

    public carro4x4(String marca, String placa, int numeroSe, double kilometrosR, String cantcombus,String Tmotor,int Nasientos) {
        super(marca, placa, numeroSe, kilometrosR, cantcombus);
        this.Tmotor=Tmotor;
        this.Nasientos=Nasientos;
    }
    
    public String mostrar(){
        String info4x4;
        info4x4=mostrarinfo()+"\t"+Tmotor+"\t"+Nasientos;
        return info4x4;
    }
    
    public void setcantcombus(String cantcombus){
        this.cantcombus=cantcombus;
    }
    public void motor(String motor){
        this.Tmotor=motor;
    }
}
