public class HousingSociety{

private String name;
private String cityName;
private Society society;

public HousingSociety(String name,String cityName,Society society){
	this.name=name;
	this.cityName=cityName;
	this.society=society;
}
public String getCurrentOwner(String plotNo){
	Plot p=society.findPlot(plotNo);
	if(p==null){
	return "Plot not found";
	}
	else{
	return p.getNameOfOwner();
	}
		
}

public double getPlotArea(String plotNo){
	Plot p=society.findPlot(plotNo);
	if(p==null){
	return -1;
	}
	else{
	return p.calArea();
	}

}

	public double totalArea(){
	return society.totalArea();
}
	public void display() {
    	System.out.println("Housing Society: " + name + ", City: " + cityName);
    	society.display();
    	System.out.printf("Total area: %.2f sq ft%n", society.totalArea());
}

}