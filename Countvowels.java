
public class Countvowels {
    public static void maun(String[]args){
        
        String str="hello world";
        int Count=0;
        for(char ch: str.toLowerCase().toCharArray()){
            if(ch =='a'||ch =='e'||ch =='i'||ch=='o'||ch =='u'){
                Count++;
            }
        }
        System.out.println("Number of vowels:" + Count);
        
    }
}
            
        
    


     

