//Shirley Li 10/9, name class
package com.company;
public class Name {
    public static void main (String[] args){
        String first = "Nella";
        String last = "Larsen";
        System.out.println("Enter first name ==> "+ first);
        System.out.println("Enter last name ==> "+ last);
        //First Last
        System.out.println(first+" " +last);
        //The sum of the lengths of the two names
        System.out.println(first.length()+last.length());
        //The two initials side by side
        System.out.println(first.substring(0,1)+last.substring(0,1));
        //The comparison of the two original names
        System.out.println(first.compareTo(last));
        //The index position in the last name of the last letter of the first name, -1 if not there
        System.out.println(first.indexOf(last.substring(last.length()-1)));
        //The index position in the first name of the last letter of the last name, -1 if not there
        System.out.println(last.indexOf(first.substring(first.length()-1)));
        /*A new first and last name made of the following:
        First half of first + last half of last
        First half of last + last half of first
        Requirement-all of the original name letters must be used in the new names.
        Hint:create two int variables called mid1and mid2 to contain the midpoint value of
         each name to be used in creating the new names as described above.
        For example, the midpoint of “Carl”is 2 (4/ 2) and the midpoint of “Sagan”is 2(5 / 2)*/
        String midfirst = first.substring(0,(first.length()+1)/2)+last.substring(last.length()/2);
        String midlast = last.substring(0,last.length()/2)+first.substring((first.length()+1)/2);
        System.out.println(midfirst+" "+midlast);
    }

}
