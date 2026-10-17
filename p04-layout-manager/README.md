**EKSPERIMEN PRAKTIKUM 2**

1. Pada flowPanel, ubah Alignment layout menjadi Center, lalu kecilkan jendela. Apa yang berubah? Baris
mana di initComponents() yang ikut berubah?
2. Pada gridPanel, ubah Rows menjadi 0 dan Columns menjadi 2. Berapa baris yang terbentuk dan mengapa?
3. Pada boxPanel, isi properti maximumSize keempat tombol dengan lebar 32767 dan tinggi sama dengan
tinggi tombol. Bagaimana lebar tombol berubah? Tambahkan juga Vertical Strut dari kategori Swing Fillers di
antara tombol.

**JAWAB :**
1. Komponen berubah menjadi ke tengah dan saat diperkecil komponen tetap berada di tengah. Baris yang berubah adalah setAlignment(FlowLayout.CENTER)
2. komponen akan tersusun dalam 2 kolom dan 5 baris karena terdapat 9 komponen
3. lebar tombol menjadi menyesuaikan ruang yang tersedia hingga batas maksimum. Penambahan Vertical Strut membuat jarak vertikal antar tombol menjadi lebih renggang.

**EKSPERIMEN PRAKTIKUM 4**
1. Ubah Weight X pada namaField menjadi 0.0, lalu lebarkan jendela. Apa yang terjadi pada isian?
2. Ubah Direction formPanel di dalam isiPanel dari North menjadi Center, lalu tinggikan jendela. Apa
perbedaannya?
3. Hapus baris setMinimumSize(getSize()) di konstruktor, lalu kecilkan jendela sekecil mungkin. Bagian
mana yang rusak lebih dulu?

**JAWAB :**
1. Isian nama tidak melebar saat jendela diperbesar karena tidak mendapat tambahan ruang dari `GridBagLayout`.
2. Form yang awalnya berada di bagian atas akan berpindah ke tengah area `isiPanel` ketika jendela ditinggikan.
3. Yang rusak adalah kolom isi form dan tombol panel, karena saat jendela diperkeci kolom menjadi sempit dan posisi tombol tidak beraturan

**PERTANYAAN REFLEKSI**
1. Mengapa Null Layout dan Absolute Layout sebaiknya dihindari?
2. Jelaskan perbedaan perilaku FlowLayout dan GridLayout saat jendela dilebarkan.
3. Apa fungsi Weight X dan Fill pada constraint GridBagLayout?
4. Mengapa formPanel dibungkus isiPanel dan diletakkan di North?

**JAWAB :**
1. karena posisi komponen diatur manual, sehingga tampilan bisa berantakan saat ukuran jendela berubah
2. FlowLayout menyusun komponen secara berurutan, sedangkan GridLayout menyusun komponen dalam baris dan kolom dengan ukuran yang sama
3. Weight X mengatur pembagian ruang tambahan secara horizontal, sedangkan Fill mengatur apakah komponen memenuhi ruang yang tersedia
4. formPanel dibungkus isiPanel dan diletakkan di North agar bagian form berada di atas dan lebih mudah diatur



**TANGKAPAN LAYAR**
<img width="960" height="600" alt="Cuplikan layar 2026-10-18 033206" src="https://github.com/user-attachments/assets/de202cc5-b591-44b8-9b9f-6a7cd1511b08" />

<img width="960" height="600" alt="Cuplikan layar 2026-10-18 033222" src="https://github.com/user-attachments/assets/449fc674-37c4-4046-9a38-b04bb1e1f09c" />

Navigator

<img width="280" height="443" alt="image" src="https://github.com/user-attachments/assets/356ea84f-a62e-4f67-b9d5-6f47b5eb1b82" />


**TABEL PENILAIAN DARI TEMAN**
| No | Pemeriksaan | Ya atau Belum |
|:--:|---|:--:|
| 1 | Label singkat, jelas, dan sejajar | Ya |
| 2 | Isian dikelompokkan dengan judul bagian | Ya |
| 3 | Placeholder dipakai untuk isian yang punya format | Ya |
| 4 | Komponen sesuai jenis data | Ya |
| 5 | Tombol utama menonjol dan berada di kanan bawah | Ya |
| 6 | Jarak antar komponen konsisten | Ya |
| 7 | Form tetap rapi saat jendela dilebarkan dan ditinggikan | Belum |
| 8 | Tampilan dibuat dengan JFrame Form dan layout manager, bukan Null Layout atau Absolute Layout | Ya |

Saran : Perbaiki pengaturan tata letak agar form tetap rapi dan proporsional ketika ukuran jendela diubah, terutama untuk mengurangi ruang kosong yang berlebihan saat jendela dipanjangkan.

**TABEL RANCANGAN**
| Bagian | Panel | Layout |
|---|---|---|
| Jendela | JFrame | BorderLayout |
| Header | headerPanel | BoxLayout |
| Isi | isiPanel | borderLayout |
| Form | formPanel | gridBagLayout |
| Tombol | tombolPanel | FlowLayout |


**deklarasi AI :**

Saya menggunakan AI untuk mengetahui cara membuat tabel di README.md
prompt :bagaimana cara membuat tabel di readme

jawaban AI :Contoh membuat tabel di README.md:

```markdown
| Nama | Umur |
|---|---|
| Andi | 20 |
| Budi | 21 |
```

Hasilnya:

| Nama | Umur |
| ---- | ---- |
| Andi | 20   |
| Budi | 21   |

Cara membuatnya:

1. Buka file `README.md` di GitHub.
2. Klik ikon pensil untuk mengedit.
3. Masukkan kode Markdown di atas.
4. Klik Preview untuk melihat hasilnya.
5. Klik Commit changes untuk menyimpan.



