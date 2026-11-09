package minecraft;

import Nursultan.class11352;
import Nursultan.class11938;
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map;
import java.util.function.Predicate;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08044 implements class06695, class07061 {
   public static final int N = 5;
   public static final int y = 36;
   public static final int u = 9;
   public static final int i = 40;
   public static final int R = 41;
   public static final int M = 42;
   public static final int B = -1;
   public static final Int2ObjectMap<class07085> Z = new Int2ObjectArrayMap(
      Map.of(
         class07085.field_6166.N(36),
         class07085.field_6166,
         class07085.field_6172.N(36),
         class07085.field_6172,
         class07085.field_6174.N(36),
         class07085.field_6174,
         class07085.field_6169.N(36),
         class07085.field_6169,
         40,
         class07085.field_6171,
         41,
         class07085.field_48824,
         42,
         class07085.field_55946
      )
   );
   private static final class00392 E = class00392.L("container.inventory");
   private final class00743<class06584> W = class00743.method_10213(36, class06584.E);
   private int m;
   public final class08036 z;
   public final class08599 U;
   private int P;

   public static int L() {
      return 9;
   }

   public static boolean L(int var0) {
      return var0 >= 0 && var0 < 9;
   }

   public void L(class06584 var1) {
      this.N(this.M());
      if (!this.W.get(this.m).R()) {
         int ix = this.i();
         if (ix != -1) {
            this.W.set(ix, this.W.get(this.m));
         }
      }

      this.W.set(this.m, var1);
   }

   public int M() {
      for (int ix = 0; ix < 9; ix++) {
         int j = (this.m + ix) % 9;
         if (this.W.get(j).R()) {
            return j;
         }
      }

      for (int k = 0; k < 9; k++) {
         int l = (this.m + k) % 9;
         if (!this.W.get(l).I()) {
            return l;
         }
      }

      return this.m;
   }

   public boolean M(class06584 var1) {
      return this.N(-1, var1);
   }

   @Override
   public class00392 method_5477() {
      return E;
   }

   public class08044(class08036 var1, class08599 var2) {
      super();
      this.z = var1;
      this.U = var2;
   }

   public void B(class06584 var1) {
      this.N(var1, true);
   }

   public void B() {
      for (int ix = 0; ix < this.W.size(); ix++) {
         class06584 class06584 = this.method_5438(ix);
         if (!class06584.R()) {
            class06584.N(this.z.method_73183(), this.z, ix == this.m ? class07085.field_6173 : null);
         }
      }
   }

   public void Z(class06584 var1) {
      for (int var2 = 0; var2 < this.W.size(); var2++) {
         if (this.W.get(var2) == var1) {
            this.W.set(var2, class06584.E);
            return;
         }
      }

      ObjectIterator<class07085> objectiterator = Z.values().iterator();

      while (objectiterator.hasNext()) {
         class07085 class07085 = (class07085)objectiterator.next();
         if (this.U.N(class07085) == var1) {
            this.U.N(class07085, class06584.E);
            return;
         }
      }
   }

   public void Z() {
      for (int ix = 0; ix < this.W.size(); ix++) {
         class06584 class06584 = this.W.get(ix);
         if (!class06584.R()) {
            this.z.method_7329(class06584, true, false);
            this.W.set(ix, class06584.E);
         }
      }

      this.U.N((class07438)this.z);
   }

   public int i() {
      for (int ix = 0; ix < this.W.size(); ix++) {
         if (this.W.get(ix).R()) {
            return ix;
         }
      }

      return -1;
   }

   public static boolean i(class06584 var0) {
      return !var0.m() && !var0.I() && !var0.L(class02484.B);
   }

   private int U(class06584 var1) {
      int ix = this.R(var1);
      if (ix == -1) {
         ix = this.i();
      }

      return ix == -1 ? var1.c() : this.y(ix, var1);
   }

   public int z() {
      return this.P;
   }

   public boolean z(class06584 var1) {
      for (class06584 class06584 : this) {
         if (!class06584.R() && class06584.L(class06584, var1)) {
            return true;
         }
      }

      return false;
   }

   public class02596 u(int var1) {
      return new class02596(var1, this.method_5438(var1).t());
   }

   public class00743<class06584> u() {
      return this.W;
   }

   public int u(class06584 var1) {
      for (int ix = 0; ix < this.W.size(); ix++) {
         if (!this.W.get(ix).R() && class06584.L(var1, this.W.get(ix))) {
            return ix;
         }
      }

      return -1;
   }

   private int y(int var1, class06584 var2) {
      int ix = var2.c();
      class06584 class06584 = this.method_5438(var1);
      if (class06584.R()) {
         class06584 = var2.L(0);
         this.method_5447(var1, class06584);
      }

      int j = this.a_(class06584) - class06584.c();
      int k = Math.min(ix, j);
      if (k == 0) {
         return ix;
      } else {
         ix -= k;
         class06584.M(k);
         class06584.u(5);
         return ix;
      }
   }

   public class06584 y() {
      return this.W.get(this.m);
   }

   public void y(int var1) {
      this.N(this.M());
      class06584 class06584 = this.W.get(this.m);
      this.W.set(this.m, this.W.get(var1));
      this.W.set(var1, class06584);
   }

   public boolean y(Predicate<class06584> var1) {
      for (class06584 class06584 : this) {
         if (var1.test(class06584)) {
            return true;
         }
      }

      return false;
   }

   public boolean N(class03530<class06581> var1) {
      for (class06584 class06584 : this) {
         if (!class06584.R() && class06584.N(var1)) {
            return true;
         }
      }

      return false;
   }

   private void N(int var1, class06584 var2, CallbackInfo var3) {
      class11938.L().L(class11352.N());
   }

   public void N(int var1) {
      if (!L(var1)) {
         throw new IllegalArgumentException("Invalid selected slot");
      } else {
         this.m = var1;
      }
   }

   public class06584 N(class06584 var1) {
      return this.W.set(this.m, var1);
   }

   private void N(CallbackInfo var1) {
      class11938.L().L(class11352.N());
   }

   public int N() {
      return this.m;
   }

   public class06584 N(boolean var1) {
      class06584 class06584 = this.y();
      return class06584.R() ? class06584.E : this.method_5434(this.m, var1 ? class06584.c() : 1);
   }

   public void N(class02741 var1) {
      for (class06584 class06584 : this.W) {
         var1.N(class06584);
      }
   }

   public void N(class08044 var1) {
      for (int ix = 0; ix < this.method_5439(); ix++) {
         this.method_5447(ix, var1.method_5438(ix));
      }

      this.N(var1.N());
   }

   public void N(class08294<class08332> var1) {
      for (int ix = 0; ix < this.W.size(); ix++) {
         class06584 class06584 = this.W.get(ix);
         if (!class06584.R()) {
            var1.N(new class08332(ix, class06584));
         }
      }
   }

   public boolean N(int var1, class06584 var2) {
      if (var2.R()) {
         return false;
      } else {
         try {
            if (var2.m()) {
               if (var1 == -1) {
                  var1 = this.i();
               }

               if (var1 >= 0) {
                  this.W.set(var1, var2.M());
                  this.W.get(var1).u(5);
                  return true;
               } else if (this.z.method_56992()) {
                  var2.i(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int ix;
               do {
                  ix = var2.c();
                  if (var1 == -1) {
                     var2.i(this.U(var2));
                  } else {
                     var2.i(this.y(var1, var2));
                  }
               } while (!var2.R() && var2.c() < ix);

               if (var2.c() == ix && this.z.method_56992()) {
                  var2.i(0);
                  return true;
               } else {
                  return var2.c() < ix;
               }
            }
         } catch (Throwable throwable) {
            class07080 class07080 = class07080.N(throwable, "Adding item to inventory");
            class07074 class07074 = class07080.N("Item being added");
            class07074.N("Item ID", class06581.N(var2.B()));
            class07074.N("Item data", var2.P());
            class07074.N("Item name", () -> var2.d().getString());
            throw new class07878(class07080);
         }
      }
   }

   public int N(class03556<class06581> var1, class06584 var2) {
      for (int ix = 0; ix < this.W.size(); ix++) {
         class06584 class06584 = this.W.get(ix);
         if (!class06584.R() && class06584.N(var1) && i(class06584) && (var2.R() || class06584.L(var2, class06584))) {
            return ix;
         }
      }

      return -1;
   }

   public void N(class06584 var1, boolean var2) {
      while (!var1.R()) {
         int ix = this.R(var1);
         if (ix == -1) {
            ix = this.i();
         }

         if (ix == -1) {
            this.z.method_7328(var1, false);
            break;
         }

         int j = var1.U() - this.method_5438(ix).c();
         if (this.N(ix, var1.N(j)) && var2) {
            class08036 class08036 = this.z;
            if (class08036 instanceof class04770) {
               ((class04770)class08036).field_13987.method_14364(this.u(ix));
            }
         }
      }
   }

   private boolean N(class06584 var1, class06584 var2) {
      return !var1.R() && class06584.L(var1, var2) && var1.E() && var1.c() < this.a_(var1);
   }

   public void N(class08310<class08332> var1) {
      this.W.clear();

      for (class08332 class08332 : var1) {
         if (class08332.N(this.W.size())) {
            this.method_5447(class08332.N(), class08332.y());
         }
      }
   }

   public int N(Predicate<class06584> var1, int var2, class06695 var3) {
      int ix = 0;
      boolean flag = var2 == 0;
      ix += class06686.N(this, var1, var2 - ix, flag);
      ix += class06686.N(var3, var1, var2 - ix, flag);
      class06584 class06584 = ((class07482)this.z.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M();
      ix += class06686.N(class06584, var1, var2 - ix, flag);
      if (class06584.R()) {
         ((class07482)this.z.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(class06584.E);
      }

      return ix;
   }

   @Override
   public boolean method_5443(class08036 var1) {
      return true;
   }

   @Override
   public void method_5448() {
      this.W.clear();
      this.U.y();
   }

   @Override
   public void method_5447(int var1, class06584 var2) {
      this.N(var1, var2, null);
      if (var1 < this.W.size()) {
         this.W.set(var1, var2);
      }

      class07085 class07085 = (class07085)Z.get(var1);
      if (class07085 != null) {
         this.U.N(class07085, var2);
      }
   }

   @Override
   public void method_5431() {
      this.N(null);
      this.P++;
   }

   @Override
   public class06584 method_5434(int var1, int var2) {
      if (var1 < this.W.size()) {
         return class06686.N(this.W, var1, var2);
      } else {
         class07085 class07085 = (class07085)Z.get(var1);
         if (class07085 != null) {
            class06584 class06584 = this.U.N(class07085);
            if (!class06584.R()) {
               return class06584.N(var2);
            }
         }

         return class06584.E;
      }
   }

   @Override
   public class06584 method_5441(int var1) {
      if (var1 < this.W.size()) {
         class06584 class06584 = this.W.get(var1);
         this.W.set(var1, class06584.E);
         return class06584;
      } else {
         class07085 class07085 = (class07085)Z.get(var1);
         return class07085 != null ? this.U.N(class07085, class06584.E) : class06584.E;
      }
   }

   @Override
   public boolean method_5442() {
      for (class06584 class06584 : this.W) {
         if (!class06584.R()) {
            return false;
         }
      }

      ObjectIterator objectiterator = Z.values().iterator();

      while (objectiterator.hasNext()) {
         class07085 class07085 = (class07085)objectiterator.next();
         if (!this.U.N(class07085).R()) {
            return false;
         }
      }

      return true;
   }

   public int R(class06584 var1) {
      if (this.N(this.method_5438(this.m), var1)) {
         return this.m;
      } else if (this.N(this.method_5438(40), var1)) {
         return 40;
      } else {
         for (int ix = 0; ix < this.W.size(); ix++) {
            if (this.N(this.W.get(ix), var1)) {
               return ix;
            }
         }

         return -1;
      }
   }

   @Override
   public class06584 method_5438(int var1) {
      if (var1 < this.W.size()) {
         return this.W.get(var1);
      } else {
         class07085 class07085 = (class07085)Z.get(var1);
         return class07085 != null ? this.U.N(class07085) : class06584.E;
      }
   }

   @Override
   public int method_5439() {
      return this.W.size() + Z.size();
   }
}
