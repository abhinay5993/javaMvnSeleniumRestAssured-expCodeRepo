package com.h2dbconnect.jpaRestserve;

public class BeanCompoForStrApp {
	
	private String textMes;

	public BeanCompoForStrApp(String textMes) {
		this.textMes = textMes;
	}

	public String getTextMes() {
		return textMes;
	}

	public void setTextMes(String textMes) {
		this.textMes = textMes;
	}

	@Override
	public String toString() {
		return "BeanCompoForStrApp [textMes=" + textMes + "]";
	}
		
}