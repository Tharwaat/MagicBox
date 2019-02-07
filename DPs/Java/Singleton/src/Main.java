
public class Main {

	public static void main(String[] args) {
		
		SingleObjectClass object = SingleObjectClass.getInstance();
		
		object.ShowMessage();
		
		SingleObjectClass obj2 = SingleObjectClass.getInstance();
		
		obj2.ShowMessage();
	}

}
