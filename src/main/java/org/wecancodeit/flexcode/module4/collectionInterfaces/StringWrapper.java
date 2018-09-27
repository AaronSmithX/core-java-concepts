package org.wecancodeit.flexcode.module4.collectionInterfaces;

public class StringWrapper {
	
	private String identity;
	
	StringWrapper(String identity) {
		this.identity = identity;
	}
	
	public String getIdentity() {
		return identity;
	}
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof StringWrapper)) {
			return false;
		}
		StringWrapper otherWrapper = (StringWrapper) other;
		return this.getIdentity().equals(otherWrapper.getIdentity());
	}
}
