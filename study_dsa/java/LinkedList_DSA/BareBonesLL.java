public interface BareBonesLL <E>  //<generics>
{
    // add func
    public void add (int index, E Item);

    // remove func
    public E remove (int index);
    
    // getter/setter functions
    public E get (int index);
    public E set (int index, E newValue);

    //curr size of LL
    public int size();




}