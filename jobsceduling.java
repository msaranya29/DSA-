import java.util.*;
public class jobsceduling {
    static class Job{
        int id;
        int deadLine;
        int profit;
        public Job(int i,int d,int p)
    {
            id=i;
            deadLine=d;
            profit=p;
        }
        
    }
    public static void main(String[] args) {
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        Job jobs[]=new Job[jobsInfo.length];
        for(int i=0;i<jobsInfo.length;i++){
            jobs[i]=new Job();
            jobs[i].id=i+1;
            jobs[i].deadLine=jobsInfo[i][0];
            jobs[i].profit=jobsInfo[i][1];
        }
    }
}
