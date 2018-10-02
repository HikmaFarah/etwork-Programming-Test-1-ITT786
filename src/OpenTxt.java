/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package write;

/**
 *
@author Hikma Farah Ali
 */
public class OpenTxt {

   
	private String word;
	private String and;
	private String meaning;
 
	public OpenTxt() {
	}
 
	public OpenTxt( String word, String and,String meaning) {
		
		this.word = word;
		this.and = and;
		this.meaning = meaning;
	}
 public String getWord() {
		return word;
	}
 
	public void setWord(String word) {
		this.word = word;
	}
 
	public String getAnd() {
		return and;
	}
 
	public void setAnd(String and) {
		this.and = and;
	}
        public String getMeaning() {
		return meaning;
	}
        
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	@Override
	public String toString() {
	return "WriteTxt [ name=" + word + ", and=" + and + " ,meaning=" + meaning+"]";
	}
}
