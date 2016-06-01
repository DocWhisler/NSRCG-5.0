package de.nsrcg.app.db;

import java.util.ArrayList;

public interface CRUDDAO<Interface, Selector> {

	public Interface create(Interface plainDataObject);
    
	public ArrayList<Interface> read(Selector selector);
    
	public void update(Interface dataTransferObject);
    
	public void delete(Interface dataTransferObject);
	
}
