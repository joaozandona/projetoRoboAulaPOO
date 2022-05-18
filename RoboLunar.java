import java.util.Timer;
import java.util.TimerTask;

public class RoboLunar {
    private int bateria = 100;
    private int rotacao = 0; // eixo base da nave vai ser 0, nesse caso vamos considerar 0 como norte ou posição inicial dela
    private int direcao = 0;
    private String direcaoDesc = "";

    Timer timer = new Timer();

    public RoboLunar(){}

    public void Virar(int quantoRodar){
        
        if (this.bateria - 5 >= 1 ) {
            
            this.bateria = this.bateria - 5;
            this.rotacao = this.rotacao + quantoRodar;
            if (this.rotacao > 360) {
                this.rotacao = this.rotacao - 360;
            }
            System.out.println("A bateria da nave esta em: "+this.bateria);
            System.out.println("A direcao da nave foi alterada para: "+this.rotacao+" graus");

        }else{
    
            System.out.println("Sem bateria para realizar o processo entrando em modo de carregamento");
            this.bateria = Carregando();
    
        }

        

    }

    public void MudarDirecao(int direcao){
        if (this.bateria - 10 >= 1 ) {

            this.bateria = this.bateria - 10;

            if (this.direcao != direcao) {

                this.direcao = direcao;
            
                if (this.direcao == 1) {
                    this.direcaoDesc = "Frente";
                }else{
                    this.direcaoDesc = "Tras";
                }

                System.out.println("A nave esta indo para: "+this.direcaoDesc);
            
            }else{
                System.out.println("Rota em curso sem necessidade de alterar");
            }

            
        
        }else{
            
            System.out.println("Sem bateria para realizar o processo entrando em modo de carregamento");
            this.bateria = Carregando();
        
        }
    
    }

    public void Dados(){
        
        if (this.bateria - 10 >= 1 ) {

            this.bateria = this.bateria - 1;
            
            System.out.println("A bateria da nave esta em: "+this.bateria);
            System.out.println("A direcao da nave e: "+this.rotacao+" graus");
            System.out.println("A nave esta indo para: "+this.direcaoDesc);
        
        }else{

            System.out.println("Sem bateria para realizar o processo entrando em modo de carregamento");
            this.bateria = Carregando();
        
        }
            
    }
    public int Carregando(){
        timer.schedule(new TimerTask() {
            public void run() {
                bateria = bateria + 1;
                System.out.println("Bateria carregando: "+bateria+"%");         
                if (bateria == 100) {
                    timer.cancel();
                }
            }
        }, 1000, 500);
        return bateria;
    }

}
