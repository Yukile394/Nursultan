package minecraft;

import java.util.List;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public final class class00143 {
   public static final class02362<class00667, class00143> N = class02362.N((var0, var1) -> var1.N(var0), class00143::y);
   private final List<class01763> y;
   @Nullable
   private class00138 L;
   private int u;
   private final class07209 i;
   private final float R;
   private final boolean M;

   public void L(int var1) {
      this.u = var1;
   }

   static class01763[] L(class00667 var0) {
      class01763[] aclass01763 = new class01763[var0.E()];

      for (int ix = 0; ix < aclass01763.length; ix++) {
         aclass01763[ix] = class01763.L(var0);
      }

      return aclass01763;
   }

   public boolean L() {
      return this.u >= this.y.size();
   }

   public class07209 M() {
      return this.y.get(this.u).u();
   }

   public class00143(List<class01763> var1, class07209 var2, boolean var3) {
      super();
      this.y = var1;
      this.i = var2;
      this.R = var1.isEmpty() ? Float.MAX_VALUE : this.y.get(this.y.size() - 1).L(this.i);
      this.M = var3;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof class00143 class00143)
         ? false
         : this.u == class00143.u && this.L == class00143.L && this.M == class00143.M && this.i.equals(class00143.i) && this.y.equals(class00143.y);
   }

   @Override
   public String toString() {
      return "Path(length=" + this.y.size() + ")";
   }

   @Override
   public int hashCode() {
      return this.u + this.y.hashCode() * 31;
   }

   public class01763 B() {
      return this.y.get(this.u);
   }

   @Nullable
   public class01763 Z() {
      return this.u > 0 ? this.y.get(this.u - 1) : null;
   }

   public int i() {
      return this.y.size();
   }

   public class00143 m() {
      class00143 class00143 = new class00143(this.y, this.i, this.M);
      class00143.L = this.L;
      class00143.u = this.u;
      return class00143;
   }

   @Nullable
   public class00138 U() {
      return this.L;
   }

   public boolean z() {
      return this.M;
   }

   public class07209 u(int var1) {
      return this.y.get(var1).u();
   }

   @Nullable
   public class01763 u() {
      return !this.y.isEmpty() ? this.y.get(this.y.size() - 1) : null;
   }

   public static class00143 y(class00667 var0) {
      boolean flag = var0.readBoolean();
      int ix = var0.readInt();
      class07209 class07209 = var0.i();
      List list = var0.N_16(class01763::L);
      class00138 class00138 = class00138.y(var0);
      class00143 class00143 = new class00143(list, class07209, flag);
      class00143.L = class00138;
      class00143.u = ix;
      return class00143;
   }

   public void y(int var1) {
      if (this.y.size() > var1) {
         this.y.subList(var1, this.y.size()).clear();
      }
   }

   public boolean y() {
      return this.u <= 0;
   }

   public class07209 E() {
      return this.i;
   }

   public boolean N(@Nullable class00143 var1) {
      return var1 != null && this.y.equals(var1.y);
   }

   public void N() {
      this.u++;
   }

   static void N(class00667 var0, class01763[] var1) {
      var0.L(var1.length);
      class01763[] aclass01763 = var1;
      int ix = var1.length;

      for (int j = 0; j < ix; j++) {
         aclass01763[j].y(var0);
      }
   }

   public void N(int var1, class01763 var2) {
      this.y.set(var1, var2);
   }

   void N(class01763[] var1, class01763[] var2, Set<class04604> var3) {
      this.L = new class00138(var1, var2, var3);
   }

   public class06889 N(class07049 var1, int var2) {
      class01763 class01763 = this.y.get(var2);
      double d0 = class01763.N + (int)(var1.method_17681() + 1.0F) * 0.5;
      double d1 = class01763.y;
      double d2 = class01763.L + (int)(var1.method_17681() + 1.0F) * 0.5;
      return new class06889(d0, d1, d2);
   }

   public void N(class00667 var1) {
      if (this.L != null && !this.L.L().isEmpty()) {
         var1.writeBoolean(this.M);
         var1.writeInt(this.u);
         var1.N(this.i);
         var1.N_12(this.y, (var0, var1x) -> var1x.y(var0));
         this.L.N(var1);
      } else {
         throw new IllegalStateException("Missing debug data");
      }
   }

   public class06889 N(class07049 var1) {
      return this.N(var1, this.u);
   }

   public class01763 N(int var1) {
      return this.y.get(var1);
   }

   public float W() {
      return this.R;
   }

   public int R() {
      return this.u;
   }
}
