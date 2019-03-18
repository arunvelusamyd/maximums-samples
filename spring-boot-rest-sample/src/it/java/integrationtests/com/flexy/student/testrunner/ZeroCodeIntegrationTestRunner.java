package integrationtests.com.flexy.student.testrunner;

import com.flexy.SpringBootKatharsisApplication;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.runners.model.InitializationError;

public class ZeroCodeIntegrationTestRunner  extends ZeroCodeUnitRunner {

    static{
        System.setProperty("gateway.employee.baseUrl", "http://localhost:8888/api");

        String[] emptyArgs = {};
        SpringBootKatharsisApplication.main(emptyArgs);
    }

    public ZeroCodeIntegrationTestRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }
}
