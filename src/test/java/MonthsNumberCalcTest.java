import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.FreelancerMonthsVacation.monthsNumbers.MonthsNumberCalc;


public class MonthsNumberCalcTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/Test.csv")
    void numberOfMonthsToBeOffCases(int income, int expenses, int threshold, int expected) {
        MonthsNumberCalc calc = new MonthsNumberCalc();

        //int expected = 3;
        //Расчет количества свободных месяцев
        int actual = calc.calculation(income, expenses, threshold);

        //Использование метода Assertions для сравнения ожидаемого результата и фактического
        Assertions.assertEquals(expected, actual);

    }

}
