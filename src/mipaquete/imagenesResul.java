
package mipaquete;

import javax.swing.ImageIcon;

public class imagenesResul {
     public ImageIcon icoImagen;
    public ImageIcon Imaen(int vDados){
    switch(vDados)
    {
        case 1:
            icoImagen=new ImageIcon("C:\\Users\\front desk\\Desktop\\png\\d1.png");break;
            case 2:
            icoImagen=new ImageIcon("C:\\Users\\front desk\\Desktop\\png\\d2.png");break;
                case 3:
            icoImagen=new ImageIcon("C:\\Users\\front desk\\Desktop\\png\\d3.png");break;
                    case 4:
            icoImagen=new ImageIcon("C:\\Users\\front desk\\Desktop\\png\\d4.png");break;
                        case 5:
            icoImagen=new ImageIcon("C:\\Users\\front desk\\Desktop\\png\\d5.png");break;
                            case 6:
            icoImagen=new ImageIcon("C:\\Users\\front desk\\Desktop\\png\\d6.png");break;
            
    }
    return icoImagen;
    } 
}
