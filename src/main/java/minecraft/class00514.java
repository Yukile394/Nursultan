package minecraft;

import java.util.BitSet;
import org.jspecify.annotations.Nullable;

public class class00514 implements class00381<class07280> {
   public static final class02362<class04247, class00514> N = class00381.N(class00514::N, class00514::new);
   private final int y;
   private final int L;
   private final class01839 u;
   private final class01832 i;

   public class01839 L() {
      return this.u;
   }

   public class00514(class00570 var1, class05795 var2, @Nullable BitSet var3, @Nullable BitSet var4) {
      super();
      class07321 class07321 = var1.R();
      this.y = class07321.B;
      this.L = class07321.Z;
      this.u = new class01839(var1);
      this.i = new class01832(class07321, var2, var3, var4);
   }

   private class00514(class04247 var1) {
      super();
      this.y = var1.readInt();
      this.L = var1.readInt();
      this.u = new class01839(var1, this.y, this.L);
      this.i = new class01832(var1, this.y, this.L);
   }

   public class01832 u() {
      return this.i;
   }

   public int y() {
      return this.L;
   }

   private void N(class04247 var1) {
      var1.writeInt(this.y);
      var1.writeInt(this.L);
      this.u.N(var1);
      this.i.N(var1);
   }

   public int N() {
      return this.y;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class00514> method_65080() {
      return class04248.a;
   }
}
