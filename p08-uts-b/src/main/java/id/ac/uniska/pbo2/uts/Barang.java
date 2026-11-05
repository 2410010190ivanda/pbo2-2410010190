/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

/**
 *
 * @author ivanda
 */
public record Barang(String nama, int harga, int jumlah, Kategori kategori) {

    public int hitungSubtotal() {
        return harga * jumlah;
    }

}

