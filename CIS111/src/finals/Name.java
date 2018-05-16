package finals;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
				private String first, last;
				public Name(String first, String last) {
					this.first = first;
					this.last = last;
		
	}
	
				public String getFirst() {
					return first;
				}
				public void setFirst(String first) {
					this.first = first;
				}
				public String getLast() {
					return last;
				}
				public void setLast(String last) {
					this.last = last;
				}





				public String lastFirst(String first, String last){
					String answer = last + ", " + first;
					return answer;
				}
				
				
				public void gotModernMarried(String add) {
					last = getLast()+"-"+add;
					
				}
				
				
	
	
}
