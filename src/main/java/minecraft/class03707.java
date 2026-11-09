package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public final class class03707 {
   private static final Map<String, class03707> E = new Object2ObjectArrayMap();
   public static final Codec<class03707> N = Codec.stringResolver(var0 -> var0.W, E::get);
   public static final class03707 y = new class03707(
      "oak",
      0.1F,
      Optional.empty(),
      Optional.empty(),
      Optional.of(class03168.M),
      Optional.of(class03168.T),
      Optional.of(class03168.I),
      Optional.of(class03168.H)
   );
   public static final class03707 L = new class03707(
      "spruce", 0.5F, Optional.of(class03168.v), Optional.of(class03168.n), Optional.of(class03168.m), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final class03707 u = new class03707(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(class03168.k), Optional.of(class03168.Y), Optional.empty(), Optional.empty()
   );
   public static final class03707 i = new class03707("azalea", Optional.empty(), Optional.of(class03168.w), Optional.empty());
   public static final class03707 R = new class03707("birch", Optional.empty(), Optional.of(class03168.E), Optional.of(class03168.K));
   public static final class03707 M = new class03707("jungle", Optional.of(class03168.j), Optional.of(class03168.b), Optional.empty());
   public static final class03707 B = new class03707("acacia", Optional.empty(), Optional.of(class03168.W), Optional.empty());
   public static final class03707 Z = new class03707("cherry", Optional.empty(), Optional.of(class03168.Q), Optional.of(class03168.X));
   public static final class03707 z = new class03707("dark_oak", Optional.of(class03168.B), Optional.empty(), Optional.empty());
   public static final class03707 U = new class03707("pale_oak", Optional.of(class03168.z), Optional.empty(), Optional.empty());
   private final String W;
   private final float m;
   private final Optional<class05946<class03238<?, ?>>> P;
   private final Optional<class05946<class03238<?, ?>>> s;
   private final Optional<class05946<class03238<?, ?>>> T;
   private final Optional<class05946<class03238<?, ?>>> b;
   private final Optional<class05946<class03238<?, ?>>> j;
   private final Optional<class05946<class03238<?, ?>>> v;

   public class03707(
      String var1, Optional<class05946<class03238<?, ?>>> var2, Optional<class05946<class03238<?, ?>>> var3, Optional<class05946<class03238<?, ?>>> var4
   ) {
      this(var1, 0.0F, var2, Optional.empty(), var3, Optional.empty(), var4, Optional.empty());
   }

   public class03707(
      String var1,
      float var2,
      Optional<class05946<class03238<?, ?>>> var3,
      Optional<class05946<class03238<?, ?>>> var4,
      Optional<class05946<class03238<?, ?>>> var5,
      Optional<class05946<class03238<?, ?>>> var6,
      Optional<class05946<class03238<?, ?>>> var7,
      Optional<class05946<class03238<?, ?>>> var8
   ) {
      super();
      this.W = var1;
      this.m = var2;
      this.P = var3;
      this.s = var4;
      this.T = var5;
      this.b = var6;
      this.j = var7;
      this.v = var8;
      E.put(var1, this);
   }

   public boolean N(class04782 var1, class08088 var2, class07209 var3, class00500 var4, class06069 var5) {
      class05946<class03238<?, ?>> class05946 = this.N(var5);
      if (class05946 != null) {
         class03556 var7 = var1.method_30349().L(class04227.Nh).N(class05946).orElse(null);
         if (var7 != null) {
            for (int ix = 0; ix >= -1; ix--) {
               for (int jx = 0; jx >= -1; jx--) {
                  if (N(var4, var1, var3, ix, jx)) {
                     class03238 class03238x = (class03238)var7.N();
                     class00500 class00500x = class00869.N.W();
                     var1.method_8652(var3.method_10069(ix, 0, jx), class00500x, 260);
                     var1.method_8652(var3.method_10069(ix + 1, 0, jx), class00500x, 260);
                     var1.method_8652(var3.method_10069(ix, 0, jx + 1), class00500x, 260);
                     var1.method_8652(var3.method_10069(ix + 1, 0, jx + 1), class00500x, 260);
                     if (class03238x.N(var1, var2, var5, var3.method_10069(ix, 0, jx))) {
                        return true;
                     }

                     var1.method_8652(var3.method_10069(ix, 0, jx), var4, 260);
                     var1.method_8652(var3.method_10069(ix + 1, 0, jx), var4, 260);
                     var1.method_8652(var3.method_10069(ix, 0, jx + 1), var4, 260);
                     var1.method_8652(var3.method_10069(ix + 1, 0, jx + 1), var4, 260);
                     return false;
                  }
               }
            }
         }
      }

      class05946<class03238<?, ?>> class05946x = this.N(var5, this.N(var1, var3));
      if (class05946x == null) {
         return false;
      } else {
         class03556 class03556 = var1.method_30349().L(class04227.Nh).N(class05946x).orElse(null);
         if (class03556 == null) {
            return false;
         } else {
            class03238 class03238 = (class03238)class03556.N();
            class00500 class00500 = var1.method_8316(var3).B();
            var1.method_8652(var3, class00500, 260);
            if (class03238.N(var1, var2, var5, var3)) {
               if (var1.method_8320(var3) == class00500) {
                  var1.method_8413(var3, var4, class00500, 2);
               }

               return true;
            } else {
               var1.method_8652(var3, var4, 260);
               return false;
            }
         }
      }
   }

   private boolean N(class07284 var1, class07209 var2) {
      for (class07209 class07209 : class07218.method_10097(
         var2.method_10074().method_10076(2).method_10088(2), var2.method_10084().method_10077(2).method_10089(2)
      )) {
         if (var1.method_8320(class07209).N(class01210.p)) {
            return true;
         }
      }

      return false;
   }

   private static boolean N(class00500 var0, class07290 var1, class07209 var2, int var3, int var4) {
      class00891 class00891 = var0.i();
      return var1.method_8320(var2.method_10069(var3, 0, var4)).N(class00891)
         && var1.method_8320(var2.method_10069(var3 + 1, 0, var4)).N(class00891)
         && var1.method_8320(var2.method_10069(var3, 0, var4 + 1)).N(class00891)
         && var1.method_8320(var2.method_10069(var3 + 1, 0, var4 + 1)).N(class00891);
   }

   @Nullable
   private class05946<class03238<?, ?>> N(class06069 var1, boolean var2) {
      if (var1.z() < this.m) {
         if (var2 && this.v.isPresent()) {
            return this.v.get();
         }

         if (this.b.isPresent()) {
            return this.b.get();
         }
      }

      return var2 && this.j.isPresent() ? this.j.get() : this.T.orElse(null);
   }

   @Nullable
   private class05946<class03238<?, ?>> N(class06069 var1) {
      return this.s.isPresent() && var1.z() < this.m ? this.s.get() : this.P.orElse(null);
   }
}
