package food;

public class Chef {
	//유지보수성을 높이기 위한 원칙!!!
	// 1.정확한 자료형을 보유하지 말라!! 왜?? 유연하지 못하다..
	//    해당 자료형이 변경되면, 현재 클래스가 영향을 받는다..
	
	//2.객체의 생성을 직접 new 하지말라!!
	//   new 뒤에는 반드시 해당 자료형이 보유한 생성자가 명시되어야 
	// 하므로 원칙1번을 벗어날 수 없다...
	Pan pan;
	
	public Chef(Pan pan) {
		//pan = new FryPan();
		this.pan=pan;
	}
	
	public void cook(){
		pan.make();
	}
}
