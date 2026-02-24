class Personagem {
    String nome;
    int nivel;
    double altura;
    String sexo;

    void apresentar() {
        System.out.println("Olá! Eu sou " + nome + ", nível " + nivel + ".");
    }

    void subirNivel() {
        nivel++;
        System.out.println("Parabéns! " + nome + " subiu para o nível " + nivel + "!");
    }

    void verificarPorte() {
        if (altura > 1.80) {
            System.out.println(nome + " é de porte alto.");
        } else {
            System.out.println(nome + " é de porte médio/baixo.");
        }
    }
}

public class JogoRPG {
    public static void main(String[] args) {
        
        Personagem p1 = new Personagem();
        p1.nome = "Sakura";
        p1.nivel = 50;
        p1.altura = 1.68;
        p1.sexo = "Feminino";

        Personagem p2 = new Personagem();
        p2.nome = "Naruto";
        p2.nivel = 500;
        p2.altura = 1.95;
        p2.sexo = "Masculino";

        System.out.println("--- STATUS DA BATALHA ---");
        
        p1.apresentar();    
        p1.verificarPorte(); 

        System.out.println("-------------------------");

        p2.apresentar();   
        p2.subirNivel();    
        p2.verificarPorte();
    }
}