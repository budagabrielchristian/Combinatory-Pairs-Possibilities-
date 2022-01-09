package mathematics;

import java.util.LinkedList;

public class PossibleCombinations {
   LinkedList<String> elementsA = new LinkedList<>();
   LinkedList<String> elementsB = new LinkedList<>();
   LinkedList<String> copyOfB = new LinkedList<>();
   LinkedList<String> combinations = new LinkedList<>();
  public PossibleCombinations(LinkedList<String> elementsA, LinkedList<String> elementsB) {
      this.elementsA = elementsA;
      this.elementsB = elementsB;
   }

  public void findCombinations() {
      Integer numberOfCombinations = 0;
      Integer numberCombinationsA = 0;
      copyOfB.addAll(elementsB);
      do {
         if (numberOfCombinations == elementsA.size() * elementsB.size()) {
            return;
         }
         if (copyOfB.size() == 1) {
            combinations.add("(" + elementsA.get(numberCombinationsA) + ", " +
                             copyOfB.get(0) + ")");
            copyOfB.clear();
            copyOfB.addAll(elementsB);
            numberCombinationsA++;
            numberOfCombinations++;
         } else {
            combinations.add("(" + elementsA.get(numberCombinationsA) + ", " +
                             copyOfB.get(0) + ")");
            copyOfB.remove(copyOfB.get(0));
            numberOfCombinations++;
         }
      } while (numberOfCombinations != elementsA.size() * elementsB.size());

      System.out.println("Elements A: " + elementsA);
      System.out.println("Elements B: " + elementsB);
      System.out.println("Combinations [" + combinations.size() + "]: " + combinations);
   }
}
