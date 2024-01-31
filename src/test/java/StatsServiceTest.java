import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void sumAllTest() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.sumAll(salesData);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageAmountTest() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageAmount(salesData);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxNumberOfSalesTest() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxNumberOfSales(salesData);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minNumberOfSalesTest() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minNumberOfSales(salesData);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthBelowAverageTest() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.monthBelowAverage(salesData);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthAboveAverageTest() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.monthAboveAverage(salesData);
        Assertions.assertEquals(expected, actual);
    }
}
