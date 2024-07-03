package kadai;

// ■問題1
// 下記のCreatureクラスを継承させてDogクラスを作成せよ。
// ・Dogは sleepingメソッドを持ち、sleeping を実行すると“Zzz…、Zzz…”と表示する。
// ・コンストラクタで名前と年齢を設定する。
class Creature {
	public String name;
	public int age;

	public void showProfile() {
		System.out.println("名前：" + this.name + "、年齢：" + this.age);
	}

	public void speak() {
		System.out.println("......");
	}
}

class Dog extends Creature {

	Dog(String name, int age) {
		super.name = name;
		super.age = age;
	}

	public void sleeping() {
		System.out.println("Zzz…、Zzz…");
	}

	// ■問題6
	// HorseクラスとDogクラスに speakメソッドをオーバーライドするメソッドを追加せよ。 
	// Horse では“neigh”、Dog では“bowwow”という文字列を表示させること。

	public void speak() {
		System.out.println("bowwow");
	}

}

// ■問題3
// Creatureクラスを継承させてHorseクラスを作成せよ。
// ・Horseはrunメソッドを持ち、runを実行すると“clip-clop”という文字列を表示する。
// ・コンストラクタで名前と年齢を設定する。
class Horse extends Creature {
	Horse(String name, int age) {
		super.name = name;
		super.age = age;
	}

	public void run() {
		System.out.println("clip-clop");
	}

	public void speak() {
		System.out.println("neigh");
	}
}

public class Kadai32 {
	public static void main(String[] args) {

		// ■問題2
		// 次のプログラムを作成せよ。
		// ・Dogクラスのインスタンスを作成。
		// ・メンバー変数、name と age に名前と年齢を設定。
		// ・showProfile を実行。
		// ・sleepingを実行。
		System.out.println("問2");
		Dog taro = new Dog("taro", 11);
		taro.showProfile();
		taro.sleeping();

		// ■問題4
		// 次のプログラムを作成せよ。
		// ・Horse クラスのインスタンスを作成。
		// ・メンバー変数、name と age に名前と年齢を設定。
		// ・showProfile を実行。
		// ・Horse のインスタンスの run を実行。
		System.out.println("\n問4");
		Horse uma = new Horse("uma", 3);
		uma.showProfile();
		uma.run();

		//■問題7
		//以下のプログラムを作成せよ。
		//・HorseクラスとDogクラスのインスタンスそれぞれの speakを実行。
		System.out.println("\n問7");
		uma.speak();
		taro.speak();

		// ■問題8
		// 以下のプログラムを作成せよ。
		// ・Creature クラスの要素数が4の配列を作成。
		// ・配列の偶数番目には Dog クラスのインスタンス、奇数番目には Horseクラスのインスタンスを設定。
		// ・配列の総ての要素の speak メソッドを実行。
		System.out.println("\n問8");
		Creature[] creatures = new Creature[4];

		for (int i = 1; i <= creatures.length; i++) {
			if (i % 2 == 0) {
				creatures[i - 1] = new Dog("inu" + i, i);
			} else {
				creatures[i - 1] = new Horse("uma" + i, i);
			}
		}
		for (Creature creature : creatures) {
			creature.speak();
		}
	}

}
