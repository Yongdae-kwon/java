package ch16.sec05.exam02;

@FunctionalInterface
public interface Comparable {
	int compare (String a, String b);  // void가 아니니 리턴이 있을거다 생각
}
