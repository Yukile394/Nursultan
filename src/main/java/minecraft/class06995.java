package minecraft;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;

public final class class06995 implements class07023 {
   private static final int y = 24;
   public static final class01424<class06995> N = new class07024();
   private int[] L;

   @Override
   public byte L() {
      return 11;
   }

   public int[] M() {
      return this.L;
   }

   public class06995(int[] var1) {
      super();
      this.L = var1;
   }

   @Override
   public int size() {
      return this.L.length;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class06995 && Arrays.equals(this.L, ((class06995)var1).L);
   }

   @Override
   public String toString() {
      class04818 class04818 = new class04818();
      class04818.N(this);
      return class04818.N();
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.L);
   }

   @Override
   public void clear() {
      this.L = new int[0];
   }

   public class06995 N() {
      int[] aint = new int[this.L.length];
      System.arraycopy(this.L, 0, aint, 0, this.L.length);
      return new class06995(aint);
   }

   @Override
   public class01424<class06995> u() {
      return N;
   }

   @Override
   public boolean y(int var1, class07709 var2) {
      if (var2 instanceof class07737 class07737) {
         this.L = ArrayUtils.add(this.L, var1, class07737.B());
         return true;
      } else {
         return false;
      }
   }

   public class07720 u(int var1) {
      int i = this.L[var1];
      this.L = ArrayUtils.remove(this.L, var1);
      return class07720.N(i);
   }

   @Override
   public int y() {
      return 24 + 4 * this.L.length;
   }

   @Override
   public void N(DataOutput var1) throws IOException {
      var1.writeInt(this.L.length);

      for (int i : this.L) {
         var1.writeInt(i);
      }
   }

   @Override
   public void N(class04836 var1) {
      var1.N(this);
   }

   @Override
   public boolean N(int var1, class07709 var2) {
      if (var2 instanceof class07737 class07737) {
         this.L[var1] = class07737.B();
         return true;
      } else {
         return false;
      }
   }

   public class07720 L(int var1) {
      return class07720.N(this.L[var1]);
   }

   @Override
   public class03154 N(class03175 var1) {
      return var1.N(this.L);
   }

   @Override
   public Optional<int[]> ai_() {
      return Optional.of(this.L);
   }
}
