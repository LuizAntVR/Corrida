package Pista;

import java.util.*;
import java.util.Map;
import java.util.Collections;

public class PistaMain {

    public static void main(String[] args) {
        
        //Adicionado os Competidores(Carros)
        Carro carro1 = new Carro("Amarelo", 100);
        Carro carro2 = new Carro("Verde", 400);
        Carro carro3 = new Carro("Rosa", 300);
        Carro carro4 = new Carro("Azul", 500);
        
        //"Iniciando a corrida"
        carro1.start();
        carro2.start();
        carro3.start();
        carro4.start();  
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
        //Adicionando os Carros no dicionario
        Map<String, Integer>comp = new LinkedHashMap<>();
        
        comp.put(carro1.getCor(), carro1.getVel());
        comp.put(carro2.getCor(), carro2.getVel());
        comp.put(carro3.getCor(), carro3.getVel());
        comp.put(carro4.getCor(), carro4.getVel());
        
        //Definindo a maior Velocidade
        List<Integer> maior = new ArrayList<>();
        
        maior.add(carro1.getVel());
        maior.add(carro2.getVel());
        maior.add(carro3.getVel());
        maior.add(carro4.getVel());
        
        Collections.sort(maior, Collections.reverseOrder());
        int mavel = maior.get(0);
               
        //Descobrindo os Vencedores
        List<String> venc = new ArrayList<>();
        
        for (Map.Entry<String, Integer> ven : comp.entrySet()) {
            if(ven.getValue() == mavel){
                venc.add(ven.getKey());
            } 
        }
       
        
        System.out.println("\n=== RESULTADO =========================");
        //Reportando o(s) Campeão(s) 
        if(venc.size() == 1){
            for (String nome : venc) {
            System.out.println("O Ganhador dessa corrida é o carro: " + nome);
            }
        }else{
            System.out.println("Houve um empate entre os carros:");
            for (String nome : venc) {
            System.out.println(nome);
            }
        }
        
    }
}
