package ejercicio2extra.servicio;

import ejercicio2extra.entidades.Edificio;
import ejercicio2extra.entidades.Polideportivo;
import ejercicio2extra.entidades.EdificioDeOficinas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chuky
 */
public class ServicioEdificio {

    private final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearEdificio(ArrayList<Edificio> x) {
        System.out.println("Que tipo de edificio quiere agregar a la lista\n1-Polideportivo\n2-Edifcio de Oficina");
        String opc = sc.next();
        if (opc.equalsIgnoreCase("1")) {
            Polideportivo poli = new Polideportivo();

            System.out.println("Ingrese el nombre del polideportivo");
            poli.setNombre(sc.next());
            boolean tonto = false;
            while (!tonto) {
                System.out.println("Es techado?\n1-Si\n2-No");
                var f = sc.next();
                if (f.equalsIgnoreCase("1")) {
                    poli.setTechado(true);
                    tonto = true;
                } else if (f.equalsIgnoreCase("2")) {
                    poli.setTechado(false);
                    tonto = true;
                } else if(!(f.equals("1")&&f.equals("2"))){
                    System.out.println("Error de opcion gil no era tan dificil");
                    System.out.println("Vamos a intarlo de vuelta pelotudo");
                }

            }
            System.out.println("Ingrese el alto del polideportivo");
            poli.setAlto(Double.parseDouble(sc.next()));
            System.out.println("Ingrese el ancho del polideportivo");
            poli.setAncho(Double.parseDouble(sc.next()));
            System.out.println("Ingrese el largo del polideportivo");
            poli.setLargo(Double.parseDouble(sc.next()));
            x.add(poli);

        } else if(opc.equals("2")){
            EdificioDeOficinas edo = new EdificioDeOficinas();
            System.out.println("Ingrese la cantidad de personas que trabajan en cada oficina");
            edo.setCantPersonas(Integer.parseInt(sc.next()));
            System.out.println("Ingrese la cantidad de pisos del edificio");
            edo.setCantPisos(Integer.parseInt(sc.next()));
            edo.setCantOficinas(edo.getCantPisos());
            System.out.println("Ingrese el alto del edificio");
            edo.setAlto(Double.parseDouble(sc.next()));
            System.out.println("Ingrese el ancho del edificio");
            edo.setAncho(Double.parseDouble(sc.next()));
            System.out.println("Ingrese el largo del edificio");
            edo.setLargo(Double.parseDouble(sc.next()));
            x.add(edo);

        }else{
            System.out.println("Alto navo sos");}

    }
    
    public void cantPersonas(ArrayList<Edificio> x){
        for (Edificio aux : x) {
            if (aux instanceof EdificioDeOficinas) {
                EdificioDeOficinas object = (EdificioDeOficinas) aux;
                System.out.println("La cantidad de personas por piso es: "+ object.getCantPersonas()+"\nEl total de personas en el edificio es: "+ object.getCantPisos()*object.getCantPersonas());

            }
        }
    }
    
    public void mostrar(ArrayList<Edificio> x){
        for (Edificio aux : x) {
            System.out.println("El edificio tiene una superficie de: " + aux.calcularSuperficie()+ "Mts??");
            System.out.println("El edificio tiene un volumen de: " + aux.calcularVolumnen()+ "Mts??");
        }
        
    }
    
    public void techado(ArrayList<Edificio> x){
        int techo=0;
        int sintecho=0;
        for (Edificio aux : x) {
            if (aux instanceof Polideportivo) {
                Polideportivo object = (Polideportivo) aux;
                if (object.isTechado()) {
                    techo++;
                }else{
                    sintecho++;
                }
            }
        }
        
        System.out.println("El/Los polideportivo/s techado/s es/son: " + techo + "\nEl/Los polideportivo/s  sin techo es/son: " + sintecho);
    }
}
