/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sagar
 */
public class ImageItems {
    
    private byte[] picture;
    
    public ImageItems(byte[] picture){
        this.picture=picture;
        
    }
    
    
    public byte[] getImage(){
        
        return picture;
    }
}
