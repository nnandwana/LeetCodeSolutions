import org.junit.Test;                                                           
import static org.junit.Assert.*;                                                
                                                                                 
public class Pangram {                                                           
                                                                                 
    public static boolean checkPangram(String str) {                             
        int arr[] = new int[26];                                                 
        boolean isPana = false;                                                  
        for (int i = 0; i < str.length(); i++) {                                 
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')                    
                arr[str.charAt(i) - 'A'] = 1;                                    
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')               
                arr[str.charAt(i) - 'a'] = 1;                                    
        }                                                                        
        for (int i = 0; i < arr.length; i++) {                                   
            if (arr[i] == 0)                                                     
                return false;                                                    
        }                                                                        
        return true;                                                             
        }                                                                        
        @Test                                                                    
        public void panagramString() {                                           
            String input = "The quick brown fox jumps over the  lazy dog";       
            assertTrue(Pangram.checkPangram(input));                             
        }                                                                        
                                                                                 
        @Test                                                                    
        public void nonPanagramString() {                                        
            String input = "The quick brown fox jumps over the  dog";            
            assertFalse(Pangram.checkPangram(input));                            
        }                                                                        
}                                                                                
                                                                                 
