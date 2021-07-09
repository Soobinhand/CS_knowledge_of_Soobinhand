package algo4.practice1_3;

import edu.princeton.cs.algs4.StdIn;

import java.util.Iterator;

public class _8<Item> implements Iterable<Item> {
    @SuppressWarnings("unchecked")
    private Item[] a = (Item[]) new Object[1];
    private int n;

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void push(Item item) {
        if (n == a.length) resize(2 * n);
        a[n++] = item;
    }

    public Item pop() {
        Item item = a[--n];
        a[n] = null;
        if (n > 0 && n == a.length / 4) resize(n * 2);
        return item;
    }

    public int arraySize() {
        return a.length;
    }

    private void resize(int max) {
        @SuppressWarnings("unchecked")
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < n; i++)
            temp[i] = a[i];
        a = temp;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<Item> {
        private int i = n - 1;

        @Override
        public boolean hasNext() {
            return i >= 0;
        }

        @Override
        public Item next() {
            return a[i--];
        }


    }
    public static void main(String[] args)
    {
        _8<String> stack = new _8<String>();
        String[] inputs = StdIn.readAllStrings();
        for (int i = 0; i < inputs.length; i++)
        {
            if (inputs[i].equals("-"))
            {
                stack.pop();
            }
            else
            {
                stack.push(inputs[i]);
            }
            for (String s : stack)
            {
                System.out.print(s + " ");
            }
            System.out.println();
            System.out.println("ArraySize: " + stack.arraySize());
            System.out.println();
        }
    }

}