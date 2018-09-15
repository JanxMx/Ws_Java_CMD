package com.jnx.cmd.enums.example_02;

public class Test {

    public static void main(String[] args) {

        // whois.arin.net
        System.out.println(WhoisRIR.ARIN.url());

        WhoisRIR rir = WhoisRIR.APNIC;

        if(rir == WhoisRIR.APNIC) {
            System.out.println("This is APNIC : " + rir.url());
        }

    }
}