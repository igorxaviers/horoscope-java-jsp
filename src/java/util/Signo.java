/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author igorr, junior
 */
public final class Signo {
    
    public static String getSigno(int dia, int mes){
        if((dia>=21 && mes>=3) && (dia<=20 && mes<=4))
            return "Áries";
        else
        if((dia>=21 && mes>=4) && (dia<=20 && mes<=4))
            return "Touro";
        else
        if((dia>=21 && mes>=5) && (dia<=20 && mes<=6))
            return "Gêmeos";
        else
        if((dia>=21 && mes>=6) && (dia<=22 && mes<=7))
            return "Câncer";
        else
        if((dia>=23 && mes>=7) && (dia<=22 && mes<=8))
            return "Leão";        
        else
        if((dia>=23 && mes>=8) && (dia<=22 && mes<=9))
            return "Virgem";
        else
        if((dia>=23 && mes>=9) && (dia<=22 && mes<=10))
            return "Libra";         
        else
        if((dia>=23 && mes>=10) && (dia<=21 && mes<=11))
            return "Escorpião";         
        else
        if((dia>=22 && mes>=11) && (dia<=21 && mes<=12))
            return "Sagitário";                
        else
        if((dia>=22 && mes>=12) && (dia<=20 && mes<=1))
            return "Capricórnio";                
        else
        if((dia>=21 && mes>=1) && (dia<=18 && mes<=2))
            return "Aquário";                
        else
            return "Peixes";
    } 
}
