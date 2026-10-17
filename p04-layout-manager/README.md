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

**TANGKAPAN LAYAR**
<img width="960" height="600" alt="Cuplikan layar 2026-10-18 033206" src="https://github.com/user-attachments/assets/de202cc5-b591-44b8-9b9f-6a7cd1511b08" />

<img width="960" height="600" alt="Cuplikan layar 2026-10-18 033222" src="https://github.com/user-attachments/assets/449fc674-37c4-4046-9a38-b04bb1e1f09c" />

Navigator
<img width="280" height="443" alt="image" src="https://github.com/user-attachments/assets/356ea84f-a62e-4f67-b9d5-6f47b5eb1b82" />





