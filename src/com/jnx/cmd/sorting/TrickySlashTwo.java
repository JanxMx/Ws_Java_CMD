package com.jnx.cmd.sorting;

public class TrickySlashTwo {
    
    public static void main(String[] args) {

        // Divide la i/2
        for(int i=100; i>0; i/=2)
            for(int j=0; j<i; j++)
                System.out.println("i:" + i + "-j:" + j);

        // Divide entre i/2
        for(int i=100; i>0; i=i/2)
            for(int j=0; j<i; j++)
                System.out.println("i2:" + i + "-j2:" + j);

        // Decrementa 5
        for(int i=50; i>0; i-=5)
            for(int j=0; j<i; j++)
                System.out.println("i3:" + i + "-j3:" + j);

       // Incrementa 5
        for(int i=0; i<50; i+=5)
            for(int j=0; j<i; j++)
                System.out.println("i4:" + i + "-j4:" + j);                
    }   

}