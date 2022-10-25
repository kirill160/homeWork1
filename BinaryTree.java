package com.company.Tree;

public interface BinaryTree<T>  {
    boolean isEmpty();
    void add(T data);
    Node<T> findMin(T data);

    Node<T> findMin(Node<T> data);

    T findMax();
    void delete(T data);
    boolean contains(Node<T>root, T data);

}
