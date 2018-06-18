package de.kad.intech4.djservice;

public class RestServer {

    public static void main(String[] args) {
        JettyServerThread thread = new JettyServerThread();
        thread.start();

    }


}
