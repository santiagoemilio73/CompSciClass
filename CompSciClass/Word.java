public class Word implements Comparable{
    private String orig;
    public Word(String s){
        orig = s;
    }
    public int compareTo(Object q){
       Word other = (Word)q; 
        if(orig.length() < other.orig.length()){
        return -1;
       }
       else if(orig.length() == other.orig.length()){
           return 0;
       }
       return 1;
    }
    public String toString(){
        return orig;
    }
}
