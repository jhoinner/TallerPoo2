package tallerenclasepoo;
/**
 *
 * @author Leonardo Barona
 * @author Jhoinner Constante
 */
public class furgoneta extends vehiculo {
    private int capcarga;
    private double altura;

    public furgoneta(String marca, String placa, int numeroSe, double kilometrosR, String cantcombus,int capcarga,double altura) {
        super(marca, placa, numeroSe, kilometrosR, cantcombus);
        this.capcarga=capcarga;
        this.altura=altura;
    }

    
    public String mostrar(){
     String resultado;
     resultado = mostrarinfo()+"\t"+Integer.toString(capcarga)+"\t"+Double.toString(altura);
     return resultado;
    }
    public void setcantcombus(String cantcombus){
        this.cantcombus=cantcombus;
    }
}
