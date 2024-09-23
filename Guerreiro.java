public class Guerreiro {
        private String nome;
        private int pontosDeVida;
        private int pontosDeEstamina;
        private int resistencia;

        public Guerreiro(){
            this.setNome("");
            this.setPontosDeVida(150);
            this.setPontosDeEstamina(180);
            this.setResistencia(15);
          
        }

        public void setNome(String nome){
            this.nome = nome;
        }
        
        public String getNome(){
            return this.nome;
        }
        
        
        public void setPontosDeVida(int pontosDeVida){
            if(pontosDeVida<=150 && pontosDeVida >0){
                this.pontosDeVida= pontosDeVida;
            }
                else if(pontosDeVida <=0){
                    this.pontosDeVida = 0;
                }
                else if(pontosDeVida > 150){
                    this.pontosDeVida = 150;
                }
        
        }
        
        public int getPontosDeVida(){
            return this.pontosDeVida;
        }

        public void setResistencia(int valor){
                    if(valor >0 && valor <=15){
                        this.resistencia =valor;
                    }
                    else if(valor <= 0){
                        this.resistencia = 0;
                }
                    else if(valor > 15){
                        this.resistencia = 15;
                    }
        }
        public int getResistencia(){
            return this.resistencia;
        }


        public void setPontosDeEstamina(int pontosDeEstamina){
            if(pontosDeEstamina<=180 && pontosDeVida >=0){
                this.pontosDeEstamina = pontosDeEstamina;
            }
                else if(pontosDeEstamina <0){
                    this.pontosDeEstamina = 0;
                }
                else if(pontosDeEstamina > 180){
                    this.pontosDeEstamina = 180;
                }
            }

        public int getPontosDeEstamina(){
                    return this.pontosDeEstamina;
                    }

        public void imprimirEstatisticas(){
            System.out.println("-> GUERREIRO");
        System.out.println("Nome: " + this.nome);
        System.out.println("HP " + this.pontosDeVida);
        System.out.println("Estamina: " + this.pontosDeEstamina);
        System.out.println("Resistência do escudo " + this.resistencia);
        System.out.print("/n");
        }

        public int ataque(int tipo){
            switch (tipo){
                case 1:
            if(this.pontosDeVida >0 && this.pontosDeEstamina >=10){
                pontosDeEstamina -=10;
                return 15;
            }
            case 2:
            if(this.pontosDeVida >0 && this.pontosDeEstamina >=15){
                pontosDeEstamina -=25;
                return 35;
            }
            default :
            return 0;
                
        }
    }
    
            public void sofrerDano(int dano){
                        if(dano > 0){
                            if(pontosDeVida - dano >=0){
                                pontosDeVida -=dano;
                            }
                            else{
                                pontosDeVida = 0;
                            }
                        }
                    }


        public void escudo(int dano){
            if(this.pontosDeVida >0){
                if(this.pontosDeEstamina >=30){
                pontosDeEstamina -=30;
                sofrerDano(dano - this.resistencia);
                }
                else{
                System.out.println("Não foi possível utilizar o escudo.(estamina insuficiente).");
                }
            }
            else if(this.pontosDeVida <=0){
                System.out.println("Não é possível usar o escudo, o guerreiro está morto.");
            }
        }

        public void curar(int pontos){
            if(this.pontosDeVida < 150 -pontos){
                pontosDeVida += pontos;
            }
            else if(this.pontosDeVida > 150 -pontos && this.pontosDeVida < 100){
            pontosDeVida = 150;
        }
        else if(pontosDeVida == 150){
            System.out.println("não foi possível curar, o guerreiro já está com a vida máxima.");
        }
        }
            
        public void recuperarEstamina(int estamina){
            if(this.pontosDeEstamina < 180 -estamina){
                pontosDeEstamina += estamina;
            }
            else if(this.pontosDeEstamina > 180 -estamina && this.pontosDeEstamina < 200){
            pontosDeEstamina = 180;
        }
        else if(this.pontosDeEstamina == 180){
            System.out.println("não foi possível recuperar estamina");
        }
        }
        
        public void vivomortoGuerreiro(){
            if(this.pontosDeVida ==0){
        System.out.println("O guerreiro está sem vida.");
            }
        }

        public void atacar(Mago pAtacado, int ataque){
            pAtacado.sofrerDano(ataque);
    }
    public void atacar(Viking pAtacado, int ataque){
        pAtacado.sofrerDano(ataque);
}
public void atacar(Guerreiro pAtacado, int ataque){
    pAtacado.sofrerDano(ataque);
}

}
