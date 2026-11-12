public final class ThreeMarla extends ResidentialPlot{

private String shapeName="Square";
private String shapeId;

	public ThreeMarla(String plotNo,double length,double width,String nameOfOwner,String dateReg,double price,String residentialId,String shapeId){
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
        System.out.println("Type: 3 Marla, Shape: " + shapeName + ", Shape ID: " + shapeId);
    }


}