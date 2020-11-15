package covidtracker;

public class CovidDataExceptionTest extends student.TestCase {

    public void testCovidDataException() {
        Exception exception = null;
        try {
            throw new CovidDataException("Data Exception");
        }
        catch (CovidDataException e) {
            exception = e;
        }

        assertNotNull(exception);
        assertTrue(exception.getMessage().equals("Data Exception"));
    }

}
