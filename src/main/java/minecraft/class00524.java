package minecraft;

import java.util.List;

public record class00524(int containerId, int stateId, List<class06584> items, class06584 carriedItem) implements class00381<class07280> {
   public static final class02362<class04247, class00524> N = class02362.N(
      class02389.l, class00524::N, class02389.B, class00524::y, class06584.U, class00524::L, class06584.B, class00524::u, class00524::new
   );

   public List<class06584> L() {
      return this.items;
   }

   public class00524(int containerId, int stateId, List<class06584> items, class06584 carriedItem) {
      super();
      this.containerId = containerId;
      this.stateId = stateId;
      this.items = items;
      this.carriedItem = carriedItem;
   }

   public class06584 u() {
      return this.carriedItem;
   }

   public int y() {
      return this.stateId;
   }

   public int N() {
      return this.containerId;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class00524> method_65080() {
      return class04248.v;
   }
}
