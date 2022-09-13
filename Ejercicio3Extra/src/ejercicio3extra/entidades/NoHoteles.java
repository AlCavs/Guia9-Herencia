package ejercicio3extra.entidades;

public abstract class NoHoteles extends Alojamiento{
    protected boolean privado;
    protected Double metros;

    public NoHoteles() {
    }

    
    public NoHoteles(boolean privado, Double metros, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metros = metros;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Double getMetros() {
        return metros;
    }

    public void setMetros(Double metros) {
        this.metros = metros;
    }

    @Override
    public String toString() {
        return super.toString()+"NoHoteles{" + "privado=" + privado + ", metros=" + metros + '}';
    }
    
    
    
    
}
