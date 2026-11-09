package minecraft;

import java.util.List;
import java.util.Optional;

public class class04974 extends class04977 {
   public static final int N = 0;
   public static final int y = 1;
   public static final int L = 2;
   public static final int u = 3;
   public static final int n = 8;
   public static final int t = 26;
   public static final int G = 44;
   private static final int d = 98;
   public static final int l = 48;
   private final class07299 w;
   private final class00263 k;
   private final class00263 Y;
   private final class00263 Q;
   private final class05865 O = class05865.N();

   private List<class06584> P() {
      return List.of(this.j.method_5438(0), this.j.method_5438(1), this.j.method_5438(2));
   }

   public class04974(int var1, class08044 var2) {
      this(var1, var2, class05880.N);
   }

   public class04974(int var1, class08044 var2, class05880 var3) {
      this(var1, var2, var3, var2.z.method_73183());
   }

   private class04974(int var1, class08044 var2, class05880 var3, class07299 var4) {
      super(class05851.field_22484, var1, var2, var3, N(var4.method_8433()));
      this.w = var4;
      this.k = var4.method_8433().N(class00263.y);
      this.Y = var4.method_8433().N(class00263.L);
      this.Q = var4.method_8433().N(class00263.u);
      this.N(this.O).N(0);
   }

   private class02934 s() {
      return new class02934(this.j.method_5438(0), this.j.method_5438(1), this.j.method_5438(2));
   }

   @Override
   public void y(class06695 var1) {
      super.y(var1);
      if (this.w instanceof class04782) {
         boolean flag = this.L(0).R() && this.L(1).R() && this.L(2).R() && !this.L(this.m()).R();
         this.O.N(flag ? 1 : 0);
      }
   }

   @Override
   public boolean y(class06584 var1) {
      if (this.Y.N(var1) && !this.L(0).R()) {
         return true;
      } else {
         return this.k.N(var1) && !this.L(1).R() ? true : this.Q.N(var1) && !this.L(2).R();
      }
   }

   @Override
   public void E() {
      class02934 class02934 = this.s();
      Optional<class03729<class03278>> optional;
      if (this.w instanceof class04782 class04782) {
         optional = class04782.method_64577().N(class05838.M, class02934, class04782);
      } else {
         optional = Optional.empty();
      }

      optional.ifPresentOrElse(var2x -> {
         class06584 class06584 = var2x.y().method_8116(class02934, this.w.method_30349());
         this.v.N((class03729<?>)var2x);
         this.v.method_5447(0, class06584);
      }, () -> {
         this.v.N(null);
         this.v.method_5447(0, class06584.E);
      });
   }

   @Override
   public boolean N(class06584 var1, class06937 var2) {
      return var2.L != this.v && super.N(var1, var2);
   }

   private static class03275 N(class00272 var0) {
      class00263 class00263xx = var0.N(class00263.y);
      class00263 class00263x = var0.N(class00263.L);
      class00263 class00263xx = var0.N(class00263.u);
      return class03275.N().N(0, 8, 48, class00263x::N).N(1, 26, 48, class00263xx::N).N(2, 44, 48, class00263xx::N).N(3, 98, 48).N();
   }

   @Override
   protected boolean N(class00500 var1) {
      return var1.N(class00869.Ph);
   }

   @Override
   protected void N(class08036 var1, class06584 var2) {
      var2.N(var1, var2.c());
      this.v.N(var1, this.P());
      this.N(0);
      this.N(1);
      this.N(2);
      this.i.N_53((var0, var1x) -> var0.N(1044, var1x, 0));
   }

   private void N(int var1) {
      class06584 class06584 = this.j.method_5438(var1);
      if (!class06584.R()) {
         class06584.B(1);
         this.j.method_5447(var1, class06584);
      }
   }

   public boolean W() {
      return this.O.y() > 0;
   }
}
