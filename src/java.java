/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class java {
    boolean aredisjoint(int array1[], int array2[]){
        for (int i=0 ; i < array1.length; i++ ){
          for (int j=0; j< array2.length; j++){
              if (array1[i] == array2[j]){
                  return false;
              }
          }
          
      }
        return true;
    }

    public static void main(String[] args) {
      
        java dis = new java();
        int array1[] = {12,34,11,9,3};
        int array2[] = {7,2,1,5};
        
        boolean result = dis.aredisjoint(array1, array2);
        if (result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
            
    }
    
}
