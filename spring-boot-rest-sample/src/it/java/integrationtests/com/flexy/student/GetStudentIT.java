package integrationtests.com.flexy.student;

import integrationtests.com.flexy.student.testrunner.ZeroCodeIntegrationTestRunner;
import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("application_host.properties")
@RunWith(ZeroCodeIntegrationTestRunner.class)
public class GetStudentIT {

    @Test
    @JsonTestCase("integration_tests/student/get_student_test.json")
    public void test_getNewCustomerDetailsById() throws Exception {

    }

}
