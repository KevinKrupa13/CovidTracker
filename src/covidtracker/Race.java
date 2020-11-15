package covidtracker;

public class Race {

    private String race;
    private long numberOfDeaths;
    private long numberOfCases;

    public Race(String race, long numberOfCases, long numberOfDeaths)
        throws CovidDataException {
        if (numberOfCases < numberOfDeaths) {
            throw new CovidDataException("Too many deaths");
        }

        this.race = race;
        this.numberOfCases = numberOfCases;
        this.numberOfDeaths = numberOfDeaths;
    }


    public String getRace() {
        return this.race;
    }


    public long getDeaths() {
        return this.numberOfDeaths;
    }


    public long getCases() {
        return this.numberOfCases;
    }


    public double calculateCFR() {
        return (this.numberOfDeaths / this.numberOfCases) * 100;
    }


    public boolean equals(Object entry) {
        if (entry == null) {
            return false;
        }

        if (entry == this) {
            return true;
        }

        if (this.getClass() == entry.getClass()) {
            Race temp = ((Race)entry);

            return (this.race.equals(temp.getRace())
                && this.numberOfCases == temp.getCases()
                && this.numberOfDeaths == temp.getDeaths());
        }
        
        return false;
    }
    
    public String toString() {
        StringBuilder string = new StringBuilder();
        
        string.append(this.race + " ");
        string.append("Cases: " + this.numberOfCases + " ");
        string.append("Deaths: " + this.numberOfDeaths);
        
        return string.toString();
    }

}
