 char ch;
        
        System.out.print("Enter one character:");
        ch=s.next().toLowerCase().charAt(0);
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')//8==a=FALSE 8==e FALSE
            
            System.out.println("\tEntered character "+ch+" is a vowel");
        else if(ch>='a'&& ch<='z') //8>=a=FALSE =FALSE
            System.out.println("\tEntered character "+ch+" is a consonant");
        else if(ch>='0'&& ch<='9')//8>=0=TRUE && 8<=9=TRUE=TRUE
            System.out.println("\tEntered character "+ch+" is a number");
        else
            System.out.println("Special Character");
