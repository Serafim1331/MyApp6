package SymbolOccurance;

public class FindSymbolOccurance {

    public static int findSymbolOccurance(String str,char symbol){
        int count = 0;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)== symbol){
                count++;
            }
        }
        return count;
    }
}
