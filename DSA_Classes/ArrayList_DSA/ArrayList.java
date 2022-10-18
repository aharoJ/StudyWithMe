import javax.lang.model.element.Element;

public class ArrayList<E> implements BareBonesArrayList <E>
{
    //Data
    private int size; //[ x , x , x ]
    private int capacity; // E.length -1;
    private E[] myArray ; // reff to array
    private static final int INITIAL_CAPACITY = 10; // Default capacity

    ArrayList ()     // DVC 
    {
        this.capacity = this.INITIAL_CAPACITY;
        this.size = 0; // base case
        myArray = (E[]) new Object[this.capacity]; // gen the array - instance
    }

    ArrayList ( int capacity )     // EVC 
    {
        this.capacity = capacity;
        this.size = 0;
        myArray = (E[]) new Object[this.capacity];


    }


    @Override // add function
    public void add(E elements) 
    {
        if ( this.size < this.capacity ){   
            myArray[size] = elements;  
            size ++;
        
        } else{
            System.out.println("One moment... re-allocating space (= ");
            this.re_allocate(); // neither this
            this.add(elements); //ion get this
            
        }

        
    }

    // make space *2 ... shift [ x, x, x, ' ' , ' ' ,]
    private void re_allocate() 
    {
        this.capacity *= 2; // arr.length * 2 
        E[] temp = (E[]) new Object[this.capacity]; // new instance of object - gen arr
        for (int i=0; i < myArray.length; ++ i )
        {
            temp[i] = myArray[i];
        
        } this.myArray = temp;
    }

    @Override  // add by elem,indx
    public void add(E elements, int index) 
    {
        if ( index < 0 || index > size) 
         System.out.println("Invalid Index!");  
        
        if ( index == size ) 
            this.add(elements);
        else {
            if (this.size == this.capacity )
            {
                re_allocate();

            }

            for ( int i=size; i > index; -- i)
            {
                this.myArray[i] = this.myArray[i -1];
            }
            this.myArray[index] = elements;
            ++ this.size;
        }

        
        
    }

    @Override // rm func
    public E remove(int index) 
    {
        if ( index < 0 || index >= size ) 
        {
            System.out.println ( " Invalid Index ! " ) ;
            return null ;
        }

        E temp = myArray[index];
        for ( int i = index ; i < size -1; ++ i) 
        {
            this.myArray[i] = this.myArray[i+1];
        }
        -- this.size; 
        return temp; 
    }


    @Override // get func
    public E get(int index) {
        if ( index < 0 || index >= size ) 
        {
            System.out.println ( " InvalidIndex ! " ) ;
            return null ;
        
        } return myArray[index] ; 
    }

    @Override // set eleme to index
    public void set(E elements, int index) {
        if ( index < 0 || index >= size ) { System.out.println ( " InvalidIndex ! " ); }  // base case
        //else
        myArray[index] = elements;
    }

    @Override // size of arr
    public int getSize() {
        return this.size;
    }

    @Override // 
    public int indexOf(E elements) 
    {
        if (elements != null )
        {
            for (int i=0; i < myArray.length; ++ i)
            {
                if ( this.myArray[i] == elements);
                    return i;
            }
        
        } 
        return -1;
    }

    // Prints to terminal ~(-_-)~
    public String toString()
    {
        String s = " " ;
        for ( int i = 0 ; i < this.size; ++ i) // iterate ~ size;
        {
            s = s + " [" +myArray[i]+ "] ";
    
        } return  s;
    }








    
}
