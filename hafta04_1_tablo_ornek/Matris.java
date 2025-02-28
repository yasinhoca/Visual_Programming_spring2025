package hafta04_1_tablo_ornek;

import java.util.ArrayList;
import java.util.Random;

public class Matris {
    static Random r = new Random();

    static ArrayList listeOlustur(int satir, int sutun){
        ArrayList liste = new ArrayList();
        int uzunluk = satir*sutun;
        for(int i=0;i<uzunluk;i++) liste.add(r.nextInt(100));
        return liste;
    }

    static int[][] listeyiMatriseKir(int satir, int sutun,ArrayList liste){
        int[][] m = new int[satir][sutun];


        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                m[i][j] =(int) liste.get(j+(i*sutun));
            }
        }


        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }

        return m;
    }

}
