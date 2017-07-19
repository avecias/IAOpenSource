/*
Hilo para el inicio de la session
 */
package com.mx.avecias.ia.opensource.controller.thread;

import com.mx.avecias.ia.opensource.model.entities.Session;
import com.mx.avecias.ia.opensource.view.GUILogo;
import com.mx.avecias.ia.opensource.view.IGPrincipal;


public class InitSession extends Thread {

    private final GUILogo logo;

    public InitSession(GUILogo logo) {
        this.logo = logo;
    }

    @Override
    public void run() {
        // Carga e iniciar la session
        Session session = new Session();
        for (int i = 0; i < 101; i++) {
            try {
                logo.getBar().setValue(i);
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.err.println("Error al interrumpir " + e);
            }
        }
        new IGPrincipal(session).setVisible(true);
        logo.setVisible(true);
        logo.dispose();
    }

}
