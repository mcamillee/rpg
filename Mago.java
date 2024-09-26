
public class Mago {
    private String nome;
    private int pontosDeVida;
    private int pontosDeMana;


public Mago(){
    this.setNome("");
    this.setPontosDeVida(100);
    this.setPontosDeMana(200);
  
}


public void setNome(String nome){
    this.nome = nome;
}

public String getNomeo(){
    return this.nome;
}



public void setPontosDeVida(int pontosDeVida){
    if(pontosDeVida<=100 && pontosDeVida >0){
        this.pontosDeVida = pontosDeVida;
    }
        else if(pontosDeVida <=0){
            this.pontosDeVida = 0;
        }
        else if(pontosDeVida > 100){
            this.pontosDeVida = 100;
        }

}

public int getPontosDeVidaMago(){
    return this.pontosDeVida;
}


public void setPontosDeMana(int pontosDeMana){
    if(pontosDeMana<=200 && pontosDeVida >=0){
        this.pontosDeMana = pontosDeMana;
    }
        else if(pontosDeMana <0){
            this.pontosDeMana = 0;
        }
        else if(pontosDeMana > 200){
            this.pontosDeMana = 200;
        }
}

public int getPontosDeMana(){
return this.pontosDeMana;
}

public void imprimirEstatisticas(){
    System.out.println("-> MAGO");
System.out.println("Nome: " + this.nome);
System.out.println("HP " + this.pontosDeVida);
System.out.println("Mana: " + this.pontosDeMana);
System.out.print("/n");
}




public int magia(int tipo){
        switch (tipo){

        case 1:
        if(this.pontosDeVida >0 && this.pontosDeMana >=20)
            pontosDeMana -=20;
            return 20;
    
        case 2:
        if(this.pontosDeVida>0 && this.pontosDeMana >=50)
            pontosDeMana -=50;
            return 40;

        default :
            return 0;
                
    }
}
public void atacar(Guerreiro pAtacado, int tipoMagia){
    pAtacado.sofrerDano(magia(tipoMagia));
}

public void atacar(Mago pAtacado, int ataque){
    pAtacado.sofrerDano(ataque);
}

public void curar(int pontos){
    if(this.pontosDeVida < 100 -pontos){
        System.out.println(pontos + " pontos de vida recuperados.");
        pontosDeVida += pontos;
    }
    else if(this.pontosDeVida > 100 -pontos && this.pontosDeVida < 100){
    System.out.println(100-pontosDeVida + " pontos de vida recuperados.");
    pontosDeVida = 100;
}
else if(pontosDeVida == 100){
    System.out.println("não é possível curar, você já está com a vida máxima.");
}
}
    
public void recuperarMana(int mana){
    if(this.pontosDeMana < 200 -mana){
        System.out.println(mana + " pontos de mana recuperada.");
        pontosDeMana += mana;
    }
    else if(this.pontosDeMana > 200 -mana && this.pontosDeMana < 200){
    System.out.println(200-pontosDeMana + " pontos de mana recuperada.");
    pontosDeMana = 200;
}
else if(this.pontosDeMana == 200){
    System.out.println("não é possível recuperar mana, o mago já está com a mana cheia.");
}
}

public void vivomortoMago(){
    if(this.pontosDeVida ==0){
System.out.println("O mago está sem vida.");

    }
}
public void sofrerDano(int dano){
    if(dano > 0){
        if(pontosDeVida- dano >=0){
            pontosDeVida-=dano;
        }
        else{
            pontosDeVida = 0;
        }
    }
}





}

