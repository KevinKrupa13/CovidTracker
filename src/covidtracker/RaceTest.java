package covidtracker;

public class RaceTest extends student.TestCase {

    private Race race;

    public void setUp() throws CovidDataException {
        race = new Race("Race", 10000, 5000);
    }


    public void testConstructor() {
        Exception exception = null;
        try {
            race = new Race("Race", 5, 10);
        }
        catch (CovidDataException e) {
            exception = e;
        }

        assertNotNull(exception);
        assertTrue(exception.getMessage().equals("Too many deaths"));
    }


    public void testGetRace() {
        assertTrue(race.getRace().equals("Race"));
    }


    public void testGetDeaths() {
        assertEquals(race.getDeaths(), 5000);
    }


    public void testGetCases() {
        assertEquals(race.getCases(), 10000);
    }


    public void testCalculateCFR() {
        assertEquals(race.calculateCFR(), 0.0, 50.0);
    }


    @SuppressWarnings("unlikely-arg-type")
    public void testEquals() throws CovidDataException {
        Race same = race;
        Race equals = new Race("Race", 10000, 5000);
        
        Race difName = new Race("Name", 10000, 5000);
        Race difCases = new Race("Race", 9000, 5000);
        Race difDeaths = new Race("Race", 10000, 4000);
        
        Race nullRace = null;
        
        String difClass = "Kevin";
        
        assertTrue(race.equals(same));
        assertTrue(race.equals(equals));
        
        assertFalse(race.equals(difName));
        assertFalse(race.equals(difCases));
        assertFalse(race.equals(difDeaths));
        
        assertFalse(race.equals(nullRace));
        
        assertFalse(race.equals(difClass));    
    }


    public void testToString() {
        assertTrue(race.toString().equals("Race Cases: 10000 Deaths: 5000"));
    }

}
