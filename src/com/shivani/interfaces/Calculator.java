package com.shivani.interfaces;

import com.shivani.services.ValueAssign;

//public interface Calculator<E> {
//	public E addition(ValueAssign<E> p);
//	public E subtraction(E p);
//	public E multiplication(E p);
//	public E division(E p);
//
//}
public interface Calculator<E> {
    public E addition(ValueAssign<E> p);
    public E subtraction(ValueAssign<E> p);
    public E multiplication(ValueAssign<E> p);
    public E division(ValueAssign<E> p);

 

}
