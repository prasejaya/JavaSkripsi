/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsi;

/**
 *
 * @author Have
 */
public class getDataTrain {
    private int age,kelas,alamine_aminotransferase, aspartate_aminotransferase, alkaline_phosphotase;
    private float direct_bilirubin, albumin, albumin_globulin_ratio, total_protiens, total_bilirubin ;
    private String gender;
    
    public void setage(int age) {
        this.age = age;
    }
    public void setgender(String gender) {
        this.gender = gender;
    }
    public void setkelas(int kelas) {
        this.kelas = kelas;
    }
    public void settotal_bilirubin(float total_bilirubin) {
        this.total_bilirubin = total_bilirubin;
    }
    public void setalamine_aminotransferase(int alamine_aminotransferase) {
        this.alamine_aminotransferase = alamine_aminotransferase;
    }
    public void setaspartate_aminotransferase(int aspartate_aminotransferase) {
        this.aspartate_aminotransferase = aspartate_aminotransferase;
    }
    public void setdirect_bilirubin(float direct_bilirubin) {
        this.direct_bilirubin = (float) direct_bilirubin;
    }
    public void setalkaline_phosphotase(int alkaline_phosphotase) {
        this.alkaline_phosphotase = alkaline_phosphotase;
    }
    public void setalbumin(float albumin) {
        this.albumin = albumin;
    }
    public void setalbumin_globulin_ratio(float albumin_globulin_ratio) {
        this.albumin_globulin_ratio = albumin_globulin_ratio;
    }
    public void settotal_protiens(float total_protiens) {
        this.total_protiens = total_protiens;
    }
    public int getage() {
        return age;
    }
    public String getgender() {
        return gender;
    }
    
    public int getkelas() {
        return kelas;
    }
    
    public int getalamine_aminotransferase() {
        return alamine_aminotransferase ;
    }
    public int getaspartate_aminotransferase() {
        return aspartate_aminotransferase;
    }
    public float getdirect_bilirubin() {
        return direct_bilirubin;
    }
    public float total_bilirubin() {
        return total_bilirubin;
    }
    public int getalkaline_phosphotase() {
        return alkaline_phosphotase;
    }
    public float getalbumin() {
        return albumin;
    }
    public float getalbumin_globulin_ratio() {
        return albumin_globulin_ratio;
    }
    public float gettotal_protiens() {
        return total_protiens;
    }
}
