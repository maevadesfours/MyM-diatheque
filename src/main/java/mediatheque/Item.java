package mediatheque;

public abstract class Item {
	public abstract void accept(MediathequeVisitor visitor);
	private String title;

	protected Item(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public abstract void print();

	@Override
	public String toString() {
		return title;
	}
	
}
