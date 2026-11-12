public final class FiveMarla extends ResidentialPlot{

private String shapeName="Rectangle";
private String shapeId;

	public FiveMarla(String plotNo,double length,double width,String nameOfOwner,String dateReg,double price,String residentialId,String shapeId){
	super(plotNo,length,width,nameOfOwner,dateReg,price,residentialId);
	this.shapeId=shapeId;
}
@Override
	public double calArea(){
	return length*width;
}
@Override
    	public void display() {
        super.display();
        System.out.println("Type: 5 Marla, Shape: " + shapeName + ", Shape ID: " + shapeId);
    }

}