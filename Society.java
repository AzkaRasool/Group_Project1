public class Society{

private String name;
private Block []blocks;
private int countblocks;
private int plotLength;

	public Society(String name,int maxBlocks,int plotLength){
	this.name=name;
	this.blocks=new Block[maxBlocks];
	this.plotLength=plotLength;
}
	public Block addBlock(String name){
	if(name!=null&&countblocks<blocks.length){
	Block b=new Block(name,plotLength);            //composition
	blocks[countblocks++]=b;
	return b;
	}
	else{
	System.out.println("Blocks Full.Cannot add more");
	return null;
	}
}

	public Plot findPlot(String plotNo){
	if(plotNo==null)
	return null;
	for(int i=0;i<countblocks;i++){
	Plot p=blocks[i].findPlot(plotNo);
	if(p!=null)
	return p;	
	}
	return null;

}

	public double totalArea(){
	double sum=0;
	for(int i=0;i<countblocks;i++){
	sum+=blocks[i].totalArea();
	}
	return sum;
}
	public void display() {
        System.out.println("########## Society: " + name + " ##########");
        for (int i = 0; i < countblocks; i++)
            blocks[i].display();
    }

}