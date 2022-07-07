
# Assignment 3 - Mobile App Testing

Melakukan pengujian pada aplikasi mobile,
dalam kasus ini adalah aplikasi e-commerce yang merupakan
aplikasi demo.


## Konfigurasi


- **Genymotion** v3.2.1
- **Oracle VM Virtualbox** v6.1.34
- **Katalon**


## Test Scenario

### Test Case Produk

Melakukan test case pada fitur produk dalam aplikasi
e-commerce

| ID        | Deskripsi                         | Ekspektasi    | Aktual        | Hasil
| :----     | :---                              | :----         | :------       | :-----
|TCP_01     | Pembelian 100 item                | Gagal         | Gagal         | Pengujian Berhasil
|TCP_02     | Pembelian 5 item                  | Berhasil      | Berhasil      | Pengujian Berhasil
|TCP_03     | Pembelian 5 item sebanyak 2 kali  | Gagal         | Berhasil      | Pengujian Gagal
|TCP_04     | Save Gambar Produk                | Berhasil      | Berhasil      | Pengujian Berhasil
|TCP_05     | Share Produk                      | Berhasil      | Berhasil      | Pengujian Berhasil

### Test Case Cart

Melakukan test case pada fitur cart dalam aplikasi
e-commerce

| ID        | Deskripsi                         | Ekspektasi    | Aktual        | Hasil
| :----     | :---                              | :----         | :------       | :-----
|TCC_01     | Konfirmasi cart kosong            | Berhasil      | Berhasil      | Pengujian Berhasil
|TCC_02     | Cart Kosong, tap random           | Berhasil      | Gagal         | Pengujian Gagal
|TCC_03     | Checkout barang pembelian         | Berhasil      | Berhasil      | Pengujian Berhasil
|TCC_04     | Menghapus sebuah barang           | Berhasil      | Berhasil      | Pengujian Berhasil

### Test Case Profile

Melakukan test case pada fitur profile dalam aplikasi
e-commerce

| ID         | Deskripsi                           | Ekspektasi    | Aktual        | Hasil
| :----      | :---                                | :----         | :------       | :-----
|TCPf_01     | Menghapus histori pembelian         | Berhasil      | Berhasil      | Pengujian Berhasil
|TCPf_02     | Edit Profile                        | Berhasil      | Berhasil      | Pengujian Berhasil
|TCPf_03     | Edit Profile Invalid                | Gagal         | Gagal         | Pengujian Berhasil
|TCPf_04     | Konfirmasi histori pembelian kosong | Berhasil      | Berhasil      | Pengujian Berhasil
