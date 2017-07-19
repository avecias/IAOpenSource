/*
Inicio de la Sesion para el almacenamiento de todos los archivos durante el uso del progrma
 */
package com.mx.avecias.ia.opensource.controller.load;

import com.mx.avecias.ia.opensource.controller.thread.InitSession;
import com.mx.avecias.ia.opensource.view.GUILogo;


public class LoadSession {
   
    public void init(GUILogo logo){
        // Inicio del hilo
        InitSession initSession = new InitSession(logo);
        initSession.start();
    }

}
