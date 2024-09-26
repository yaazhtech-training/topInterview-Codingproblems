package org.example.arrays1;

public class NonRepeatingElement {
    static void findnonrepeatingelement(int num[]){
        boolean chk ;
        for(int i=0;i<num.length;i++){
            chk=false;
            for(int j=0;j<num.length;j++){
                if(i!=j&&num[i]==num[j]){
                    chk=true;
                    break;
                }
            }
            if (!chk){
                System.out.println(num[i]+" ");
            }

        }
    }
    public static void main(String[] args) {
        int num[]={1,1,2,2,3,4,4,5,6,6,7};
        {
            System.out.println("Non-repeating numbers are");
        }
        findnonrepeatingelement(num);
    }
}
