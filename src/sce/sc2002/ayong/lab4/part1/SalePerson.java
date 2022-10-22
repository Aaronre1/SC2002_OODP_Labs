package sce.sc2002.ayong.lab4.part1;

public class SalePerson implements Comparable {
    private String _firstname;
    private String _lastName;
    private int _totalSales;

    public SalePerson(String firstname, String lastname, int totalsales) {
        _firstname = firstname;
        _lastName = lastname;
        _totalSales = totalsales;
    }

    @Override
    public String toString() {
        return _lastName + " , " + _firstname + " : " + _totalSales;
    }

    public boolean equals(Object obj) {
        SalePerson sp = (SalePerson) obj;
        return sp._firstname == _firstname && sp._lastName == _lastName;
    }

    @Override
    public int compareTo(Object obj) {
        SalePerson sp = (SalePerson) obj;

        if (_totalSales == sp._totalSales) {
            return sp._lastName.compareTo(_lastName); //_lastName.compareTo(sp._lastName);
        } else {
            return _totalSales - sp._totalSales;
        }
    }

    public String getFirstName() {
        return _firstname;
    }

    public String getLastName() {
        return _lastName;
    }

    public int getTotalSales() {
        return _totalSales;
    }
}
