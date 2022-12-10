import java.util.Scanner;


public class Main {


    static int plusMethod(int x, int y) {
        return x * y;
    }

    static double plusMethod(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {

        // membuat scanner baru

        Manager mgr= new Manager();
        Scanner Manager = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("### Pendataan MANAGER ###");
        System.out.print("Nama Manager: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        mgr.nama = Manager.nextLine();
        // Tampilkan outpu lagi
        System.out.print("Alamat: ");
        // menggunakan scanner lagi
        mgr.alamat = Manager.nextLine();

        System.out.print("Usia: ");
        mgr.usia = Manager.nextInt();

        System.out.print("Gaji: ");
        mgr.gaji = Manager.nextInt();


        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama manager: " + mgr.getNama());
        System.out.println("Alamat: " + mgr.getAlamat());
        System.out.println("Usia: " + mgr.getUsia() + " tahun");
        System.out.println("Gaji: Rp " + mgr.getGaji());


        Pelanggan plg= new Pelanggan();
        Scanner Pelanggan = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("### Pendataan PENGUNJUNG  ###");
        System.out.print("Nama Pengunjung: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        plg.nama2 = Pelanggan.nextLine();
        // Tampilkan outpu lagi
        System.out.print("ID: ");
        // menggunakan scanner lagi
        plg.id2 = Pelanggan.nextInt();

        System.out.print("No_hp: ");
        plg.no_hp = Pelanggan.nextInt();

        System.out.print("Alamat: ");
        plg.alamat1 = Pelanggan.nextLine();


        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama manager: " + plg.getNama2());
        System.out.println("ID: " + plg.getId2());
        System.out.println("No Hp: " + plg.getNo_hp() );
        System.out.println("Alamat: " + plg.getAlamat1());



        Pelanggan bc= new Resepsionis();
        Resepsionis rsp= new Resepsionis();
        Scanner Resepsionis = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("### Pendataan RESEPSIONIS  ###");
        System.out.print("Nama Resepsionis: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        rsp.nama1 = Resepsionis.nextLine();
        System.out.print("Lokasi: ");
        rsp.lokasi = Resepsionis.nextLine();
        // Tampilkan outpu lagi
        System.out.print("ID: ");
        // menggunakan scanner lagi
        rsp.id = Resepsionis.nextInt();

        System.out.print("No_hp: ");
        rsp.no_hp1 = Resepsionis.nextInt();




        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama Resepsionis: " + rsp.getNama1());
        System.out.println("ID: " + rsp.getId());
        System.out.println("No Hp: " + rsp.getNo_hp1());
        System.out.println("Lokasi:" + rsp.getLokasi());
        bc.check_member();

        Pelanggan br= new Membership();
        Membership mbr= new Membership();
        Scanner Membership = new Scanner(System.in);
        br.check_member();
        br.harga();
        System.out.print("Pilih tipe Membership: ");
        //menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        mbr.tipe = Membership.nextInt();

        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Tipe Membership ke- " + mbr.getTipe());



        Pembayaran byr= new Bayar();
        Scanner Bayar = new Scanner(System.in);
        System.out.print("Tuliskan Harga: ");
        //menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        ((Bayar) byr).harga= (int) Bayar.nextDouble();

        System.out.println("Masukkan berapa bulan membership: ");
        ((Bayar) byr).bulan= (int) Bayar.nextDouble();



        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Harga: " + ((Bayar) byr).getBayar());
        System.out.println("Bulan: "+ ((Bayar) byr).getBulan());
        System.out.println("total: ");


        int myNum1 = plusMethod(8, 300000);// bulan:x dan harga: y
        double myNum2 = plusMethod(4.3, 160000);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);





    }



}