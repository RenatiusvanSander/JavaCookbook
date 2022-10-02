package edu.remad.javacookbook.structuringdatawithjava;

import java.util.ArrayList;
import java.util.List;

public class CallTrack {

  /** the list of person objects */
  protected List<Person> usrList = new ArrayList<>();

  /** The scrolling list */
  protected java.awt.List visList = new java.awt.List();

  /** Add one (new) Personto the list, keeping the list sorted */
  protected void add(Person p) {
    String lastName = p.getLastName();
    int i;
    for(i = 0; i < usrList.size(); i++) {
      if(lastName.compareTo((usrList.get(i)).getLastName()) <= 0) {
        break;
      }
    }

    usrList.add(i, p);
    visList.add(p.getFullName(), i);
    visList.select(i);
  }
}
