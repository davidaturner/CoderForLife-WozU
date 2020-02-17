package taskmanager.interfaces;

public interface ModelViewBuilder {

	void buildView();
	
	ModelViewBuilder addtoModel();
	ModelViewBuilder removefromModel();
	ModelViewBuilder updateModel();	
	ModelViewBuilder relistModel();
	
	ModelViewBuilder clearModel();
}
