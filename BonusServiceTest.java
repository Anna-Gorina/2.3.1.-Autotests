import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service =  new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем метод задачи:
        long actual = service.calculate(amount, registered);

        // производим проверка (сравниваем ожидаемый и фактический):
        // если true - то ПРОЙТИ
        // если false - то FAIL
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service =  new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем метод задачи:
        long actual = service.calculate(amount, registered);

        // производим проверка (сравниваем ожидаемый и фактический):
        // если true - то ПРОЙТИ
        // если false - то FAIL
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnRegisteredAndUnderLimit() {
        BonusService service =  new BonusService();

        // подготавливаем данные:
        long amount = 5000_40;
        boolean registered = false;
        long expected = 50;

        // вызываем метод задачи:
        long actual = service.calculate(amount, registered);

        // производим проверка (сравниваем ожидаемый и фактический):
        // если true - то ПРОЙТИ
        // если false - то FAIL
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForUnRegisteredAndOverLimit() {
        BonusService service =  new BonusService();

        // подготавливаем данные:
        long amount = 500_000_30;
        boolean registered = false;
        long expected = 500;

        // вызываем метод задачи:
        long actual = service.calculate(amount, registered);

        // производим проверка (сравниваем ожидаемый и фактический):
        // если true - то ПРОЙТИ
        // если false - то FAIL
        assertEquals(expected, actual);
    }
}