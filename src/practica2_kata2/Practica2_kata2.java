/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_kata2;

import java.util.Map;

/**
 *
 * @author Héctor
 */
public class Practica2_kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        
        Histogram histo = new Histogram(data);
        
        Map<String,Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<String, Integer> entry: histogr.entrySet()) {
            System.out.println("Key =" + entry.getKey() + ", Value =" + entry.getValue());
        }
        
    }
    
}
