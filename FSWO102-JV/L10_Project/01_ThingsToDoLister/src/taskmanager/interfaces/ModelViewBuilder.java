package taskmanager.interfaces;

public interface ModelViewBuilder {

	void buildView();
	
	ModelViewBuilder addtoModel();
	ModelViewBuilder removefromModel();
	ModelViewBuilder markasCompleteInModel();	
	ModelViewBuilder relistModel();
	
	ModelViewBuilder clearModel();
}
