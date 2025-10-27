import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    // DisplayName, Test 어노테이션으로 테스트명, 테스트 메서드임을 표기함
    @DisplayName("1 + 2 equals 3")
    @Test
    public void junitTest() {
        int a = 1;
        int b = 2;
        int sum = 3;

        // 값이 같은지 확인 - AssertJ의 Assertions를 통해 가독성을 향상시킴
        Assertions.assertThat(a + b).isEqualTo(sum);
    }
}
