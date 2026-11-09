package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class class02733 {
   public static final class02362<ByteBuf, class02733> N = class02389.N(class02733::N, class02733::Z);
   private static final class02733[] y = class07536.N(() -> {
      class02733[] aclass02733 = new class02733[48];
      N(new class02733(class07211.field_11036, class07211.field_11043, class02759.field_52681), aclass02733);
      return aclass02733;
   });
   private final class07211 L;
   private final class07211 u;
   private final class07211 i;
   private final class02759 R;
   private final int M;
   private final List<class07211> B;
   private final List<class07211> Z;
   private final List<class07211> z;
   private final Map<class07211, class02733> U = new EnumMap<>(class07211.class);
   private final Map<class07211, class02733> E = new EnumMap<>(class07211.class);
   private final Map<class02759, class02733> W = new EnumMap<>(class02759.class);

   public class02733 L(class07211 var1) {
      return var1.z() == this.L.z() ? this : this.U.get(var1);
   }

   public class07211 L() {
      return this.L;
   }

   public List<class07211> M() {
      return this.Z;
   }

   private class02733(class07211 var1, class07211 var2, class02759 var3) {
      super();
      this.L = var1;
      this.u = var2;
      this.R = var3;
      this.M = y(var1, var2, var3);
      class07211 class07211 = class07211.N(var2.E().method_10259(var1.E()), null);
      Objects.requireNonNull(class07211);
      if (this.R == class02759.field_52682) {
         this.i = class07211;
      } else {
         this.i = class07211.b();
      }

      this.B = List.of(this.u.b(), this.u, this.i, this.i.b(), this.L.b(), this.L);
      this.Z = this.B.stream().filter(var1x -> var1x.z() != this.L.z()).toList();
      this.z = this.B.stream().filter(var1x -> var1x.z() == this.L.z()).toList();
   }

   @Override
   public String toString() {
      return "[up=" + this.L + ",front=" + this.u + ",sideBias=" + this.R + "]";
   }

   public List<class07211> B() {
      return this.z;
   }

   public int Z() {
      return this.M;
   }

   public class02759 i() {
      return this.R;
   }

   public class02733 u(class07211 var1) {
      class02733 class02733 = this.y(var1);
      return this.u == class02733.i ? class02733.N() : class02733;
   }

   public class07211 u() {
      return this.i;
   }

   public class07211 y() {
      return this.u;
   }

   protected static int y(class07211 var0, class07211 var1, class02759 var2) {
      if (var0.z() == var1.z()) {
         throw new IllegalStateException("Up-vector and front-vector can not be on the same axis");
      } else {
         int ix;
         if (var0.z() == class07185.field_11052) {
            ix = var1.z() == class07185.field_11048 ? 1 : 0;
         } else {
            ix = var1.z() == class07185.field_11052 ? 1 : 0;
         }

         int j = ix << 1 | var1.i().ordinal();
         return ((var0.ordinal() << 2) + j << 1) + var2.ordinal();
      }
   }

   public class02733 y(class07211 var1) {
      return this.U.get(var1);
   }

   private static class02733 N(class02733 var0, class02733[] var1) {
      if (var1[var0.Z()] != null) {
         return var1[var0.Z()];
      } else {
         var1[var0.Z()] = var0;

         for (class02759 class02759 : class02759.values()) {
            var0.W.put(class02759, N(new class02733(var0.L, var0.u, class02759), var1));
         }

         for (class07211 class07211xx : class07211.values()) {
            class07211 class07211x = var0.L;
            if (class07211xx == var0.L) {
               class07211x = var0.u.b();
            }

            if (class07211xx == var0.L.b()) {
               class07211x = var0.u;
            }

            var0.U.put(class07211xx, N(new class02733(class07211x, class07211xx, var0.R), var1));
         }

         for (class07211 class07211x : class07211.values()) {
            class07211 class07211xx = var0.u;
            if (class07211x == var0.u) {
               class07211xx = var0.L.b();
            }

            if (class07211x == var0.u.b()) {
               class07211xx = var0.L;
            }

            var0.E.put(class07211x, N(new class02733(class07211x, class07211xx, var0.R), var1));
         }

         return var0;
      }
   }

   public class02733 N(class02759 var1) {
      return this.W.get(var1);
   }

   public class02733 N() {
      return this.N(this.R.N());
   }

   public class02733 N(class07211 var1) {
      return this.E.get(var1);
   }

   public static class02733 N(class07211 var0, class07211 var1, class02759 var2) {
      return y[y(var0, var1, var2)];
   }

   public static class02733 N(int var0) {
      return y[var0];
   }

   public static class02733 N(class06069 var0) {
      return class07536.N((class02733[])y, var0);
   }

   public List<class07211> R() {
      return this.B;
   }
}
