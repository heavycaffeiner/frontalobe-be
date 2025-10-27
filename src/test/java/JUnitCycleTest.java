import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeAll // 전체 테스트를 실행하기 전 1회 실행 - static으로 선언
    static void beforeAll() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach // 테스트 케이스 시작 전마다 실행
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }
    @Test
    public void test2() {
        System.out.println("Test 2");
    }
    @Test
    public void test3() {
        System.out.println("Test 3");
    }

    @AfterAll // 전체 테스트를 실행 후 1회 실행 - static으로 선언
    static void afterAll() {
        System.out.println("@AfterAll");
    }

    @AfterEach // 테스트 케이스 종료 전마다 실행
    void afterEach() {
        System.out.println("@AfterEach");
    }
}

