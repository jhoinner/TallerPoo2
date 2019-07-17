
package tallerenclasepoo;

public class TallerenclasePOO {

    public static void main(String[] args) {
       moto m;
       carro4x4 c4x4;
       carroturismo carrot;
       furgoneta f;
       Carrodeportivo carrod;
       Monovolumenes mv;
       
       m = new moto ("Kawasaki","fgt12d",1234556,12000,"8 Galones");
       c4x4 = new carro4x4("Toyota","dfg859",85878,45000,"12 Galones","V8",6);
       carrot = new carroturismo("Chevrolet","ert899",124474,11000,"89 Galones","Vans",4,"Enseri");
       f = new furgoneta ("Nissan","ddd111",963331,787945,"5 Galones",1000,202);
       carrod = new Carrodeportivo("Ferrari","eer333",654323,1200,"12 Galones","20000 HP",true,2,4);
       mv = new Monovolumenes("SuperCarry","wqw741",966696696,63000,"10 Galones",6,false,8,"Volka",15);
       
       
        System.out.println("Moto: "+"\t"+m.mostrar());
        System.out.println("Carro 4x4: "+"\t"+c4x4.mostrar());
        System.out.println("Carro Turismo: "+"\t"+carrot.mostrar());
        System.out.println("Furgoneta: "+"\t"+f.mostrar());
        System.out.println("Carro Deportivo: "+"\t"+carrod.mostrar());
        System.out.println("Monovolumes: "+"\t"+mv.mostrar());
        System.out.println("");
        c4x4.setcantcombus("CambioEfectuado");
        System.out.println("Carro 4x4: "+"\t"+c4x4.mostrar());
        mv.setTmotor("CambioEfectuado");
        System.out.println("Monovolumes: "+"\t"+mv.mostrar());
       
    }
    
    
}
