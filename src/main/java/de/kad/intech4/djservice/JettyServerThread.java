package de.kad.intech4.djservice;


import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;
import org.eclipse.jetty.server.Server;

/**
 * Thread for the Jetty RestServer that is handling the REST API
 */
public class JettyServerThread extends Thread {


    static final String APPLICATION_PATH = "/rest";
    static final String CONTEXT_ROOT = "/";

    public JettyServerThread() {
    }


    /**
     * Starts the REST API via Jetty RestServer
     */
    public void run() {
        final Server server = new Server(8081);

        // Setup the basic RestApplication "context" at "/".
        // This is also known as the handler tree (in Jetty speak).
        final ServletContextHandler context = new ServletContextHandler(
                server, CONTEXT_ROOT);
        final ServletHolder restEasyServlet = new ServletHolder(
                new HttpServletDispatcher());
        restEasyServlet.setInitParameter("resteasy.servlet.mapping.prefix",
                APPLICATION_PATH);
        restEasyServlet.setInitParameter("javax.ws.rs.Application",
                "de.kad.intech4.djservice.RestApplication");
        context.addServlet(restEasyServlet, CONTEXT_ROOT);


        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
