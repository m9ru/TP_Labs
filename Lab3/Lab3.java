import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Lab3 {
    public static void main(String[] args){
        UrlCont urlCont = new UrlCont("http://mtuci.ru/");
        int depth = 1;
        int threadNum = 1;
        
        ArrayList<UrlScan> scanners = new ArrayList<>(threadNum);
        for (int i = 0; i < threadNum; i++)
        {
            UrlScan scanner = new UrlScan(urlCont, depth);
            scanner.setDaemon(true);
            scanner.start();
            scanners.add(scanner);
        }
        
        boolean proc = true;
        while (proc == true)
        {
            Thread.yield();
            proc = false;
            for (UrlScan scanner : scanners)
            {
                if (scanner.getState() != Thread.State.WAITING)
                {
                    proc = true;
                    break;
                }
            }
        }
        
        Hashtable<String, UrlInfo> visitedUrl = urlCont.getVisitedUrl();
        Enumeration<UrlInfo> val = visitedUrl.elements();
        while (val.hasMoreElements())
        {
            UrlInfo urlInfo = val.nextElement();
            System.out.println(urlInfo.getUrl());
        }
        System.out.println("Всего просмотрено url: " + Integer.toString(visitedUrl.size()));
    }
}