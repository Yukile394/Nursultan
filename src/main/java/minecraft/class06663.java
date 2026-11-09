package minecraft;

import java.util.Set;

public record class06663(int id, class08716 change, Set<class06681> relatives) implements class00381<class07280> {
   public static final class02362<class00667, class06663> N = class02362.N(
      class02389.B, class06663::N, class08716.N, class06663::y, class06681.field_54095, class06663::L, class06663::new
   );

   public Set<class06681> L() {
      return this.relatives;
   }

   public class06663(int id, class08716 change, Set<class06681> relatives) {
      super();
      this.id = id;
      this.change = change;
      this.relatives = relatives;
   }

   public class08716 y() {
      return this.change;
   }

   public static class06663 N(int var0, class08716 var1, Set<class06681> var2) {
      return new class06663(var0, var1, var2);
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int N() {
      return this.id;
   }

   @Override
   public class02897<class06663> method_65080() {
      return class04248.Nm;
   }
}
