import java.util.*;

public class Aplikasi {

    public static void main(String args[]) {
        Aplikasi app = new Aplikasi();
        Scanner sc = new Scanner(System.in);
        while(true) {
            app.printMenu();
            int answer = sc.nextInt();
            switch(answer) {
                case 1:
                    System.out.println("Formulir Tambah Data");
                    app.addData();
                    break;
                case 2:
                    System.out.println("Formulir Ubah Data");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("Formulir Hapus Data");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("Formulir Lihat Data");
                    app.listData();
                    break;
                case 5:
                    return;
            }
        }
    }

    public void hapusData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("------------------------");
        System.out.print("Urutan Data ke: "); int idx = Integer.parseInt(sc.nextLine());
        //  proses hapus data di list
        Operasi.removeData(idx-1);
    }

    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("------------------------");
        System.out.print("Urutan Data ke: "); int idx = Integer.parseInt(sc.nextLine());
        System.out.println("------------------------");
        System.out.print("Nama: "); String nama = sc.nextLine();
        System.out.print("Nim: "); String nim = sc.nextLine();
        System.out.print("Kelas: "); String kelas = sc.nextLine();
        System.out.print("Alamat: "); String alamat = sc.nextLine();
        //  proses timpa data di list
        Operasi.editData(new Data(nama, nim, kelas, alamat), idx-1);
    }

    public void listData() {
        //  ambil data dan tampilkan ke layar
        List<Data> result = Operasi.getListData();
        for(int i=0; i<result.size(); i++) {
            System.out.println();
            System.out.println("Data ke-" + (i+1));
            System.out.println("  Nama : " + result.get(i).getnama());
            System.out.println("  Nim : " + result.get(i).getnim());
            System.out.println("  Kelas : " + result.get(i).getkelas());
            System.out.println("  Alamat : " + result.get(i).getalamat());
        }
    }

    public void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("---------------------------");
        System.out.print("Nama: "); String nama = sc.nextLine();
        System.out.print("Nim: "); String nim = sc.nextLine();
        System.out.print("Kelas: "); String kelas = sc.nextLine();
        System.out.print("Alamat: "); String alamat = sc.nextLine();
        // proses simpan data
        Operasi.addData(new Data(nama, nim, kelas,alamat));
    }

    public void printMenu() {
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("APLIKASI PEREKAMAN DATA MAHASISWA");
        System.out.println("----------------------------");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Keluar");
        System.out.print("Pilihan : ");
    }

}