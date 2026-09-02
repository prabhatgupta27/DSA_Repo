import java.lang.*;
  
class Anagram {
    static final int CHAR=256;
    static boolean areSame(int CT[],int CP[])
    {
    for(int i=0;i<CHAR;i++){
        if(CT[i]!=CP[i]){
            return false;
        }
    }
    return true;
    }
    
    static boolean isPresent(String txt,String pat){
    int[] CT=new int[CHAR];
    int[] CP=new int[CHAR];

        if(pat.length() > txt.length()) return false;


        for(int i=0;i<pat.length();i++)
    {
        CT[txt.charAt(i)]++;
        CP[pat.charAt(i)]++;
    }
    for(int i=pat.length();i<txt.length();i++)
    {
        if(areSame(CT,CP))return true;
        CT[txt.charAt(i)]++;
        CT[txt.charAt(i-pat.length())]--;
    }
    return areSame(CT,CP);
    }
    
    public static void main(String args[]) 
    { 
      /*  String txt = "geeksforgeeks";
        String pat = "frog";*/
      /*  String txt = "anagram";
        String pat = "nagaram";*/
        String txt = "ab";
        String pat = "a";
        if (isPresent(txt, pat)) 
            System.out.println("Anagram search found"); 
        else
            System.out.println("Anagram search not found"); 
    } 
} 