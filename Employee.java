


abstract class Employee {
    private String name;
    private String category;
    private int id;
    
    Employee(String name, int id, String cat){
        this.name = name;
        this.id = id;
        this.category = cat;
    }
    public String name(){
        return name;
    }
    public String category(){
        return category;
    }
    public int getId(){
       return id; 
    } 
    abstract public double calculateSalary();
    
    @Override
    public String toString(){
        System.out.println("");
        return "ID : "+id+"\nName : "+name+"\nCategory : "+category+"\nSalary : "+calculateSalary()+" ";  
    }

}
