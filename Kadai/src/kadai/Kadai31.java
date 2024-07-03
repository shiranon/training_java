package kadai;

class MobilePhone {
	private String number;
	
	// ■問題3
	// 　MobilePhone クラスに
	// 　・所有者名（String）
	// 　・管理番号（int）
	// 　のメンバ変数（フィールド）を追加せよ。ただし（）で記された型で設定しすること。
	// 　またフィールドはカプセル化させること。
	private String name;
	private int manageNumber;

	// ■問題7
	// 　MobilePhone クラスに
	// 　・所有者を設定する引数（ String ）を持つコンストラクタ
	// 　・管理番号を設定する引数（ int ）を持つコンストラクタ
	// 　を追加せよ。
	MobilePhone() {
	}
	
	MobilePhone(int manageNumber) {
		this.manageNumber = manageNumber;
	}

	MobilePhone(String name) {
		this.name = name;
	}

	MobilePhone(int manageNumber, String name) {
		this.manageNumber = manageNumber;
		this.name = name;
	}

	public void setNumber(String num) {
		this.number = num;
	}

	public void setName(String str) {
		this.name = str;
	}

	public void setManageNumber(int num) {
		this.manageNumber = num;
	}

	public void showNumber() {
		System.out.println("番号：" + this.number);
	}

	public int getManageNumber() {
		return this.manageNumber;
	}

	public String getName() {
		return this.name;
	}

	public void showProfile() {
		System.out.println("------------------------------------------------");
		System.out.println("　　　番号：" + this.number);
		System.out.println("　　所有者：" + this.name);
		System.out.println("　管理番号：" + this.manageNumber);
		System.out.println("------------------------------------------------");
	}

	public void showOwner() {
		System.out.println("管理番号" + this.manageNumber + "の所有者は" + this.name + "です。");
	}
}

public class Kadai31 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// ■問題1
		// 　番号「090-1234-5678」のmobileAと、
		// 　番号「080-9876-5432」のmobileBというインスタンスを２つ作成せよ。

		MobilePhone mobileA = new MobilePhone();
		MobilePhone mobileB = new MobilePhone();
		mobileA.setNumber("090-1234-5678");
		mobileB.setNumber("080-9876-5432");

		// ■問題2
		// 　作成したインスタンスのうち、mobileAの番号を表示させよ。
		mobileA.showNumber();

		// ■問題4
		// 　問題３で設定したメンバ変数が他のクラスから設定できるようにセッターを作成せよ。
		mobileA.setManageNumber(11);
		mobileA.setName("hoge");

		// ■問題5
		// 　MobilePhone クラスに　以下ように内容を表示させる showProfileメソッド を追加せよ。
		//   ------------------------------------------------
		// 　　　　番号：
		// 　　　所有者：
		// 　　管理番号：　　　　　　
		// 　------------------------------------------------
		mobileA.showProfile();

		// ■問題6
		// 　mainメソッドで以下の文を表示させよ。
		// 　「管理番号***番の所有者は******です。」
		// 　ただし「***」の部分は各自自由に設定せよ。
		System.out.println("管理番号" + mobileA.getManageNumber() + "の所有者は" + mobileA.getName() + "です。");
		

		// ■問題8
		// 　問題7で作成したコンストラクタを使用して
		// 　・所有者が「情報太郎」の mobileC 
		// 　・管理番号が「123」の mobileD
		// 　のインスタンスを作成せよ。
		MobilePhone mobileC = new MobilePhone("情熱太郎");
		MobilePhone mobileD = new MobilePhone(123);
		mobileC.showProfile(); //コンストラクタが走り、Stringはnull intは0で初期化される
	}

}