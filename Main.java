import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int oqUserQuer = 0;
        int frenteOuTras = 0;
        int quantoVirar = 0;
        int repete = 1;
        RoboLunar robo = new RoboLunar();
        Scanner oqQuer = new Scanner(System.in);
        while (repete == 1) {
        
            System.out.println("Qual função você deseja desempenhar? 1 = Virar 2 = MudarDirecao 3 = Dados");
            
            oqUserQuer = oqQuer.nextInt();

            if (oqUserQuer == 1) {
                
                System.out.println("Deseja virar em quantos graus?");
                quantoVirar = oqQuer.nextInt();
                robo.Virar(quantoVirar);
            
            } else if(oqUserQuer == 2) {
                
                System.out.println("Gostaria de ir para frente ou para tras? 1 - frente 0 - tras");
                frenteOuTras = oqQuer.nextInt();
                robo.MudarDirecao(frenteOuTras);

            } else if(oqUserQuer == 3) {
                robo.Dados();
            }

            System.out.println("Gostaria de realizar mais processos? 1 - Continuar 0 - Parar");
            repete = oqQuer.nextInt();

        }

    }
}