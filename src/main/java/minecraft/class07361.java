package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07361 extends class08050 {
   private static final Logger W = LogUtils.getLogger();
   @Nullable
   private volatile class05795 m;
   private volatile class00549 P = class00549.L;
   private final List<class07001> s = Lists.newArrayList();
   @Nullable
   private class03322 T;
   @Nullable
   private class02999 b;
   private final class05688<class00891> j;
   private final class05688<class04651> v;

   @Override
   public class05474 w() {
      return (class05474)(this.d() ? class02999.y : this);
   }

   @Override
   public class04327<class00891> P() {
      return this.j;
   }

   public class04310<class00891> K() {
      return N(this.j);
   }

   @Override
   public class00500 method_8320(class07209 var1) {
      int i = var1.method_10264();
      if (this.method_31601(i)) {
         return class00869.mh.W();
      } else {
         class00554 class00554 = this.y(this.method_31602(i));
         return class00554.L() ? class00869.N.W() : class00554.N(var1.method_10263() & 15, i & 15, var1.method_10260() & 15);
      }
   }

   @Override
   public class04688 method_8316(class07209 var1) {
      int i = var1.method_10264();
      if (this.method_31601(i)) {
         return class04684.N.M();
      } else {
         class00554 class00554 = this.y(this.method_31602(i));
         return class00554.L() ? class04684.N.M() : class00554.y(var1.method_10263() & 15, i & 15, var1.method_10260() & 15);
      }
   }

   public class07361(class07321 var1, class07371 var2, class05474 var3, class06614 var4, @Nullable class03032 var5) {
      this(var1, var2, null, new class05688<>(), new class05688<>(), var3, var4, var5);
   }

   public class07361(
      class07321 var1,
      class07371 var2,
      @Nullable class00554[] var3,
      class05688<class00891> var4,
      class05688<class04651> var5,
      class05474 var6,
      class06614 var7,
      @Nullable class03032 var8
   ) {
      super(var1, var2, var6, var7, 0L, var3, var8);
      this.j = var4;
      this.v = var5;
   }

   public Map<class07209, class00394> J() {
      return this.z;
   }

   public class04310<class04651> V() {
      return N(this.v);
   }

   @Override
   public class04327<class04651> s() {
      return this.v;
   }

   @Nullable
   @Override
   public class02999 l() {
      return this.b;
   }

   public List<class07001> o() {
      return this.s;
   }

   public class03322 g() {
      if (this.T == null) {
         this.T = new class03322(this.method_31605(), this.method_31607());
      }

      return this.T;
   }

   public Map<class07209, class07001> q() {
      return Collections.unmodifiableMap(this.Z);
   }

   @Override
   public void u(class07209 var1) {
      if (!this.method_31606(var1)) {
         class08050.N(this.y, this.method_31602(var1.method_10264())).add(R(var1));
      }
   }

   public void y(class07001 var1) {
      this.s.add(var1);
   }

   @Override
   public class00549 E() {
      return this.P;
   }

   public void N(class03322 var1) {
      this.T = var1;
   }

   @Override
   public void N(class07209 var1) {
      this.z.remove(var1);
      this.Z.remove(var1);
   }

   @Override
   public class08094 N(long var1) {
      return new class08094(this.j.N(var1), this.v.N(var1));
   }

   private static <T> class04310<T> N(class05688<T> var0) {
      return new class04310<>(var0.y());
   }

   public void N(@Nullable class02999 var1) {
      this.b = var1;
   }

   public void N(class05795 var1) {
      this.m = var1;
   }

   public static class07209 N(short var0, int var1, class07321 var2) {
      int i = class01296.N(var2.B, var0 & 15);
      int jx = class01296.N(var1, var0 >>> 4 & 15);
      int k = class01296.N(var2.Z, var0 >>> 8 & 15);
      return new class07209(i, jx, k);
   }

   @Nullable
   @Override
   public class00500 N(class07209 var1, class00500 var2, int var3) {
      int i = var1.method_10263();
      int jx = var1.method_10264();
      int k = var1.method_10260();
      if (this.method_31601(jx)) {
         return class00869.mh.W();
      } else {
         int l = this.method_31602(jx);
         class00554 class00554 = this.y(l);
         boolean flag = class00554.L();
         if (flag && var2.N(class00869.N)) {
            return var2;
         } else {
            int i1 = class01296.y(i);
            int j1 = class01296.y(jx);
            int k1 = class01296.y(k);
            class00500 class00500 = class00554.N(i1, j1, k1, var2);
            if (this.P.N(class00549.U)) {
               boolean var14 = class00554.L();
               if (var14 != flag) {
                  this.m.N(var1, var14);
               }

               if (class05015.N(class00500, var2)) {
                  this.B.N(this, i1, jx, k1);
                  this.m.N(var1);
               }
            }

            EnumSet<class07830> enumset1 = this.E().i();
            EnumSet<class07830> enumset = null;

            for (class07830 class07830x : enumset1) {
               if (this.M.get(class07830x) == null) {
                  if (enumset == null) {
                     enumset = EnumSet.noneOf(class07830.class);
                  }

                  enumset.add(class07830x);
               }
            }

            if (enumset != null) {
               class07841.N(this, enumset);
            }

            for (class07830 class07830x : enumset1) {
               this.M.get(class07830x).N(i1, jx, k1, var2);
            }

            return class00500;
         }
      }
   }

   @Override
   public void N(class04748 var1, class04932 var2) {
      if (this.l() != null && var2.y()) {
         class05163 class05163 = var2.N();
         class05474 class05474 = this.w();
         if (class05163.Z() < class05474.method_31607() || class05163.E() > class05474.method_31600()) {
            return;
         }
      }

      super.N(var1, var2);
   }

   public void N(class00549 var1) {
      this.P = var1;
      if (this.b != null && var1.N(this.b.N())) {
         this.N(null);
      }

      this.Z();
   }

   @Nullable
   @Override
   public class07001 N(class07209 var1, class01929 var2) {
      class00394 class00394 = this.method_8321(var1);
      return class00394 != null ? class00394.y_2(var2) : this.Z.get(var1);
   }

   @Override
   public void N(class07049 var1) {
      if (!var1.method_5765()) {
         try (class04495 class04495 = new class04495(var1.method_71370(), W)) {
            class08303 class08303 = class08303.N(class04495, var1.method_56673());
            var1.method_5662(class08303);
            this.y(class08303.y());
         }
      }
   }

   @Override
   public void N(class00394 var1) {
      this.Z.remove(var1.d());
      this.z.put(var1.d(), var1);
   }

   @Override
   public void N(ShortList var1, int var2) {
      class08050.N(this.y, var2).addAll(var1);
   }

   public static short R(class07209 var0) {
      int i = var0.method_10263();
      int jx = var0.method_10264();
      int k = var0.method_10260();
      int l = i & 15;
      int i1 = jx & 15;
      int j1 = k & 15;
      return (short)(l | i1 << 4 | j1 << 8);
   }

   @Nullable
   public class03322 O() {
      return this.T;
   }

   @Nullable
   @Override
   public class00394 method_8321(class07209 var1) {
      return this.z.get(var1);
   }

   @Override
   public class03556<class00780> method_16359(int var1, int var2, int var3) {
      if (this.W().N(class00549.R)) {
         return super.method_16359(var1, var2, var3);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }
}
