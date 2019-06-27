package Principal;

import Variables.Configuracion;
import ficherotxt.Interface.Network;

public class Cls_Main {

    private static Network nw;
    private static Configuracion config;

    public static void main(String[] args) {

        config = new Configuracion();
        nw = new Network();
        nw.setVisible(true);
    }
}
