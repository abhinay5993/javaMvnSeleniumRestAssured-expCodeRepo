package com.guvi.Java8BeginnMod;

public class MemberInnerClassApp {

	public static void main(String[] args) {
		MemberInnerClassApp mi = new MemberInnerClassApp();
		MemberInnerClassApp.InnerCls in = mi.new InnerCls();
		System.out.println("\nMember b from Inner class : "+in.b);
		in.show();

	}

	int a = 100;

	class InnerCls {
		// inner
		int b = 200;

		public void show() {
			System.out.println("\nAccessing the a from outside of InnerCls class : "+a);
			System.out.println("I am show method from inner class!!");
		}
	}

}