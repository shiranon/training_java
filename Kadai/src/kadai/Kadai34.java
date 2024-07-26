package kadai;

public class Kadai34 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Memo myMemo = new Memo(200, 100, "英会話10:00～");
		System.out.println("メモの幅　　：" + myMemo.getWidth());
		System.out.println("メモの高さ　：" + myMemo.getHeight());
		System.out.println("メモの文字長：" + myMemo.getLength());
	}

}

interface Rect {
	int getWidth();

	int getHeight();
}

interface Contents {
	int getLength();
}



class Memo implements Rect, Contents {
	private int width;
	private int height;
	private String contents;

	Memo(int vWidth, int vHeight, String vContents) {
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
}