
public class Radio implements Alert {

	@Override
	public void alert(AlertVisitor alertVisitor) {
		alertVisitor.visit(this);
	}
}
