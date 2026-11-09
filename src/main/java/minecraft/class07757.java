package minecraft;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;

public final class class07757 implements class07023 {
   private static final int y = 24;
   public static final class01424<class07757> N = new class07727();
   private long[] L;

   @Override
   public byte L() {
      return 12;
   }

   public long[] M() {
      return this.L;
   }

   public class07757(long[] var1) {
      super();
      this.L = var1;
   }

   @Override
   public int size() {
      return this.L.length;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class07757 && Arrays.equals(this.L, ((class07757)var1).L);
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
      this.L = new long[0];
   }

   public class07757 N() {
      long[] along = new long[this.L.length];
      System.arraycopy(this.L, 0, along, 0, this.L.length);
      return new class07757(along);
   }

   @Override
   public class01424<class07757> u() {
      return N;
   }

   @Override
   public boolean y(int var1, class07709 var2) {
      if (var2 instanceof class07737 class07737) {
         this.L = ArrayUtils.add(this.L, var1, class07737.M());
         return true;
      } else {
         return false;
      }
   }

   public class07729 u(int var1) {
      long i = this.L[var1];
      this.L = ArrayUtils.remove(this.L, var1);
      return class07729.N(i);
   }

   @Override
   public int y() {
      return 24 + 8 * this.L.length;
   }

   @Override
   public void N(DataOutput var1) throws IOException {
      var1.writeInt(this.L.length);

      for (long i : this.L) {
         var1.writeLong(i);
      }
   }

   @Override
   public void N(class04836 var1) {
      var1.N(this);
   }

   @Override
   public boolean N(int var1, class07709 var2) {
      if (var2 instanceof class07737 class07737) {
         this.L[var1] = class07737.M();
         return true;
      } else {
         return false;
      }
   }

   public class07729 L(int var1) {
      return class07729.N(this.L[var1]);
   }

   @Override
   public class03154 N(class03175 var1) {
      return var1.N(this.L);
   }

   @Override
   public Optional<long[]> aj_() {
      return Optional.of(this.L);
   }
}
