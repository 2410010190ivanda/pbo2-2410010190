/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p07.mini.proyek;

/**
 *
 * @author ivanda
 */
/**
* Kategori kontak. Nilai dari toString() dipakai sebagai teks di JComboBox dan tabel.
*/
public enum Kategori {
    TERSEDIA("Tersedia"),
    DIPINJAM("Dipinjam");
    
 private final String label;
 Kategori(String label) {
 this.label = label;
 }
 @Override
 public String toString() {
 return label;
 }
}