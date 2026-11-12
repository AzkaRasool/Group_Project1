public abstract class Plot{

private String plotNo;
protected double length;
protected double width;
private String nameOfOwner;
private String dateReg;
private double price;
private boolean reserved;

public Plot(String plotNo,double length,double width,String nameOfOwner,String dateReg,double price){

	this.plotNo=plotNo;
	this.length=length;
	this.width=width;
	this.nameOfOwner=nameOfOwner;
	this.dateReg=dateReg;
	this.price=price;
	this.reserved=false;

}

public abstract double calArea();
	


public void changeOwner(String owner,String date,double price){
	if (owner == null) {
    System.out.println("Invalid owner. Owner not changed");
    return;
}
	if (date == null) {
    System.out.println("Invalid date. Owner not changed");
    return;
}
	if (price < 0) {
    System.out.println("Invalid price. Owner not changed");
    return;
}
	this.nameOfOwner=owner;
	this.dateReg=date;
	this.price=price;

}

public void reserve() {
        if (reserved) {
            System.out.println("Plot " + plotNo + " is already reserved");
        } else {
            reserved = true;
        }
    }

    public void cancelReservation() {
        reserved = false;
    }

    public boolean isReserved() { return reserved; }

    public String getStatus() {
        return reserved ? "Reserved" : "Available";
    }

public String getNameOfOwner(){

	return nameOfOwner;
}

public String getDateReg(){

	return dateReg;

}

public double getPrice(){

	return price;

}

public String getPlotNo(){

	return plotNo;

}

public void display() {
        System.out.println("Plot No: " + plotNo);
        System.out.println("Owner: " + nameOfOwner);
        System.out.println("Registered: " + dateReg);
        System.out.printf("Price: Rs %,.0f%n", price);
        System.out.printf("Area: %.2f sq ft%n", calArea());
        System.out.println("Status: " + getStatus());
    }

}