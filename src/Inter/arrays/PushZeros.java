package Inter.arrays;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 1/7/16
 * Time: 4:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PushZeros implements push{


    // Function which pushes all zeros to end of an array.
    public static void pushZerosToEnd(int arr[], int n){
        int count = 0;  // Count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
        // incremented

        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n)
            arr[count++] = 0;
    }

    /*Driver function to check for above functions*/
    public static void main (String[] args)
    {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }

    @Override
    public int getPush() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void get1() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public int get3() {
        //To change body of implemented methods use File | Settings | File Templates.
        return 0;
    }

    @Override
    public void get4() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void main1(String[] args) {
        //To change body of implemented methods use File | Settings | File Templates.
    }


}

interface push{
    public int getPush();
    void get1();

    int get3();
    public void get4();
    public void main1(String[] args);
    public static Integer x = null;




}

