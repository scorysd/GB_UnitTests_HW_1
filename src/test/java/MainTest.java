import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testMethod1() {
        assertEquals(5, 2 + 3);
    }
    @BeforeEach
    public void setup() {
// Инициализация ресурсов
    }
    @AfterEach
    public void teardown() {
// Очистка ресурсов
    }
    @BeforeAll
    public static void globalSetup() {
// Инициализация
    }
    @AfterAll
    public static void globalTeardown() {
// Очистка
    }
    @Test
    @DisplayName("Тест суммирования")
    public void testSum() {
        assertEquals(5, 2 + 3);
    }
    @Test
    @Disabled
    public void testMethod() {
// этот тест не будет запущен
    }
}
