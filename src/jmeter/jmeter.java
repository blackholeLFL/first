package jmeter;

public class jmeter {
	private String name;
	private String friend;
	public jmeter() {
		name = "myName";
		friend = "friendName";
	}
	public String getName(){
		return name;
	}
	public String getFriend(){
		return friend;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setFriend(String friend){
		this.friend = friend;
	}
}
