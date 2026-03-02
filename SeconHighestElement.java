class SecondHighest {
    public static void main(String[] args) {
        
        int[] arr = {10, 25, 8, 40, 30};
        
        int first = -99999; // Initialize second to a very small value
        int second = -99999; // Initialize second to a very small value        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second highest element");
        } else {
            System.out.println("Second highest element: " + second);
        }
    }
}