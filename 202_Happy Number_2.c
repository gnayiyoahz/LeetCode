
bool isHappy(int n){
     
    int sumDigit(int n) {     
        int sum = 0; 
        while (n!= 0) { 
            sum += pow((n % 10),2); 
            n /= 10; 
        } 
        return sum;     
    }    
    
    
    int i = n, j = n; 
    do { 
        i = sumDigit(i); 
        j = sumDigit(sumDigit(j)); 
    } while (i != j); 

   
    return (i == 1); 
}

        
