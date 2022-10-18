public class SingleLL <E> implements BareBonesLL <E> 
{
    // Class for Nodes
    private class Node<F> 
    {
        // instance variables ?
        private F data;                     // data 
        private Node<F> next;               // link to next_node

        // constructor  (EVC)
        public Node (F data, Node<F> next)
        {
            this.data = data;
            this.next = next;
        }
        
        // constructor (EVC)
        public Node (F data)
        {
            this(data,null);           // (evc) for data only
        }
    }



    private Node <E> head;                  // reference to Head of LL
    private int size;                       // how many nodes are in the LL 

    public SingleLL()
    {
        this.head = new Node<E>(null); // base case [null data&&next]
        this.size = 0;
    }






    public void add(int index, E item) 
    {
        if ( index < 0 || index > size )            // base case
        {
            System.out.println("Invalid Index!");

        
        } else if (index == 0) {
            addFirst(item);

        } else {
            Node <E> node = getNode(index);
            addAfter (node, item);
        }

    }


    private Node<E> getNode(int index) 
    {
        if (index < 0 || index > size)
        {
            System.out.println("Invalid Index!");
        }

        Node<E> node = head;
        for (int i = 0; i < index && node!=null; ++ i)
        {
            node = node.next;
        
        } return node;                                      // return reference
    }


    private void addAfter(Node<E> node, E item) 
    {
        node.next = new Node<E> (item, node.next);
        ++ size;
    }


    private void addFirst(E item) 
    {
        // Node<E> temp = new Node<E>(item, head.next);
        // head.next = temp;

        head.next = new Node<E>(item, head.next);
        ++ size;
    }


    public E remove(int index) 
    {
        if (index < 0 || index > size)
        {
            System.out.println("Invalid Index!");
        
        } else if (index == 0){
            return removeFirst();
        
        } else{
            Node<E> node = getNode(index);
            return removeAftert(node);
        }

        
        
        return null;
    }


    private E removeAftert(Node<E> node) 
    {
        Node<E> temp = head;
        if (temp != null)
        {
            node.next = temp.next;
            -- size;
            return temp.data;
        
        } return null;
    }


    private E removeFirst() 
    {
        return null;
    }


    public E get(int index) 
    {
        if (index < 0 || index >= size) {
            throw new
            IndexOutOfBoundsException(Integer.toString(index));
            }
            Node<E> node = getNode(index);
            return node.data;
    }


    public E set(int index, E newValue) 
    {
        if (index < 0 || index >= size) {
            throw new
            IndexOutOfBoundsException(Integer.toString(index));
            }
            Node<E> node = getNode(index);
            E result = node.data;
            node.data = newValue;
            return result;
              
    }


    public int size() 
    {

        return this.size;
    }
    

    public String toString()
    {
        String s  = "[";
        Node<E> p = head;
        if (p != null)
        {
            while (p.next != null)  // iterate ~ while...
            {
                s += p.next.data + " -> ";
                p  = p.next;
            }
        
        } // end of linked_list

        s += "]";
        return s;
    }
}