package Chap06_07.Ex06;

// 梓端税 琶球拭 葵聖 拝雁馬澗 号縦 : 3亜走 	<== 梓端研 持失 板
	//1. 琶球拭 送羨 葵聖 採食馬澗 号縦 	<== 梓端研 持失 板
	//2. setter研 搭背辞 梓端拭 琶球拭 葵聖 採食.(珍闘継戚 吉陥.)	<==梓端研 持失拝 凶 段奄 葵生稽 琶球拭 葵聖 拝雁.
	//3. 持失切研 搭背辞 梓端税 琶球 葵聖 採食.

class Aa {//1. 梓端 持失 板 送羨 琶球拭 葵 拝雁
	String name;  //戚硯
	int age;	 //蟹戚
	String mail;//五析 爽社
	
	void print() {
		System.out.println("name : "+ name +" age : "+ age +" mail : "+mail);
	}
}
class Bb{ 	//2. setter研 搭背辞 梓端税 琶球税 葵聖 拝雁
	String name;//戚硯
	int age;//蟹戚
	String mail;//五析 爽社
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setMail(String mail) {
		this.mail=mail;
	}
	
	void print() {
		System.out.println("name : "+ name +" age : "+ age +" mail : "+mail);
	}
}
class Cc{//3. 持失切研 搭背辞 梓端税 琶球税 葵 拝雁
	String name;//戚硯
	int age;//蟹戚
	String mail;//五析 爽社
	
	Cc(String a, int b, String c){  //持失切拭辞 古鯵痕呪 3鯵研 閤製!!!
		name=a;
		age=b;
		mail=c;
	}
	
	void print() {
		System.out.println("name : "+ name +" age : "+ age +" mail : "+mail);
	}
}

public class FieldOfValue {

	public static void main(String[] args) {
		//1. 梓端税 琶球拭 送羨 葵聖 拝雁.
		Aa aa=new Aa();	//梓端研 持失 板
		aa.name="遭識";
		aa.age=27;
		aa.mail="aaa@aaa.com";
		aa.print();
		
		//2. 梓端税 setter研 紫遂背辞 琶球税 葵聖 採食
		Bb bb=new Bb();		//梓端研 持失 板 
		bb.setName("爽遭識");
		bb.setAge(27);
		bb.setMail("ddd@ddd.com");
		bb.print();
		
		
		//3. 持失切研 紫遂背辞 琶球税 葵聖 採食.(梓端研 持失拝 凶 琶球税 葵聖 段奄鉢)
		Cc cc =new Cc("遭識",34,"じじじ.じじじじ");  //梓端研 持失拝凶 琶球税 葵聖 採食
		cc.print();
		
	}

}
