package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.stream.Stream;
import net.fabricmc.fabric.mixin.transfer.BundleContentsAccessor;
import org.apache.commons.lang3.math.Fraction;

public final class class02830 implements class04830, BundleContentsAccessor {
   public static final class02830 N = new class02830(List.of());
   public static final Codec<class02830> y = class06584.y.listOf().flatXmap(class02830::N, var0 -> DataResult.success(var0.i));
   public static final class02362<class04247, class02830> L = class06584.z.N_33(class02389.N()).N_10(class02830::new, var0 -> var0.i);
   private static final Fraction B = Fraction.getFraction(1, 16);
   private static final int Z = -1;
   public static final int u = -1;
   final List<class06584> i;
   final Fraction R;
   final int M;

   public Iterable<class06584> L() {
      return this.i;
   }

   public boolean M() {
      return this.i.isEmpty();
   }

   class02830(List<class06584> var1, Fraction var2, int var3) {
      super();
      this.i = var1;
      this.R = var2;
      this.M = var3;
   }

   public class02830(List<class06584> var1) {
      this((List<class06584>)var1, y((List<class06584>)var1), -1);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class02830 class02830) ? false : this.R.equals(class02830.R) && class06584.N(this.i, class02830.i);
      }
   }

   @Override
   public String toString() {
      return "BundleContents" + this.i;
   }

   @Override
   public int hashCode() {
      return class06584.N(this.i);
   }

   public int B() {
      return this.M;
   }

   public boolean Z() {
      return this.M != -1;
   }

   public int i() {
      return this.i.size();
   }

   public Iterable<class06584> u() {
      return Lists.transform(this.i, class06584::t);
   }

   public static boolean y(class06584 var0) {
      return !var0.R() && var0.B().u();
   }

   private static Fraction y(List<class06584> var0) {
      Fraction fraction = Fraction.ZERO;

      for (class06584 class06584 : var0) {
         fraction = fraction.add(N(class06584).multiplyBy(Fraction.getFraction(class06584.c(), 1)));
      }

      return fraction;
   }

   public Stream<class06584> y() {
      return this.i.stream().map(class06584::t);
   }

   public int N() {
      int ix = this.i();
      int j = ix > 12 ? 11 : 12;
      int k = ix % 4;
      int l = k == 0 ? 0 : 4 - k;
      return Math.min(ix, j - l);
   }

   public class06584 N(int var1) {
      return this.i.get(var1);
   }

   private static DataResult<class02830> N(List<class06584> var0) {
      try {
         Fraction fraction = y(var0);
         return DataResult.success(new class02830(var0, fraction, -1));
      } catch (ArithmeticException arithmeticexception) {
         return DataResult.error(() -> "Excessive total bundle weight");
      }
   }

   static Fraction N(class06584 var0) {
      class02830 class02830 = var0.method_58694(class02484.D);
      if (class02830 != null) {
         return B.add(class02830.R());
      } else {
         return !var0.a_(class02484.Nd, class08588.L).N().isEmpty() ? Fraction.ONE : Fraction.getFraction(1, var0.U());
      }
   }

   public Fraction R() {
      return this.R;
   }
}
