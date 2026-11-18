package tiendaelectronica.interfaz;

import tiendaelectronica.modelo.CamaraSeguridad;
import tiendaelectronica.modelo.Computador;

public class MainElectronica {
    static void main() {
        Computador c1= new Computador(1,"HP",32);
        CamaraSeguridad cs1 = new CamaraSeguridad(1, "Patito", 1028);

        System.out.println(c1.prender());
        if(c1.ejecutarPrograma("Word")){
            System.out.println("El programa ha sido lanzado");
        }else{
            System.out.println("No se h apodido ejercutar el programa");
        }
        System.out.println(c1.apagar());
        System.out.println(c1.apagar());
        System.out.println(c1.mostrarInformacion());

        System.out.println(c1.apagar());

        System.out.println(cs1.apagar());
        if(cs1.grabarVideo()){
            System.out.println("El video se ha garabado y guardado con èxito");
        }else{
            System.out.println("El video no pudo grabarse");
        }
        System.out.println(cs1.prender());
        System.out.println(cs1.prender());
        System.out.println(cs1.mostrarInformacion());
    }
}
