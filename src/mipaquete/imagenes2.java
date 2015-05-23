
package mipaquete;

import javax.swing.ImageIcon;

public class imagenes2 {
        public ImageIcon icoImagen;
    public ImageIcon gifDado2(int Dado2){
    switch(Dado2)
    {
        case 1:
            icoImagen=new ImageIcon("C:\\Users\\front desk\\Desktop\\gifs\\dados-01.gif");break;
            case 2:
            icoImagen=new ImageIcon("C:\\Users\\front desk\\Desktop\\gifs\\dados-02.gif");break;
                case 3:
            icoImagen=new ImageIcon("C:\\Users\\front desk\\Desktop\\gifs\\dados-03.gif");break;
                    case 4:
            icoImagen=new ImageIcon("C:\\Users\\front desk\\Desktop\\gifs\\dados-04.gif");break;
                        case 5:
            icoImagen=new ImageIcon("C:\\Users\\front desk\\Desktop\\gifs\\dados-05.gif");break;
                            case 6:
            icoImagen=new ImageIcon("C:\\Users\\front desk\\Desktop\\gifs\\dados-06.gif");break;
            
    }
    return icoImagen;
    }
}
