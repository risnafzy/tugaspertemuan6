/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6;
import pertemuan6.PersegiPanjang;
/**
 *
 * @author ACER
 */
public class Main {
   public static void main(String[] args) {
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(1, 1);
        System.out.println("panjang1= " + persegiPanjang1.getPanjang() + ", lebar= " + persegiPanjang1.getLebar());
        System.out.println("Luas persegiPanjang 1 adalah: " + persegiPanjang1.getLuas());
        System.out.println("Keliling persegiPanjang 1 adalah: " + persegiPanjang1.getKeliling());
        System.out.println("");

        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);
        System.out.println("panjang2= " + persegiPanjang2.getPanjang() + ", lebar= " + persegiPanjang2.getLebar());
        System.out.println("Luas persegiPanjang 2 adalah: " + persegiPanjang2.getLuas());
        System.out.println("Keliling persegiPanjang 2 adalah: " + persegiPanjang2.getKeliling());
        System.out.println("");

        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25, 35);
        System.out.println("panjang3= " + persegiPanjang3.getPanjang() + ", lebar= " + persegiPanjang3.getLebar());
        System.out.println("Luas persegiPanjang 3 adalah: " + persegiPanjang3.getLuas());
        System.out.println("Keliling persegiPanjang 3 adalah: " + persegiPanjang3.getKeliling());
    }
}