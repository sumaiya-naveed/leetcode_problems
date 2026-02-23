class Solution {
    public int reverse(int x) {
        String reverse = "";
        String number = String.valueOf(x);
        int start = 0;

         if(number.charAt(0) == '-'){
            reverse = "-";
            start = 1;
        }
        for(int i=number.length()-1;i>=start;i--){
            reverse  = reverse+ number.charAt(i);
        }

       
        try{
            int reverse_int = Integer.parseInt(reverse);
            return reverse_int;
        }catch(NumberFormatException e){
            return 0;
        }
    }

}