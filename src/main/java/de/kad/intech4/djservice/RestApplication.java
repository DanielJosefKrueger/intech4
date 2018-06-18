package de.kad.intech4.djservice;

import sun.net.www.ApplicationLaunchException;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;





    /**
     * RestApplication class for the Jetty server
     */
    public class RestApplication extends Application {
        private Set<Object> singletons = new HashSet<Object>();

        public RestApplication() {
            singletons.add(new RestRessource());
        }

        @Override
        public Set<Object> getSingletons() {
            return singletons;
        }
    }




