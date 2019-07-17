package tallerenclasepoo;
/**
 *
 * @author Leonardo Barona
 * @author Jhoinner Constante
 */
public class moto extends vehiculo {

    public moto(String marca, String placa, int numeroSe, double kilometrosR, String cantcombus) {
        super(marca, placa, numeroSe, kilometrosR, cantcombus);
    }

    
    public String mostrar(){
        String infomoto;
        infomoto=mostrarinfo();
        return infomoto;
    }

    
}
