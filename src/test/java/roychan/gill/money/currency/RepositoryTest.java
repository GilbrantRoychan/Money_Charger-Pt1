package roychan.gill.money.currency;

import org.junit.jupiter.api.*;
import roychan.gill.money.currency.entity.CurrencyEntity;
import roychan.gill.money.currency.repository.CurrencyRepository;
import roychan.gill.money.currency.repository.impl.CurrencyRepositoryImpl;
import roychan.gill.money.currency.service.CurrencyService;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
public class RepositoryTest {

    private CurrencyRepository currencyRepository;
    public CurrencyService currencyService;

    @BeforeAll
    void setUp() {
        currencyRepository = new CurrencyRepositoryImpl();
        currencyService = new CurrencyService(currencyRepository);
    }

    @Test
    void testAddData() {
        CurrencyEntity test1 = new CurrencyEntity(1,"Testing1", "Indonesia", 12000L);
        currencyRepository.addAccount(test1);

    }

    @Test
    void testShow() {
        CurrencyEntity test1 = new CurrencyEntity("Testing1", "Indonesia", 12000L);
        CurrencyEntity test2 = new CurrencyEntity("Testing1", "Indonesia", 12000L);
        currencyRepository.addAccount(test1);
        currencyRepository.addAccount(test2);
        System.out.println(currencyRepository.getAllData().size());
    }
}
