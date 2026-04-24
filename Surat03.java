public class Surat03 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // S atau I
    int durasi;

    Surat03(){
    }

    Surat03(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi){
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    void tampil(){
        System.out.println(idSurat + " | " + namaMahasiswa + " | " + kelas + 
        " | " + jenisIzin + " | " + durasi + " hari");
    }
}
