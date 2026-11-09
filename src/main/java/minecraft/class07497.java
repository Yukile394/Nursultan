package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07497 extends class04977 {
   public static final int N = 0;
   public static final int y = 1;
   public static final int L = 2;
   private static final Logger n = LogUtils.getLogger();
   private static final boolean t = false;
   public static final int u = 50;
   private int G;
   @Nullable
   private String l;
   private final class05865 d = class05865.N();
   private boolean w = false;
   private static final int k = 0;
   private static final int Y = 1;
   private static final int Q = 1;
   private static final int O = 1;
   private static final int g = 2;
   private static final int I = 1;
   private static final int J = 1;
   private static final int o = 27;
   private static final int q = 76;
   private static final int K = 134;
   private static final int V = 47;

   private static class03275 P() {
      return class03275.N().N(0, 27, 47, var0 -> true).N(1, 76, 47, var0 -> true).N(2, 134, 47).N();
   }

   public class07497(int var1, class08044 var2) {
      this(var1, var2, class05880.N);
   }

   public class07497(int var1, class08044 var2, class05880 var3) {
      super(class05851.field_17329, var1, var2, var3, P());
      this.N(this.d);
   }

   @Nullable
   private static String y(String var0) {
      String s = class05018.M(var0);
      return s.length() <= 50 ? s : null;
   }

   @Override
   public void E() {
      class06584 class06584x = this.j.method_5438(0);
      this.w = false;
      this.d.N(1);
      int i = 0;
      long j = 0L;
      byte b0 = 0;
      if (!class06584x.R() && class07323.N(class06584x)) {
         class06584 class06584x = class06584x.t();
         class06584 class06584xx = this.j.method_5438(1);
         class02715 class02715 = new class02715(class07323.y(class06584x));
         j += (long)class06584x.a_(class02484.n, 0).intValue() + class06584xx.a_(class02484.n, 0).intValue();
         this.G = 0;
         if (!class06584xx.R()) {
            boolean flag = class06584xx.L(class02484.p);
            if (class06584x.W() && class06584x.L(class06584xx)) {
               int k2 = Math.min(class06584x.P(), class06584x.s() / 4);
               if (k2 <= 0) {
                  this.v.method_5447(0, class06584.E);
                  this.d.N(0);
                  return;
               }

               int i3;
               for (i3 = 0; k2 > 0 && i3 < class06584xx.c(); i3++) {
                  int j3 = class06584x.P() - k2;
                  class06584x.y(j3);
                  i++;
                  k2 = Math.min(class06584x.P(), class06584x.s() / 4);
               }

               this.G = i3;
            } else {
               if (!flag && (!class06584x.N(class06584xx.B()) || !class06584x.W())) {
                  this.v.method_5447(0, class06584.E);
                  this.d.N(0);
                  return;
               }

               if (class06584x.W() && !flag) {
                  int kx = class06584x.s() - class06584x.P();
                  int lx = class06584xx.s() - class06584xx.P();
                  int i1 = lx + class06584x.s() * 12 / 100;
                  int var13 = kx + i1;
                  int k1 = class06584x.s() - var13;
                  if (k1 < 0) {
                     k1 = 0;
                  }

                  if (k1 < class06584x.P()) {
                     class06584x.y(k1);
                     i += 2;
                  }
               }

               class02710 class02710 = class07323.y(class06584xx);
               boolean flag2 = false;
               boolean flag3 = false;

               for (Entry entry : class02710.y()) {
                  class03556<class07304> class03556 = (class03556<class07304>)entry.getKey();
                  int l1 = class02715.N(class03556);
                  int i2 = entry.getIntValue();
                  i2 = l1 == i2 ? i2 + 1 : Math.max(i2, l1);
                  class07304 class07304 = class03556.N();
                  LocalRefImpl localrefimpl = new LocalRefImpl();
                  localrefimpl.init(class03556);
                  boolean flag4 = this.N(class07304, class06584x, localrefimpl);
                  class03556 = (class03556<class07304>)localrefimpl.dispose();
                  boolean flag1 = flag4;
                  if (this.R.method_56992() || class06584x.N(class06570.Gq)) {
                     flag1 = true;
                  }

                  for (class03556<class07304> class03556x : class02715.N()) {
                     if (!class03556x.equals(class03556) && !class07304.N(class03556, class03556x)) {
                        flag1 = false;
                        i++;
                     }
                  }

                  if (!flag1) {
                     flag3 = true;
                  } else {
                     flag2 = true;
                     if (i2 > class07304.i()) {
                        i2 = class07304.i();
                     }

                     class02715.N(class03556, i2);
                     int k3 = class07304.L();
                     if (flag) {
                        k3 = Math.max(1, k3 / 2);
                     }

                     i += k3 * i2;
                     if (class06584x.c() > 1) {
                        i = 40;
                     }
                  }
               }

               if (flag3 && !flag2) {
                  this.v.method_5447(0, class06584.E);
                  this.d.N(0);
                  return;
               }
            }
         }

         if (this.l != null && !class05018.B(this.l)) {
            if (!this.l.equals(class06584x.d().getString())) {
               b0 = 1;
               i += b0;
               class06584x.N(class02484.B, class00392.y(this.l));
            }
         } else if (class06584x.L(class02484.B)) {
            b0 = 1;
            i += b0;
            class06584x.y(class02484.B);
         }

         int j2 = i <= 0 ? 0 : (int)class04995.N(j + i, 0L, 2147483647L);
         this.d.N(j2);
         if (i <= 0) {
            class06584x = class06584.E;
         }

         if (b0 == i && b0 > 0) {
            if (this.d.y() >= 40) {
               this.d.N(39);
            }

            this.w = true;
         }

         if (this.d.y() >= 40 && !this.R.method_56992()) {
            class06584x = class06584.E;
         }

         if (!class06584x.R()) {
            int l2 = class06584x.a_(class02484.n, 0);
            if (l2 < class06584xx.a_(class02484.n, 0)) {
               l2 = class06584xx.a_(class02484.n, 0);
            }

            if (b0 != i || b0 == 0) {
               l2 = N(l2);
            }

            class06584x.N(class02484.n, Integer.valueOf(l2));
            class07323.N(class06584x, class02715.y());
         }

         this.v.method_5447(0, class06584x);
         this.u();
      } else {
         this.v.method_5447(0, class06584.E);
         this.d.N(0);
      }
   }

   private boolean N(class07304 var1, class06584 var2, LocalRef var3) {
      return this.N(var1, var2, (class03556)var3.get());
   }

   private boolean N(class07304 var1, class06584 var2, class03556 var3) {
      return var2.canBeEnchantedWith(var3, EnchantingContext.ACCEPTABLE);
   }

   @Override
   protected boolean N(class08036 var1, boolean var2) {
      return (var1.method_56992() || var1.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 >= this.d.y()) && this.d.y() > 0;
   }

   @Override
   protected boolean N(class00500 var1) {
      return var1.N(class01210.V);
   }

   public static int N(int var0) {
      return (int)Math.min(var0 * 2L + 1L, 2147483647L);
   }

   public boolean N(String var1) {
      String s = y(var1);
      if (s != null && !s.equals(this.l)) {
         this.l = s;
         if (this.L(2).R()) {
            class06584 class06584 = this.L(2).i();
            if (class05018.B(s)) {
               class06584.y(class02484.B);
            } else {
               class06584.N(class02484.B, class00392.y(s));
            }
         }

         this.E();
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void N(class08036 var1, class06584 var2) {
      if (!var1.method_56992()) {
         var1.method_7316(-this.d.y());
      }

      if (this.G > 0) {
         class06584 class06584 = this.j.method_5438(1);
         if (!class06584.R() && class06584.c() > this.G) {
            class06584.B(this.G);
            this.j.method_5447(1, class06584);
         } else {
            this.j.method_5447(1, class06584.E);
         }
      } else if (!this.w) {
         this.j.method_5447(1, class06584.E);
      }

      this.d.N(0);
      if (var1 instanceof class04770 class04770 && !class05018.B(this.l) && !this.j.method_5438(0).d().getString().equals(this.l)) {
         class04770.method_31273().N(this.l);
      }

      this.j.method_5447(0, class06584.E);
      this.i.N_53((var1x, var2x) -> {
         class00500 class00500x = var1x.method_8320(var2x);
         if (!var1.method_56992() && class00500x.N(class01210.V) && var1.method_59922().z() < 0.12F) {
            class00500 class00500x = class07804.Z(class00500x);
            if (class00500x == null) {
               var1x.method_8650(var2x, false);
               var1x.N(1029, var2x, 0);
            } else {
               var1x.method_8652(var2x, class00500x, 2);
               var1x.N(1030, var2x, 0);
            }
         } else {
            var1x.N(1030, var2x, 0);
         }
      });
   }

   @Override
   public int W() {
      return this.d.y();
   }
}
