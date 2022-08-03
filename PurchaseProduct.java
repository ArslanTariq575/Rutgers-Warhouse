package warehouse;

public class PurchaseProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);
        Warehouse wa = new Warehouse();
        int n = StdIn.readInt();

        for(int i=0; i<n; i++){
            String s = StdIn.readString();
            if(s.equals("add")){
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();
                wa.addProduct(id, name, stock, day, demand);
            }
            else if(s.equals("restock")){
                int id = StdIn.readInt();
                int amount = StdIn.readInt();
                wa.restockProduct(id, amount);
            }
            else if(s.equals("purchase")){
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                int amount = StdIn.readInt();
                wa.purchaseProduct(id, day, amount);
            }
            else if(s.equals("delete")){
                int id = StdIn.readInt();
                wa.deleteProduct(id);
            }
        }

        StdOut.print(wa);
	
    }
}
