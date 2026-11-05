**LINK VIDEO DEMO**

https://youtu.be/ETUMipt3ABw?si=QkL_jzChD6nQqLS_

**EKSPERIMEN PRAKTIKUM 5**

1. Di KontakTableModel, jadikan baris fireTableRowsInserted(baris, baris); sebagai komentar, lalu
tambah kontak baru. Apakah tabel langsung berubah?
2. Di method barisTerpilih, ganti isinya menjadi return kontakTable.getSelectedRow();. Cari kata
"ah", pilih Ahmad Fauzi, lalu klik Hapus dan pilih No. Nama siapa yang muncul di dialog konfirmasi?
3. Di konstruktor DialogKontak, ubah super(pemilik, judul, true) menjadi false. Saat dialog terbuka,
coba klik jendela utama. Apa yang terjadi pada kontak yang ditambahkan?
4. Tekan Ctrl+N, Ctrl+E, dan Ctrl+D. Mengapa Ctrl+E dan Ctrl+D tidak bekerja saat tidak ada baris yang dipilih?
5. Di tab Design, ubah accelerator hapusItem menjadi tombol Delete tanpa Ctrl. Baris apa yang berubah di
initComponents()?
6. Ubah deklarasi atribut menjadi private KontakTableModel model; lalu isi model = new
KontakTableModel(); setelah initComponents(). Jalankan. Pesan error apa yang muncul dan
mengapa?

**JAWAB**
1. Tidak. Data kontak berhasil ditambahkan ke dalam List, tetapi tabel tidak langsung diperbarui.
2. Nama yang muncul adalah Budi Santoso.
3. Jendela utama tetap bisa diklik. Kontak tidak langsung masuk ke tabel karena dialog bersifat non-modal.
4. Ctrl+N berfungsi untuk menambah kontak. Ctrl+E dan Ctrl+D tidak bekerja karena tidak ada baris yang dipilih.
5. Baris setAccelerator() pada hapusItem berubah dari Ctrl+D menjadi tombol Delete tanpa Ctrl.
6. Muncul error IllegalArgumentException: Cannot set a null TableModel karena model belum dibuat saat initComponents() dijalankan.

**PETA EVENT**
<img width="920" height="268" alt="image" src="https://github.com/user-attachments/assets/2c37a566-ef60-4a39-90f8-fb54b68bedc8" />


