/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class process  {

    private final int g[][] = new int[10][10];
    private final int d[] = new int[10];
    private int n;
    
    Queue<Integer> q = new LinkedList<>();

    public process() {
    }

    public process(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void khoiTao() {
        for (int i = 1; i <= n; i++) {
            d[i] = 0;
        }
    }

    public void docFile() throws FileNotFoundException {
        File f = new File("C:/Users/Andy/Desktop/matrix.txt");
        if (f.exists()) {
            Scanner read = new Scanner(f);
        }
    }

    public void xuatMT() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(g[i][j] + " ");
            System.out.println("\n");
            }
        }
    }
    public void queue(int a){
        q.add(a); d[a] = 1;
        while(!q.isEmpty()){
            int u; 
            u = q.
        }
    }
}
