/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonsimulator;

/**
 *
 * @author pedro
 */
public class Pokemon {
    
    private String nome;
    private int level;
    private int hp;
    private int ataque;
    private int defesa;
    
    public Pokemon(String nome, int level, int hp, int ataque, int defesa) {
        this.nome = nome;
        this.level = level;
        this.hp = hp;
        this.ataque = ataque;
        this.defesa = defesa;
    }
    
    public void calcularAtributos() {
       hp = hp + (level/2);
       ataque = ataque + (level/3);
       defesa = defesa + (level/4);
    }
    


    public int getHp() {
        return hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getLevel() {
        return level;
    }
    
    
    
    
    
}
