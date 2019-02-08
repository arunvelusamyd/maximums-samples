package integrationtests.com.flexy.student.testrunner;

import com.flexy.SpringBootKatharsisApplication;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.runners.model.InitializationError;

public class ZeroCodeIntegrationTestRunner  extends ZeroCodeUnitRunner {

    static{
        String[] emptyArgs = {};
        SpringBootKatharsisApplication.main(emptyArgs);
    }

    public ZeroCodeIntegrationTestRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }
}
