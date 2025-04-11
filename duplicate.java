public class duplicate{
    int myArray [] = {2,4,8,4,1,9,20,3,7,3,2};
    public void myFuction(){
        boolean[] isDuplicate = new boolean[myArray.length];
        for(int i=0;i<myArray.length;i++){
            
            for(int j=i+1;j<myArray.length;j++){
                
                if(myArray[i]==myArray[j]){
                    isDuplicate[i]=true;
                    break;
                }
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            if (isDuplicate[i]) {
                System.out.println(myArray[i] + " is duplicated.");
                
                for (int j = i + 1; j < myArray.length; j++) {
                    if (myArray[j] == myArray[i]) {
                        isDuplicate[j] = false; 
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        duplicate myObject = new duplicate();

        myObject.myFuction();
    }
}