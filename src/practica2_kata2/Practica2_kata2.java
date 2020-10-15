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
        int[] data = {1,4,5,5,4,6,1,2,4,5,6,2,5,6,3,5,5,6,2,5,1};
        
        Histogram histo = new Histogram(data);
        
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry: histogr.entrySet()) {
            System.out.println("Key =" + entry.getKey() + ", Value =" + entry.getValue());
        }
        
    }
    
}
