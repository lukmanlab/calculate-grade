import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  

public class Main {

  public static void main(String[] args) {
    // instanciate
    Scanner scan = new Scanner(System.in);

    // masukkan nim
    System.out.print("NIM: ");
    String nim = scan.nextLine(); 

    // masukkan nama
    System.out.print("Nama Lengkap: ");
    String nama = scan.nextLine();

    // masukkan jenis kelamin
    System.out.print("Jenis Kelamin: \n1. Laki-laki\n2. Perempuan\nPilih: ");
    int option = scan.nextInt();
    String jenis_kelamin = jenis_kelamin(option);
    scan.nextLine();

    // masukkan tgl input nilai
    DateTimeFormatter datetimeformat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now = LocalDateTime.now();
    String tanggal = datetimeformat.format(now);
    System.out.println("Tanggal input: " + tanggal);

    // nama mata kuliah
    System.out.print("Mata Kuliah: ");
    String matkul = scan.nextLine();

    // masukkan jumlah absensi
    System.out.print("Jumlah Absensi (1-14): ");
    int absensi = scan.nextInt();

    // nilai tugas
    System.out.print("Nilai Tugas (1-100): ");
    int tugas = scan.nextInt();

    // nilai uts
    System.out.print("Nilai UTS (1-100): ");
    int uts = scan.nextInt();

    // nilai uas
    System.out.print("Nilai UAS (1-100): ");
    int uas = scan.nextInt();
    scan.close();

    // nilai akhir dan keterangan
    System.out.println("====================================\nNIM \t\t:" + nim + "\nNama \t\t:" + nama + "\nMata Kuliah \t:" + matkul + "\nNilai Akhir \t:" + nilai_akhir(tugas,uts,uas) + "\nKeterangan \t:" + keterangan(nilai_akhir(tugas,uts,uas)));
  }

  // fungsi pilih jenis kelamin
  private static String jenis_kelamin(int i){
    String opsi;
    if ( i == 1){
      opsi = "Laki-laki";
    }else if (i == 2){
      opsi = "Perempuan";
    }else {
      opsi = "Opsi tidak ada!";
    }
    return(opsi);
  }

  // hitung nilai akhir
  private static double nilai_akhir(int x, int y, int z){
    int tugas = x;
    int uts = y;
    int uas = z;
    double hasil = (x * 15/100) + (y * 40/100) + (z * 45/100);
    return (hasil);
  }

  // keterangan
  private static String keterangan(double n){
    String ket = "";
    if (n >= 0 && n <= 49){
      ket = "E";
    }else if(n >= 50 && n <= 59){
      ket = "D";
    }else if(n >= 60 && n <= 63.9){
      ket = "C";
    }else if(n >= 64 && n <= 67.9){
      ket = "C+";
    }else if(n >= 68 && n <= 70.9){
      ket = "B-";
    }else if(n >= 71 && n <= 73.9){
      ket = "B";
    }else if(n >= 74 && n <= 76.9){
      ket = "B+";
    }else if(n >= 77 && n <= 79.9){
      ket = "A-";
    }else if(n >= 80 && n <= 100){
      ket = "A";
    }
    return(ket);
  }
}