
public class Cart{
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered=0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered < MAX_NUMBERS_ORDERED){
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered += 1;
            System.out.println("The disc has been added!");
        }else{
            System.out.println("The cart is almost full!");
        }
    }


    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for (int i=0; i<qtyOrdered; i++){
            if(itemsOrdered[i] == disc){
                for (int j=i; j<qtyOrdered-1; j++){
                    itemsOrdered[j] = itemsOrdered[j+1];
                }

                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered -= 1;
                return;
            }
        }

        System.out.println("Can not find this DVD in cart!");
    }

    public void displayCart(){
        if(qtyOrdered != 0){
            System.out.println("--------------------------");
            for (int i=0; i<qtyOrdered; i++){
                itemsOrdered[i].print_Details();
            }
        }else{
            System.out.println("Cart is empty!");
        }
    }
    public float totalCost(){
        float sum = 0f;
//        DigitalVideoDisc i = new DigitalVideoDisc();
        for(int i=0; i<qtyOrdered; i++){
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
}