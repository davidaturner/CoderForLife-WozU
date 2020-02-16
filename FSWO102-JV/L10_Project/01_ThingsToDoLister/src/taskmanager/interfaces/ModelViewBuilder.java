package taskmanager.interfaces;

public interface ModelViewBuilder {

	void buildView();
	
	ModelViewBuilder addtoModel();
	ModelViewBuilder removefromModel();
	
	ModelViewBuilder getFromModel();
	ModelViewBuilder puttoModel();
	
	ModelViewBuilder relistModel();
	ModelViewBuilder clearModel();
}
