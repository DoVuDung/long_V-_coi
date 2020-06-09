/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class chinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = 8,c,d;
        process que = new process();
        que.khoiTao();
        System.out.println("Nhap dinh");
        c = in.nextInt();
        que.queue(c);
        
        
    }
    
}
