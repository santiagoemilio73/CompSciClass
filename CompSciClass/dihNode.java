public class dihNode 
{
    private String data;
    private dihNode next;
    public dihNode()
    {
        data = "";
        next=null;
    }
    public dihNode(String name){
        data = name;
        next= null;
    }
    public void point(dihNode pointed)
    {
        next = pointed;
    }
    public void setName(String name){
        data= name;
    }
    public dihNode getNext()
    {
        return next;
    }
    public String getName()
    {
        return data;
    }
    public String toString(){
        return data;
    }
}