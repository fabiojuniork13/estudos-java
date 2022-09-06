package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class teste2 {
	static String a;

	public static void main(String[] args) throws CloneNotSupportedException {
//		List<Peca> lista = new ArrayList<Peca>();
//		Peca p1 = new Peca();
//		p1.setNome("12345");
//		p1.setV("0");
//		
//		for(int i = 0; i <= 3; i++) {
//			Peca p2 = new Peca();
//			
//			p2 = p1.clone();
//			
//			p2.setV(Integer.toString(i));
//			
//			lista.add(p2);
//			
//		}
//		
//		for (Peca peca : lista) {
//			System.out.println(peca.getNome() + " " + peca.getV());
//		}
//		
//		System.out.println(p1.getNome() + " " + p1.getV());
//		
//		Peca p3 = null;
//		
//		p3.setNome("BLALBA");
//		
		List<Peca> lista = new ArrayList<Peca>();
		java.lang.Thread t1 = new java.lang.Thread(new Runnable() {
            @Override
            public void run() {
            	Peca p1 = new Peca();
            	p1.setNome("MIA");
            	lista.add(p1);
            	System.out.println("oi eu sou o t1 " + p1.getNome());
            }
        });
		
		
		
		
		Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("oi eu sou o t2");
            }
        });
		
		try {
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Peca p2 = lista.get(0);
		
		System.out.println(p2.getNome());
		
	}
	

}
