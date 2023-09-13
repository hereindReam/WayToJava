import java.util.HashMap;
import java.util.Scanner;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character,Integer> list=new HashMap<>();
            //initialize
            for(char c:  magazine.toCharArray()){
                if(!list.containsKey(c)){
                    list.put(c,1);
                }else{
                    list.put(c,list.get(c)+1);
                }
            }
            for(char c:ransomNote.toCharArray()){
                if(list.containsKey(c)&&list.get(c)>=1){
                    list.put(c,list.get(c)-1);
                }else{
                    return false;
                }
            }
            return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String ransomNote= scanner.next();
        String magazine= scanner.next();
        System.out.println(canConstruct(ransomNote,magazine));
        scanner.close();
    }
}
