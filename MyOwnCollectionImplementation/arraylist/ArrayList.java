package MyOwnCollectionImplementation.arraylist;

import java.util.Arrays;

public class ArrayList {

	private static final int DEFAULT_CAPACITY=10;
	
	private static final int RESIZE_MULITPLIER=2;
	
	private int currentCapacity=DEFAULT_CAPACITY;
	
	private Object[] elements;
	
	public int length=0;
	

	public ArrayList() {
		elements=new Object[DEFAULT_CAPACITY];
	}
	

	public void add(Object object) {
		ensureCapacity();
		elements[length++]=object;
	}


	private void ensureCapacity() {
		int newLength=length+1;
		if(newLength >currentCapacity) {
			int newCapacity=currentCapacity*RESIZE_MULITPLIER;
			currentCapacity=newCapacity;
			Object[] tempElements=new Object[newCapacity];
			for(int i=0;i<elements.length;i++) {
				tempElements[i]=elements[i];
			}
			elements=tempElements;
		}
	}


	@Override
	public String toString() {
		return "ArrayList [elements=" + Arrays.toString(elements) + "]";
	}
	
	
	public Object get(int index) {
		if(index<=length) {
			return elements[index];	
		}else {
			return null;
		}
		
	}
	
	public boolean remove(Object obejct) {
		boolean found=false;
		boolean removed=false;
		for(int i=0;i<elements.length;i++) {
			if(!found && elements[i]==obejct) {
				found=true;
			}
			if(found) {
				int range =i+1;
				if(range>=length) {
					elements[i]=null;
				}else {
					elements[i]=elements[i+1];
				}
				removed=true;
			}
		}
		return removed;
	}
	
	
	public Object remove(int index) {
		Object toReturn=null;
		if(index==length) {
			toReturn=elements[index];
			elements[index]=null;
		}
		else if(index<length) {
			toReturn=elements[index];
			for(int i=index;i<length;i++) {
				if((i+1)<currentCapacity)
					elements[i]=elements[i+1];
				else {
					elements[i]=null;
				}
			}
			
		}
		return toReturn;
	}
	
	public void sort() {
		System.out.println("in Progress");
	}
	
}
