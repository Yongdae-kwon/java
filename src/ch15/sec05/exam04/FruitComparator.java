package ch15.sec05.exam04;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
	
	
	// 정렬 기준을 price로 설정
	@Override
	public int compare (Fruit o1, Fruit o2) {		// Fruit 객체를 2개씩 가져와서 비교
		if(o1.price < o2.price) return -1;
		else if (o1.price == o2.price) return 0;
		else return 1;
	}
}
