package zero;
import java.util.*;

public class Access_Limiter {
	
	private String name;
	
	public Access_Limiter() {
		Sub_Acess_Limiter sal = new Sub_Acess_Limiter();
		sal.test();
//		sal.name 은 private 이기 때문에 사용 불가
//		System.out.println("name: "+sal.name);
		sal.setName("Hong KillDong");
		name = sal.getName();
	}
	
	public void test() {
		
	}
	public static void main(String[] args) {
		Access_Limiter al = new Access_Limiter();
		al.test();
		System.out.println("name : "+al.name);
	}
	
	/*
	 * 접근제한자
	 * : 접근성을 설정하는데 사용되는 키워드 -> 다른 클래스의 생성자, 데이터 멤버, 메서드의 접근을 제한함.
	 *  
	 *    [유형]                | [같은 클래스] |  [같은 패키지]  | [자식 클래스]  | [기타 영역]
	 *  < public >             |     O      |     O        |     O       |   O
	 *  < proected >           |     O      |     O        |     O       ||  X
	 *  < 선언하지 않음(default) > |    O      ||     O       ||     X      ||  X
	 *  < private >            |     O      |     X        |     X       |   X
	 *  
	 *  => 제한 범위
	 *  [ public ]   : 모든 곳에서 가능
	 *  [ proected ] : 패키지 및 모든 하위 클래스(자식) 내에서 가능
	 *  [ default ]  : 동일한 패키지 내에서만 가능
	 *  [ private ]  : 클래스 내에서만 가능
	 */

}
