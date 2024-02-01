//For loop version of identifying even or odd numbers;

int[] num = {1,2,3,4,5,6,7,8,9,10};
        
            System.out.print("Even: ");
              for(int i = 0; i< num.length; i++){
            if(num[i] % 2 == 0){
                System.out.print(+num[i]+", ");
            }
              }
              
             System.out.print("Odd: ");
              for(int i= 0; i< num.length; i++){
            if(num[i] % 2 != 0){
                System.out.print(+num[i]+", ");
            }
            
              }
        
//For-each loop version of identifying even or odd numbers;    
    int[] numbers = {1, 2, 5, 6, 4, 3, 8, 9, 10};

        System.out.println("Odd Numbers:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

        System.out.println("\nEven Numbers:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
    }
