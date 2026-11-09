package minecraft;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import org.jspecify.annotations.Nullable;

public class class08002 extends class08005 {
   private static final double N = 0.15;
   @Nullable
   private class08372<class07049> y;
   @Nullable
   private class07211 L;
   private int u;
   private double R;
   private double M;
   private double B;

   private void L() {
      this.method_31472();
      this.method_73183().method_32888(class01194.P, this.method_73189(), class01164.N(this));
   }

   @Override
   public void method_31471(class07276 var1) {
      super.method_31471(var1);
      this.method_18799(var1.Z());
   }

   @Override
   public void method_5982() {
      if (this.method_73183().y() == class07086.field_5801) {
         this.method_31472();
      }
   }

   @Override
   protected void method_5693(class04293 var1) {
   }

   @Override
   public void method_5773() {
      super.method_5773();
      class07049 class07049 = !this.method_73183().method_8608() ? class08372.N(this.y, this.method_73183()) : null;
      class07089 class07089 = null;
      if (!this.method_73183().method_8608()) {
         if (class07049 == null) {
            this.y = null;
         }

         if (class07049 == null || !class07049.method_5805() || class07049 instanceof class08036 && class07049.method_7325()) {
            this.method_56990();
         } else {
            this.R = class04995.N(this.R * 1.025, -1.0, 1.0);
            this.M = class04995.N(this.M * 1.025, -1.0, 1.0);
            this.B = class04995.N(this.B * 1.025, -1.0, 1.0);
            class06889 class06889x = this.method_18798();
            this.method_18799(class06889x.y((this.R - class06889x.M) * 0.2, (this.M - class06889x.B) * 0.2, (this.B - class06889x.Z) * 0.2));
         }

         class07089 = class08038.N(this, this::N);
      }

      class06889 class06889 = this.method_18798();
      this.method_33574(this.method_73189().i(class06889));
      this.method_61409();
      if (this.field_51994 != null && this.field_51994.i()) {
         this.method_60698();
      }

      if (class07089 != null && this.method_5805() && class07089.N() != class07113.field_1333) {
         this.y(class07089);
      }

      class08038.N(this, 0.5F);
      if (this.method_73183().method_8608()) {
         this.method_73183()
            .method_8406(
               class07107.n, this.method_23317() - class06889.M, this.method_23318() - class06889.B + 0.15, this.method_23321() - class06889.Z, 0.0, 0.0, 0.0
            );
      } else if (class07049 != null) {
         if (this.u > 0) {
            this.u--;
            if (this.u == 0) {
               this.N(this.L == null ? null : this.L.z(), class07049);
            }
         }

         if (this.L != null) {
            class07209 class07209x = this.method_24515();
            class07185 class07185 = this.L.z();
            if (this.method_73183().method_8515(class07209x.method_10093(this.L), this)) {
               this.N(class07185, class07049);
            } else {
               class07209 class07209x = class07049.method_24515();
               if (class07185 == class07185.field_11048 && class07209x.method_10263() == class07209x.method_10263()
                  || class07185 == class07185.field_11051 && class07209x.method_10260() == class07209x.method_10260()
                  || class07185 == class07185.field_11052 && class07209x.method_10264() == class07209x.method_10264()) {
                  this.N(class07185, class07049);
               }
            }
         }
      }
   }

   @Override
   public class04911 method_5634() {
      return class04911.field_15251;
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      this.method_5783(class04909.wx, 1.0F, 1.0F);
      var1.method_65096(class07107.M, this.method_23317(), this.method_23318(), this.method_23321(), 15, 0.2, 0.2, 0.2, 0.0);
      this.L();
      return true;
   }

   @Override
   protected boolean method_61410() {
      return !this.method_31481();
   }

   @Override
   public boolean method_5809() {
      return false;
   }

   @Override
   protected double method_7490() {
      return 0.04;
   }

   @Override
   public float method_5718() {
      return 1.0F;
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      if (this.y != null) {
         var1.N("Target", class01487.N, this.y.L());
      }

      var1.y("Dir", class07211.field_57037, this.L);
      var1.N("Steps", this.u);
      var1.N("TXD", this.R);
      var1.N("TYD", this.M);
      var1.N("TZD", this.B);
   }

   @Override
   public boolean method_5863() {
      return true;
   }

   @Override
   public boolean method_5640(double var1) {
      return var1 < 16384.0;
   }

   @Override
   public boolean method_5643(class07072 var1) {
      return true;
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.u = var1.N("Steps", 0);
      this.R = var1.N("TXD", 0.0);
      this.M = var1.N("TYD", 0.0);
      this.B = var1.N("TZD", 0.0);
      this.L = var1.<class07211>N("Dir", class07211.field_57037).orElse(null);
      this.y = class08372.N(var1, "Target");
   }

   public class08002(class07299 var1, class07438 var2, class07049 var3, class07185 var4) {
      this(class07078.yE, var1);
      this.L(var2);
      class06889 class06889 = var2.method_5829().R();
      this.method_5808(class06889.M, class06889.B, class06889.Z, this.method_36454(), this.method_36455());
      this.y = class08372.N(var3);
      this.L = class07211.field_11036;
      this.N(var4, var3);
   }

   public class08002(class07078<? extends class08002> var1, class07299 var2) {
      super(var1, var2);
      this.field_5960 = true;
   }

   @Nullable
   private class07211 y() {
      return this.L;
   }

   @Override
   protected boolean N(class07049 var1) {
      return super.N(var1) && !var1.field_5960;
   }

   private void N(@Nullable class07185 var1, @Nullable class07049 var2) {
      double d0 = 0.5;
      class07209 class07209x;
      if (var2 == null) {
         class07209x = this.method_24515().method_10074();
      } else {
         d0 = var2.method_17682() * 0.5;
         class07209x = class07209.method_49637(var2.method_23317(), var2.method_23318() + d0, var2.method_23321());
      }

      double d1 = class07209x.method_10263() + 0.5;
      double d2 = class07209x.method_10264() + d0;
      double d3 = class07209x.method_10260() + 0.5;
      class07211 class07211 = null;
      if (!class07209x.method_19769(this.method_73189(), 2.0)) {
         class07209 class07209x = this.method_24515();
         ArrayList arraylist = Lists.newArrayList();
         if (var1 != class07185.field_11048) {
            if (class07209x.method_10263() < class07209x.method_10263() && this.method_73183().R(class07209x.method_10078())) {
               arraylist.add(class07211.field_11034);
            } else if (class07209x.method_10263() > class07209x.method_10263() && this.method_73183().R(class07209x.method_10067())) {
               arraylist.add(class07211.field_11039);
            }
         }

         if (var1 != class07185.field_11052) {
            if (class07209x.method_10264() < class07209x.method_10264() && this.method_73183().R(class07209x.method_10084())) {
               arraylist.add(class07211.field_11036);
            } else if (class07209x.method_10264() > class07209x.method_10264() && this.method_73183().R(class07209x.method_10074())) {
               arraylist.add(class07211.field_11033);
            }
         }

         if (var1 != class07185.field_11051) {
            if (class07209x.method_10260() < class07209x.method_10260() && this.method_73183().R(class07209x.method_10072())) {
               arraylist.add(class07211.field_11035);
            } else if (class07209x.method_10260() > class07209x.method_10260() && this.method_73183().R(class07209x.method_10095())) {
               arraylist.add(class07211.field_11043);
            }
         }

         class07211 = class07211.y(this.field_5974);
         if (arraylist.isEmpty()) {
            for (int i = 5; !this.method_73183().R(class07209x.method_10093(class07211)) && i > 0; i--) {
               class07211 = class07211.y(this.field_5974);
            }
         } else {
            class07211 = (class07211)arraylist.get(this.field_5974.y(arraylist.size()));
         }

         d1 = this.method_23317() + class07211.P();
         d2 = this.method_23318() + class07211.s();
         d3 = this.method_23321() + class07211.T();
      }

      this.N(class07211);
      double d6 = d1 - this.method_23317();
      double d7 = d2 - this.method_23318();
      double d4 = d3 - this.method_23321();
      double d5 = Math.sqrt(d6 * d6 + d7 * d7 + d4 * d4);
      if (d5 == 0.0) {
         this.R = 0.0;
         this.M = 0.0;
         this.B = 0.0;
      } else {
         this.R = d6 / d5 * 0.15;
         this.M = d7 / d5 * 0.15;
         this.B = d4 / d5 * 0.15;
      }

      this.field_64356 = true;
      this.u = 10 + this.field_5974.y(5) * 10;
   }

   private void N(@Nullable class07211 var1) {
      this.L = var1;
   }

   @Override
   protected void N(class07089 var1) {
      super.N(var1);
      this.L();
   }

   @Override
   protected void N(class06183 var1) {
      super.N(var1);
      ((class04782)this.method_73183()).method_65096(class07107.l, this.method_23317(), this.method_23318(), this.method_23321(), 2, 0.2, 0.2, 0.2, 0.0);
      this.method_5783(class04909.wS, 1.0F, 1.0F);
   }

   @Override
   protected void N(class06145 var1) {
      super.N(var1);
      class07049 class07049x = var1.L();
      class07049 class07049x = this.z();
      class07438 class07438x = class07049x instanceof class07438 ? (class07438)class07049x : null;
      class07072 class07072 = this.method_48923().N(this, class07438x);
      if (class07049x.method_64420(class07072, 4.0F)) {
         if (this.method_73183() instanceof class04782 class04782) {
            class07323.N(class04782, class07049x, class07072);
         }

         if (class07049x instanceof class07438 class07438x) {
            class07438x.method_37222(new class07055(class07047.d, 200), (class07049)MoreObjects.firstNonNull(class07049x, this));
         }
      }
   }
}
