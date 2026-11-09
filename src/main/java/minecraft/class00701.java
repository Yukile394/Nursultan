package minecraft;

import com.mojang.logging.LogUtils;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00701 extends class07049 {
   private static final Logger R = LogUtils.getLogger();
   private static final class00500 M = class00869.e.W();
   private static final int B = 0;
   private static final float Z = 0.0F;
   private static final int z = 40;
   private static final boolean U = true;
   private static final boolean E = false;
   private class00500 W = M;
   public int N = 0;
   public boolean y = true;
   private boolean m = false;
   private boolean P;
   private int s = 40;
   private float T = 0.0F;
   @Nullable
   public class07001 L;
   public boolean u;
   protected static final class02131<class07209> i = class03289.N(class00701.class, class02154.P);

   public class00500 L() {
      return this.W;
   }

   @Override
   public boolean method_5862() {
      return false;
   }

   @Override
   public void method_31471(class07276 var1) {
      super.method_31471(var1);
      this.W = class00891.N(var1.W());
      this.field_23807 = true;
      double d0 = var1.u();
      double d1 = var1.M();
      double d2 = var1.B();
      this.method_5814(d0, d1, d2);
      this.N(this.method_24515());
   }

   @Override
   public class00381<class07280> method_18002(class01599 var1) {
      return new class07276(this, var1, class00891.W(this.L()));
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(i, class07209.field_10980);
   }

   @Override
   public void method_5773() {
      if (this.W.P()) {
         this.method_31472();
      } else {
         class00891 class00891 = this.W.i();
         this.N++;
         this.method_56990();
         this.method_5784(class07451.field_6308, this.method_18798());
         this.method_61409();
         this.method_60698();
         if (this.method_73183() instanceof class04782 class04782 && (this.method_5805() || this.u)) {
            class07209 class07209 = this.method_24515();
            boolean flag = this.W.i() instanceof class06785;
            boolean flag1 = flag && this.method_73183().method_8316(class07209).N(class01231.N);
            double d0 = this.method_18798().B();
            if (flag && d0 > 1.0) {
               class06183 class06183 = this.method_73183()
                  .N(
                     new class05862(
                        new class06889(this.field_6014, this.field_6036, this.field_5969),
                        this.method_73189(),
                        class05849.field_17558,
                        class05835.field_1345,
                        this
                     )
                  );
               if (class06183.N() != class07113.field_1333 && this.method_73183().method_8316(class06183.u()).N(class01231.N)) {
                  class07209 = class06183.u();
                  flag1 = true;
               }
            }

            if (!this.method_24828() && !flag1) {
               if (this.N > 100
                     && (class07209.method_10264() <= this.method_73183().method_31607() || class07209.method_10264() > this.method_73183().method_31600())
                  || this.N > 600) {
                  if (this.y && class04782.method_64395().N(class07305.U)) {
                     this.method_5706(class04782, class00891);
                  }

                  this.method_31472();
               }
            } else {
               class00500 class00500 = this.method_73183().method_8320(class07209);
               this.method_18799(this.method_18798().u(0.7, -0.5, 0.7));
               if (!class00500.N(class00869.LN)) {
                  if (!this.m) {
                     boolean flag2 = class00500.N(new class02953(this.method_73183(), class07209, class07211.field_11033, class06584.E, class07211.field_11036));
                     boolean flag3 = class07204.U(this.method_73183().method_8320(class07209.method_10074())) && (!flag || !flag1);
                     boolean flag4 = this.W.N((class05487)this.method_73183(), class07209) && !flag3;
                     if (flag2 && flag4) {
                        if (this.W.y(class06665.q) && this.method_73183().method_8316(class07209).N() == class04684.L) {
                           this.W = this.W.y(class06665.q, true);
                        }

                        if (this.method_73183().method_8652(class07209, this.W, 3)) {
                           class04782.method_14178().L.N(this, new class07259(class07209, this.method_73183().method_8320(class07209)));
                           this.method_31472();
                           if (class00891 instanceof class06344 class06344) {
                              class06344.N(this.method_73183(), class07209, this.W, class00500, this);
                           }

                           if (this.L != null && this.W.k()) {
                              class00394 class00394 = this.method_73183().method_8321(class07209);
                              if (class00394 != null) {
                                 try (class04495 class04495 = new class04495(class00394.J(), R)) {
                                    class01042 class01042 = this.method_73183().method_30349();
                                    class08303 class08303 = class08303.N(class04495, class01042);
                                    class00394.i(class08303);
                                    class07001 class07001 = class08303.y();
                                    this.L.N((BiConsumer<String, class07709>)((var1x, var2x) -> class07001.N(var1x, var2x.N())));
                                    class00394.y_1(class08308.N(class04495, class01042, class07001));
                                 } catch (Exception exception) {
                                    R.error("Failed to load block entity from falling block", exception);
                                 }

                                 class00394.method_5431();
                              }
                           }
                        } else if (this.y && class04782.method_64395().N(class07305.U)) {
                           this.method_31472();
                           this.N(class00891, class07209);
                           this.method_5706(class04782, class00891);
                        }
                     } else {
                        this.method_31472();
                        if (this.y && class04782.method_64395().N(class07305.U)) {
                           this.N(class00891, class07209);
                           this.method_5706(class04782, class00891);
                        }
                     }
                  } else {
                     this.method_31472();
                     this.N(class00891, class07209);
                  }
               }
            }
         }

         this.method_18799(this.method_18798().L(0.98));
      }
   }

   @Override
   public final boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (!this.method_64421(var2)) {
         this.method_5785();
      }

      return false;
   }

   @Override
   protected class07065 method_33570() {
      return class07065.field_28630;
   }

   @Override
   public boolean method_5747(double var1, float var3, class07072 var4) {
      if (!this.P) {
         return false;
      } else {
         int ix = class04995.L(var1 - 1.0);
         if (ix < 0) {
            return false;
         } else {
            Predicate<class07049> predicate = class07042.i.and(class07042.y);
            class07072 class07072 = this.W.i() instanceof class06344 class06344 ? class06344.N(this) : this.method_48923().N(this);
            float f = Math.min(class04995.y(ix * this.T), this.s);
            this.method_73183().method_8333(this, this.method_5829(), predicate).forEach(var2 -> var2.method_64419(class07072, f));
            boolean flag = this.W.N(class01210.V);
            if (flag && f > 0.0F && this.field_5974.z() < 0.05F + ix * 0.05F) {
               class00500 class00500 = class07804.Z(this.W);
               if (class00500 == null) {
                  this.m = true;
               } else {
                  this.W = class00500;
               }
            }

            return false;
         }
      }
   }

   @Override
   protected double method_7490() {
      return 0.04;
   }

   @Override
   protected void method_5652(class08329 var1) {
      var1.N("BlockState", class00500.N, this.W);
      var1.N("Time", this.N);
      var1.N("DropItem", this.y);
      var1.N("HurtEntities", this.P);
      var1.N("FallHurtAmount", this.T);
      var1.N("FallHurtMax", this.s);
      if (this.L != null) {
         var1.N("TileEntityData", class07001.N, this.L);
      }

      var1.N("CancelDrop", this.m);
   }

   @Override
   public boolean method_5863() {
      return !this.method_31481();
   }

   @Override
   public void method_5819(class07074 var1) {
      super.method_5819(var1);
      var1.N("Immitating BlockState", this.W.toString());
   }

   @Override
   protected void method_5749(class08299 var1) {
      this.W = var1.<class00500>N("BlockState", class00500.N).orElse(M);
      this.N = var1.N("Time", 0);
      boolean flag = this.W.N(class01210.V);
      this.P = var1.N("HurtEntities", flag);
      this.T = var1.N("FallHurtAmount", 0.0F);
      this.s = var1.N("FallHurtMax", 40);
      this.y = var1.N("DropItem", true);
      this.L = var1.<class07001>N("TileEntityData", class07001.N).orElse(null);
      this.m = var1.N("CancelDrop", false);
   }

   @Nullable
   @Override
   public class07049 method_5731(class01032 var1) {
      class05946<class07299> class05946 = var1.y().method_27983();
      class05946<class07299> class05946x = this.method_73183().method_27983();
      boolean flag = (class05946x == class07299.field_25181 || class05946 == class07299.field_25181) && class05946x != class05946;
      class07049 class07049 = super.method_5731(var1);
      this.u = class07049 != null && flag;
      return class07049;
   }

   @Override
   public boolean method_5732() {
      return false;
   }

   @Override
   protected class00392 method_23315() {
      return class00392.N("entity.minecraft.falling_block_type", this.W.i().M());
   }

   public class00701(class07078<? extends class00701> var1, class07299 var2) {
      super(var1, var2);
   }

   private class00701(class07299 var1, double var2, double var4, double var6, class00500 var8) {
      this(class07078.Ny, var1);
      this.W = var8;
      this.field_23807 = true;
      this.method_5814(var2, var4, var6);
      this.method_18799(class06889.L);
      this.field_6014 = var2;
      this.field_6036 = var4;
      this.field_5969 = var6;
      this.N(this.method_24515());
   }

   public void y() {
      this.m = true;
   }

   public void N(float var1, int var2) {
      this.P = true;
      this.T = var1;
      this.s = var2;
   }

   public void N(class07209 var1) {
      this.field_6011.N(i, var1);
   }

   public static class00701 N(class07299 var0, class07209 var1, class00500 var2) {
      class00701 class00701 = new class00701(
         var0, var1.method_10263() + 0.5, var1.method_10264(), var1.method_10260() + 0.5, var2.y(class06665.q) ? var2.y(class06665.q, false) : var2
      );
      var0.method_8652(var1, var2.Y().B(), 3);
      var0.method_8649(class00701);
      return class00701;
   }

   public void N(class00891 var1, class07209 var2) {
      if (var1 instanceof class06344) {
         ((class06344)var1).N(this.method_73183(), var2, this);
      }
   }

   public class07209 N() {
      return this.field_6011.N(i);
   }
}
