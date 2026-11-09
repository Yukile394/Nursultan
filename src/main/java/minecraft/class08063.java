package minecraft;

import java.util.Set;

public record class08063(int id, class08716 change, Set<class06681> relatives, boolean onGround) implements class00381<class07280> {
   public static final class02362<class00667, class08063> N = class02362.N(
      class02389.B, class08063::N, class08716.N, class08063::y, class06681.field_54095, class08063::L, class02389.y, class08063::u, class08063::new
   );

   public Set<class06681> L() {
      return this.relatives;
   }

   public class08063(int id, class08716 change, Set<class06681> relatives, boolean onGround) {
      super();
      this.id = id;
      this.change = change;
      this.relatives = relatives;
      this.onGround = onGround;
   }

   public boolean u() {
      return this.onGround;
   }

   public class08716 y() {
      return this.change;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public static class08063 N(int var0, class08716 var1, Set<class06681> var2, boolean var3) {
      return new class08063(var0, var1, var2, var3);
   }

   public int N() {
      return this.id;
   }

   @Override
   public class02897<class08063> method_65080() {
      return class04248.yZ;
   }
}
