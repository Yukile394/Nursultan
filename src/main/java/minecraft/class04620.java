package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04620 extends class00394 {
   static final Logger N = LogUtils.getLogger();
   private static final String i = "flower_pos";
   private static final String R = "bees";
   static final List<String> y = Arrays.asList(
      "Air",
      "drop_chances",
      "equipment",
      "Brain",
      "CanPickUpLoot",
      "DeathTime",
      "fall_distance",
      "FallFlying",
      "Fire",
      "HurtByTimestamp",
      "HurtTime",
      "LeftHanded",
      "Motion",
      "NoGravity",
      "OnGround",
      "PortalCooldown",
      "Pos",
      "Rotation",
      "sleeping_pos",
      "CannotEnterHiveTicks",
      "TicksSincePollination",
      "CropsGrownSincePollination",
      "hive_pos",
      "Passengers",
      "leash",
      "UUID"
   );
   public static final int L = 3;
   private static final int M = 400;
   private static final int B = 2400;
   public static final int u = 600;
   private final List<class04630> Z = Lists.newArrayList();
   @Nullable
   private class07209 m;

   public boolean L() {
      return this.Z.isEmpty();
   }

   public boolean M() {
      return class05847.N(this.z, this.d());
   }

   public class04620(class07209 var1, class00500 var2) {
      super(class00404.field_20431, var1, var2);
   }

   private boolean B() {
      return this.m != null;
   }

   private List<class05534> Z() {
      return this.Z.stream().map(class04630::y).toList();
   }

   public boolean u() {
      return this.Z.size() == 3;
   }

   @Override
   public void y(class08329 var1) {
      super.y(var1);
      var1.L("bees");
   }

   private List<class07049> N(class00500 var1, class05497 var2) {
      ArrayList arraylist = Lists.newArrayList();
      this.Z.removeIf(var4 -> N(this.z, this.U, var1, var4.y(), arraylist, var2, this.m));
      if (!arraylist.isEmpty()) {
         super.method_5431();
      }

      return arraylist;
   }

   @Override
   protected void N(class02676 var1) {
      super.N(var1);
      var1.N(class02484.Nd, new class08588(this.Z()));
   }

   @Override
   protected void N_9(class02666 var1) {
      super.N_9(var1);
      this.Z.clear();
      var1.a_(class02484.Nd, class08588.L).N().forEach(this::N);
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      var1.N("bees", class05534.u, this.Z());
      var1.y("flower_pos", class07209.field_25064, this.m);
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class04620 var3) {
      N(var0, var1, var2, var3.Z, var3.m);
      if (!var3.Z.isEmpty() && var0.method_8409().U() < 0.005) {
         double d0 = var1.method_10263() + 0.5;
         double d1 = var1.method_10264();
         double d2 = var1.method_10260() + 0.5;
         var0.method_43128(null, d0, d1, d2, class04909.LU, class04911.field_15245, 1.0F, 1.0F);
      }
   }

   public void N(@Nullable class08036 var1, class00500 var2, class05497 var3) {
      List<class07049> list = this.N(var2, var3);
      if (var1 != null) {
         for (class07049 class07049 : list) {
            if (class07049 instanceof class04626 class04626 && var1.method_73189().M(class07049.method_73189()) <= 16.0) {
               if (!this.M()) {
                  class04626.y(var1);
               } else {
                  class04626.N(400);
               }
            }
         }
      }
   }

   private static boolean N(
      class07299 var0, class07209 var1, class00500 var2, class05534 var3, @Nullable List<class07049> var4, class05497 var5, @Nullable class07209 var6
   ) {
      if (var0.method_75728().N(class00608.X, var1) && var5 != class05497.field_21052) {
         return false;
      } else {
         class07211 class07211 = var2.L(class04593.y);
         class07209 class07209 = var1.method_10093(class07211);
         boolean flag = !var0.method_8320(class07209).M(var0, class07209).method_1110();
         if (flag && var5 != class05497.field_21052) {
            return false;
         } else {
            class07049 class07049 = var3.N(var0, var1);
            if (class07049 != null) {
               if (class07049 instanceof class04626 class04626) {
                  if (var6 != null && !class04626.v() && var0.field_9229.z() < 0.9F) {
                     class04626.y(var6);
                  }

                  if (var5 == class05497.field_20428) {
                     class04626.Nq();
                     if (var2.N(class01210.NC, var0x -> var0x.y(class04593.L))) {
                        int ix = N(var2);
                        if (ix < 5) {
                           int j = var0.field_9229.y(100) == 0 ? 2 : 1;
                           if (ix + j > 5) {
                              j--;
                           }

                           var0.method_8501(var1, var2.y(class04593.L, ix + j));
                        }
                     }
                  }

                  if (var4 != null) {
                     var4.add(class04626);
                  }

                  float f = class07049.method_17681();
                  double d3 = flag ? 0.0 : 0.55 + f / 2.0F;
                  double d0 = var1.method_10263() + 0.5 + d3 * class07211.P();
                  double d1 = var1.method_10264() + 0.5 - class07049.method_17682() / 2.0F;
                  double d2 = var1.method_10260() + 0.5 + d3 * class07211.T();
                  class07049.method_5808(d0, d1, d2, class07049.method_36454(), class07049.method_36455());
               }

               var0.method_8396(null, var1, class04909.LZ, class04911.field_15245, 1.0F, 1.0F);
               var0.N(class01194.L, var1, class01164.N(class07049, var0.method_8320(var1)));
               return var0.method_8649(class07049);
            } else {
               return false;
            }
         }
      }
   }

   public static int N(class00500 var0) {
      return var0.L(class04593.L);
   }

   public void N(class05534 var1) {
      this.Z.add(new class04630(var1));
   }

   public void N(class04626 var1) {
      if (this.Z.size() < 3) {
         var1.method_5848();
         var1.method_5772();
         var1.yU();
         this.N(class05534.N(var1));
         if (this.z != null) {
            if (var1.v() && (!this.B() || this.z.field_9229.Z())) {
               this.m = var1.m();
            }

            class07209 class07209 = this.d();
            this.z
               .method_43128(
                  null, class07209.method_10263(), class07209.method_10264(), class07209.method_10260(), class04909.LB, class04911.field_15245, 1.0F, 1.0F
               );
            this.z.N(class01194.L, class07209, class01164.N(var1, this.w()));
         }

         var1.method_31472();
         super.method_5431();
      }
   }

   public boolean N() {
      if (this.z == null) {
         return false;
      } else {
         for (class07209 class07209 : class07209.method_10097(this.U.method_10069(-1, -1, -1), this.U.method_10069(1, 1, 1))) {
            if (this.z.method_8320(class07209).i() instanceof class00756) {
               return true;
            }
         }

         return false;
      }
   }

   private static void N(class07299 var0, class07209 var1, class00500 var2, List<class04630> var3, @Nullable class07209 var4) {
      boolean flag = false;
      Iterator iterator = var3.iterator();

      while (iterator.hasNext()) {
         class04630 class04630 = (class04630)iterator.next();
         if (class04630.N()) {
            class05497 class05497 = class04630.L() ? class05497.field_20428 : class05497.field_20429;
            if (N(var0, var1, var2, class04630.y(), null, class05497, var4)) {
               flag = true;
               iterator.remove();
            }
         }
      }

      if (flag) {
         N(var0, var1, var2);
      }
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.Z.clear();
      var1.<List>N("bees", class05534.u).orElse(List.of()).forEach(this::N);
      this.m = var1.<class07209>N("flower_pos", class07209.field_25064).orElse(null);
   }

   @Override
   public void method_5431() {
      if (this.N()) {
         this.N(null, this.z.method_8320(this.d()), class05497.field_21052);
      }

      super.method_5431();
   }

   public int R() {
      return this.Z.size();
   }

   @Override
   public void method_74589(class04782 var1, class06990 var2) {
      var2.N(class00429.B, () -> class00447.N(this));
   }
}
