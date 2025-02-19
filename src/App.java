import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a nuestra tienda de frutas y verduras");

        Map<String, Double> inventario = new HashMap<>(); //Declaracion del HashMap

        inventario.put("Manzana", 0.5); //put agrega elementos al HashMap
        inventario.put("Pera", 0.4); //key, value
        inventario.put("Papa", 1.2);
        inventario.put("Cebolla", 0.75);

        System.out.println("Este es el inventario de frutas y verduras:");

        for (String fruta : inventario.keySet()) { //keySet() devuelve un array de keys
            System.out.println(fruta + ":  $" + inventario.get(fruta)); //get() devuelve el value asociado con la clave especificada
            
        }

        String frutaBuscada = "Naranja";
        System.out.println("Se acerca un cliente y nos pide: " + frutaBuscada);

        //.containsKey() devuelve true si el HashMap contiene la key especificada
        //.containsValue() devuelve true si el HashMap contiene el value especificado
        if(inventario.containsKey(frutaBuscada)){ //HashMap no respeta el orden de insercion
            System.out.println("Si tenemos " + frutaBuscada + " y cuesta $" + inventario.get(frutaBuscada));
        } else {
            System.out.println("Lo siento, no tenemos " + frutaBuscada);
        }
        
        frutaBuscada = "Pera";
        if(inventario.containsKey(frutaBuscada)){
            System.out.println("Si tenemos " + frutaBuscada + " y cuesta $" + inventario.get(frutaBuscada));
        } else {
            System.out.println("Lo siento, no tenemos " + frutaBuscada);
        }

        inventario.remove("Pera"); //remove() elimina el elemento con la key especificada

        System.out.println("Inventario actualizado:");
        for (String fruta : inventario.keySet()) { 
            System.out.println(fruta + ":  $" + inventario.get(fruta)); 
            
        }

        System.out.println("=====================================================");

        System.out.println("Bienvenido a nuestra tienda de tenis");

        Map<String, Double> inventario2 = new TreeMap<>(); //Declaracion del TreeMap

        inventario2.put("AF1", 1200.0); 
        inventario2.put("Yeezys", 300.0); 
        inventario2.put("Cortes", 600.0);
        inventario2.put("LunarForce", 500.0);

        System.out.println("Este es el inventario de sneakers:");

        for (String zapato : inventario2.keySet()) { //keySet() devuelve un array de keys
            System.out.println(zapato + ":  $" + inventario2.get(zapato)); //get() devuelve el value asociado con la clave especificada
            
        }

        String zapatoBuscado = "Airforce97";
        System.out.println("Se acerca un cliente y nos pide: " + zapatoBuscado);

        //.containsKey() devuelve true si el TreeMap contiene la key especificada
        //.containsValue() devuelve true si el TreeMap contiene el value especificado
        if(inventario2.containsKey(zapatoBuscado)){ //TreeMap ordena alfabeticamente por los keys
            System.out.println("Si tenemos " + zapatoBuscado + " y cuesta $" + inventario2.get(zapatoBuscado));
        } else {
            System.out.println("Lo siento, no tenemos " + zapatoBuscado);
        }
        
        zapatoBuscado = "AF1";
        if(inventario2.containsKey(zapatoBuscado)){
            System.out.println("Si tenemos " + zapatoBuscado + " y cuesta $" + inventario2.get(zapatoBuscado));
        } else {
            System.out.println("Lo siento, no tenemos " + zapatoBuscado);
        }

        inventario2.remove("AF1"); //remove() elimina el elemento con la key especificada

        System.out.println("Inventario actualizado:");
        for (String zapato : inventario2.keySet()) { 
            System.out.println(zapato + ":  $" + inventario2.get(zapato)); 
            
        }

        System.out.println("=====================================================");

        System.out.println("Bienvenido a nuestra tienda de souvenirs");

        Map<String, Double> inventario3 = new LinkedHashMap<>(); //Declaracion del LinkedHashMap

        inventario3.put("Figura temática", 200.0); 
        inventario3.put("Llavero", 30.0); 
        inventario3.put("Cuadro de paisaje", 60.0);
        inventario3.put("Foto de recuerdo", 50.0);

        System.out.println("Este es el inventario de souvenirs:");

        for (String souvenir : inventario3.keySet()) { //keySet() devuelve un array de keys
            System.out.println(souvenir + ":  $" + inventario3.get(souvenir)); //get() devuelve el value asociado con la clave especificada
            
        }

        String souvenirBuscado = "Tarjeta postal";
        System.out.println("Se acerca un cliente y nos pide: " + souvenirBuscado);

        //.containsKey() devuelve true si el LinkedHashMap contiene la key especificada
        //.containsValue() devuelve true si el LinkedHashMap contiene el value especificado
        if(inventario3.containsKey(souvenirBuscado)){ //TreeMap ordena alfabeticamente por los keys
            System.out.println("Si tenemos " + souvenirBuscado + " y cuesta $" + inventario3.get(souvenirBuscado));
        } else {
            System.out.println("Lo siento, no tenemos " + souvenirBuscado);
        }
        
        souvenirBuscado = "Llavero";
        if(inventario3.containsKey(souvenirBuscado)){
            System.out.println("Si tenemos " + souvenirBuscado + " y cuesta $" + inventario3.get(souvenirBuscado));
        } else {
            System.out.println("Lo siento, no tenemos " + souvenirBuscado);
        }

        inventario3.remove("Llavero"); //remove() elimina el elemento con la key especificada

        System.out.println("Inventario actualizado:");
        for (String souvenir : inventario3.keySet()) { 
            System.out.println(souvenir + ":  $" + inventario3.get(souvenir)); 
            
        }

    }
}
