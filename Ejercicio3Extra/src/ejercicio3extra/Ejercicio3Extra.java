package ejercicio3extra;

import ejercicio3extra.entidades.Turismo;
import ejercicio3extra.servicios.ServicioTurismo;

/**
 *
 * @author Chuky
 */
public class Ejercicio3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioTurismo st = new ServicioTurismo();
        Turismo t = new Turismo();
        st.agregarAlojamiento(t);
        st.mostrar(t);
        t.getListaHoteles().sort(t.comparador);
        
        st.mostrar(t);
        st.mostrarNoHoteles(t);
        
    }
    
}
