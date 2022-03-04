import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * methode devrait retourner la somme des entiers compris entre 10 et 100
 */
public class SumRange {

    public int sumRancge(int[] ints,int n1,int n2) {

        int sum = IntStream.of(ints).filter(num -> (num >= n1) && (num <= n2)).sum();
        return  sum;
    }
}


/**
 * la methoode  retourne true si b est le humeau de a ou false si ce n'est ps le cas a et b sont deux chaines de caractére non null
 */
public class Twin {
    public  boolean isTwin(String a ,String b){
        char[] charA=a.toLowerCase().toCharArray();
        char[]charB=b.toLowerCase().toCharArray();
        Arrays.sort(charA);
        Arrays.sort(charB);
        String resultA=new String(charA);
        String resultB= new String(charB);

      return  resultA.equals(resultB);
    }
}

/**
 * return  la valeur la plus proche de zéro à partir d'un tableau avec positif et négative
 */

public class ClosetoZero {

    public int closeZero( int []ints){

        int near =ints[0];
        int curr=0;
        Arrays.sort(ints);
        if(ints==null || ints.length==0){
            return 0;
        }
        for (int i = 0; i <ints.length ; i++) {
            curr=Math.abs(ints[i]);
            if (curr <= Math.abs(near)) {
                near=ints[i];
            }
        }
        return near;
    }
  
  //  en java 8

    public static void main(String[] args) {
        int[] str = {2,3,-2};
        Arrays.stream(str).filter(i -> i != 0)
                .reduce((a, b) -> abs(a) < abs(b) ? a : (abs(a) == abs(b) ? max(a, b) : b))
                .ifPresent(System.out::println);
    }
  
  /**
    Vous travaillez pour un magasin qui souhaite offrir une réduction de "discount%" sur le produit le plus cher acheté par un client donné pendant la période des soldes.
    Le responsable du magasin vous demande de développer la méthode calculateTotalPrice().
    Cette méthode:
    prend en paramètres la liste de prix des produits achetés par le client et le pourcentage de réduction" discount".
    retourne le prix de vente total (arrondi à l'entier inférieur si le total ne tombe pas rond).
    Contraintes:
    0=<"discount"<=100
    0=<prix d'un produit <100000
    0<nombre de produits<100

 */
  public class ClaculTotalPrice {
    public static int calculateTotalPrice1(int[] prices,int discount) {
        int total1=0;
        int len=prices.length;
        Arrays.sort(prices);
        for(int i=0;i<len-1;i++) {
            total1=total1+prices[i];
        }
        IntStream.range(0,len).reduce(0, (a, b) -> a + b);

        return (int)Math.floor(total1+ (((float)prices[len-1])-(prices[len-1])*discount/100f));

    }
}

  
  public class FindSmallIntervaal {

    public int findLargeInterval(int[] numbers){
        Arrays.sort(numbers);
//Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
      return IntStream.range(0,numbers.length-1).map(i->numbers[i+1]-i).min().getAsInt();
    }
}



