public class usecase3 {
        public static void main(String[] args){
            String input="level";
            String reversed="";
            for(int i=input.length()-1;i>=0;i--){
                reversed+=input.charAt(i);
            }
            if(input.equals(reversed)){
                System.out.println("it is a palindrome");
            }
            else{
                System.out.println("it is not a palindrome");
            }
        }
    }

