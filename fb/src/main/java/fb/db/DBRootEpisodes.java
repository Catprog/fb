package fb.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="rootepisodes")
public class DBRootEpisodes {
	public DBRootEpisodes() {}
	
	@Id
	private int id;
	
	@OneToMany
	private List<DBEpisode> roots = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<DBEpisode> getRoots() {
		return roots;
	}

	public void setRoots(List<DBEpisode> roots) {
		this.roots = roots;
	}
}
