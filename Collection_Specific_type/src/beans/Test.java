package beans;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
public class Test {
	private Vector vector;
	private TreeSet cricketers;
	private Hashtable cc;
	private Properties pp;
	
	public Properties getPp() {
		return pp;
	}
	public void setPp(Properties pp) {
		this.pp = pp;
	}
	public Vector getVector() {
		return vector;
	}
	public void setVector(Vector vector) {
		this.vector = vector;
	}
	public TreeSet getCricketers() {
		return cricketers;
	}
	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}
	public Hashtable getCc() {
		return cc;
	}
	public void setCc(Hashtable cc) {
		this.cc = cc;
	}
	
	public void printData(){
		System.out.println("vector************");
		
		for (Object object : vector) {
			System.out.println(object);
		}
		System.out.println("Cricketes************");
		for (Object object : cricketers) {
			System.out.println(object);
		}
		System.out.println("CC************");
		for (Object object : cc.entrySet()) {
			System.out.println(object);
		}
		System.out.println("pp************");
		for (Object object : pp.entrySet()) {
			System.out.println(object);
		}
	}
}
