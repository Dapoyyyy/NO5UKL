/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.no5ukl;

/**
 *
 * @author Asus
 */
import java.util.HashMap;
import java.util.Map;
public class NO5UKL {



    public static void main(String[] args) {
        
        int[] array = {1, 2, 2, 3, 3, 3, 4};
        
        Map<Integer, Integer> frekuensi = new HashMap<>();
        
        // Menghitung frekuensi
        for (int angka : array) {
            if (frekuensi.containsKey(angka)) {
                frekuensi.put(angka, frekuensi.get(angka) + 1);
            } else {
                frekuensi.put(angka, 1);
            }
        }
        
        // Menampilkan hasil
        for (Map.Entry<Integer, Integer> entry : frekuensi.entrySet()) {
            System.out.println(entry.getKey() + " muncul " + entry.getValue() + " kali");
        }
    }
}
