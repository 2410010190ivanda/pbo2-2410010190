# pbo2-2410010190
# NAMA : Muhammad Ivanda Stevhany
# NPM :2410010190
# KELAS : 5A REG BJM TI

**Tangkapan Layar P02**
<img width="1920" height="1200" alt="Cuplikan layar 2026-09-27 211114" src="https://github.com/user-attachments/assets/0bb91e4c-1239-4130-8404-51a02282b943" />

**Soal praktikum 6**

soal no 1
Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project p02-perpustakaan-mini: Compilation failure
id/ac/uniska/pbo2/p02/AplikasiPerpustakaan.java:[17,13] id.ac.uniska.pbo2.p02.Koleksi is abstract; cannot be instantiated

-> [Help 1]

To see the full stack trace of the errors, re-run Maven with the -e switch.
Re-run Maven using the -X switch to enable full debug logging.

For more information about the errors and possible solutions, please read the following articles:
[Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
alasan error : karena class Koleksi adalah abstract yang membuat tidak bisa di inisiasi

Soal no 2
Jika @override masih ada, maka akan error ketika melakukan compile karena method hitungdenda yang ada di AplikasiPerpustakaan.java erbeda dengan method yang ada di buku.java yang menggunakan hitungDenda, yang artinya @override mengaggap method tersebut tidak cocok.
Jika @override dihapus, program bisa di compile walau method hitungDenda di class buku.java dan AplikasiPerpustakaan.java tidak cocok karena tidak ada @override yang mengeceknya.

Soal no 3
Akan muncul pemberitahuan bahwa "judul tidak boleh kosong" mengikuti aturan yang dibuat pada koleksi.java

Soal no 4
Aturan yang dilanggar adalah enkapsulasi, karena status menjadi bisa diubah langsung dari luar class. 



**Tangkapan layar P01**
<img width="1920" height="1200" alt="LOG1" src="https://github.com/user-attachments/assets/d59b1f01-d24e-477e-b6ff-762c539432b4" />
<img width="1920" height="1200" alt="Kartu_mahasiswa_PBO2" src="https://github.com/user-attachments/assets/c06edbb3-45d5-44e9-926a-42b0445dcef8" />

<img width="1919" height="1199" alt="halopbo2" src="https://github.com/user-attachments/assets/7239d7b5-63ad-4520-9118-ad6c9e6bb229" />

