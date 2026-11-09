package minecraft;

import Nursultan.class11390;
import Nursultan.class11938;
import baritone.utils.accessor.IFireworkRocketEntity;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08006 extends class08005 implements class05640, IFireworkRocketEntity {
   private static final class02131<class06584> N = class03289.N(class08006.class, class02154.B);
   private static final class02131<OptionalInt> y = class03289.N(class08006.class, class02154.n);
   private static final class02131<Boolean> L = class03289.N(class08006.class, class02154.U);
   private static final int u = 0;
   private static final int R = 0;
   private static final boolean M = false;
   private int B = 0;
   private int Z = 0;
   @Nullable
   private class07438 z;
   private Double U;

   @Override
   public class06584 L() {
      return this.field_6011.N(N);
   }

   private void L(class04782 var1) {
      float f = 0.0F;
      List<class02827> list = this.R();
      if (!list.isEmpty()) {
         f = 5.0F + list.size() * 2;
      }

      if (f > 0.0F) {
         if (this.z != null) {
            this.z.method_64397(var1, this.method_48923().N(this, this.z()), 5.0F + list.size() * 2);
         }

         double d0 = 5.0;
         class06889 class06889x = this.method_73189();

         for (class07438 class07438 : this.method_73183().N(class07438.class, this.method_5829().M(5.0))) {
            if (class07438 != this.z && !(this.method_5858(class07438) > 25.0)) {
               boolean flag = false;

               for (int i = 0; i < 2; i++) {
                  class06889 class06889x = new class06889(class07438.method_23317(), class07438.method_23323(0.5 * i), class07438.method_23321());
                  if (this.method_73183().N(new class05862(class06889x, class06889x, class05849.field_17558, class05835.field_1348, this)).N()
                     == class07113.field_1333) {
                     flag = true;
                     break;
                  }
               }

               if (flag) {
                  float f1 = f * (float)Math.sqrt((5.0 - this.method_5739(class07438)) / 5.0);
                  class07438.method_64397(var1, this.method_48923().N(this, this.z()), f1);
               }
            }
         }
      }
   }

   private static class06584 M() {
      return new class06584(class06570.GJ);
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(N, M());
      var1.N(y, OptionalInt.empty());
      var1.N(L, false);
   }

   @Override
   public void method_5773() {
      this.N(null);
      super.method_5773();
      class07089 class07089;
      if (this.i()) {
         if (this.z == null) {
            this.field_6011.N(y).ifPresent(var1x -> {
               class07049 class07049 = this.method_73183().method_8469(var1x);
               if (class07049 instanceof class07438) {
                  this.z = (class07438)class07049;
               }
            });
         }

         if (this.z != null) {
            class06889 class06889xxx;
            if (this.z.method_6128()) {
               class06889 class06889x = this.z.method_5720();
               double d0 = this.N(1.5);
               double d1 = 0.1;
               class06889 class06889xx = this.z.method_18798();
               this.z
                  .method_18799(
                     class06889xx.y(
                        class06889x.M * 0.1 + (class06889x.M * this.N(1.5) - class06889xx.M) * 0.5,
                        class06889x.B * 0.1 + (class06889x.B * this.N(1.5) - class06889xx.B) * 0.5,
                        class06889x.Z * 0.1 + (class06889x.Z * this.N(1.5) - class06889xx.Z) * 0.5
                     )
                  );
               class06889xxx = this.z.method_40123(class06570.GJ);
            } else {
               class06889xxx = class06889.L;
            }

            this.method_5814(this.z.method_23317() + class06889xxx.M, this.z.method_23318() + class06889xxx.B, this.z.method_23321() + class06889xxx.Z);
            this.method_18799(this.z.method_18798());
         }

         class07089 = class08038.N(this, this::N);
      } else {
         if (!this.y()) {
            double d2 = this.field_5976 ? 1.0 : 1.15;
            this.method_18799(this.method_18798().u(d2, 1.0, d2).y(0.0, 0.04, 0.0));
         }

         class06889 class06889 = this.method_18798();
         class07089 = class08038.N(this, this::N);
         this.method_5784(class07451.field_6308, class06889);
         this.method_61409();
         this.method_18799(class06889);
      }

      if (!this.field_5960 && this.method_5805() && class07089.N() != class07113.field_1333) {
         this.y(class07089);
         this.field_64356 = true;
      }

      this.T();
      if (this.B == 0 && !this.method_5701()) {
         this.method_73183()
            .method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.UO, class04911.field_15256, 3.0F, 1.0F);
      }

      this.B++;
      if (this.method_73183().method_8608() && this.B % 2 < 2) {
         this.method_73183()
            .method_8406(
               class07107.g,
               this.method_23317(),
               this.method_23318(),
               this.method_23321(),
               this.field_5974.E() * 0.05,
               -this.method_18798().B * 0.5,
               this.field_5974.E() * 0.05
            );
      }

      if (this.B > this.Z && this.method_73183() instanceof class04782 class04782) {
         this.y(class04782);
      }
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Life", this.B);
      var1.N("LifeTime", this.Z);
      var1.N("FireworksItem", class06584.y, this.L());
      var1.N("ShotAtAngle", this.field_6011.N(L).booleanValue());
   }

   @Override
   public boolean method_5727(double var1, double var3, double var5) {
      return super.method_5727(var1, var3, var5) && !this.i();
   }

   @Override
   public boolean method_5640(double var1) {
      return var1 < 4096.0 && !this.i();
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.B = var1.N("Life", 0);
      this.Z = var1.N("LifeTime", 0);
      this.field_6011.N(N, var1.<class06584>N("FireworksItem", class06584.y).orElse(M()));
      this.field_6011.N(L, var1.N("ShotAtAngle", false));
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 17 && this.method_73183().method_8608()) {
         class06889 class06889 = this.method_18798();
         this.method_73183().method_8547(this.method_23317(), this.method_23318(), this.method_23321(), class06889.M, class06889.B, class06889.Z, this.R());
      }

      super.method_5711(var1);
   }

   @Override
   public boolean method_5732() {
      return false;
   }

   public class08006(class07078<? extends class08006> var1, class07299 var2) {
      super(var1, var2);
   }

   public class08006(class07299 var1, double var2, double var4, double var6, class06584 var8) {
      super(class07078.Nu, var1);
      this.B = 0;
      this.method_5814(var2, var4, var6);
      this.field_6011.N(N, var8.t());
      int i = 1;
      class02813 class02813 = var8.method_58694(class02484.NT);
      if (class02813 != null) {
         i += class02813.N();
      }

      this.method_18800(this.field_5974.N(0.0, 0.002297), 0.05, this.field_5974.N(0.0, 0.002297));
      this.Z = 10 * i + this.field_5974.y(6) + this.field_5974.y(7);
   }

   public class08006(class07299 var1, @Nullable class07049 var2, double var3, double var5, double var7, class06584 var9) {
      this(var1, var3, var5, var7, var9);
      this.L(var2);
   }

   public class08006(class07299 var1, class06584 var2, class07438 var3) {
      this(var1, var3, var3.method_23317(), var3.method_23318(), var3.method_23321(), var2);
      this.field_6011.N(y, OptionalInt.of(var3.method_5628()));
      this.z = var3;
   }

   public class08006(class07299 var1, class06584 var2, class07049 var3, double var4, double var6, double var8, boolean var10) {
      this(var1, var2, var4, var6, var8, var10);
      this.L(var3);
   }

   public class08006(class07299 var1, class06584 var2, double var3, double var5, double var7, boolean var9) {
      this(var1, var3, var5, var7, var2);
      this.field_6011.N(L, var9);
   }

   private boolean i() {
      return this.field_6011.N(y).isPresent();
   }

   private boolean u() {
      return !this.R().isEmpty();
   }

   @Override
   public boolean y() {
      return this.field_6011.N(L);
   }

   private void y(class04782 var1) {
      var1.method_8421(this, (byte)17);
      this.method_32875(class01194.G, this.z());
      this.L(var1);
      this.method_31472();
   }

   private void N(CallbackInfo var1) {
      this.U = null;
   }

   private double N(double var1) {
      if (this.U == null) {
         class11390 class11390 = class11390.y(var1);
         class11938.L().L(class11390);
         this.U = class11390.N();
      }

      return this.U;
   }

   @Override
   protected void N(class06145 var1) {
      super.N(var1);
      if (this.method_73183() instanceof class04782 class04782) {
         this.y(class04782);
      }
   }

   @Override
   protected void N(class06183 var1) {
      class07209 class07209 = new class07209(var1.u());
      this.method_73183().method_8320(class07209).N(this.method_73183(), class07209, this, class08400.N, true);
      if (this.method_73183() instanceof class04782 class04782 && this.u()) {
         this.y(class04782);
      }

      super.N(var1);
   }

   public class07438 getBoostedEntity() {
      if (this.i() && this.z == null) {
         class07049 class07049 = this.method_73183().method_8469(this.field_6011.N(y).getAsInt());
         if (class07049 instanceof class07438) {
            this.z = (class07438)class07049;
         }
      }

      return this.z;
   }

   private List<class02827> R() {
      class02813 class02813 = this.field_6011.N(N).method_58694(class02484.NT);
      return class02813 != null ? class02813.y() : List.of();
   }

   @Override
   public DoubleDoubleImmutablePair a_(class07438 var1, class07072 var2) {
      double d0 = var1.method_73189().M - this.method_73189().M;
      double d1 = var1.method_73189().Z - this.method_73189().Z;
      return DoubleDoubleImmutablePair.of(d0, d1);
   }
}
