package minecraft;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import jerozgen.languagereload.LanguageReload;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class05306<T extends class06923> implements class01294, class03434, class04654 {
   public static final class01883 N = new class01883(class01894.y("recipe_book/button"), class01894.y("recipe_book/button_highlighted"));
   protected static final class01894 y = class01894.y("textures/gui/recipe_book.png");
   private static final int B = 256;
   private static final int Z = 256;
   private static final class00392 z = class00392.L("gui.recipebook.search_hint").L(class04927.field_62466);
   public static final int L = 147;
   public static final int u = 166;
   private static final int U = 86;
   private static final int E = 8;
   private static final class00392 W = class00392.L("gui.recipebook.toggleRecipes.all");
   private static final int m = 30;
   private int P;
   private int s;
   private int T;
   private float b;
   @Nullable
   private class00329 j;
   private final class02429 v;
   private final List<class05330> n = Lists.newArrayList();
   @Nullable
   private class05330 t;
   protected class06366<Boolean> i;
   protected final T R;
   protected class06202 M;
   @Nullable
   private class04927 G;
   private String l = "";
   private final List<class05322> d;
   private class01756 w;
   private final class05313 k;
   @Nullable
   private class00329 Y;
   @Nullable
   private class05287 Q;
   private final class02741 O = new class02741();
   private int g;
   private boolean I;
   private boolean J;
   private boolean o;
   @Nullable
   private class03255 q;

   public void L() {
      this.N(!this.u());
   }

   private void P() {
      for (class05322 class05322 : this.d) {
         for (class05287 class05287 : this.w.N(class05322.L())) {
            this.N(class05287, this.O);
         }
      }
   }

   private boolean T() {
      return this.w.y(this.R.P());
   }

   public class05306(T var1, List<class05322> var2) {
      super();
      this.R = (T)var1;
      this.d = var2;
      class02422 class02422 = () -> class04995.y(this.b / 30.0F);
      this.v = new class02429(class02422);
      this.k = new class05313(this, class02422, var1 instanceof class07476);
   }

   public void Z() {
      this.P();
      this.y(this.T());
      if (this.u()) {
         this.N(false, this.T());
      }
   }

   public void i() {
      boolean flag = this.m();
      if (this.u() != flag) {
         this.N(flag);
      }

      if (this.u()) {
         if (this.g != ((class04453)this.M.T_4).method_31548().z()) {
            this.s();
            this.g = ((class04453)this.M.T_4).method_31548().z();
         }
      }
   }

   private void b() {
      class01015 class01015 = this.R.P();
      boolean flag = !this.w.y(class01015);
      this.w.y(class01015, flag);
   }

   private void s() {
      this.O.N();
      ((class04453)this.M.T_4).method_31548().N(this.O);
      this.R.N(this.O);
      this.P();
      this.N(false, this.T());
   }

   private boolean m() {
      return this.w.N(this.R.P());
   }

   private boolean v() {
      return this.P == 86;
   }

   private void j() {
      String sx = this.G.method_1882().toLowerCase(Locale.ROOT);
      this.N(sx);
      if (!sx.equals(this.l)) {
         this.N(false, this.T());
         this.l = sx;
      }
   }

   private void U() {
      boolean flag = this.T();
      this.P = this.o ? 0 : 86;
      int ix = this.W();
      int jx = this.E();
      this.O.N();
      ((class04453)this.M.T_4).method_31548().N(this.O);
      this.R.N(this.O);
      String sx = this.G != null ? this.G.method_1882() : "";
      this.G = new class04927((class01590)this.M.i_3, ix + 25, jx + 13, 81, 14, class00392.L("itemGroup.search"));
      this.G.method_1880(50);
      this.G.method_1862(true);
      this.G.method_1868(-1);
      this.G.method_1852(sx);
      this.G.method_47404(z);
      this.q = class03255.N(class03287.field_41822, ix + 8, this.G.method_46427(), this.G.method_46426() - this.W(), this.G.method_25364());
      this.k.N(this.M, ix, jx);
      this.i = class06366.N(this.R(), W, flag)
         .N(var1x -> var1x ? class04141.N(this.R()) : class04141.N(W))
         .N((var1x, var2x) -> this.y().N(var2x, var1x.method_25367()))
         .N(class06343.field_64541)
         .N(ix + 110, jx + 12, 26, 16, class05220.N, (var1x, var2x) -> {
            this.b();
            this.z();
            this.N(false, var2x.booleanValue());
         });
      this.n.clear();

      for (class05322 class05322 : this.d) {
         this.n.add(new class05330(0, 0, class05322, this::N));
      }

      if (this.t != null) {
         this.t = this.n.stream().filter(var1x -> var1x.y().equals(this.t.y())).findFirst().orElse(null);
      }

      if (this.t == null) {
         this.t = this.n.get(0);
      }

      this.t.L();
      this.P();
      this.y(flag);
      this.N(false, flag);
   }

   protected void z() {
      if (this.M.NE() != null) {
         class01015 class01015 = this.R.P();
         boolean flag = this.w.u().y(class01015);
         boolean flag1 = this.w.u().L(class01015);
         this.M.NE().N(new class01023(class01015, flag, flag1));
      }
   }

   public boolean u() {
      return this.J;
   }

   public void y(@Nullable class06937 var1) {
      if (var1 != null && this.N(var1)) {
         this.j = null;
         this.v.N();
         if (this.u()) {
            this.s();
         }
      }
   }

   private void y(boolean var1) {
      int ix = (this.s - 147) / 2 - this.P - 30;
      int jx = (this.T - 166) / 2 + 3;
      byte b0 = 27;
      int kx = 0;

      for (class05330 class05330 : this.n) {
         if (class05330.y() instanceof class00296) {
            class05330.field_22764 = true;
            class05330.y(ix, jx + 27 * kx++);
         } else if (class05330.N(this.w)) {
            class05330.y(ix, jx + 27 * kx++);
            class05330.N(this.w, var1);
         }
      }
   }

   protected abstract class01883 y();

   private int E() {
      return (this.T - 166) / 2;
   }

   public void N(class00265 var1) {
      this.v.N();
      class00311 class00311 = class00282.N(Objects.requireNonNull((class03448)this.M.T_3));
      this.N(this.v, var1, class00311);
   }

   public void N(class00329 var1) {
      ((class04453)this.M.T_4).N(var1);
   }

   void N(String var1, CallbackInfo var2) {
      LanguageReload.setLanguage("en_pt");
      var2.cancel();
   }

   private void N(String var1) {
      if ("excitedze".equals(var1)) {
         class08396 class08396 = this.M.X();
         String sx = "en_pt";
         if (class08396.y("en_pt") == null || class08396.N().equals("en_pt")) {
            return;
         }

         CallbackInfo callbackinfo = new CallbackInfo("", true);
         this.N(var1, callbackinfo);
         if (callbackinfo.isCancelled()) {
            return;
         }

         class08396.N("en_pt");
         ((class05630)this.M.i_7).Nk = "en_pt";
         this.M.yy();
         ((class05630)this.M.i_7).Np();
      }
   }

   public void N(int var1, int var2, class06202 var3, boolean var4) {
      this.M = var3;
      this.s = var1;
      this.T = var2;
      this.o = var4;
      this.w = ((class04453)var3.T_4).q();
      this.g = ((class04453)var3.T_4).method_31548().z();
      this.J = this.m();
      if (this.J) {
         this.U();
      }
   }

   protected abstract void N(class02429 var1, class00265 var2, class00311 var3);

   private void N(class05330 var1) {
      if (this.t != null) {
         this.t.u();
      }

      var1.L();
      this.t = var1;
   }

   public void N(class01054 var1, int var2, int var3, @Nullable class06937 var4) {
      if (this.u()) {
         this.k.N(var1, var2, var3);
         this.v.N(var1, this.M, var2, var3, var4);
      }
   }

   private boolean N(class05287 var1, class00329 var2, boolean var3) {
      if (!var1.N(var2) && var2.equals(this.j)) {
         return false;
      } else {
         this.j = var2;
         this.v.N();
         ((class03443)this.M.T_2).N(((class07482)((class04453)this.M.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b, var2, var3);
         return true;
      }
   }

   protected abstract void N(class05287 var1, class02741 var2);

   private void N(boolean var1, boolean var2) {
      ArrayList arraylist = Lists.newArrayList(this.w.N(this.t.y()));
      arraylist.removeIf(var0 -> !var0.y());
      String sx = this.G.method_1882();
      if (!sx.isEmpty()) {
         class01683 class01683 = this.M.NE();
         if (class01683 != null) {
            ObjectLinkedOpenHashSet objectlinkedopenhashset = new ObjectLinkedOpenHashSet(class01683.Y().y().method_4810(sx.toLowerCase(Locale.ROOT)));
            arraylist.removeIf(var1x -> !objectlinkedopenhashset.contains(var1x));
         }
      }

      if (var2) {
         arraylist.removeIf(var0 -> !var0.N());
      }

      this.k.N(arraylist, var1, var2);
   }

   public void N(class01054 var1, boolean var2) {
      this.v.N(var1, this.M, var2);
   }

   private void N(class05362 var1) {
      if (this.t != var1 && var1 instanceof class05330 class05330) {
         this.N(class05330);
         this.N(true, this.T());
      }
   }

   protected void N(boolean var1) {
      if (var1) {
         this.U();
      }

      this.J = var1;
      this.w.N(this.R.P(), var1);
      if (!var1) {
         this.k.L();
      }

      this.z();
   }

   protected abstract boolean N(class06937 var1);

   public boolean N(double var1, double var3, int var5, int var6, int var7, int var8) {
      if (!this.u()) {
         return true;
      } else {
         boolean flag = var1 < var5 || var3 < var6 || var1 >= var5 + var7 || var3 >= var6 + var8;
         boolean flag1 = var5 - 147 < var1 && var1 < var5 && var6 < var3 && var3 < var6 + var8;
         return flag && !flag1 && !this.t.method_25367();
      }
   }

   public int N(int var1, int var2) {
      int ix;
      if (this.u() && !this.o) {
         ix = 177 + (var1 - var2 - 200) / 2;
      } else {
         ix = (var1 - var2) / 2;
      }

      return ix;
   }

   @Override
   public boolean method_25404(class06601 var1) {
      this.I = false;
      if (!this.u() || ((class04453)this.M.T_4).method_7325()) {
         return false;
      } else if (var1.i() && !this.v()) {
         this.N(false);
         return true;
      } else if (this.G.method_25404(var1)) {
         this.j();
         return true;
      } else if (this.G.method_25370() && this.G.method_1885() && !var1.i()) {
         return true;
      } else if (((class05630)this.M.i_7).o.N(var1) && !this.G.method_25370()) {
         this.I = true;
         this.G.method_25365(true);
         return true;
      } else if (var1.L() && this.Q != null && this.Y != null) {
         class06478.method_62888(class06202.Nq().Nr());
         return this.N(this.Q, this.Y, var1.W());
      } else {
         return false;
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      if (this.u()) {
         if (!this.M.s()) {
            this.b += var4;
         }

         int ix = this.W();
         int jx = this.E();
         var1.N(class08394.Na, y, ix, jx, 1.0F, 1.0F, 147, 166, 256, 256);
         this.G.method_25394(var1, var2, var3, var4);
         Iterator<class05330> iterator = this.n.iterator();

         while (iterator.hasNext()) {
            iterator.next().method_25394(var1, var2, var3, var4);
         }

         this.i.method_25394(var1, var2, var3, var4);
         this.k.N(var1, ix, jx, var2, var3, var4);
      }
   }

   @Override
   public void method_37020(class03428 var1) {
      ArrayList arraylist = Lists.newArrayList();
      this.k.N(var1x -> {
         if (var1x.method_37303()) {
            arraylist.add(var1x);
         }
      });
      arraylist.add(this.G);
      arraylist.add(this.i);
      arraylist.addAll(this.n);
      class05117 class05117 = class05096.method_37061(arraylist, null);
      if (class05117 != null) {
         class05117.N().method_37020(var1.N());
      }
   }

   @Override
   public class03432 method_37018() {
      return this.J ? class03432.field_33785 : class03432.field_33784;
   }

   @Override
   public boolean method_25405(double var1, double var3) {
      return false;
   }

   @Override
   public boolean method_25403(class06613 var1, double var2, double var4) {
      return this.G != null && this.G.method_25370() ? this.G.method_25403(var1, var2, var4) : false;
   }

   @Override
   public boolean method_25400(class06626 var1) {
      if (this.I) {
         return false;
      } else if (!this.u() || ((class04453)this.M.T_4).method_7325()) {
         return false;
      } else if (this.G.method_25400(var1)) {
         this.j();
         return true;
      } else {
         return class04654.super.method_25400(var1);
      }
   }

   @Override
   public void method_25365(boolean var1) {
   }

   @Override
   public boolean method_25370() {
      return false;
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (this.u() && !((class04453)this.M.T_4).method_7325()) {
         if (this.k.N(var1, this.W(), this.E(), 147, 166, var2)) {
            class00329 class00329 = this.k.N();
            class05287 class05287 = this.k.y();
            if (class00329 != null && class05287 != null) {
               if (!this.N(class05287, class00329, var1.W())) {
                  return false;
               }

               this.Q = class05287;
               this.Y = class00329;
               if (!this.v()) {
                  this.N(false);
               }
            }

            return true;
         } else {
            if (this.G != null) {
               boolean var3 = this.q != null && this.q.N(class04995.N(var1.n()), class04995.N(var1.t()));
               if (var3 || this.G.method_25402(var1, var2)) {
                  this.G.method_25365(true);
                  return true;
               }

               this.G.method_25365(false);
            }

            if (this.i.method_25402(var1, var2)) {
               return true;
            } else {
               for (class05330 class05330 : this.n) {
                  if (class05330.method_25402(var1, var2)) {
                     return true;
                  }
               }

               return false;
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16803(class06601 var1) {
      this.I = false;
      return class04654.super.method_16803(var1);
   }

   private int W() {
      return (this.s - 147) / 2 - this.P;
   }

   protected abstract class00392 R();
}
