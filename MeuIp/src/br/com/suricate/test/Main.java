package br.com.suricate.test;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class Main {

	
	public static void main(String[] args) {
	
		InetAddress ia;
		String ip = null;
		String nome = null;
		Enumeration nis = null;
        try {
            nis = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e) {
            e.printStackTrace();
        }
        while (nis.hasMoreElements()) {
            NetworkInterface ni = (NetworkInterface) nis.nextElement();
            Enumeration ias = ni.getInetAddresses();
            while (ias.hasMoreElements()) {
                ia = (InetAddress) ias.nextElement();
                if (!ia.getHostAddress().contains(":") && !(ia.getHostAddress().length()<9)) {//Nesse if está a charada, sendo que eu sei que meu ip começa com 10.132, por exemplo
                	ip=ia.getHostAddress();    
                }
                System.out.println("Teste " + ia.getHostAddress());
                if (!ni.getName().equals("lo")) {
                    System.out.println("test = "+ia.getHostAddress());
                }
            }
        }
        System.out.println("Nome: " + nome);
        System.out.println("IP: " + ip);
	}

}
