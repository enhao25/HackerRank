import java.util.*;

public class PrimeFactor {
  public static void main(String [] args) {
    try {
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      ArrayList<ourValue> valueArray = new ArrayList<>();

      for (int i = 0; i < N; i++) {
        int value = scan.nextInt();
        valueArray.add(new ourValue(value, getPrimeNumber(value)));
      }

      Collections.sort(valueArray);

      for (int i = 0; i < valueArray.size(); i++) {
        System.out.println(valueArray.get(i).value);
      }

      scan.close();
    } catch (Exception e) {}
  }

  public static int[] getPrimeNumber(int value) {
    int results[] = new int[20];
    int counter = 0;

    for(int i = 2; i<= value; i++) {
      while(value % i == 0) {
        value = value/i;
        results[counter++] = i;
      }
    }
    return results;
  }
}

class ourValue implements Comparable<ourValue> {
  int value;
  int[] primeFactors;

  ourValue(int value, int[] primeFactors) {
    this.value = value;
    this.primeFactors = primeFactors;
  }

  @Override
  public int compareTo(ourValue ourVal) {
    // Get the shortest length
    int length = primeFactors.length < ourVal.primeFactors.length ? primeFactors.length : ourVal.primeFactors.length;
    for (int i = 0; i < length; i++) {
      if (primeFactors[i] > ourVal.primeFactors[i]) {
        return 1;
      } else if (primeFactors[i] < ourVal.primeFactors[i]) {
        return -1;
      }
    }
    return 0;
  }
}