package gui.minimarket.controller;

import gui.minimarket.model.PelangganModel;
import gui.minimarket.view.PelangganView;
import javax.swing.JOptionPane;

/**
 * Controller yang mengatur interaksi antara model dan view pelanggan.
 */
public class PelangganController {

    private PelangganModel model;

    /**
     * Mengembalikan model pelanggan.
     * @return model pelanggan.
     */
    public PelangganModel getModel() {
        return model;
    }

    /**
     * Mengatur model pelanggan.
     * @param model Model pelanggan yang akan diset.
     */
    public void setModel(PelangganModel model) {
        this.model = model;
    }

    /**
     * Menyimpan data form pelanggan ke dalam model.
     * @param view View pelanggan yang berisi data.
     */
    public void simpanForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtNotelp().getText();
        String alamat = view.getTxtAlamat().getText();

        if (nama.trim().isEmpty()) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if (email.trim().isEmpty()) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        } else if (noTelp.trim().isEmpty()) {
            JOptionPane.showMessageDialog(view, "No Telepon Masih Kosong");
        } else if (alamat.trim().isEmpty()) {
            JOptionPane.showMessageDialog(view, "Alamat Masih Kosong");
        } else {
            model.setNama(nama);
            model.setEmail(email);
            model.setNoTelepon(noTelp);
            model.setAlamat(alamat);
            model.simpanForm();
        }
    }

    /**
     * Mereset data form pelanggan pada model.
     * @param view View pelanggan yang akan direset datanya.
     */
    public void resetForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtNotelp().getText();
        String alamat = view.getTxtAlamat().getText();
        if (nama.trim().isEmpty() && email.trim().isEmpty() && noTelp.trim().isEmpty() && alamat.trim().isEmpty()){
            JOptionPane.showMessageDialog(view, "Form Kosong !!!");
        }
        model.resetForm();
    }
}
