package calculateaverage;

public class CalculateAverage {
    public static void main(String[] args) {
        double[] grades = new double[] {20, 80, -500,
        40, 75, 50, 100, 76, 80, 90};
        System.out.println("The total grade is: " + calcAvg(grades));
        
    }
    static double calcAvg (double[] g){
        double total = 0;
        for (int i = 0; i < g.length; i++)
        {
            if (g[i] < 0)
                continue;
            
            total += g[i];
        }
        total = total / g.length;
                
        return total;
    }
    
}
