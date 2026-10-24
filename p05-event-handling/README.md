**TANGKAPAN LAYAR EVENT TOMBOL DAFTAR**

<img width="345" height="562" alt="image" src="https://github.com/user-attachments/assets/74b7ced8-529c-4fb5-851a-01f001103a0a" />

**RINGKASAN DIALOG DAN KONFIRMASI KELUAR**

<img width="959" height="564" alt="image" src="https://github.com/user-attachments/assets/149182d5-35a4-4050-8371-9d9569230637" />
<img width="960" height="600" alt="image" src="https://github.com/user-attachments/assets/8c740dc8-7f8d-46b2-8ff0-3fbd2fb3564c" />


**TABEL PENGAMATAN PRAKTIKUM 2**
| No | Tindakan                                  | Event yang Tercatat                                           |
| -: | ----------------------------------------- | ------------------------------------------------------------- |
|  1 | Arahkan kursor ke tombol, lalu jauhkan    | Kursor masuk ke tombol, kursor keluar dari tombol             |
|  2 | Klik tombol Klik Saya                     | Tombol diklik                                                 |
|  3 | Centang lalu hapus centang Aktifkan Fitur | Kotak dicentang, centang dihapus                              |
|  4 | Ganti pilihan dari Pagi menjadi Malam     | Memilih Malam                                                 |
|  5 | Klik isian, lalu ketik kata "abc"         | Mengetik huruf a, mengetik huruf b, mengetik huruf c          |
|  6 | Klik tombol setelah mengetik di isian     | Kursor masuk ke tombol, isian kehilangan fokus, tombol diklik |

**Eksperimen praktikum 3**
1. Hapus pemeriksaan if (evt.getStateChange() == ItemEvent.SELECTED) dan tambahkan
1. System.out.println("item berubah"); di dalam event handler. Berapa kali pesan tercetak setiap
pilihan diganti?
2. Di jendela Properties bagian Events, kosongkan event keyReleased pada celsiusField, lalu buat event
keyPressed yang memanggil konversi(). Mengapa hasil yang tampil terlambat satu karakter?
3. Hapus blok try dan catch di method konversi, lalu ketik huruf pada isian. Apa yang muncul di jendela
Output?

**Jawab**
1. Pesan item berubah tercetak 2 kali karena event dipanggil saat pilihan lama dilepas dan pilihan baru dipilih.
2. Hasil terlambat satu karakter karena keyPressed dijalankan sebelum karakter dimasukkan ke isian.
3. Pesan NumberFormatException muncul di Output NetBeans karena huruf tidak dapat dikonversi menjadi angka dan tidak ditangani oleh try-catch.

**Eksperimen praktikum 4**
1. Buat event actionPerformed untuk kaliButton melalui Events tanpa menghapus lambda di konstruktor, lalu
tambahkan System.out.println("kali"); di kedua tempat. Berapa kali pesan tercetak? Mengapa satu
tombol sebaiknya hanya memakai satu cara?
2. Tambahkan tombol % untuk sisa bagi (modulus). Apa saja yang diubah di tab Design dan di tab Source?
3. Tekan tombol Hapus. Mengapa kursor langsung berada di isian pertama?

**Jawab**
1. Event kaliButton: Pesan "kali" tercetak 2 kali karena ada dua ActionListener. Sebaiknya satu tombol menggunakan satu cara saja.
2. Tambahkan tombol % di Design, edit gridLayout pada bagian column menjadi 5, tambahkan event tombol memanggil method hitung%, lalu tambahkan method untuk menghitung % di Source.
3. Kursor kembali ke isian pertama karena angka1Field.requestFocusInWindow() meminta fokus kembali ke isian tersebut.


**Refleksi**
1.Jelaskan peran sumber event, object event, dan listener dengan contoh dari kode Anda.
2. Mengapa KeyListener tidak dapat ditulis dengan lambda, dan bagaimana NetBeans mengatasinya saat
Anda memilih event keyReleased?
3. Apa keuntungan memisahkan KonverterSuhu dari form KonversiSuhu?
4. Mengapa aksi pada itemStateChanged perlu memeriksa ItemEvent.SELECTED?
5. Kapan Anda memakai event handler dari GUI Builder, lambda, atau method reference?

**Jawab**

1. Sumber event adalah komponen pemicu, object event berisi informasi kejadian, dan listener menangani event.

Contoh: kaliButton.addActionListener(e -> hitung('x'));

2. KeyListener tidak dapat menggunakan lambda karena memiliki banyak method. NetBeans mengatasinya dengan menggunakan kelas adapter KeyAdapter saat kita memilih event keyReleased, sehingga hanya method yang dipilih yang perlu ditulis.

3. KonverterSuhu dipisahkan agar kode lebih terstruktur.
4. agar aksi hanya dijalankan sekali
5. di form konversiSuhu.java

contoh kode yang dipakai :private void celsiusFieldKeyReleased(java.awt.event.KeyEvent evt) {                                         
        // Hasil diperbarui setiap tombol keyboard dilepas
        konversi();
    }
