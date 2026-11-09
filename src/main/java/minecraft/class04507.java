package minecraft;

import Nursultan.class10972;
import Nursultan.class11806;
import Nursultan.class11938;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.ArrayList;
import net.caffeinemc.mods.sodium.client.render.SodiumWorldRenderer;
import net.caffeinemc.mods.sodium.mixin.core.render.world.EntityRendererAccessor;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class04507<T extends class07049, S extends class08800> implements EntityRendererAccessor {
   private static final float field_61797 = 0.5F;
   private static final float field_61798 = 32.0F;
   public static final float field_32921 = 0.025F;
   protected final class01781 field_4676;
   private final class01590 field_27761;
   protected float field_4673;
   protected float field_4672;
   private static final NamespacedId NAME_TAG_ID = new NamespacedId("minecraft", "name_tag");
   private int lastId = -100;

   public class04507(class04832 var1) {
      super();
      this.field_4672 = 1.0F;
      this.field_4676 = var1.N();
      this.field_27761 = var1.z();
   }

   private void handler$cgl000$nursultan$injectGetAndUpdateRenderState(class07049 var1, float var2, CallbackInfoReturnable var3) {
      class08800 class08800 = (class08800)var3.getReturnValue();
      if (class08800 instanceof class11806) {
         class08800.dataManager().N().N(var1);
      }
   }

   private boolean wrapOperation$cll000$sodium$preShouldRender(class01383 var1, class00734 var2, Operation var3, class07049 var4) {
      SodiumWorldRenderer sodiumworldrenderer = SodiumWorldRenderer.instanceNullable();
      return sodiumworldrenderer == null
         ? (Boolean)var3.call(new Object[]{var1, var2})
         : sodiumworldrenderer.isEntityVisible(this, var4) && (Boolean)var3.call(new Object[]{var1, var2});
   }

   private boolean wrapWithCondition$cgl000$nursultan$injectRender(class04507 var1, class08800 var2, class01421 var3, class01237 var4, class06959 var5) {
      class10972 class10972 = class10972.N(var2);
      class11938.L().L(class10972);
      return !class10972.y();
   }

   public void method_62354(T var1, S var2, float var3) {
      var2.U = var1.method_5864();
      var2.E = class04995.u((double)var3, var1.field_6038, var1.method_23317());
      var2.W = class04995.u((double)var3, var1.field_5971, var1.method_23318());
      var2.m = class04995.u((double)var3, var1.field_5989, var1.method_23321());
      var2.v = var1.method_5767();
      var2.P = var1.field_6012 + var3;
      var2.s = var1.method_17681();
      var2.T = var1.method_17682();
      var2.b = var1.method_5751();
      if (var1.method_5765() && var1.method_5854() instanceof class07504 class07504 && class07504.N() instanceof class02726 class02726 && class02726.P()) {
         double d2 = class04995.u((double)var3, class07504.field_6038, class07504.method_23317());
         double d0 = class04995.u((double)var3, class07504.field_5971, class07504.method_23318());
         double d1 = class04995.u((double)var3, class07504.field_5989, class07504.method_23321());
         var2.d = class02726.i(var3).u(new class06889(d2, d0, d1));
      } else {
         var2.d = null;
      }

      if (this.field_4676.y != null) {
         var2.j = this.field_4676.y(var1);
         boolean flag1 = var2.j < 4096.0 && this.method_3921((T)var1, var2.j);
         if (flag1) {
            var2.w = this.method_62426((T)var1);
            var2.k = var1.method_56072().N(class03831.field_47745, 0, var1.method_61415(var3));
         } else {
            var2.w = null;
         }
      }

      label72: {
         var2.n = var1.method_21751();
         class07299 class07299 = var1.method_73183();
         if (var1 instanceof class02607 class02607) {
            class07049 class07049 = class02607.yW();
            if (class07049 instanceof class07049) {
               float f = var1.method_60951(var3) * (float) (Math.PI / 180.0);
               class06889 class06889 = class02607.M(var3);
               class07209 class07209 = class07209.method_49638(var1.method_5836(var3));
               class07209 class07209x = class07209.method_49638(class07049.method_5836(var3));
               int i = this.method_24087((T)var1, class07209);
               int j = this.field_4676.N(class07049).method_24087(class07049, class07209x);
               int k = class07299.method_8314(class00772.field_9284, class07209);
               int l = class07299.method_8314(class00772.field_9284, class07209x);
               boolean flag = class07049.method_70986() && class02607.aa_();
               int i1 = flag ? 4 : 1;
               if (var2.Y == null || var2.Y.size() != i1) {
                  var2.Y = new ArrayList<>(i1);

                  for (int j1 = 0; j1 < i1; j1++) {
                     var2.Y.add(new class08804());
                  }
               }

               if (flag) {
                  float f1 = class07049.method_60951(var3) * (float) (Math.PI / 180.0);
                  class06889 class06889x = class07049.method_30950(var3);
                  class06889[] aclass06889 = class02607.ab_();
                  class06889[] aclass068891 = class07049.method_70985();
                  int k1 = 0;

                  while (true) {
                     if (k1 >= i1) {
                        break label72;
                     }

                     class08804 class08804x = var2.Y.get(k1);
                     class08804x.N = aclass06889[k1].y(-f);
                     class08804x.y = var1.method_30950(var3).i(class08804x.N);
                     class08804x.L = class06889x.i(aclass068891[k1].y(-f1));
                     class08804x.u = i;
                     class08804x.i = j;
                     class08804x.R = k;
                     class08804x.M = l;
                     class08804x.B = false;
                     k1++;
                  }
               } else {
                  class06889 class06889x = class06889.y(-f);
                  class08804 class08804 = var2.Y.getFirst();
                  class08804.N = class06889x;
                  class08804.y = var1.method_30950(var3).i(class06889x);
                  class08804.L = class07049.method_30951(var3);
                  class08804.u = i;
                  class08804.i = j;
                  class08804.R = k;
                  class08804.M = l;
                  break label72;
               }
            }
         }

         var2.Y = null;
      }

      var2.t = var1.method_5862();
      class06202 class06202 = class06202.Nq();
      boolean flag2 = class06202.y(var1);
      var2.l = flag2 ? class02566.M(var1.method_22861()) : 0;
      var2.G = this.method_24088((T)var1, var3);
   }

   public void method_3936(S var1, class01421 var2, class01237 var3, class06959 var4) {
      if (var1.Y != null) {
         for (class08804 class08804 : var1.Y) {
            var3.N(var2, class08804);
         }
      }

      if (this.wrapWithCondition$cgl000$nursultan$injectRender(this, var1, var2, var3, var4)) {
         this.method_3926((S)var1, var2, var3, var4);
      }
   }

   protected void method_73154(T var1, S var2) {
      class06202 class06202 = class06202.Nq();
      class07299 class07299 = var1.method_73183();
      this.method_72979((S)var2, class06202, class07299);
   }

   public class00734 method_62358(T var1) {
      return var1.method_5829();
   }

   public abstract S method_55269();

   public class01590 method_3932() {
      return this.field_27761;
   }

   @Nullable
   protected class00392 method_62426(T var1) {
      return var1.method_5476();
   }

   protected boolean method_3921(T var1, double var2) {
      return var1.method_5733() || var1.method_16914() && var1 == this.field_4676.L;
   }

   protected float method_55831(S var1) {
      return this.field_4673;
   }

   protected float method_65247(S var1) {
      return this.field_4672;
   }

   private void method_72979(S var1, class06202 var2, class07299 var3) {
      var1.O.clear();
      if (((class05630)var2.i_7).Ny().method_41753() && !var1.v) {
         float f = Math.min(this.method_55831((S)var1), 32.0F);
         var1.Q = f;
         if (f > 0.0F) {
            double d0 = var1.j;
            float f1 = (float)((1.0 - d0 / 256.0) * this.method_65247((S)var1));
            if (f1 > 0.0F) {
               int i = class04995.N(var1.E - f);
               int j = class04995.N(var1.E + f);
               int k = class04995.N(var1.m - f);
               int l = class04995.N(var1.m + f);
               float f2 = Math.min(f1 / 0.5F - 1.0F, f);
               int i1 = class04995.N(var1.W - f2);
               int j1 = class04995.N(var1.W);
               class07218 class07218 = new class07218();

               for (int k1 = k; k1 <= l; k1++) {
                  for (int l1 = i; l1 <= j; l1++) {
                     class07218.N(l1, 0, k1);
                     class08050 class08050 = var3.method_8500(class07218);

                     for (int i2 = i1; i2 <= j1; i2++) {
                        class07218.method_10099(i2);
                        this.method_72978((S)var1, var3, f1, class07218, class08050);
                     }
                  }
               }
            }
         }
      } else {
         var1.Q = 0.0F;
      }
   }

   protected boolean method_62406(T var1) {
      return true;
   }

   public boolean method_3933(T var1, class01383 var2, double var3, double var5, double var7) {
      if (!var1.method_5727(var3, var5, var7)) {
         return false;
      } else if (!this.method_62406((T)var1)) {
         return true;
      } else {
         class00734 class00734x = this.method_62358((T)var1).M(0.5);
         if (class00734x.i() || class00734x.N() == 0.0) {
            class00734x = new class00734(
               var1.method_23317() - 2.0,
               var1.method_23318() - 2.0,
               var1.method_23321() - 2.0,
               var1.method_23317() + 2.0,
               var1.method_23318() + 2.0,
               var1.method_23321() + 2.0
            );
         }

         if (this.wrapOperation$cll000$sodium$preShouldRender(var2, class00734x, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_4604, net.minecraft.class_238]");
            return ((class01383)var0[0]).method_23093((class00734)var0[1]);
         }, var1)) {
            return true;
         } else {
            if (var1 instanceof class02607) {
               class07049 class07049 = ((class02607)var1).yW();
               if (class07049 != null) {
                  class00734 class00734x = this.field_4676.N(class07049).method_62358(class07049);
                  return var2.method_23093(class00734x) || var2.method_23093(class00734x.y(class00734x));
               }
            }

            return false;
         }
      }
   }

   protected void method_3926(S var1, class01421 var2, class01237 var3, class06959 var4) {
      if (var1.w != null) {
         var3.N(var2, var1.k, 0, var1.w, !var1.n, var1.G, var1.j, var4);
      }
   }

   public class06889 method_23169(S var1) {
      return var1.d != null ? var1.d : class06889.L;
   }

   public int method_24087(T var1, class07209 var2) {
      return var1.method_5809() ? 15 : var1.method_73183().method_8314(class00772.field_9282, var2);
   }

   protected int method_27950(T var1, class07209 var2) {
      return var1.method_73183().method_8314(class00772.field_9284, var2);
   }

   public final int method_24088(T var1, float var2) {
      class07209 class07209 = class07209.method_49638(var1.method_31166(var2));
      return class03042.N(this.method_24087((T)var1, class07209), this.method_27950((T)var1, class07209));
   }

   @Nullable
   private static class07049 method_68837(class07049 var0) {
      class08337 class08337 = class06202.Nq().Na();
      if (class08337 != null) {
         class04782 class04782 = class08337.N(var0.method_73183().method_27983());
         if (class04782 != null) {
            return class04782.method_8469(var0.method_5628());
         }
      }

      return null;
   }

   private void method_72978(S var1, class07299 var2, float var3, class07218 var4, class08050 var5) {
      float f = var3 - (float)(var1.W - var4.method_10264()) * 0.5F;
      class07209 class07209 = var4.method_10074();
      class00500 class00500 = var5.method_8320(class07209);
      if (class00500.b() != class06898.field_11455) {
         int i = var2.U(var4);
         if (i > 3) {
            if (class00500.W(var5, class07209)) {
               class00494 class00494 = class00500.R(var5, class07209);
               if (!class00494.method_1110()) {
                  float f1 = class04995.N(f * 0.5F * class03042.N(var2.method_8597(), i), 0.0F, 1.0F);
                  float f2 = (float)(var4.method_10263() - var1.E);
                  float f3 = (float)(var4.method_10264() - var1.W);
                  float f4 = (float)(var4.method_10260() - var1.m);
                  var1.O.add(new class08453(f2, f3, f4, class00494, f1));
               }
            }
         }
      }
   }

   public final S method_62425(T var1, float var2) {
      class08800 class08800 = this.method_55269();
      this.method_62354((T)var1, (S)class08800, var2);
      this.method_73154((T)var1, (S)class08800);
      this.handler$cgl000$nursultan$injectGetAndUpdateRenderState(var1, var2, new CallbackInfoReturnable("", false, class08800));
      return (S)class08800;
   }
}
