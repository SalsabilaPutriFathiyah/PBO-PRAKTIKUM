
public class Barang {
    String kode_barang;
    String nama_barang;
    int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok += stk;
    }
    
    public String getkode_barang(){
        return kode_barang;
    }
    public String getnama_barang(){
        return nama_barang;
    }
    public int getstok(){
        return stok;
    }
}
