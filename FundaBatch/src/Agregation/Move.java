package Agregation;

import java.util.Arrays;

public class Move {

	int id,boxcollection;
	String name;
    Actor act[];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBoxcollection() {
		return boxcollection;
	}
	public void setBoxcollection(int boxcollection) {
		this.boxcollection = boxcollection;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Actor[] getAct() {
		return act;
	}
	public void setAct(Actor[] act) {
		this.act = act;
	}
	public String toString()
	{
		return id+""+name+""+boxcollection+""+Arrays.toString(act);
		
	}
}
