package eygds.maven.demo.maths;

public class Calc {

	public int addNums(int i, int j) {
		return i + j;
	}

	public int subNums(int i, int j) {
		return i - j;
	}

	public int getDataFromDb(int i, int j) {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return i + j;
	}

	public int checkPositive(int num) {
		if (num > 0)
			return num;
		throw new RuntimeException("invalid input");
	}

	public void printNums(int i, int j) {
		System.out.println(i + j);
	}

}
