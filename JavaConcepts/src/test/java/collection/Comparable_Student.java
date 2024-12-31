package collection;

/* Comparable is default sorting logic
 * Comparable is declared at class level
 * the sorting logic is implemented for the whole class
 * if some other sorting criteria is needed, need to change in the main class
 */

//casting the object type in Comparable to avoid class cast exception and its to compare only student object
public class Comparable_Student implements Comparable<Comparable_Student> {
	
	int id;
	String name;
	int age;
	
	public Comparable_Student(int id, String name, int age) {
		this.id = id;
		this.name=name;
		this.age=age;
	}
    			
  //Comparing using the String
	@Override
	public int compareTo(Comparable_Student stud) {
		// TODO Auto-generated method stub
		return this.name.compareTo(stud.name);
	}

	/* overloading of compareTo method is not allowed
	 * compare using id (integer value)
	 * @Override
	public int compareTo(Comparable_Student stud1) {
		if(this.id < stud1.id) 
			return 1;
		else
			return -1
	} */
	
    @Override
    public String toString() {
        return "id="+ id + ", name='" + name + "', age=" + age;
    }
}
