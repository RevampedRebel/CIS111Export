package classes;

public class Employee {

	

	private String name = "default";
	private int id = -1;
	private String dpt = "default";
	private String pos = "default";
	public Employee(String name, int id, String dpt, String pos){
		if(name != "default" && id != -1 && dpt == "default" && pos == "default") {
			this.name = name;
			this.id = id;
			this.dpt = "";
			this.pos = "";
			
		}
		if(name != "default" && id != -1 && dpt != "default" && pos != "default") {
			this.name = name;
			this.id = id;
			this.dpt = dpt;
			this.pos = pos;
			
		}
		if(name == "default" && id == -1 && dpt == "default" && pos == "default") {
			this.name = "";
			this.id = 0;
			this.dpt = "";
			this.pos = "";
			
		}
		
		
	}
	
	public void setName() {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId() {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setDpt() {
		this.dpt = dpt;
	}
	public String getDpt() {
		return dpt;
	}
	public void setPos() {
		this.pos = pos;
	}
	public String getPos() {
		return pos;
	}
	public String toString() {
		String answer = name + ", " + id + ", " + dpt + ", " + pos;
		return answer;
	}
	
	
	
	
}
