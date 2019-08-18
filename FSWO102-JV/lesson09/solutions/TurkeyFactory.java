package solutions;

public class TurkeyFactory extends AnimalFactory {

	@Override
	IAnimal getAnimal() {
		return 	new Turkey.TurkeyBuilder().setPropertyOf("Acme Farms, Inc.")
				.setAddress("100 Main St")
				.setCity("Pittsburgh")
				.setState("PA")
				.setZip("15220")
				.build();
	}

}
