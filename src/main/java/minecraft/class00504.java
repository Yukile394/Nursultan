package minecraft;

import java.util.BitSet;
import org.jspecify.annotations.Nullable;

public class class00504 implements class00381<class07280> {
   public static final class02362<class00667, class00504> N = class00381.N(class00504::N, class00504::new);
   private final int y;
   private final int L;
   private final class01832 u;

   public class01832 L() {
      return this.u;
   }

   public class00504(class07321 var1, class05795 var2, @Nullable BitSet var3, @Nullable BitSet var4) {
      super();
      this.y = var1.B;
      this.L = var1.Z;
      this.u = new class01832(var1, var2, var3, var4);
   }

   private class00504(class00667 var1) {
      super();
      this.y = var1.E();
      this.L = var1.E();
      this.u = new class01832(var1, this.y, this.L);
   }

   public int y() {
      return this.L;
   }

   private void N(class00667 var1) {
      var1.L(this.y);
      var1.L(this.L);
      this.u.N(var1);
   }

   public int N() {
      return this.y;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class00504> method_65080() {
      return class04248.A;
   }
}
