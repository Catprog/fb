package fb.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="recentepisodes")
public class DBRecents {
	public DBRecents() {}
	
	@Id
	private int id;
	
	@OneToMany
	private List<DBEpisode> recents = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<DBEpisode> getRecents() {
		return recents;
	}

	public void setRecents(List<DBEpisode> recents) {
		this.recents = recents;
	}
}
