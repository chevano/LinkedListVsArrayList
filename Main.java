/*
  -------------------------------------------------------------------------------------------------------------------------------
                                            Student name:       Chevano Gordon
                                            Professor name:     Adolfas Lapsys
                                            Class:              CS212(Lecture)
                                            Project #:          3
  -------------------------------------------------------------------------------------------------------------------------------
 */
class Main {
    public static void main(String[] args) {
        // TODO: test your classes here.
        
        int data1 = 4;
        int data2 = 32;
        int data3 = 14;
        int data4 = 78;
        int data5 = 9;
        int data6 = 12;
        int data7 = 22;
        int data8 = 55;
        int data9 = 76;
        int data10 = 11;
        
        
         
        SafeArray arr = new SafeArray();
        
        System.out.println("---------------------------------------------SafeArray---------------------------------------------------------");
        arr.append(data1);
        arr.append(data2);
        arr.append(data3);
        arr.append(data4);
        arr.append(data5);
        arr.append(data6);
        arr.append(data7);
        arr.append(data8);
        arr.append(data9);
        arr.append(data10);
        arr.insert(3,99);
        arr.prepend(data8);
        arr.prepend(data2);
        arr.remove(1);
        arr.removeFirst();
        arr.removeLast();
        System.out.println("second index = " + arr.get(2));
        System.out.println("first index = " + arr.getFirst());
        System.out.println("last index= " + arr.getLast());
        System.out.println("size = " + arr.size());
        arr.print();
         
        //----------------------------------------------------PAGE BREAK------------------------------------------------------------//
        
        LinkedList myList = new LinkedList();
        
        System.out.println("--------------------------------------------LinkedList---------------------------------------------------------");
        try
        {
            myList.append(data1);
            myList.append(data2);
            myList.append(data3);
            myList.append(data4);
            myList.append(data5);
            myList.append(data6);
            myList.append(data7);
            myList.append(data8);
            myList.append(data9);
            myList.append(data10);
            myList.insert(3,99);
            myList.prepend(data8);
            myList.prepend(data2);
            myList.remove(1);
            myList.removeFirst();
            myList.removeLast();
            System.out.println("second index = " + myList.get(2));
            System.out.println("first index = " + myList.getFirst());
            System.out.println("last index= " + myList.getLast());
            System.out.println("size = " + myList.size());
            myList.print();
        }
        catch(NullPointerException e)
        {
            
        }
        System.out.println();
       
    }
}

