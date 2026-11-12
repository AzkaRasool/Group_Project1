public class Demo{

public static void main(String args[]){

        Society society = new Society("Green Valley", 5, 10);

        Block a = society.addBlock("Block A");
        Block b = society.addBlock("Block B");

        a.addPlot(new ThreeMarla("A-1", 27, 30.25, "Ali", "2024-01-10", 5_000_000, "R1", "S1"));
        a.addPlot(new FiveMarla("A-2", 25, 54.45, "Sara", "2024-02-15", 8_000_000, "R2", "S2"));
        a.addPlot(new CommercialPlot("A-3", 30, 40, "Hamza", "2024-03-01", 12_000_000, "C1"));
        b.addPlot(new CommunityPlot("B-1", 50, 50, "Society", "2023-12-01",2_000_000 , "CM1"));

        HousingSociety hs = new HousingSociety("Green Valley Housing", "Lahore", society);

        // status
        Plot p = society.findPlot("A-3");
        if (p != null) {
            p.reserve();
            System.out.println("Status of A-3: " + p.getStatus());
        }

        // change owner
        Plot q = society.findPlot("A-1");
        if (q != null) {
            q.changeOwner("Usman", "2026-11-01", 6_000_000);
        }

        // lookups
        System.out.println("Owner of A-1: " + hs.getCurrentOwner("A-1"));
        System.out.println("Area of A-2: " + hs.getPlotArea("A-2"));

        // display one plot, then everything
        society.findPlot("B-1").display();
        System.out.println();
        society.display();

        System.out.println("Total area: " + hs.totalArea());
    }
}
            
       