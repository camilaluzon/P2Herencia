package tiendaelectronica.modelo;

public class Dispositivo {
    private int codigo;
    private String marca;
    private boolean estado;

    public Dispositivo(int codigo, String marca) {
        this.codigo = codigo;
        this.marca = marca;
        estado = false;
    }

    public String prender(){
        if(estado == false){
            estado = true;
            return "Prendido";
        }
        return  "El Dispositivo ya se encontraba prendido";
    }

    public String apagar(){
        if(estado == true){
            estado = false;
            return "Se ha apagado el dispositivo";
        }
        return  "El Dispositivo no estaba prendido";
    }
}
