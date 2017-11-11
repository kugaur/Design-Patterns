package com.designpatterns.mediator;

/**
 * Mediator for IATC 
 */
public interface IATCMediator {

    void registerRunway(Runway runway);
    
    void registerFlight(Flight flight);
    
    boolean isLandingOk();
    
    void setLandingStatus(boolean status);
}
