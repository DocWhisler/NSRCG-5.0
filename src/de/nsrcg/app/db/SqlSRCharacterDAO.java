package de.nsrcg.app.db;

import java.util.Collection;

import de.nsrcg.app.models.shadowrun5.SRCharacter;
import de.nsrcg.app.models.shadowrun5.SRCharacterDAO;
import de.nsrcg.app.models.shadowrun5.SRCharacterProxy;

public class SqlSRCharacterDAO implements SRCharacterDAO {

	private static class SqlSRCharacter extends SRCharacterProxy {
		
		private long id;
		
		public SqlSRCharacter(SRCharacter state, long id) {
			super(state);
			this.id = id;
		}

		private long getId() {
			return id;
		}

		private void setId(long id) {
			this.id = id;
		}		
	}
	
	@Override
	public SRCharacter create(SRCharacter plainDataObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<SRCharacter> read(Selector selector) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(SRCharacter dataTransferObject) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(SRCharacter dataTransferObject) {
		// TODO Auto-generated method stub

	}

}
