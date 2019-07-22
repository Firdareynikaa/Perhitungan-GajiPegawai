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
public class jabatan {
    
    protected int besarGaji;
    
    protected void setGaji(String jabatan)
    {
        if(null != jabatan)
        switch (jabatan) {
            case "umk":
                this.besarGaji = 3000000;
                break;
            case "sv":
                this.besarGaji = 4000000;
                break;
            case "mng":
                this.besarGaji = 6000000;
                break;
            default:
                break;
        }
    }
    
    protected int getGaji()
    {
        return this.besarGaji;
    }
    
}
