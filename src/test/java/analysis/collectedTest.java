package analysis;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Vector;

public class collectedTest {

    @DisplayName("배열과 Vector 이용한 데이터 관리 비교")
    @Test
    public void arrayVsVector() {
        String[] array = new String[10];
        Vector<String> vector = new Vector<>();     // default 10

        System.out.println("array size=" + array.length);
        // 디폴트로 10개로 정해져 리스트의 개수가 capacity 이상이 되면 두배 씩 늘려 나아가는 전략
        System.out.println("vector size= " + vector.capacity());
    }

}
