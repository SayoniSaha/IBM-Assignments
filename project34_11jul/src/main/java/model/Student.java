package model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("s")

public class Student {

	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	@PostConstruct
    public void initStudent() {
        System.out.println("Init Method");
	}
 
    @PreDestroy
    public void destroyStudent(){
        System.out.println("Destroy method");
    }
}
