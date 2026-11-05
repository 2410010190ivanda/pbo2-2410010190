/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

/**
 *
 * @author ivanda
 */
public enum Kategori {
Alat_Tulis("Alat tulis"),
Makanan("Makanan"),
Minuman("Minuman"),
Lainnya("Lainnya");

private final String label;
Kategori(String label) { this.label = label; } 
@Override public String toString()
{ return label; }
}
