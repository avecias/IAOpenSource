/*
Insertar imagenes en la ventana principal
 */
package com.mx.avecias.ia.opensource.controller.load;


import com.mx.avecias.ia.opensource.model.components.WindowInternal;
import com.mx.avecias.ia.opensource.model.entities.Imagen;
import javax.swing.JDesktopPane;

public class LoadImagePrincipalDesktop {
    
    public static void newWindow(JDesktopPane desktopPane, Imagen imagen, WindowInternal internal){
        internal = new WindowInternal(imagen.getNombre(), true, true, true, imagen.getIdImagen());
        internal.init(imagen.getBufferedImage());
        desktopPane.add(internal);
        internal.pack();
        internal.setVisible(true);
    }
}
