package ch08.sec09;

public class InterfaceImpl implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("InterfacecImpl-methodA() 실행");		
	}

	@Override
	public void methodB() {
		System.out.println("InterfacecImpl-methodB() 실행");		
	}

	@Override
	public void methodC() {
		System.out.println("InterfacecImpl-methodC() 실행");		
	}

}
