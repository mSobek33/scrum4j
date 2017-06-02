
package de.hsbochum.fbg.kswe.scrum.events;

import de.hsbochum.fbg.kswe.scrum.artifacts.ProductBacklog;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class SprintRetrospective implements Event {

    private final int POSITION = 4;
    
    @Override
    public Class<? extends Event> followingEventType() {
        return SprintPlanning.class;
    }
    
  
    public int getPOSITION(){
        return POSITION;
    }

    @Override
    public void init(Event previos, ProductBacklog productBacklog) throws InitializationException {
    }

}
