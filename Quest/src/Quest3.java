
public class Quest3 {
	public int stringCount(String text, String search) {
		int answer = 0;
		
		int idx = 0;
		while(true) {
			idx = text.indexOf(search,idx);
			if(idx == -1) break;
			answer++;
			idx++;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Quest3 quest3 = new Quest3();
		System.out.println(quest3.stringCount("Hello World Test", "r"));
	}
}





