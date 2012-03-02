import java.util.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class ResultsDataBase {

    private ArrayList<Result> results;
    int t, p, c, s = 0;
    public ResultsDataBase()
    {
        results = new ArrayList<Result>();
    }

    public boolean addResult(Result r)
    {
        int i = results.size();
        results.add(r);
        s = r.getOutcome();
                if(s == 0)
                    c++;
                else if(s == 1)
                    p++;
                else
                    t++;
        if(results.size() > i)
            return true;
        else
            return false;
    }

    public String getScore()
    {
        String str = "";
        str = "Match result are: " + p + " Wins, " + c + " Losses, and " + t + " Ties";
        return str;
    }

}
