public class CommercialPlot extends Plot{

private String commercialId;

	public CommercialPlot(String plotNo,double length,double width,String nameOfOwner,String dateReg,double price,String commercialId){
		super(plotNo,length,width,nameOfOwner,dateReg,price);
		this.commercialId=commercialId;
}
@Override
	public double calArea(){
		return length*width;

}

@Override
	public void display() {
        super.display();
        System.out.println("Type: Commercial, ID: " + commercialId);
    }


}