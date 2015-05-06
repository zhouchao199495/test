package exercise;

public class Hello extends Test2{
	private int aa;
	public static void ch(Test2 t) {
		t.a="bbb";
	}
	public Hello(int bb) {
		aa = bb;
	}
	public static void main(String args[]) {
		Hello h = new Hello(10);
		System.out.println(h.aa);
	}
	
	
}

class Test2 {
	public  String a="a";
	public StringBuffer sb;
	public StringBuilder sb2;
	public String c="a";
	public String d="a";
	public String b=c+d;
	
	public void f (int a) throws IndexOutOfBoundsException{
		
	}
	public Test2() {
		System.out.println("构造方法。。");
	}
	
	{
		System.out.println("初始化函数体。。");
	}
	
	
	
	protected void fun() {
		
	}
}

abstract class Super {
	private final String name;
	
	public Super(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}

class MYString extends Super {

	public MYString(String name) {
		super(name);
	}
	
	
	public static MYString valueOf(String name) {
		if(name==null||name.trim()=="") {
			return new MYString("null");
		}
		
		return new MYString(new String(name).intern());
	}
}
