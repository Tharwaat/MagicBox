
public class SingleObjectClass {
	private static SingleObjectClass instance = new SingleObjectClass();
	static int objectsNum = 0;
	
	private SingleObjectClass() {
		objectsNum++;
	}
	
	public static SingleObjectClass getInstance() {
		return instance;
	}
	
	public void ShowMessage() {
		System.out.println(objectsNum);
	}
}
