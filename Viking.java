public class Viking extends Guerreiro{


    public Viking(){
        this.setNome("");
        this.setPontosDeVida(150);
        this.setPontosDeEstamina(180);
        this.setResistencia(30);
      
    }

    @Override
    public void imprimirEstatisticas(){
        System.out.println("-> VIKING");
    System.out.println("Nome: " + this.getNome());
    System.out.println("HP " + this.getPontosDeVida());
    System.out.println("Estamina: " + this.getPontosDeEstamina());
    System.out.println("Resistência do escudo " + this.getResistencia());
    System.out.print("/n");
    }

@Override
public int ataque(int tipo){
    switch (tipo){
        case 1:
    if(getPontosDeVida() >0 && getPontosDeEstamina() >=20){
        this.setPontosDeEstamina(getPontosDeEstamina() - 20) ;
        return 20;
    }
    case 2:
    if(getPontosDeVida() >0 && getPontosDeEstamina() >=40){
        this.setPontosDeEstamina(getPontosDeEstamina() - 40) ;
        return 50;
    }

    default :
    return 0;
}
}
        
    @Override
    public void escudo(int dano){
        if(this.getPontosDeVida() >0){
            if(this.getPontosDeEstamina() >=20){
             this.setPontosDeEstamina(getPontosDeEstamina() -20);
            sofrerDano(dano - this.getResistencia());
              }
            else{
            System.out.println("Não foi possível utilizar o escudo.(estamina insuficiente).");
            }
        }
        else if(this.getPontosDeVida() <=0){
         System.out.println("Não é possível usar o escudo, o guerreiro está morto.");
        }
    }


    public void LancarMachado(Mago pAtacado){
        if(this.getPontosDeVida() >0 &&this.getPontosDeEstamina() >= 60)
                this.setPontosDeEstamina(getPontosDeEstamina() - 60) ;
                pAtacado.sofrerDano(80);
    }

    public void LancarMachado(Guerreiro pAtacado){
        if(this.getPontosDeVida() >0 &&this.getPontosDeEstamina() >= 60)
                this.setPontosDeEstamina(getPontosDeEstamina() - 60) ;
                pAtacado.sofrerDano(80);
    }


@Override
public void vivomortoGuerreiro(){
    if(this.getPontosDeVida() == 0){
System.out.println("O viking está sem vida.");
    }
}
}
