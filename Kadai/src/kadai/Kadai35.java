package kadai;

interface Contents2 {
	int getLength();

	String getContents();
}

class Tag implements Contents2 {
	private String contents;

	Tag(String contents) {
		this.contents = contents;
	}

	public int getLength() {
		return this.contents.length();
	}

	public String getContents() {
		return this.contents;
	}
}

class Memo2 implements Rect, Contents2 {
	private int width;
	private int height;
	private String contents;

	Memo2(int vWidth, int vHeight, String vContents) {
		this.width = vWidth;
		this.height = vHeight;
		this.contents = vContents;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	public int getLength() {
		return this.contents.length();
	}

	public String getContents() {
		return this.contents;
	}
}

public class Kadai35 {

	public static void main(String[] args) {
		Memo2[] memos = {
				new Memo2(200, 100, "食事会"),
				new Memo2(100, 120, "説明会:2006/10/11"),
				new Memo2(30, 100, "協議会:8/10")
		};
		Tag[] tags = {
				new Tag("2006/12/1 打ち合わせ予定"),
				new Tag("2006/12/15 会議(資料作成)")
		};
		for (Memo2 memo : memos) {
			summarize(memo);
		};
		for (Tag tag : tags) {
			summarize(tag);
		};
	}

	static void summarize(Contents2 contents) {
		if (contents.getLength() < 13) {
			System.out.println(contents.getContents());
		} else {
			System.out.println("要約:" + contents.getContents().substring(0, 13));
		}
	}

}