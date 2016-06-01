package de.nsrcg.app.db;

import java.util.ArrayList;
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
		assert(plainDataObject instanceof SRCharacter) == false;
		long rowid = 0;

			// TODO neuer Datensatz
				
		return new SqlSRCharacter(plainDataObject, rowid);		
	}

	@Override
	public ArrayList<SRCharacter> read(Selector selector) {
		ArrayList<SRCharacter> characters = new ArrayList<SRCharacter>();
		
		switch (selector) {
		case SELECT_ALL:
			// Select satement
			break;
		case SELECT_ONE:
			// Select satement
			break;
		default:
			System.out.println("No characters found");
			break;
		}
		
		return characters;
	}

	@Override
	public void update(SRCharacter dataTransferObject) {
		assert dataTransferObject instanceof SqlSRCharacter;
		final long rowid = ((SqlSRCharacter) dataTransferObject).getId();
		
		// UPDATE rowid

	}

	@Override
	public void delete(SRCharacter dataTransferObject) {
		assert dataTransferObject instanceof SqlSRCharacter;
		final long rowId = ((SqlSRCharacter) dataTransferObject).getId();
		
		// DELETE ROW

	}
}
