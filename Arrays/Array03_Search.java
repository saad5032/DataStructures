

public class Array03_Search {
    
// If array is sorted you use Binary search algo to find element.
// If the array is not sorted, you would typically use a linear search algorithm to find an element.


int arr[] = null;  // arr is refered as this in below code.

// --> Overall time complexity is O(N) 
// --> Overall space complexity is O(1) as no new space is used.
public void LinearSearch(int valueToFind){
    for(int i =0; i < this.arr.length;i++){    // --> O(N) time complexity
        if(this.arr[i] == valueToFind){   // --> O(1)
            System.out.println("Value found : "+arr[i] + " at index " + i);  // --> O(1) 
            return;
        }else{
            System.out.println("The element was not found"); // --> O(1) 
        }
    }

    }

    public void ArrayMaking(){ 
        // I am using this method to show how we can user other java class methods or else i could have 
        // inistailzed array at beginning

        Array02_insertion obj = new Array02_insertion();

        obj.OneDArray(10);
        obj.insert(1, 10);
        obj.insert(2, 20);
        obj.insert(3, 30);
        obj.insert(4, 40);

        this.arr = obj.arr;
    }

    public static void main(String[] args) {
        Array03_Search obj2 = new Array03_Search();
        obj2.ArrayMaking();
        obj2.LinearSearch(10);
        
    }
}
