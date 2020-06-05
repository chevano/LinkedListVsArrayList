public class SafeArray implements Collection {
    private int[] arr;
    private int size;
    
    // The default capacity to use (if not specified by the user).
    private static final int DEFAULT_CAPACITY = 10;
    
    public SafeArray()
    {
        this(DEFAULT_CAPACITY);
    }
    
    public SafeArray(int capacity)
    {
        arr = new int[capacity];
        size = 0;
    }
    
    // TODO: implement the necessary methods here.
    
    /*
      ---------------------------------------------------------------------------------------------
              Copies the data of an array from end to the specified index of the array,
              where the data of the position being specified becomes duplicate of the next slot.
      ---------------------------------------------------------------------------------------------
     */
   public void insert(int index, int data)
    {
        grow();
        size++;
        for(int i = arr.length-1; i > index; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[index] = data;
    }
    /*
      ---------------------------------------------------------------------
                Adds a new element to the end of the array.
      ---------------------------------------------------------------------
    */
    
    public void append(int data)
    {
        grow();
        arr[size] = data;
        size++;
    }
    
    /*
      ------------------------------------------------------------------------------------------------
                Adds a new element to the beginning of the array by first making a duplicate of
                the array from start to end. By doing this the data in the first cell becomes
                the data in the next cell which in turn shifts all the elements to the right.
      ------------------------------------------------------------------------------------------------
    */
    
    public void prepend(int data)
    {
        grow();
        size++;
        for(int i = arr.length-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = data;
    }
    
    /*
      --------------------------------------------------------------------
                Returns the data at a particular index in the array
      --------------------------------------------------------------------
    */
    
    public int get(int index)
    {
        return arr[index];
    }
    
    /*
     ------------------------------------------------------------------
                Returns the data at the beginning of the array
     ------------------------------------------------------------------
    */
    
    public int getFirst()
    {
        return arr[0];
    }
    
    /*
     ------------------------------------------------------------------
                Returns the data at the end of the array
     ------------------------------------------------------------------
    */
    
    public int getLast()
    {
        return arr[size-1];
    }
    
    /*
      ----------------------------------------------------------------------------------------------------------
                Deletes a data in the array at a particular index. This is done by copying the data
                from the specified index to the end of the array, where the index that was specified
                becomes overriden by the next cell. Therefore if we had wanted to remove a data in
                cell 2 and the the array had at most 3 filled cells then the data in cell 2 will get
                override with the data in cell 3. The size is then reduced by 1 to get rid of the
                duplicate data at the end which corresponds to the second to last element in the array.
      -----------------------------------------------------------------------------------------------------------
     */
    
    public void remove(int index)
    {
        for (int i = index; i < size-1; i++)
            arr[i] = arr[i+1];
        
        size--;
    }
    
    /*
      ---------------------------------------------------------------------------------------------------------
                This goes through the same process as remove where the only difference is that the
                index being specified points to the beginning of the array.
      ---------------------------------------------------------------------------------------------------------
    */
    
    public void removeFirst()
    {
        for (int i = 0; i < size-1; i++)
            arr[i] = arr[i+1];
        
        size--;
    }
    
    /*
      ----------------------------------------------------------------------------
                Deletes the last element in the array by decreasing
                its size which in turns gets rid of the last element
      ----------------------------------------------------------------------------
    */
    
    public void removeLast()
    {
        size--;
    }
    
    /*
     -------------------------------------------------------------
                Returns the size of the array.
     -------------------------------------------------------------
    */
    
    public int size()
    {
        return size;
    }
    /*
      -----------------------------------------------------------------------------------------------------------
                Prints the elements in the array(wasn't required but useful for checking the methods)
      -----------------------------------------------------------------------------------------------------------
    */
    public void print()
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    /*
      -----------------------------------------------------------------------------------
                Used to increase the capacity of the array whenever needed.
      -----------------------------------------------------------------------------------
    */
    
    public void grow()
    {
        if(size >= arr.length)
        {
            int newSize = size;
            newSize   *= 2;
            int[] temp = new int [newSize];
            for(int i = 0; i < size; i++)
                temp[i] = arr[i];
            arr = temp;
        }
    }
}

