package minecraft;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class07253 extends class00394 implements class08597 {
   private static final int u = 5;
   public static final int N = 48;
   public static final int y = 48;
   public static final String L = "author";
   private static final String i = "";
   private static final String R = "";
   private static final class07209 M = new class07209(0, 1, 0);
   private static final class00753 B = class00753.field_11176;
   private static final class06993 Z = class06993.field_11467;
   private static final class07111 m = class07111.field_11302;
   private static final boolean P = true;
   private static final boolean s = false;
   private static final boolean T = false;
   private static final boolean b = false;
   private static final boolean j = true;
   private static final float v = 1.0F;
   private static final long n = 0L;
   @Nullable
   private class01894 t;
   private String G = "";
   private String l = "";
   private class07209 d = M;
   private class00753 w = B;
   private class07111 k = class07111.field_11302;
   private class06993 Y = class06993.field_11467;
   private class08070 Q;
   private boolean O = true;
   private boolean g = false;
   private boolean I = false;
   private boolean J = false;
   private boolean o = true;
   private float q = 1.0F;
   private long K = 0L;

   public void L(class04782 var1) {
      class01207 class01207 = this.u(var1);
      if (class01207 != null) {
         this.N(var1, class01207);
      }
   }

   @Override
   public class08623 L() {
      class07209 class07209 = this.M();
      class00753 class00753 = this.B();
      int ix = class07209.method_10263();
      int jx = class07209.method_10260();
      int j1 = class07209.method_10264();
      int i2 = j1 + class00753.method_10264();
      int kx;
      int lx;
      switch (this.k) {
         case field_11300:
            kx = class00753.method_10263();
            lx = -class00753.method_10260();
            break;
         case field_11301:
            kx = -class00753.method_10263();
            lx = class00753.method_10260();
            break;
         default:
            kx = class00753.method_10263();
            lx = class00753.method_10260();
      }

      int i1;
      int k1;
      int l1;
      int j2;
      switch (this.Y) {
         case field_11463:
            i1 = lx < 0 ? ix : ix + 1;
            k1 = kx < 0 ? jx + 1 : jx;
            l1 = i1 - lx;
            j2 = k1 + kx;
            break;
         case field_11464:
            i1 = kx < 0 ? ix : ix + 1;
            k1 = lx < 0 ? jx : jx + 1;
            l1 = i1 - kx;
            j2 = k1 - lx;
            break;
         case field_11465:
            i1 = lx < 0 ? ix + 1 : ix;
            k1 = kx < 0 ? jx : jx + 1;
            l1 = i1 + lx;
            j2 = k1 - kx;
            break;
         default:
            i1 = kx < 0 ? ix + 1 : ix;
            k1 = lx < 0 ? jx + 1 : jx;
            l1 = i1 + kx;
            j2 = k1 + lx;
      }

      return class08623.N(i1, j1, k1, l1, i2, j2);
   }

   public boolean L(boolean var1) {
      if (this.t != null && this.z instanceof class04782 class04782) {
         class07209 class07209 = this.d().method_10081(this.d);
         return N(class04782, this.t, class07209, this.w, this.O, this.G, var1, List.of());
      } else {
         return false;
      }
   }

   public class07209 M() {
      return this.d;
   }

   public float P() {
      return this.q;
   }

   public boolean T() {
      if (this.Q != class08070.field_12695) {
         return false;
      } else {
         class07209 class07209xx = this.d();
         byte b0 = 80;
         class07209 class07209x = new class07209(class07209xx.method_10263() - 80, this.z.method_31607(), class07209xx.method_10260() - 80);
         class07209 class07209xx = new class07209(class07209xx.method_10263() + 80, this.z.method_31600(), class07209xx.method_10260() + 80);
         Stream<class07209> stream = this.N(class07209x, class07209xx);
         return N(class07209xx, stream)
            .filter(
               var2x -> {
                  int ix = var2x.U() - var2x.B();
                  int jx = var2x.E() - var2x.Z();
                  int kx = var2x.W() - var2x.z();
                  if (ix > 1 && jx > 1 && kx > 1) {
                     this.d = new class07209(
                        var2x.B() - class07209xx.method_10263() + 1, var2x.Z() - class07209xx.method_10264() + 1, var2x.z() - class07209xx.method_10260() + 1
                     );
                     this.w = new class00753(ix - 1, jx - 1, kx - 1);
                     this.method_5431();
                     class00500 class00500 = this.z.method_8320(class07209xx);
                     this.z.method_8413(class07209xx, class00500, class00500, 3);
                     return true;
                  } else {
                     return false;
                  }
               }
            )
            .isPresent();
      }
   }

   public class07253(class07209 var1, class00500 var2) {
      super(class00404.field_11895, var1, var2);
      this.Q = var2.L(class07714.y);
   }

   public class00753 B() {
      return this.w;
   }

   public class07111 Z() {
      return this.k;
   }

   public void i(boolean var1) {
      this.J = var1;
   }

   public boolean b() {
      return this.Q != class08070.field_12695 ? false : this.L(true);
   }

   public long s() {
      return this.K;
   }

   public boolean n() {
      return this.I;
   }

   public boolean m() {
      return this.g;
   }

   public boolean o() {
      return this.o;
   }

   public boolean t() {
      return this.J;
   }

   public boolean v() {
      if (this.Q == class08070.field_12697 && !this.z.method_8608() && this.t != null) {
         class01224 class01224 = ((class04782)this.z).method_14183();

         try {
            return class01224.y(this.t).isPresent();
         } catch (class00719 class00719) {
            return false;
         }
      } else {
         return false;
      }
   }

   public void j() {
      if (this.t != null) {
         ((class04782)this.z).method_14183().u(this.t);
      }
   }

   private void q() {
      if (this.z != null) {
         class07209 class07209 = this.d();
         class00500 class00500 = this.z.method_8320(class07209);
         if (class00500.N(class00869.sh)) {
            this.z.method_8652(class07209, class00500.y(class07714.y, this.Q), 2);
         }
      }
   }

   public String U() {
      return this.l;
   }

   public class06993 z() {
      return this.Y;
   }

   public void u(boolean var1) {
      this.I = var1;
   }

   public String u() {
      return this.t == null ? "" : this.t.toString();
   }

   @Nullable
   private class01207 u(class04782 var1) {
      return this.t == null ? null : var1.method_14183().y(this.t).orElse(null);
   }

   public void y(boolean var1) {
      this.g = var1;
   }

   public boolean y(class04782 var1) {
      class01207 class01207 = this.u(var1);
      if (class01207 == null) {
         return false;
      } else {
         this.N(class01207);
         return true;
      }
   }

   public void y(String var1) {
      this.l = var1;
   }

   public static class06069 y(long var0) {
      return var0 == 0L ? class06069.y(class07536.L()) : class06069.y(var0);
   }

   @Override
   public class08592 y() {
      if (this.Q != class08070.field_12695 && this.Q != class08070.field_12697) {
         return class08592.field_55994;
      } else if (this.Q == class08070.field_12695 && this.J) {
         return class08592.field_55996;
      } else {
         return this.Q != class08070.field_12695 && !this.o ? class08592.field_55994 : class08592.field_55995;
      }
   }

   public class08070 E() {
      return this.Q;
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.N(var1.N("name", ""));
      this.G = var1.N("author", "");
      this.l = var1.N("metadata", "");
      int ix = class04995.N(var1.N("posX", M.method_10263()), -48, 48);
      int jx = class04995.N(var1.N("posY", M.method_10264()), -48, 48);
      int kx = class04995.N(var1.N("posZ", M.method_10260()), -48, 48);
      this.d = new class07209(ix, jx, kx);
      int lx = class04995.N(var1.N("sizeX", B.method_10263()), 0, 48);
      int i1 = class04995.N(var1.N("sizeY", B.method_10264()), 0, 48);
      int j1 = class04995.N(var1.N("sizeZ", B.method_10260()), 0, 48);
      this.w = new class00753(lx, i1, j1);
      this.Y = var1.<class06993>N("rotation", class06993.field_56670).orElse(Z);
      this.k = var1.<class07111>N("mirror", class07111.field_56669).orElse(m);
      this.Q = var1.<class08070>N("mode", class08070.field_56673).orElse(class08070.field_12696);
      this.O = var1.N("ignoreEntities", true);
      this.g = var1.N("strict", false);
      this.I = var1.N("powered", false);
      this.J = var1.N("showair", false);
      this.o = var1.N("showboundingbox", true);
      this.q = var1.N("integrity", 1.0F);
      this.K = var1.N("seed", 0L);
      this.q();
   }

   private void N(class01207 var1) {
      this.G = !class05018.y(var1.y()) ? var1.y() : "";
      this.w = var1.N();
      this.method_5431();
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      var1.N("name", this.u());
      var1.N("author", this.G);
      var1.N("metadata", this.l);
      var1.N("posX", this.d.method_10263());
      var1.N("posY", this.d.method_10264());
      var1.N("posZ", this.d.method_10260());
      var1.N("sizeX", this.w.method_10263());
      var1.N("sizeY", this.w.method_10264());
      var1.N("sizeZ", this.w.method_10260());
      var1.N("rotation", class06993.field_56670, this.Y);
      var1.N("mirror", class07111.field_56669, this.k);
      var1.N("mode", class08070.field_56673, this.Q);
      var1.N("ignoreEntities", this.O);
      var1.N("strict", this.g);
      var1.N("powered", this.I);
      var1.N("showair", this.J);
      var1.N("showboundingbox", this.o);
      var1.N("integrity", this.q);
      var1.N("seed", this.K);
   }

   private void N(class04782 var1, class01207 var2) {
      this.N(var2);
      class01233 class01233 = new class01233().N(this.k).N(this.Y).N(this.O).y(this.g);
      if (this.q < 1.0F) {
         class01233.y().N(new class01201(class04995.N(this.q, 0.0F, 1.0F))).N(y(this.K));
      }

      class07209 class07209 = this.d().method_10081(this.d);
      if (class07529.K) {
         class07209.method_10097(class07209, class07209.method_10081(this.w)).forEach(var1x -> var1.method_8652(var1x, class00869.EK.W(), 2));
      }

      var2.N(var1, class07209, class07209, class01233, y(this.K), 2 | (this.g ? 816 : 0));
   }

   public void N(class07111 var1) {
      this.k = var1;
   }

   public void N(class06993 var1) {
      this.Y = var1;
   }

   public void N(class08070 var1) {
      this.Q = var1;
      class00500 class00500 = this.z.method_8320(this.d());
      if (class00500.N(class00869.sh)) {
         this.z.method_8652(this.d(), class00500.y(class07714.y, var1), 2);
      }
   }

   public void N(@Nullable String var1) {
      this.N(class05018.y(var1) ? null : class01894.L(var1));
   }

   public void N(boolean var1) {
      this.O = var1;
   }

   public void N(@Nullable class01894 var1) {
      this.t = var1;
   }

   public void N(class07438 var1) {
      this.G = var1.method_74861();
   }

   public void N(class07209 var1) {
      this.d = var1;
   }

   public void N(class00753 var1) {
      this.w = var1;
   }

   private Stream<class07209> N(class07209 var1, class07209 var2) {
      return class07209.method_20437(var1, var2)
         .filter(var1x -> this.z.method_8320(var1x).N(class00869.sh))
         .map(this.z::method_8321)
         .filter(var0 -> var0 instanceof class07253)
         .map(var0 -> (class07253)var0)
         .filter(var1x -> var1x.Q == class08070.field_12699 && Objects.equals(this.t, var1x.t))
         .map(class00394::d);
   }

   private static Optional<class05163> N(class07209 var0, Stream<class07209> var1) {
      Iterator iterator = var1.iterator();
      if (!iterator.hasNext()) {
         return Optional.empty();
      } else {
         class07209 class07209 = (class07209)iterator.next();
         class05163 class05163 = new class05163(class07209);
         if (iterator.hasNext()) {
            iterator.forEachRemaining(class05163::N);
         } else {
            class05163.N(var0);
         }

         return Optional.of(class05163);
      }
   }

   public void N(long var1) {
      this.K = var1;
   }

   public static boolean N(class04782 var0, class01894 var1, class07209 var2, class00753 var3, boolean var4, String var5, boolean var6, List<class00891> var7) {
      class01224 class01224 = var0.method_14183();

      class01207 class01207;
      try {
         class01207 = class01224.N(var1);
      } catch (class00719 class00719) {
         return false;
      }

      class01207.N(var0, var2, var3, !var4, Stream.concat(var7.stream(), Stream.of(class00869.EK)).toList());
      class01207.N(var5);
      if (var6) {
         try {
            return class01224.L(var1);
         } catch (class00719 class00719x) {
            return false;
         }
      } else {
         return true;
      }
   }

   public boolean N(class04782 var1) {
      if (this.Q == class08070.field_12697 && this.t != null) {
         class01207 class01207 = var1.method_14183().y(this.t).orElse(null);
         if (class01207 == null) {
            return false;
         } else if (class01207.N().equals(this.w)) {
            this.N(var1, class01207);
            return true;
         } else {
            this.N(class01207);
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean N(class08036 var1) {
      if (!var1.method_7338()) {
         return false;
      } else {
         if (var1.method_73183().method_8608()) {
            var1.method_7303(this);
         }

         return true;
      }
   }

   public void N(float var1) {
      this.q = var1;
   }

   public class07269 i() {
      return class07269.N(this);
   }

   @Override
   public class07001 N(class01929 var1) {
      return this.u(var1);
   }

   public boolean W() {
      return this.O;
   }

   public boolean R() {
      return this.t != null;
   }

   public void R(boolean var1) {
      this.o = var1;
   }
}
