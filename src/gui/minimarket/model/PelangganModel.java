package gui.minimarket.model;


import gui.minimarket.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 * Model untuk menyimpan data pelanggan. Kelas ini digunakan untuk memanipulasi data pelanggan
 * dan memberi tahu listener ketika ada perubahan data.
 */
public class PelangganModel {
    
    private String nama;
    private String email;
    private String noTelepon;
    private String alamat;
    
    private PelangganListener pelangganListener;

    /**
     * Mengembalikan nama pelanggan.
     * @return nama pelanggan.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengatur nama pelanggan.
     * @param nama Nama pelanggan yang akan disimpan.
     */
    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    /**
     * Mengembalikan email pelanggan.
     * @return email pelanggan.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Mengatur email pelanggan.
     * @param email Email pelanggan yang akan disimpan.
     */
    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    /**
     * Mengembalikan nomor telepon pelanggan.
     * @return nomor telepon pelanggan.
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Mengatur nomor telepon pelanggan.
     * @param noTelepon Nomor telepon pelanggan yang akan disimpan.
     */
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
        fireOnChange();
    }

    /**
     * Mengembalikan alamat pelanggan.
     * @return alamat pelanggan.
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * Mengatur alamat pelanggan.
     * @param alamat Alamat pelanggan yang akan disimpan.
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
        fireOnChange();
    }

    /**
     * Menyimpan data pelanggan dan menampilkan pesan sukses.
     */
    public void simpanForm() {
        JOptionPane.showMessageDialog(null, "Data Pelanggan Berhasil Disimpan");
    }

    /**
     * Mereset semua field data pelanggan menjadi kosong.
     */
    public void resetForm() {
        this.setNama("");
        this.setEmail("");
        this.setNoTelepon("");
        this.setAlamat("");
    }

    /**
     * Mengembalikan listener pelanggan.
     * @return listener pelanggan.
     */
    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    /**
     * Mengatur listener pelanggan.
     * @param pelangganListener Listener pelanggan yang akan diset.
     */
    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }

    /**
     * Memberi tahu listener bahwa ada perubahan data.
     */
    protected void fireOnChange() {
        if (pelangganListener != null) {
            pelangganListener.onChange(this);
        }
    }
}
