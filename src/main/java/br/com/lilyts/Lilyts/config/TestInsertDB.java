package br.com.lilyts.Lilyts.config;

import br.com.lilyts.Lilyts.entities.Sales;
import br.com.lilyts.Lilyts.enums.IsSales;
import org.springframework.boot.CommandLineRunner;

import java.util.Date;

public class TestInsertDB  implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Sales sale = new Sales(null, "teste", "31231238123012", "43923821931", new Date(), IsSales.YES, new byte['w'], new byte['b']);
    }
}
