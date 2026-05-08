class myQueue {
    
    int[] arr;
    int capacity;
    int size;
    // Constructor
    public myQueue(int n) {
        this.capacity=n;
        arr=new int[capacity];
        size=0;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        // Check if queue is full
        return size==capacity;
    }

    public void enqueue(int x) {
        // Enqueue
        if(isFull()){
            return;
        }
        arr[size]=x;
        size++;
    }

    public void dequeue() {
        // Dequeue
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        for(int i=1;i<size;i++){
            arr[i-1]=arr[i];
        }
        size--;
    }

    public int getFront() {
        // Get front element
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return arr[0];
    }

    public int getRear() {
        // Get last element
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        
        return arr[size-1];
    }
}
