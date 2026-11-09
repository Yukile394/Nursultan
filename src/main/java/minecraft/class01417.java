package minecraft;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import jerozgen.languagereload.access.IAdvancementsScreen;
import org.jspecify.annotations.Nullable;

public class class01417 extends class05096 implements class01700, IAdvancementsScreen {
   private static final class01894 Z = class01894.y("textures/gui/advancements/window.png");
   public static final int N = 252;
   public static final int y = 140;
   private static final int z = 9;
   private static final int U = 18;
   public static final int L = 234;
   public static final int u = 113;
   private static final int E = 8;
   private static final int W = 6;
   private static final int m = 256;
   private static final int P = 256;
   public static final int i = 16;
   public static final int R = 16;
   public static final int M = 14;
   public static final int B = 7;
   private static final double s = 16.0;
   private static final class00392 T = class00392.L("advancements.sad_label");
   private static final class00392 b = class00392.L("advancements.empty");
   private static final class00392 j = class00392.L("gui.advancements");
   private final class03686 v = new class03686(this);
   @Nullable
   private final class05096 n;
   private final class01707 t;
   private final Map<class03711, class05502> G = Maps.newLinkedHashMap();
   @Nullable
   private class05502 l;
   private boolean d;

   @Override
   public void L(class03734 var1) {
      class05502 class05502 = this.R(var1);
      if (class05502 != null) {
         class05502.N(var1);
      }
   }

   public class01417(class01707 var1) {
      this(var1, null);
   }

   public class01417(class01707 var1, @Nullable class05096 var2) {
      super(j);
      this.t = var1;
      this.n = var2;
   }

   @Nullable
   public class01387 i(class03734 var1) {
      class05502 class05502 = this.R(var1);
      return class05502 == null ? null : class05502.N(var1.y());
   }

   @Override
   public void u(class03734 var1) {
   }

   @Override
   public void y(class03734 var1) {
   }

   private void y(class01054 var1, int var2, int var3, int var4, int var5) {
      if (this.l != null) {
         var1.i().pushMatrix();
         var1.i().translate(var4 + 9, var5 + 18);
         var1.L();
         this.l.N(var1, var2 - var4 - 9, var3 - var5 - 18, var4, var5);
         var1.i().popMatrix();
      }

      if (this.G.size() > 1) {
         for (class05502 class05502 : this.G.values()) {
            if (class05502.N(var4, var5, var2, var3)) {
               var1.N(this.field_22793, class05502.u(), var2, var3);
            }
         }
      }
   }

   private void N(class01054 var1, int var2, int var3) {
      class05502 class05502 = this.l;
      if (class05502 == null) {
         var1.N(var2 + 9, var3 + 18, var2 + 9 + 234, var3 + 18 + 113, -16777216);
         int ix = var2 + 9 + 117;
         var1.N(this.field_22793, b, ix, var3 + 18 + 56 - 4, -1);
         var1.N(this.field_22793, T, ix, var3 + 18 + 113 - 9, -1);
      } else {
         class05502.y(var1, var2 + 9, var3 + 18);
      }
   }

   public void N(class01054 var1, int var2, int var3, int var4, int var5) {
      var1.N(class08394.Na, Z, var2, var3, 0.0F, 0.0F, 252, 140, 256, 256);
      if (this.G.size() > 1) {
         for (class05502 class05502x : this.G.values()) {
            class05502x.N(var1, var2, var3, var4, var5, class05502x == this.l);
         }

         for (class05502 class05502 : this.G.values()) {
            class05502.N(var1, var2, var3);
         }
      }

      var1.N(this.field_22793, this.l != null ? this.l.u() : j, var2 + 8, var3 + 6, -12566464, false);
   }

   @Override
   public void N(class03734 var1, class08019 var2) {
      class01387 class01387 = this.i(var1);
      if (class01387 != null) {
         class01387.N(var2);
      }
   }

   @Override
   public void N(class03734 var1) {
      class05502 class05502 = class05502.N(this.field_22787, this, this.G.size(), var1);
      if (class05502 != null) {
         this.G.put(var1.y(), class05502);
      }
   }

   @Override
   public void N() {
      this.G.clear();
      this.l = null;
   }

   @Override
   public void N(@Nullable class03711 var1) {
      this.l = this.G.get(var1);
   }

   @Override
   public void method_25426() {
      this.v.N(j, this.field_22793);
      this.G.clear();
      this.l = null;
      this.t.N(this);
      if (this.l == null && !this.G.isEmpty()) {
         class05502 class05502 = this.G.values().iterator().next();
         this.t.N(class05502.L().y(), true);
      } else {
         this.t.N(this.l == null ? null : this.l.L().y(), true);
      }

      this.v.y(class05362.method_46430(class05220.u, var1x -> this.method_25419()).N(200).N());
      this.v.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (((class05630)this.field_22787.i_7).a.N(var1)) {
         this.field_22787.N(null);
         ((class06220)this.field_22787.L_2).Z();
         return true;
      } else {
         return super.method_25404(var1);
      }
   }

   @Override
   public void method_48640() {
      this.v.N();
   }

   @Override
   public void method_25432() {
      this.t.N(null);
      class01683 class01683 = this.field_22787.NE();
      if (class01683 != null) {
         class01683.N(class07339.N());
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      int ix = (this.field_22789 - 252) / 2;
      int jx = (this.field_22790 - 140) / 2;
      var1.L();
      this.N(var1, ix, jx);
      var1.L();
      this.N(var1, ix, jx, var2, var3);
      if (this.d && this.l != null) {
         if (this.l.R() && this.l.M()) {
            var1.N(class06608.M);
         } else if (this.l.R()) {
            var1.N(class06608.R);
         } else if (this.l.M()) {
            var1.N(class06608.i);
         }
      }

      this.y(var1, var2, var3, ix, jx);
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.n);
   }

   @Override
   public boolean method_25403(class06613 var1, double var2, double var4) {
      if (var1.v() != 0) {
         this.d = false;
         return false;
      } else {
         if (!this.d) {
            this.d = true;
         } else if (this.l != null) {
            this.l.N(var2, var4);
         }

         return true;
      }
   }

   @Override
   public boolean method_25401(double var1, double var3, double var5, double var7) {
      if (this.l != null) {
         this.l.N(var5 * 16.0, var7 * 16.0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_25406(class06613 var1) {
      this.d = false;
      return super.method_25406(var1);
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (var1.v() == 0) {
         int ix = (this.field_22789 - 252) / 2;
         int jx = (this.field_22790 - 140) / 2;

         for (class05502 class05502 : this.G.values()) {
            if (class05502.N(ix, jx, var1.n(), var1.t())) {
               this.t.N(class05502.L().y(), true);
               break;
            }
         }
      }

      return super.method_25402(var1, var2);
   }

   @Nullable
   private class05502 R(class03734 var1) {
      class03734 class03734 = var1.u();
      return this.G.get(class03734.y());
   }

   public void languagereload_recreateWidgets() {
      Iterator<class05502> iterator = this.G.values().iterator();

      while (iterator.hasNext()) {
         iterator.next().languagereload_recreateWidgets();
      }
   }
}
