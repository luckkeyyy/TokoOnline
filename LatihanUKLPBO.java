package latihanuklpbo;

public class LatihanUKLPBO {

    public static void main(String[] args) {
        Barang barang = new Barang();
        Transaksi transaksi = new Transaksi();
        Karyawan karyawan = new Karyawan();    
        Member member = new Member();
        laporan Laporan = new laporan();
        
        
       
        transaksi.prosesTransaksi(member, transaksi, barang);
         Laporan.laporan(barang);
        Laporan.laporan(member);
        Laporan.laporan(transaksi, barang);
    }   
}
