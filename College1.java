public class College1 {
    private String name;
    private int id;
    public College1(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public Integer getid() {
        return id;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("id:" + id);
    }
}