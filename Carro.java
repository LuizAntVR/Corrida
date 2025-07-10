package Pista;

public class Carro extends Thread{
            private String cor; 
            private int vel;
    
    public Carro(String cor, int vel){
        this.cor = cor;
        this.vel = vel;
    }
    
    
    
    @Override
    public void run(){
        for(int i = 0; i <=10; i++){
            try{
                Thread.sleep(1000 - this.vel);
                if(i == 10){
                    System.out.println("-> "+this.cor+": "+i);
                }else{
                    System.out.println(this.cor+": "+i);
                }
               
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        
    }
    
    
    //GET e SET da Cor
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return cor;
    }
    
    //GET e SET da Velocidade
    public void setVel(int vel){
        this.vel = vel;
    }
    
    public int getVel(){
        return vel;
    }
    
    
}
