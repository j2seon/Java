package Chap16.Ex08;

public class Generic1<T extends Fluit> {
	private T use;			//DTO(Data Transfer Object) -getter setter 
							//VO(Value Object) - getter��!
							//�����͸� �޾Ƽ� �����ϴ� �߰��� ������ �� 
							//�������� ���� �޾Ƽ� ����, �߰��� ����
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
