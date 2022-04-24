import java.util.*;
import java.lang.Math;

class CountingSort {
    public static void main(String[] args) {
        int n, i, j;
        
        n = 12;
        int[] data = new int[n];
        
        data[0] = 40;
        data[1] = 2;
        data[2] = 1;
        data[3] = 43;
        data[4] = 3;
        data[5] = 65;
        data[6] = 0;
        data[7] = -1;
        data[8] = 68;
        data[9] = 3;
        data[10] = 42;
        data[11] = 4;
        
        // Cetak Array Data
        System.out.println("[ ");
        for (i = 0 ; i <= n - 1 ; i += 1) {
            System.out.println("  " + data[i]);
        }
        System.out.println("  ]");
        
        // Memulai Counting Sort
        // 1. cari nilai MIN dan MAX
        int MIN, MAX;
        
        MIN = 99999;
        MAX = -99999;
        for (i = 0 ; i <= n - 1 ; i += 1) {
            if (data[i] > MAX) {
                MAX = data[i];
            }
            if (data[i] < MIN) {
                MIN = data[i];
            }
        }
        
        // buat array arrCount berukuran (MAX-MIN)+1
        int nCount;
        
        nCount = MAX - MIN + 1;
        int[] arrCount = new int[nCount];
        
        // inisialisasi array arrCount
        for (i = 0 ; i <= nCount - 1 ; i += 1) {
            arrCount[i] = 0;
        }
        
        // melakukan counting 
        for (i = 0 ; i <= n - 1 ; i += 1) {
            int value;
            
            value = data[i];
            j = value - MIN;
            arrCount[j] = arrCount[j] + 1;
        }
        
        // meletakkan hasil counting ke array hasil sorting
        int k;
        
        k = 0;
        for (i = 0 ; i <= nCount - 1 ; i += 1) {
            if (arrCount[i] > 0) {
                int nK;
                
                nK = arrCount[i];
                int value;
                
                value = MIN + i;
                for (j = 1 ; j <= nK ; j += 1) {
                    data[k] = value;
                    k = k + 1;
                }
            }
        }
        
        // Cetak Hasil Sorting
        System.out.println("[ ");
        for (i = 0 ; i <= n - 1 ; i += 1) {
            System.out.println("  " + data[i]);
        }
        System.out.println("  ]");
    }
}
