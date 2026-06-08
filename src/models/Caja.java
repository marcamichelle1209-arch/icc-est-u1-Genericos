package models;

public class Caja <T> {
    private T objeto;
    public void guardar(T objeto){
        this.objeto = objeto;
    }
    public T obtener(){
        return objeto;

    }
    public boolean estaVacio(){
        return objeto== null;
    }
    @Override
    public String toString() {
        return "Caja [objeto=" + objeto + "]";
    }
    
    
}
