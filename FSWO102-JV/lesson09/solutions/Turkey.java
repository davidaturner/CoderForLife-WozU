package solutions;

public class Turkey implements IHomeAnimal {

	String name;
	
	String propertyOf;
	String address;
	String city;
	String state;
	String zip;
	
	public String getPropertyOf() {
		return propertyOf;
	}

	public String getAddress() {
		return address;
	}

	public void displayFullAddress () {
		System.out.println("\r\n" + name + " is the property of:");
		System.out.println(propertyOf);
		System.out.println(address);
		System.out.println(city);
		System.out.println(state);
		System.out.println(zip);
	}
	
	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}
	
	public String getZip() {
		return zip;
	}
	
	public Turkey(TurkeyBuilder tb) {
		name = tb.name;
		
		propertyOf = tb.propertyOf;
		address = tb.address;
		city = tb.city;
		state = tb.state;
		zip = tb.zip;
	}
	
	// Inner case builder pattern
	public static class TurkeyBuilder {
		
		private String name;
		
		private String propertyOf;
		private String address;
		private String city;
		private String state;
		private String zip;
		
		public TurkeyBuilder() {
			this.name = "";
			
			propertyOf = "";
			address = "";
			city = "";
			state = "";
			zip = "";
		}
		
		public TurkeyBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public TurkeyBuilder setPropertyOf(String propertyOf) {
			this.propertyOf = propertyOf;
			return this;
		}

		public TurkeyBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public TurkeyBuilder setCity(String city) {
			this.city = city;
			return this;
		}

		public TurkeyBuilder setState(String state) {
			this.state = state;
			return this;
		}

		public TurkeyBuilder setZip(String zip) {
			this.zip = zip;
			return this;
		}

	    public Turkey build() {
	        return new Turkey(this);
	    }

	}
	@Override
	public String getType() {
		return "turkey";
	}

	@Override
	public void speak() {
		System.out.println("Cluck!");
		
	}

	@Override
	public void eat() {
		System.out.println("I eat grain and seeds.");
		
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
