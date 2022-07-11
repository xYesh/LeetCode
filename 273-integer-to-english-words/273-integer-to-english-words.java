class Solution {
    
    
    
    public String numberToWords(int num) {
        
        if (num == 0) {
            return "Zero";
        }
        
        int billion = num / 1000000000;
        num = num % 1000000000;
        int million = num / 1000000;
        num = num % 1000000;
        int thousand = num / 1000;
        num = num % 1000;
        int hundreds = num;
        
        // System.out.println(billion + " billion " + million + " million " + thousand + " thousand " + hundreds);
        String sol = "";
        if (billion != 0) {
           sol = sol + words(billion) + " Billion ";
        }
        if (million != 0) {
           sol = sol + words(million) + " Million ";
        }
        if (thousand != 0) {
           sol = sol + words(thousand) + " Thousand ";
        }
        if (hundreds != 0) {
           sol = sol + words(hundreds);
        }
        return sol.trim();
    }
    
    private String words(int num) {
        
        int hundreds = num/100; num = num %100;
        int tens = num/10; num = num %10;
        int ones = num;
        
        String sol = "";
        
        if (hundreds != 0) {
            sol = sol + onesPlaceWords(hundreds) + " Hundred ";
        }
        if (tens != 0 && tens != 1) {
            sol = sol + tensPlaceWords(tens) + " "; 
        }
        if (ones != 0 && tens != 1) {
            sol = sol + onesPlaceWords(ones) + " ";
        }
        
        if (tens == 1) {
            sol = sol + special(ones) + " "; 
        }
        
        return sol.trim();
    }
    
    private String special(int i) {
        switch (i) {
            case 0 : return "Ten";
            case 1 : return "Eleven";
            case 2 : return "Twelve";
            case 3: return "Thirteen";
            case 4 : return "Fourteen";
            case 5: return "Fifteen";
            case 6: return "Sixteen";
            case 7: return "Seventeen";
            case 8: return "Eighteen";
            case 9 : return "Nineteen";
        }
        
        return "";
    }
    
    private String tensPlaceWords(int i) {
        switch (i) {
            case 1 : return "";
            case 2 : return "Twenty";
            case 3: return "Thirty";
            case 4 : return "Forty";
            case 5: return "Fifty";
            case 6: return "Sixty";
            case 7: return "Seventy";
            case 8: return "Eighty";
            case 9 : return "Ninety";
        }
        
        return "";
    }
    
    private String onesPlaceWords(int i) {
        switch (i) {
            case 0 : return "Zero";
            case 1 : return "One";
            case 2 : return "Two";
            case 3: return "Three";
            case 4 : return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9 : return "Nine";
        }
        
        return "";
    }
    
    
}