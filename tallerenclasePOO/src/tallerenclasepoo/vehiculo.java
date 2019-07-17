package tallerenclasepoo;
/**
 *
 * @author Leonardo Barona
 * @author Jhoinner Constante
 */
public abstract class vehiculo {
    protected String marca,placa,cantcombus;
    protected int numeroSe;
    protected double kilometrosR;

    public vehiculo(String marca, String placa, int numeroSe, double kilometrosR,String cantcombus) {
        this.marca = marca;
        this.placa = placa;
        this.numeroSe = numeroSe;
        this.kilometrosR = kilometrosR;
        this.cantcombus=cantcombus;
    }
          public String mostrarinfo(){
              String info;
              info=marca+"\t"+placa+"\t"+Integer.toString(numeroSe)+"\t"+Double.toString(kilometrosR)+"\t"+cantcombus;
             return info;
          }  


}
