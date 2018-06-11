package org.wecancodeit.flexcode.module4.iterables;

import java.util.Iterator;
import java.util.List;

// This class exists exclusively to iterate over items in MyStringIterable
// It implements the Iterator interface, specifically as an Iterator<String>
// This means it must have all methods defined in the Iterator interface
// Specifically, any generically-typed methods (that have the diamond operator: <>)
// must work with the String type. See next() below, which returns a String.
public class MyStringIterator implements Iterator<String> {
	
	// We need a collection to iterate
	private List<String> privateCollection;
	
	// We need to keep track of which item we are on
	private int currentItemIndex = 0;
	
	// Our iterator accepts a collection, which it will iterate
	public MyStringIterator(List<String> privateCollection) {
		this.privateCollection = privateCollection;
	}
	
	// We need to implement this method as defined by the Iterator interface
	// This determines if there are any items remaining to iterate
	@Override
	public boolean hasNext() {
		return currentItemIndex < privateCollection.size();
	}

	// We need to implement this method as defined by the Iterator interface
	// This is where the iteration happens: we return the next item, then bump
	// our current index up one so next time we will return the next item
	@Override
	public String next() {
		String nextItem = this.privateCollection.get(currentItemIndex);
		this.currentItemIndex++;
		return nextItem;
	}

}