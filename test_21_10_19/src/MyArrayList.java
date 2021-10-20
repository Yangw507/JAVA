/**
 * Name: Yang Wutao
 */


public class MyArrayList {

    public int[] elem;
    public int usedSize;
    public static final int capacity = 10;

    public MyArrayList() {
        this.elem = new int[capacity];
        this.usedSize = 0;
    }

    //check whether the position is legal or not
    private void checkPos(int pos) {
        if (pos < 0 || pos >= this.usedSize)
        {
            throw new RuntimeException("this position is not legal!");
        }
    }

    //在pos位置新增元素
    public void add(int pos, int data) {


    }

    //print arrayList
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    //estimate if it is there a element
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    //find the position of the element
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    //get the element at this position

    private boolean isEmpty() {
        return this.usedSize == 0;
    }
    public int getPost(int pos) {
        //estimate whether the contiguousList is full or not
        if (isEmpty()) {
            throw new RuntimeException("this contiguous is empty!");
        }
        //pos legality
        checkPos(pos);

        return this.elem[pos];

    }


    //get the length of this contiguous list
    public int getLength() {
        return this.usedSize;
    }

    //delete the element you want
    public void remove (int toRemove) {
        int index = 0;
//        for (int i = 0; i < this.usedSize; i++) {
//            if (this.elem[i] == toRemove) {
//                index = i;
//            }
//        }
        index = search(toRemove);
        if (index == -1) {
            System.out.println("no this number");
        }
        for (int i = index; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
    }

    //clear the contuguous
    public void clear() {
        this.usedSize = 0;

    }

    public static void main(String[] args) {

    }

}
