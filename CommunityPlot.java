public class CommunityPlot extends Plot{

private String communityId;

	public CommunityPlot(String plotNo,double length,double width,String nameOfOwner,String dateReg,double price,String communityId){
	super(plotNo,length,width,nameOfOwner,dateReg,price);
	this.communityId=communityId;
}
@Override
	public double calArea(){
	return length*width;
}
@Override
        public void display() {
        super.display();
        System.out.println("Type: Community, ID: " + communityId);
    }
}