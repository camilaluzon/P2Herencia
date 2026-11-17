package tiendaelectronica.modelo;

public class Computador extends Dispositivo{
    private int RAM;

    public Computador(int codigo, String marca, int RAM) {
        super(codigo, marca);
        this.RAM = RAM;
    }

    public boolean ejecutarPrograma(String nombre){
        if(nombre != null && !nombre.trim().isEmpty(){
            if(isEstado()){
                return true;
            }
        }
        return false;
    }
    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion()+"\nRAM: " + RAM;
    }
}
