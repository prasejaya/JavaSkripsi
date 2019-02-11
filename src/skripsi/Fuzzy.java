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
public class Fuzzy {
     private double x1, x2, x3, x4, x5,x6;
   // Grafik 3 Kurva : Bahu, Trapesium, Bahu
    // Function Fuzzy Membership : 
    //      Age (a = 15 ; b = 25 ; c = 45 ; d = 55)
    //      Total Protiens (a = 5,5 ; b = 6,5 ; c = 7,5 ; d = 8,5)
    //      Albumin (a = 2,9 ; b = 3,9 ; c = 4,3 ; d = 5,3)
    public double Fuzzy_BTB1(double angka, double a, double b) {
       // Age MF Anak
        // Total Protiens MF Rendah
        // Albumin MF Rendah
        //Angka pembulatan
        int bulat = 2;
        double angka1 = Math.pow(10, bulat);
        if (angka<=a) {
            x1 = 1;
        }
        else if (a<angka && angka<b) {
            x1 = (b-angka)/(b-a);
            x1 = Math.round(x1*angka1)/angka1;
        }
        else if (angka>=b) {
            x1 = 0;
        }
        
        return x1;
        
    }
    
    public double Fuzzy_BTB2(double angka, double a, double b, double c, double d) {
        // Age MF Muda
        // Total Protiens MF Normal
        // Albumin MF Normal
         int bulat = 2;
        double angka1 = Math.pow(10, bulat);
        if (angka<=a) {
            x2 = 0;
        }
        else if (a<angka && angka<b) {
            x2 = (angka-a)/(b-a);
            x2 = Math.round(x2*angka1)/angka1;
        }
        else if (b<=angka && angka<=c) {
            x2 = 1;
        }
        else if (c<angka && angka<d) {
            x2 = (d-angka)/(d-c);
            x2 = Math.round(x2*angka1)/angka1;
        }
        else if (angka>=d) {
            x2 = 0;
        }
        
        return x2;
    }
    
    public double Fuzzy_BTB3(double angka, double c, double d) {
        // Age MF Dewasa
        // Total Protiens MF Tinggi
        // Albumin MF Tinggi
         int bulat = 2;
        double angka1 = Math.pow(10, bulat);
        if (angka<=c) {
            x3 = 0;
        }
        else if (c<angka && angka<d) {
            x3 = (angka-c)/(d-c);
           x3 = Math.round(x3*angka1)/angka1;
        }
        else if (angka>=d) {
            x3 = 1;
        }
        return x3;
    }
    
       // Grafik 2 Kurva : Bahu, Bahu
    // Function Fuzzy Membership : 
    //      Total Bilirubin (a = 0,5 ; b = 1,5)
    //      Direct Bilirubin (a = 0,15 ; b = 0,25)
    //      Alamine Aminotransferase (a = 42 ; b = 52)
    //      Aspartate Aminotransferase (a = 32 ; b = 42)
    //      Albumin and Globulin Ratio (a = 0,5 ; b = 1,5)
    public double Fuzzy_BB1(double angka, double a, double b) {
        // Total Bilirubin MF Normal
        // Direct Bilirubin MF Normal
        // Alamine Aminotransferase MF Normal
        // Aspartate Aminotransferase MF Normal
        // Albumin and Globulin Ratio MF Normal
         int bulat = 2;
        double angka1 = Math.pow(10, bulat);
        if (angka<=a) {
            x1 = 1;
        }
        else if (a<angka && angka<b) {
            x1 = (b-angka)/(b-a);
            x1 = Math.round(x1*angka1)/angka1;
        }
        else if (angka>=b) {
            x1 = 0;
        }
         //x5 = Math.round(x1);
        return x1;
    }
    
    public double Fuzzy_BB2(double angka, double a, double b) {
         // Total Bilirubin MF Abnormal
        // Direct Bilirubin MF Abnormal
        // Alamine Aminotransferase MF Abnormal
        // Aspartate Aminotransferase MF Abnormal
        // Albumin and Globulin Ratio MF Abnormal
        int bulat = 2;
        double angka1 = Math.pow(10, bulat);
        if (angka<=a) {
            x1 = 0;
        }
        else if (a<angka && angka<b) {
            x1 = (angka-a)/(b-a);
             x1 = Math.round(x1*angka1)/angka1;
        }
        else if (angka>=b) {
            x1 = 1;
        }
        return x1;
    }
    
    // Grafik 2 Kurva : Trapesium, Bahu
    // Function Fuzzy Membership : 
    //      Alkaline Phosphotase (a = 25 ; b = 35 ; c = 115 ; d = 125)
    public double Fuzzy_TB1(double angka, double a, double b, double c, double d) {
        // Alkaline Phosphotase MF Normal
         int bulat = 2;
        double angka1 = Math.pow(10, bulat);
        if (angka<=a) {
            x1 = 0;
        }
        else if (a<angka && angka<b) {
            x1 = (angka-a)/(b-a);
             x1 = Math.round(x1*angka1)/angka1;
        }
        else if (b<=angka && angka<=c) {
            x1 = 1;
        }
        else if (c<angka && angka<d) {
            x1 = (d-angka)/(d-c);
             x1 = Math.round(x1*angka1)/angka1;
        }
        else if (angka>=d) {
            x1 = 0;
        }
      
        //x5 = Math.round(x1);
        return x1;
    }
    
    public double Fuzzy_TB2(double angka, double a, double b, double c, double d) {
          // Alkaline Phosphotase MF Abnormal
         int bulat = 2;
        double angka1 = Math.pow(10, bulat);
        if (angka<=c) {
            x1 = 0;
        }
        else if (c<angka && angka<d) {
            x1 = (angka-c)/(d-c);
              x1 = Math.round(x1*angka1)/angka1;
        }
        else if (angka>=d) {
            x1 = 1;
        }
        return x1;
    }
    public void Fuzzy_BTB(double angka, double a, double b, double c, double d) {
        // Age MF Anak
        // Total Protiens MF Rendah
        // Albumin MF Rendah
        if (angka<=a) {
            x1 = 1;
        }
        else if (a<angka && angka<b) {
            x1 = (b-angka)/(b-a);
        }
        else if (angka>=b) {
            x1 = 0;
        }
        // Age MF Muda
        // Total Protiens MF Normal
        // Albumin MF Normal
        if (angka<=a) {
            x2 = 0;
        }
        else if (a<angka && angka<b) {
            x2 = (angka-a)/(b-a);
        }
        else if (b<=angka && angka<=c) {
            x2 = 1;
        }
        else if (c<angka && angka<d) {
            x2 = (d-angka)/(d-c);
        }
        else if (angka>=d) {
            x2 = 0;
        }
        // Age MF Dewasa
        // Total Protiens MF Tinggi
        // Albumin MF Tinggi
        if (angka<=c) {
            x3 = 0;
        }
        else if (c<angka && angka<d) {
            x3 = (angka-c)/(d-c);
        }
        else if (angka>=d) {
            x3 = 1;
        }
    }
}
