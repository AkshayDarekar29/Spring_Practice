package beans;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Student {
	private List<Integer> listSubjects;
	private Set<Integer>  SetSubjects;
	private Map<Integer, String> MapSubject;
	private Properties propSubjects;
	public List<Integer> getListSubjects() {
		return listSubjects;
	}
	public void setListSubjects(List<Integer> listSubjects) {
		this.listSubjects = listSubjects;
	}
	public Set<Integer> getSetSubjects() {
		return SetSubjects;
	}
	public void setSetSubjects(Set<Integer> setSubjects) {
		SetSubjects = setSubjects;
	}
	public Map<Integer, String> getMapSubject() {
		return MapSubject;
	}
	public void setMapSubject(Map<Integer, String> mapSubject) {
		MapSubject = mapSubject;
	}
	
	public Properties getPropSubjects() {
		return propSubjects;
	}
	public void setPropSubjects(Properties propSubjects) {
		this.propSubjects = propSubjects;
	}
	public void showList(){
		System.out.println("List items start****");
		for (Integer list : listSubjects) {
			System.out.println(list);
		}
		System.out.println("List items end****");
	}	
	public void showSet(){
		System.out.println("Set items start****");
		for (Integer list : SetSubjects) {
			System.out.println(list);
		}
		System.out.println("Set items end****");
	}	
	public void showMap(){
		System.out.println("Map items start****");
		for (Entry<Integer, String> list : MapSubject.entrySet()) {
			System.out.println(list.getKey() + " " + list.getValue());
		}
		System.out.println("Map items end****");
	}	
	public void showProp(){
		System.out.println("Prop items start****");
		for (Entry<Object, Object> list : propSubjects.entrySet()) {
			System.out.println(list.getKey() + " " + list.getValue());
		}
		System.out.println("Prop items end****");
	}	
}
