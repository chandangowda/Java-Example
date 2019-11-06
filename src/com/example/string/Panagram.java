package com.example.string;

public class Panagram {

    public static void main(String[] args) {
        checkPanagram("Bawds jog, flick quartz, vex nymph\n");
    }

    public static boolean checkPanagram (String s2)
    {
        String s[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String s1[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        int count=0;
        for(int i=0;i<26;i++)
        {
            if(s2.contains(s[i]) || s2.contains(s1[i]))
                count++;
        }

        if(count==26)
            return true;
        else
            return false;
    }
}
