/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {
    public boolean someLibraryMethod() { 
        return true;
    }
    int search(int arr[], int n, int x) 
    { 
        for (int i = 0; i < n; i++) 
        { 
             
            if (arr[i] == x) 
                return i; 
        } 
   
        
        return -1; 
    } 
    public static void main(String []args) {
    Library lib=new Library();
    int[] arr=new int[] {2,3,4,5};
    System.out.println(lib.search(arr, 4, 4));
}
}