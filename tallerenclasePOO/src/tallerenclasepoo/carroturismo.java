package tallerenclasepoo;
/**
 *
 * @author Leonardo Barona
 * @author Jhoinner Constante
 */
public class carroturismo extends vehiculo {
    private String tipo,Tmotor;
    private int Npuertas;

    public carroturismo(String marca, String placa, int numeroSe, double kilometrosR, String cantcombus,String tipo,int Npuertas,String Tmotor) {
        super(marca, placa, numeroSe, kilometrosR, cantcombus);
        this.tipo=tipo;
        this.Tmotor=Tmotor;
        this.Npuertas=Npuertas;
    }

    public String mostrar(){
        String infocarrotur;
        infocarrotur=mostrarinfo()+"\t"+tipo+"\t"+Integer.toString(Npuertas)+"\t"+Tmotor;
        return infocarrotur;
    }
    public void setTmotor(String motor){
        this.Tmotor=motor;
    }
    public void setcantcombus(String cantcombus){
        this.cantcombus=cantcombus;
    }
}
