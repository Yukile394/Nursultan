package minecraft;

import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.jspecify.annotations.Nullable;

public class class07048 extends class07049 implements class03244 {
   private static final int i = 5;
   private static final class02131<Float> R = class03289.N(class07048.class, class02154.u);
   private static final class02131<Boolean> M = class03289.N(class07048.class, class02154.U);
   private static final class02131<class07126> B = class03289.N(class07048.class, class02154.E);
   private static final float Z = 32.0F;
   private static final int z = 0;
   private static final int U = 0;
   private static final float E = 0.0F;
   private static final float W = 0.0F;
   private static final float m = 1.0F;
   private static final float P = 0.5F;
   private static final float s = 3.0F;
   public static final float N = 6.0F;
   public static final float y = 0.5F;
   public static final int L = -1;
   public static final int u = 600;
   private static final int T = 20;
   private static final int b = 20;
   private static final class02329 j = class02329.N(class07107.t, -1);
   @Nullable
   private class07126 v;
   private class06517 n = class06517.N;
   private float t = 1.0F;
   private final Map<class07049, Integer> G = Maps.newHashMap();
   private int l = -1;
   private int d = 20;
   private int w = 20;
   private int k = 0;
   private float Y = 0.0F;
   private float Q = 0.0F;
   @Nullable
   private class08372<class07438> O;

   public void L(float var1) {
      this.Y = var1;
   }

   public boolean L() {
      return this.method_5841().N(M);
   }

   public void L(int var1) {
      this.d = var1;
   }

   public int M() {
      return this.k;
   }

   @Override
   public class01325 method_18377(class01312 var1) {
      return class01325.y(this.N() * 2.0F, 0.5F);
   }

   @Override
   public void method_18382() {
      double d0 = this.method_23317();
      double d1 = this.method_23318();
      double d2 = this.method_23321();
      super.method_18382();
      this.method_5814(d0, d1, d2);
   }

   @Override
   public class04641 method_5657() {
      return class04641.field_15975;
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (R.equals(var1)) {
         this.method_18382();
      }

      super.method_5674(var1);
   }

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.h);
      this.method_66650(var1, class02484.r);
      super.method_66649(var1);
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(R, 3.0F);
      var1.N(M, false);
      var1.N(B, j);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.method_73183() instanceof class04782 class04782) {
         this.N(class04782);
      } else {
         this.E();
      }
   }

   @Override
   public final boolean method_64397(class04782 var1, class07072 var2, float var3) {
      return false;
   }

   @Override
   protected void method_5652(class08329 var1) {
      var1.N("Age", this.field_6012);
      var1.N("Duration", this.l);
      var1.N("WaitTime", this.d);
      var1.N("ReapplicationDelay", this.w);
      var1.N("DurationOnUse", this.k);
      var1.N("RadiusOnUse", this.Y);
      var1.N("RadiusPerTick", this.Q);
      var1.N("Radius", this.N());
      var1.y("custom_particle", class07107.yE, this.v);
      class08372.N(this.O, var1, "Owner");
      if (!this.n.equals(class06517.N)) {
         var1.N("potion_contents", class06517.L, this.n);
      }

      if (this.t != 1.0F) {
         var1.N("potion_duration_scale", this.t);
      }
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      if (var1 == class02484.h) {
         return method_66651(var1, this.n);
      } else {
         return var1 == class02484.r ? method_66651(var1, this.t) : super.method_58694(var1);
      }
   }

   @Override
   protected void method_5749(class08299 var1) {
      this.field_6012 = var1.N("Age", 0);
      this.l = var1.N("Duration", -1);
      this.d = var1.N("WaitTime", 20);
      this.w = var1.N("ReapplicationDelay", 20);
      this.k = var1.N("DurationOnUse", 0);
      this.Y = var1.N("RadiusOnUse", 0.0F);
      this.Q = var1.N("RadiusPerTick", 0.0F);
      this.N(var1.N("Radius", 3.0F));
      this.O = class08372.N(var1, "Owner");
      this.N(var1.<class07126>N("custom_particle", class07107.yE).orElse(null));
      this.N(var1.<class06517>N("potion_contents", class06517.L).orElse(class06517.N));
      this.t = var1.N("potion_duration_scale", 1.0F);
   }

   public class07048(class07078<? extends class07048> var1, class07299 var2) {
      super(var1, var2);
      this.field_5960 = true;
   }

   public class07048(class07299 var1, double var2, double var4, double var6) {
      this(class07078.R, var1);
      this.method_5814(var2, var4, var6);
   }

   public int B() {
      return this.d;
   }

   @Nullable
   public class07438 z() {
      return class08372.y(this.O, this.method_73183());
   }

   public float i() {
      return this.Y;
   }

   private void U() {
      if (this.v != null) {
         this.field_6011.N(B, this.v);
      } else {
         int ix = class02566.M(this.n.y());
         this.field_6011.N(B, class02329.N(j.method_10295(), ix));
      }
   }

   public int u() {
      return this.l;
   }

   public void u(float var1) {
      this.Q = var1;
   }

   public void y(float var1) {
      this.t = var1;
   }

   public void y(int var1) {
      this.k = var1;
   }

   public class07126 y() {
      return this.method_5841().N(B);
   }

   private void E() {
      boolean flag = this.L();
      float f = this.N();
      if (!flag || !this.field_5974.Z()) {
         class07126 class07126 = this.y();
         int ix;
         float f1;
         if (flag) {
            ix = 2;
            f1 = 0.2F;
         } else {
            ix = class04995.u((float) Math.PI * f * f);
            f1 = f;
         }

         for (int jx = 0; jx < ix; jx++) {
            float f2 = this.field_5974.z() * (float) (Math.PI * 2);
            float f3 = class04995.N(this.field_5974.z()) * f1;
            double d0 = this.method_23317() + class04995.P(f2) * f3;
            double d1 = this.method_23318();
            double d2 = this.method_23321() + class04995.m(f2) * f3;
            if (class07126.method_10295() == class07107.t) {
               if (flag && this.field_5974.Z()) {
                  this.method_73183().method_8494(j, d0, d1, d2, 0.0, 0.0, 0.0);
               } else {
                  this.method_73183().method_8494(class07126, d0, d1, d2, 0.0, 0.0, 0.0);
               }
            } else if (flag) {
               this.method_73183().method_8494(class07126, d0, d1, d2, 0.0, 0.0, 0.0);
            } else {
               this.method_73183().method_8494(class07126, d0, d1, d2, (0.5 - this.field_5974.U()) * 0.15, 0.01F, (0.5 - this.field_5974.U()) * 0.15);
            }
         }
      }
   }

   public float N() {
      return this.method_5841().N(R);
   }

   public void N(class06517 var1) {
      this.n = var1;
      this.U();
   }

   public void N(float var1) {
      if (!this.method_73183().method_8608()) {
         this.method_5841().N(R, class04995.N(var1, 0.0F, 32.0F));
      }
   }

   public void N(int var1) {
      this.l = var1;
   }

   public void N(@Nullable class07438 var1) {
      this.O = class08372.N(var1);
   }

   protected void N(boolean var1) {
      this.method_5841().N(M, var1);
   }

   private void N(class04782 var1) {
      if (this.l != -1 && this.field_6012 - this.d >= this.l) {
         this.method_31472();
      } else {
         boolean flag = this.L();
         boolean flag1 = this.field_6012 < this.d;
         if (flag != flag1) {
            this.N(flag1);
         }

         if (!flag1) {
            float f = this.N();
            if (this.Q != 0.0F) {
               f += this.Q;
               if (f < 0.5F) {
                  this.method_31472();
                  return;
               }

               this.N(f);
            }

            if (this.field_6012 % 5 == 0) {
               this.G.entrySet().removeIf(var1x -> this.field_6012 >= var1x.getValue());
               if (!this.n.L()) {
                  this.G.clear();
               } else {
                  ArrayList arraylist = new ArrayList();
                  this.n.N(arraylist::add, this.t);
                  List<class07438> list = this.method_73183().N(class07438.class, this.method_5829());
                  if (!list.isEmpty()) {
                     for (class07438 class07438 : list) {
                        if (!this.G.containsKey(class07438) && class07438.method_6086() && !arraylist.stream().noneMatch(class07438::method_6049)) {
                           double d0 = class07438.method_23317() - this.method_23317();
                           double d1 = class07438.method_23321() - this.method_23321();
                           if (d0 * d0 + d1 * d1 <= f * f) {
                              this.G.put(class07438, this.field_6012 + this.w);

                              for (class07055 class07055 : arraylist) {
                                 if (class07055.L().N().N()) {
                                    class07055.L().N().N(var1, this, this.z(), class07438, class07055.i(), 0.5);
                                 } else {
                                    class07438.method_37222(new class07055(class07055), this);
                                 }
                              }

                              if (this.Y != 0.0F) {
                                 f += this.Y;
                                 if (f < 0.5F) {
                                    this.method_31472();
                                    return;
                                 }

                                 this.N(f);
                              }

                              if (this.k != 0 && this.l != -1) {
                                 this.l = this.l + this.k;
                                 if (this.l <= 0) {
                                    this.method_31472();
                                    return;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void N(@Nullable class07126 var1) {
      this.v = var1;
      this.U();
   }

   public void N(class07055 var1) {
      this.N(this.n.N(var1));
   }

   public float R() {
      return this.Q;
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.h) {
         this.N(method_66651(class02484.h, var2));
         return true;
      } else if (var1 == class02484.r) {
         this.y(method_66651(class02484.r, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }
}
