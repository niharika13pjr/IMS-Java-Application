package ims;



public class Items {
	private String name;
    private int count;
    private String room;
    public Items(String name, int counts, String rooms){
        this.name = name;
        this.count = counts;
        this.room = rooms;
    }

    public String getName(){
        return this.name;
    }
    public int getLevels(){
        return this.count;
    }
    public String getRoom(){
        return this.room;
    }

    


}
