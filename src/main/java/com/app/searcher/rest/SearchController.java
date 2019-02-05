package com.app.searcher.rest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SearchController {

    public List<Long> interSectionArrays(Set<List<Long>> setLists) {

        List<Long> ordinal = null;
        Iterator<List<Long>> iter = setLists.iterator();
        if (iter.hasNext()) {
            ordinal = iter.next();
        }
        while (iter.hasNext()) {
            List<Long> selected = iter.next();
            int indOrd = 0;
            int indSel = 0;
            while (indOrd < ordinal.size() && indSel < selected.size()) {
                if (ordinal.get(indOrd) > selected.get(indSel)) {
                    selected.remove(indSel);
                } else if (ordinal.get(indOrd) < selected.get(indSel)) {
                    ordinal.remove(indOrd);
                } else {
                    indOrd++;
                    indSel++;
                }
                if (indOrd == ordinal.size()) {
                    break;
                } else if (indSel == selected.size()) {
                    ordinal = selected;
                    break;
                }
            }
        }

        return ordinal;
    }

}
