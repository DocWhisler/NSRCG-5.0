package de.nsrcg.app.db;

import java.util.Collection;

public interface CRUDDAO<Interface, Selector> {

	public Interface create(Interface plainDataObject);
    
	public Collection<Interface> read(Selector selector);
    
	public void update(Interface dataTransferObject);
    
	public void delete(Interface dataTransferObject);
	
}
