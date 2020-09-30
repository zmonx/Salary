package A.Project;

public class Salary {
	
	private String ID;
	private String Name;
	private int Salary;
	private int Commision;
	private int NOfSales;
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getCommision() {
		return Commision;
	}
	public void setCommision(int commision) {
		Commision = commision;
	}
	
	public double CalculateComision(int NOfSales) {
	
		double result = 0;
		
		if (NOfSales >=1 && NOfSales <= 50000) {
			result = (NOfSales*5)/100;
		}
		else if (NOfSales >50000) {
			result = (NOfSales*5)/100;
		}
			
		return result;
	}
	public boolean isBound(int commision) {
		boolean result;
		if(commision >=1) {
			result = true;
		}else {
			result = false;
		}
		return result ;
	}
	

	
	
}
