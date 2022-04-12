package Chap16.Ex08;

public class Generic1<T extends Fluit> {
	private T use;			//DTO(Data Transfer Object) -getter setter 
							//VO(Value Object) - getter만!
							//데이터를 받아서 전송하는 중간자 역할을 함 
							//계층간에 값을 받아서 전송, 중간자 역할
	public T getUse() {
		return use;
	}

	public void setUse(T use) {
		this.use = use;
	}
	@Override
	public String toString() {
		return use.toString();
	}
	public void printing() {
		use.print();
	}
}
