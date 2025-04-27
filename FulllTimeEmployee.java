



public class FulllTimeEmployee extends Employee{
    
    double monthlySalary;
    
     FulllTimeEmployee(String name, int id,String cat, double salary){
         super(name,id,cat);
         this.monthlySalary = salary;
     }
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
       
}
