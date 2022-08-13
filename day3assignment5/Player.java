package day3assignment5;

public class Player {
	static int idgen = 100;
	private int id;
	private String name;
	
	public Player( String name) {
		
		this.id = idgen++;
		this.name = name;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}
	
	
	
	

}
