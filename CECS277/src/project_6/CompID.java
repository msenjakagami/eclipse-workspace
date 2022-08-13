package project_6;

import java.util.Comparator;

public class CompID implements Comparator<Student>{
	@Override
	public int compare(Student e1, Student e2){
		if(e1.getID() < e2.getID()){
			return -1;
		}
		else if(e1.getID() > e2.getID()){
			return 1;
		}
		else{
			return 0;
		}
	}
}

