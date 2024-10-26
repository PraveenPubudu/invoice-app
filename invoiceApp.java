import javax.swing.JOptionPane;

public class invoiceApp {

    public static void main(String []args){

        while (true) {
            String  opcode = JOptionPane.showInputDialog("Select Option \n\n0 for Exit\n1 for New Costomer");
            int op = Integer.parseInt(opcode);
            if(op == 0){
                System.exit(1);
            }

            // Product Data
            String codes[] = {"I001","I002","I003","I004"};
            String names[] = {"Apple Macbook Air","Asus Tuf A15","Acer Nitro 5","Lenovo Legion 5"};
            Double price[] = {330.0,320.0,290.0,350.0};

            // Costomer Data
            String cuscode[] = {"C201","C202","C203","C204"};
            String cusname[] = {"Pathum","Kamindu","Prabhath","Matheesha",};
            Double cusdis[] = {2.0,4.0,6.0,6.0};

            // Variables related to Calculation process

            String cusCode;
            String cusName;
            Double cusDis;

            String itemCode;
            Double itemPrice;

            String qty;
            Double lineTotal;
            Double fullDiscount;
            Double grandTotal;

            if (op==1){
                cusCode = JOptionPane.showInputDialog("Enter Customer code");
                int c=0;
                while (c<cuscode.length) {
                    if (cusCode.equalsIgnoreCase(cuscode[c])){
                        break;
                    }
                    c++;
                }

                cusName = cusname[c]; 
                cusDis = cusdis[c];
                cusCode = cuscode[c];

                JOptionPane.showMessageDialog(null, "Hello " + cusName + "! You have a Discount of : " + cusDis + "% On Each Item");

                itemCode = JOptionPane.showInputDialog(null, "Enter Itemcode");
                int i = 0;
                while (i<codes.length) {
                    if (itemCode.equalsIgnoreCase(codes[i])){
                        break;
                    }
                    i++;
                }

                itemCode = codes[i];
                itemPrice = price[i];

                qty = JOptionPane.showInputDialog(null, "Enter the quantity");
                int Qty = Integer.parseInt(qty);

                lineTotal = itemPrice * Qty;
                fullDiscount = (lineTotal/100)*cusDis;
                grandTotal = lineTotal - fullDiscount ;

                JOptionPane.showMessageDialog(null, "Value Stores \n\n" +
                "Total : " + lineTotal + "\n" +
                "Your Discount is : " + fullDiscount + "\n" +
                "Grand total : "+  grandTotal );
            }
        }
    }
}