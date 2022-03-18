
public class StringFun{
    public static String shout(String input){
        String temp = input.toUpperCase();
        return temp;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String result = StringFun.shout("Good morning, James");
        System.out.println(result);
	}
}
