package roninGame;
import java.util.ArrayList;

public class Team {
	
	class Node{
		Player member;
		ArrayList<Node> team;
	}
	
	private Node leader;
	private String name;
	private int size;
	private static final int limit = 4;
	
	public Team(){
		name = "";
		leader = null;
	}
	
	public Team(String name){
		this.name = name;
		leader = null;
		
	//	size = leader.team.size();
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public int addLeader(Player newMember){
		if(leader == null){
			leader = new Node();
			leader.member = newMember;
			leader.team = new ArrayList<Node>();
			size = leader.team.size();
		}
		else{
			System.out.println("Leader position already filled");
		}
		return size;
		
		
//		if(size >= limit){System.out.println("Team is full");
//		return limit;}
//		else{
//			Node f1 = leader;
//			Node member = new Node();
//			member.member = newMember;
//			member.next = f1;
//			leader = member;
//			if(f1 == null){notLeader = member;}
//			else{f1.previous = member;}
//			size++;
//			return size;
//		}
	}
	public int addPlayer(Player newPlayer){
		if(size >= limit){
			System.out.println("Team is full");
			return size;
		}
		else{
			Node newmember = new Node();
			newmember.member = newPlayer;
			leader.team.add(newmember);
			size = leader.team.size();
			return size;
		}
//		if(size >= limit){System.out.println("Team is full");
//		return limit;}
//		else{
//			Node l0 = notLeader;
//			Node newmember = new Node();
//			newmember.member = newPlayer;
//			newmember.previous = l0;
//			notLeader = newmember;
//			if(l0 == null){leader = newmember;}
//			else{l0.next = newmember;}
//			size++;
//			return size;
//		}
	}
	
	public void displayTeam(){
		System.out.println("Team: " + name);
		System.out.println("Leader: " + leader.member.getName());
		leader.member.characterScreen();
		System.out.println("Team Members:");
		for(Node n: leader.team){
			n.member.characterScreen();
		}
//		Node current = leader;
//		current.member.characterScreen();
//		while(current.next != null){
//			 //current.member.characterScreen();
//			 current.next.member.characterScreen();
//			 current = current.next;
//		}
	}
	
}
