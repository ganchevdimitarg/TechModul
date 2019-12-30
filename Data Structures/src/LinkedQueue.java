public class LinkedQueue<E> {

    private int size;

    //иницилизираме глава
    private QueueNode<E> head;

    //инизилизираме опашка
    private QueueNode<E> tail;


    public int size() {
        return this.size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    public void enqueue(E element) {
        //проверяваме дали главата е празна
        if (this.head == null){
            //създавам главата да е нов нолд
            this.head = new QueueNode<>();
            //присвой й стойноста на елемента който идва
            this.head.value = element;

            //сетват се на първия елемент
            this.tail = this.head;
        } else {
            //създаваме нов ноуд
            QueueNode<E> newNode = new QueueNode<>();
            //на главата сложи новия ноуд със стойност от подадения параметър
            newNode.value = element;
            //това ще е последния елемен който сме добавили
            this.tail.nextNode = newNode;
            //и тела става нея стойност
            this.tail = this.tail.nextNode;
        }

        //увеличаваме размера
        this.setSize(this.size() + 1);
    }

    public E dequeue() {
        if (this.size() == 0){
            throw new IllegalArgumentException("Queue is empty!");
        }
        //стъйността която трябва да върнем
        E value = this.head.value;

        //новата глава сочи към следващия елемент и той става глава
        this.head = this.head.nextNode;

        //намаляме размера
        this.setSize(this.size() - 1);

        return value;
    }

    public E[] toArray() {
        //създаваме нов масив със същия броя елементи в него
        E[] toRetarn = (E[]) new Object[this.size()];

        //създаваме нова елемент със стойноста на главата, за да не се губи информация
        QueueNode<E> tempHead = this.head;

        //с този индекс ще достъпваме в масива
        int index = 0;

        //въртим цикъл, докато главата не стане празна
        while (tempHead != null){
            //присвояваме на дадения индекс в масива стойноста на главата
            toRetarn[index++] = tempHead.value;
            //запазваме стойноста на главата да е на следващия елемент
            tempHead = tempHead.nextNode;
        }

        return toRetarn;
    }

    private class QueueNode<E> {
        private E value;

        private QueueNode<E> nextNode;
        private QueueNode<E> prevNode;

        public E getValue() {
            return this.value;
        }

        private void setValue(E value) {
            this.value = value;
        }

        public QueueNode<E> getNextNode() {
            return this.nextNode;
        }

        public void setNextNode(QueueNode<E> nextNode) {
            this.nextNode = nextNode;
        }

        public QueueNode<E> getPrevNode() {
            return this.prevNode;
        }

        public void setPrevNode(QueueNode<E> prevNode) {
            this.prevNode = prevNode;
        }
    }
}