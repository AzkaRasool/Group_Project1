public class Block{

private String name;
private Plot[] plots;
private int count;


	public Block(String name,int plotLength){

	this.name=name;
	this.plots=new Plot[plotLength];
}

	public void addPlot(Plot plot){	
	if(plot!=null&&count<plot.length){
	plots[count++]=plot;
	}
	else{
	System.out.println("Block is full,plot not added");
	}
}

	public Plot findPlot(String plotNo){
	if(plotNo==null)
	return null;
	for(int i=0;i<count;i++){

	if(plotNo.equals(plots[i].getPlotNo())){
	return plots[i];
	}
	
	
}
	return null;
}

	public double totalArea(){
	double sum=0;
	for(int i=0;i<count;i++){
	sum +=plots[i].calArea();
	}
	return sum;

}
	public void display() {
        System.out.println("===== Block " + name + " =====");
        for (int i = 0; i < count; i++) {
            plots[i].display();
            System.out.println();
        }
    }

}