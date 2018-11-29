package test;

import static org.junit.Assert.*;
import java.util.Collection;

import org.junit.Test;

import main.java.memoranda.NoteListImpl;
import main.java.memoranda.date.CalendarDate;
import main.java.memoranda.interfaces.IProject;
import nu.xom.Document;
import nu.xom.Element;

public class testNoteListImpl {
    private IProject _project = null;
    private Document _doc = null;
    private Element _root = null;
    
    @Test
    public void test() {
        int day = 26;
        int month = 2;
        int yr = 2016;
        int laterday = 26;
        int latermonth = 3;
        int lateryr = 2018;
        
        System.out.println("Debug point");
        
        CalendarDate startDate = new CalendarDate(day, month, yr);
        CalendarDate endDate = new CalendarDate(laterday, latermonth, lateryr);
        
        NoteListImpl myNoteList = new NoteListImpl(_project);
        Collection myCollection = myNoteList.getNotesForPeriod(startDate, endDate);
        System.out.println(myCollection.toString());
        
    }

}
