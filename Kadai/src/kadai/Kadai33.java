package kadai;

public class Kadai33 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// ■問題6
		// mainメソッド内でMotionIndicator型のインスタンスとUSMotionIndicator型のインスタンスを
		// ひとつずつ作成し、それぞれのdispメソッドを実行せよ。
		MotionIndicator motion = new MotionIndicator();
		motion.disp();

		USMotionIndicator usMotion = new USMotionIndicator(120);
		usMotion.disp();
	}

}

// ■問題1
// 以下のインターフェースを実装したMotionIndicatorクラスを作成せよ。
interface Indicator {
	void disp();
}

class MotionIndicator implements Indicator {

	// ■問題2
	// MotionIndicatorクラスにint型のフィールドspeedを作成しコンストラクタで値を120に設定せよ。
	// ただしフィールドはカプセル化させること。
	private int speed;

	MotionIndicator() {
		this.speed = 120;
	}
	
	MotionIndicator(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return this.speed;
	}

	// ■問題3
	// MotionIndicatorクラスにdispメソッドを実装させよ。
	// ただしdispメソッドを実行したとき以下のように表示させるものとする。
	// 「速度：（speedの値）km/h」
	public void disp() {
		System.out.println("速度：" + speed + " km/h");
	}
}

// ■問題4
// MotionIndicatorクラスを継承したUSMotionIndicatorクラスを作成せよ。
class USMotionIndicator extends MotionIndicator {

	USMotionIndicator(int speed){
		super(speed);
	}
	// ■問題5
	// USMotionIndicatorクラス内でdispメソッドをオーバーライドし、
	// 以下のように表示するようにせよ。

	// 「speed：（speedの値をmile/h換算させた値）mile/h」

	// ただし換算式は　（km/hの値）/1.609　　とする。
	public void disp() {
		System.out.println("speed：" + super.getSpeed() / 1.609 + " mile/h");
	}
}
