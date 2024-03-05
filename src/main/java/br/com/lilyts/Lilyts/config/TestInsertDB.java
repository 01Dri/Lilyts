package br.com.lilyts.Lilyts.config;

import br.com.lilyts.Lilyts.entities.Sales;
import br.com.lilyts.Lilyts.enums.IsSales;
import br.com.lilyts.Lilyts.repository.SalesReposiitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class TestInsertDB  implements CommandLineRunner {

    private final SalesReposiitory reposiitory;

    @Autowired
    public TestInsertDB(SalesReposiitory reposiitory) {
        this.reposiitory = reposiitory;
    }

    // To insert first entity on DB for tests
    @Override
    public void run(String... args) throws Exception {

        Sales sale = new Sales(null, "teste", "31231238123012", "43923821931", new Date(), IsSales.YES, new byte['w'], new byte['b']);
        reposiitory.save(sale);
    }
}
