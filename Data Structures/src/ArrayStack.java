public class ArrayStack<T> {

    private static final int INITIAL_CAPACITY = 16;

    private T[] elements;
    private int size;

    //конструктор на който не подаваме нищо, но му задаваме капацитет автоматично
    public ArrayStack() {
        this.elements = (T[]) new Object[INITIAL_CAPACITY];
    }

    //конструктор на който му подаваме капацитет
    public ArrayStack(int capacity) {
        this.elements = (T[]) new Object[capacity];
    }

    public int size() {
        return this.size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    public void push(T element) {
        //индексът на който ще добавяме в стека
        int index = this.size();
        this.elements[index] = element;

        //увеличаваме размера с единица на стека
        this.setSize(this.size() + 1);

        //проверяваме дали размера на стека не е станал колкото дължината на елементите
        if (this.size() >= this.elements.length){
            grow();
        }
    }

    public T pop() {
        //проверяваме дали е празен стека и ако е, хвърляме грешка
        if (this.size() == 0) {
            throw new IllegalArgumentException("Stack is empty!");
        }

        //вземаме индекса
        int index = this.size() - 1;

        //казваме да вземе точно този елемент от масива и да го премахне
        T element = this.elements[index];

        //след като го махнем го правим null
        this.elements[index] = null;


        //намалеме размера с единица на стека
        this.setSize(index);

        //премахва елемента след като върне
        return element;
    }

    public T[] toArray() {
        //правим нов масив
        T[] toReturn = (T[]) new Object[this.size()];

        //началният индекс
        int index = 0;

        //наливаме масива, като въртим стека отзад на пред, но прибавяме от 0 елемент (последния влязал, последния излязал)
        for (int i = toReturn.length - 1; i >= 0 ; i--) {
            toReturn[index++] = this.elements[i];
        }

        return toReturn;
    }

    private void grow() {
        //съсдаваме нов масив с двапъти по-голям размер
        T[] newArray = (T[]) new Object[this.size() * 2];

        //преналиваме от стария в новия масив
        for (int i = 0; i < this.size(); i++) {
            newArray[i] = this.elements[i];
        }

        //презаписваме стария с данните от новия
        this.elements = newArray;
    }

}