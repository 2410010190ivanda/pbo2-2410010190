/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

/**
 *
 * @author ivanda
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
* Menghubungkan daftar Barang dengan JTable.
* JTable bertanya kepada model: berapa baris, berapa kolom, dan apa isi setiap sel.
*/
public class BelanjaTableModel extends AbstractTableModel {

    private static final String[] KOLOM = {"Nama Barang", "Kategori", "Harga", "Jumlah", "Subtotal"};

    private final List<Barang> daftar = new ArrayList<>();

    @Override
    public int getRowCount() {
        return daftar.size();
    }

    @Override
    public int getColumnCount() {
        return KOLOM.length;
    }

    @Override
    public String getColumnName(int kolom) {
        return KOLOM[kolom];
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        Barang b = daftar.get(baris);

        return switch (kolom) {
            case 0 -> b.nama();
            case 1 -> b.kategori();
            case 2 -> b.harga();
            case 3 -> b.jumlah();
            default -> b.hitungSubtotal();
        };
    }

    public Barang get(int baris) {
        return daftar.get(baris);
    }

    public void tambah(Barang barang) {
        daftar.add(barang);
        int baris = daftar.size() - 1;
        fireTableRowsInserted(baris, baris); // tampilkan baris baru
    }

    public void ubah(int baris, Barang barang) {
        daftar.set(baris, barang);
        fireTableRowsUpdated(baris, baris);
    }

    public void hapus(int baris) {
        daftar.remove(baris);
        fireTableRowsDeleted(baris, baris);
    }
}

