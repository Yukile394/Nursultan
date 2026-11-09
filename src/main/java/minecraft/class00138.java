package minecraft;

import java.util.HashSet;
import java.util.Set;

public record class00138(class01763[] openSet, class01763[] closedSet, Set<class04604> targetNodes) {

   public Set<class04604> L() {
      return this.targetNodes;
   }

   public class00138(class01763[] openSet, class01763[] closedSet, Set<class04604> targetNodes) {
      super();
      this.openSet = openSet;
      this.closedSet = closedSet;
      this.targetNodes = targetNodes;
   }

   public class01763[] y() {
      return this.closedSet;
   }

   public static class00138 y(class00667 var0) {
      HashSet hashset = var0.N_15(HashSet::new, class04604::N);
      class01763[] aclass01763 = class00143.L(var0);
      class01763[] aclass017631 = class00143.L(var0);
      return new class00138(aclass01763, aclass017631, hashset);
   }

   public void N(class00667 var1) {
      var1.N_12(this.targetNodes, (var0, var1x) -> var1x.y(var0));
      class00143.N(var1, this.openSet);
      class00143.N(var1, this.closedSet);
   }

   public class01763[] N() {
      return this.openSet;
   }
}
