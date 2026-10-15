package DsJavaImp;


public class MyStack {
    private int capacity;
    private int top ;
    private int[] arr;

    public MyStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int num){
        if(isFull()){
            throw new RuntimeException();
        }
        arr[++top] = num;

    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException();
        }
        return arr[top];
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException();
        }
        return arr[top--];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == capacity-1;
    }
    public static void main(String[] args) {
        MyStack as = new MyStack(5);
        as.push(10);
        as.push(20);
        as.push(40);
        as.push(50);
        as.push(60);
        System.out.println(as.peek());
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
    }
}
