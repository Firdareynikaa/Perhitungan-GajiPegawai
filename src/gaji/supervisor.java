/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji;

/**
 *
 * @author Firdausa
 */
public class supervisor extends jabatan {
    
    protected void setGaji(int golongan)
    {
        if(golongan == 1){
            super.besarGaji = 5000000;
        }
        else if(golongan == 2){
            super.besarGaji = 10000000;
        }
    }
    
}
