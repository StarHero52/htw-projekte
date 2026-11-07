package model;

    public class Puppy implements iPet {
    private String name;
    
    public Puppy(String name){
        this.name = name;
    }

    @Override
    public String speak() {
        return name + " sagt: Wuff!";
    }
}
