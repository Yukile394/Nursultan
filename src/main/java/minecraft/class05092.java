package minecraft;

import com.mojang.logging.LogUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05092 extends class05407 {
   private static final Logger y = LogUtils.getLogger();
   private static final class00392 L = class00392.L("mco.selectServer.play");
   private final class05685 u;
   @Nullable
   private class04981 i;
   @Nullable
   private class00053 R;
   private final Map<class00082, class00073> M = new LinkedHashMap<>();
   private final long B;
   private boolean Z;
   private final class03271 z = new class03271(var1x -> {
      class06478 class06478 = this.method_37063(var1x);
   }, var1x -> this.method_37066(var1x), this::N, this::y);
   @Nullable
   private class05362 U;
   @Nullable
   private class03281 E;
   final class03686 N = new class03686(this);

   public class05096 L() {
      return this.u;
   }

   public class05092(class05685 var1, long var2, @Nullable class04981 var4, @Nullable class00053 var5) {
      super(class00392.i());
      this.u = var1;
      this.B = var2;
      this.i = var4;
      this.R = var5;
   }

   public class05092(class05685 var1, long var2) {
      this(var1, var2, null, null);
   }

   public class05092 Z() {
      class05092 class05092 = new class05092(this.u, this.B);
      class05092.Z = this.Z;
      return class05092;
   }

   public void i() {
      class05092 class05092 = this.N(this.i);
      this.field_22787.N(new class04708(this.Z(), new class04732(this.i, class05092)));
   }

   public void u() {
      class04601.<class00053>N(class05111::R, class04601.N(this::N, "Couldn't get realms region data")).thenAcceptAsync(var1 -> {
         this.R = var1;
         this.W();
      }, this.field_22787);
   }

   private void y(class03241 var1) {
      if (this.i != null && var1 instanceof class00061) {
         ((class00061)var1).L(this.i);
      }
   }

   public int y() {
      return this.N.L();
   }

   private void E() {
      if (this.i != null && this.U != null) {
         this.U.field_22763 = this.i.M();
         if (!this.U.field_22763 && this.i.R == class04961.field_19433) {
            this.U.method_47400(class04141.N(class04981.N));
         }
      }
   }

   public boolean N(long var1, String var3) {
      class05111 class05111 = class05111.N();

      try {
         List<class04950> list = class05111.N(var1, var3);
         if (this.i != null) {
            this.i.Z = list;
         } else {
            this.i = class05111.N(var1);
         }

         this.R();
         return true;
      } catch (class05097 class05097) {
         y.error("Couldn't invite user", class05097);
         return false;
      }
   }

   public class05092 N(class04981 var1) {
      class05092 class05092 = new class05092(this.u, this.B, var1, this.R);
      class05092.Z = this.Z;
      return class05092;
   }

   public void N(boolean var1) {
      class05092 class05092 = this.N(this.i);
      this.field_22787.N(new class04708(this.Z(), new class04691(this.i, class05092, var1, this.field_22787)));
   }

   public class05096 N(class05097 var1) {
      return new class04702(var1, this.u);
   }

   private void N(class03241 var1) {
      if (this.i != null && var1 instanceof class00061) {
         ((class00061)var1).y(this.i);
      }
   }

   public void N(long var1) {
      class04601.<class04981>N(var2 -> var2.N(var1), class04601.N(this::N, "Couldn't get own world")).thenAcceptAsync(var1x -> {
         this.i = var1x;
         this.W();
      }, this.field_22787);
   }

   public int N() {
      return this.N.u();
   }

   public void N(class00072 var1) {
      class00072 class00072 = this.i.z.get(this.i.T);
      var1.y.M = class00072.y.M;
      var1.y.B = class00072.y.B;
      class05111 class05111 = class05111.N();

      try {
         if (this.i.T != var1.N) {
            throw new class05097(class05124.u());
         }

         class05111.N(this.i.y, var1.N, var1.y, var1.L);
         this.i.z.put(this.i.T, var1);
         if (var1.y.u != class00072.y.u || var1.y() != class00072.y()) {
            class05685.u();
         }

         this.R();
      } catch (class05097 class05097) {
         y.error("Couldn't save slot settings", class05097);
         this.field_22787.N(new class04702(class05097, this));
         return;
      }

      this.field_22787.N(this);
   }

   public void N(String var1, String var2, class00050 var3, @Nullable class00082 var4) {
      String s = class05018.B(var2) ? "" : var2;
      String s1 = class05018.B(var1) ? "" : var1;
      class05111 class05111 = class05111.N();

      try {
         class00072 class00072 = this.i.z.get(this.i.T);
         class00082 class00082 = var3 == class00050.field_60228 ? var4 : null;
         class00081 class00081 = new class00081(var3, class00082);
         class05111.N(this.i.y, s1, s, class00081, class00072.N, class00072.y, class00072.L);
         this.i.d = class00081;
         this.i.u = var1;
         this.i.i = s;
         this.R();
      } catch (class05097 class05097) {
         y.error("Couldn't save settings", class05097);
         this.field_22787.N(new class04702(class05097, this));
         return;
      }

      this.field_22787.N(this);
   }

   @Override
   public void method_25426() {
      if (this.i == null) {
         this.N(this.B);
      }

      if (this.R == null) {
         this.u();
      }

      class05216 class05216 = class00392.L("mco.configure.world.loading");
      this.E = class03281.method_48623(this.z, this.field_22789)
         .N(
            new class08745(this.method_64506(), class08300.N, class05216),
            new class08745(this.method_64506(), class04710.y, class05216),
            new class08745(this.method_64506(), class04700.N, class05216),
            new class08745(this.method_64506(), class00083.N, class05216)
         )
         .N();
      this.E.method_71522(3, false);
      this.method_37063(this.E);
      class01885 class01885 = this.N.y(class01885.i().N(8));
      this.U = class01885.N(class05362.method_46430(L, var1x -> {
         this.method_25419();
         class05685.N(this.i, this);
      }).N(150).N());
      this.U.field_22763 = false;
      class01885.N(class05362.method_46430(class05220.U, var1x -> this.method_25419()).N());
      this.N.method_48206(var1x -> {
         var1x.method_48591(1);
         this.method_37063(var1x);
      });
      this.E.method_48987(0, false);
      this.method_48640();
      if (this.i != null && this.R != null) {
         this.W();
      }
   }

   @Override
   public boolean method_25404(class06601 var1) {
      return this.E.method_25404(var1) ? true : super.method_25404(var1);
   }

   @Override
   public void method_48640() {
      if (this.E != null) {
         this.E.method_48618(this.field_22789);
         this.E.method_49613();
         int ix = this.E.method_48202().L();
         class03255 class03255 = new class03255(0, ix, this.field_22789, this.field_22790 - this.N.y() - ix);
         this.z.N(class03255);
         this.N.y(ix);
         this.N.N();
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(class08394.Na, class05096.field_49896, 0, this.field_22790 - this.N.y() - 2, 0.0F, 0.0F, this.field_22789, 2, 32, 2);
   }

   @Override
   public void method_25419() {
      if (this.i != null) {
         class03241 class03241 = this.z.N();
         if (class03241 instanceof class00061) {
            ((class00061)class03241).L(this.i);
         }
      }

      this.field_22787.N(this.u);
      if (this.Z) {
         this.u.i();
      }
   }

   @Override
   protected void method_57735(class01054 var1) {
      var1.N(class08394.Na, class05213.i, 0, 0, 0.0F, 0.0F, this.field_22789, this.N.L(), 16, 16);
      this.method_57736(var1, 0, this.N.L(), this.field_22789, this.field_22790);
   }

   private void W() {
      if (this.i != null && this.R != null) {
         this.M.clear();

         for (class00065 class00065 : this.R.y()) {
            if (class00065.N() != class00082.field_60199) {
               this.M.put(class00065.N(), class00065.y());
            }
         }

         int ix = -1;
         if (this.E != null) {
            ix = this.E.method_71284().indexOf(this.z.N());
         }

         if (this.E != null) {
            this.method_37066(this.E);
         }

         this.E = this.method_37063(
            class03281.method_48623(this.z, this.field_22789)
               .N(
                  new class08300(this, Objects.requireNonNull(this.field_22787), this.i),
                  new class04710(this, this.field_22787, this.i),
                  new class04700(this, this.field_22787, this.i),
                  new class00083(this, this.field_22787, this.i, this.M)
               )
               .N()
         );
         this.method_25395(this.E);
         if (ix != -1) {
            this.E.method_48987(ix, false);
         }

         this.E.method_71522(3, !this.i.U);
         if (this.i.U) {
            this.E.method_71521(3, class04141.N(class00392.L("mco.configure.world.settings.expired")));
         } else {
            this.E.method_71521(3, null);
         }

         this.E();
         this.method_48640();
      }
   }

   public void R() {
      this.Z = true;
      if (this.E != null) {
         for (class03241 class03241 : this.E.method_71284()) {
            if (class03241 instanceof class00061) {
               ((class00061)class03241).N(this.i);
            }
         }
      }
   }
}
