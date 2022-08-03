package warehouse;

public class Restock {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

        Warehouse p = new Warehouse();
        int numOfItems = StdIn.readInt();
        int day, id , stock, demand, amount;
        String name;
        int i = 0;
        while(StdIn.hasNextLine()&& !StdIn.isEmpty()) {
            String type = StdIn.readString();
            if(type.equals("add")){
                 day = StdIn.readInt();
                 id  = StdIn.readInt();
                 name = StdIn.readString();
                 stock = StdIn.readInt();
                 demand = StdIn.readInt();
                p.addProduct(id, name, stock, day, demand);
               
                } 
            if(type.equals("restock")){
               id = StdIn.readInt();
               amount = StdIn.readInt();
               p.restockProduct(id,amount);
            }
            
         }

         StdOut.println(p);
    }
}
