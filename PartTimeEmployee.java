



public class PartTimeEmployee extends Employee{
    
    int totalHours;
    double rateofHour;
    PartTimeEmployee(String name, int id, String cat, int th, double rh){
        super(name,id,cat);
        this.totalHours = th;
        this.rateofHour = rh;
    }

    @Override
    public double calculateSalary() {
      return totalHours * rateofHour;
    }
    
    
}
