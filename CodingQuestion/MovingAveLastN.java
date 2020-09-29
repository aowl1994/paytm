import java.util.ArrayList;
public class MovingAveLastN implements MovingAverage{
    int n;
	int total;
	double lastN[];
	double avg;
    ArrayList<Double> elements;
	int head;

    public MovingAveLastN(int n){
        elements = new ArrayList<Double>();
        this.n = n;
    }

    public void add(double num){
        elements.add(num);
    }

    public double get(int index){
        return elements.get(index);
    }

    public int getN(){
        return n;
    }

    public double getAvg(){
        if (elements.size() < n){
            double sum = 0;
            for(double i: elements) {
                sum+=i;
            }
            return sum/elements.size();
        }

        double sum=0;
        for (int i = elements.size()-n; i<elements.size();i++){
            sum += elements.get(i);
            
        }
        return sum/n;
    }

    // Testcase
    public static void main(String[] args){
    MovingAveLastN list = new MovingAveLastN(3);
    list.add(4);
    list.add(3);
    list.add(10);
    list.add(7);
    System.out.println(list.getAvg());
    }
}

