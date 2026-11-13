public abstract  class ResidentialPlot extends Plot{

private String residentialId;

public ResidentialPlot(String plotNo,double length,double width,String nameOfOwner,String dateReg,double price,String residentialId){
		super(plotNo,length,width,nameOfOwner,dateReg,price);
		this.residentialId=residentialId;
}
@Override
public abstract double calArea();

@Override
public void display() {
  super.display();
System.out.println("Residential ID: " + residentialId);
    }
}
