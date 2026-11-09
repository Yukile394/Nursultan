package minecraft;

import java.util.Set;
import java.util.function.Predicate;

public record class05369(Set<class00500> matchingStates, int maxTickets, int validRange) {
   public static final Predicate<class03556<class05369>> N = var0 -> false;

   public int L() {
      return this.validRange;
   }

   public class05369(Set<class00500> matchingStates, int maxTickets, int validRange) {
      super();
      matchingStates = Set.copyOf(matchingStates);
      this.matchingStates = matchingStates;
      this.maxTickets = maxTickets;
      this.validRange = validRange;
   }

   public int y() {
      return this.maxTickets;
   }

   public boolean N(class00500 var1) {
      return this.matchingStates.contains(var1);
   }

   public Set<class00500> N() {
      return this.matchingStates;
   }
}
