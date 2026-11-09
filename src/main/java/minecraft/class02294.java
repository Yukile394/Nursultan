package minecraft;

import Nursultan.class10986;
import Nursultan.class10988;
import Nursultan.class11822;
import Nursultan.class11938;
import Nursultan.class12041;
import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import java.util.List;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl;
import net.fabricmc.fabric.mixin.client.rendering.LivingEntityRendererAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public abstract class class02294<T extends class07438, S extends class08476, M extends class06078<? super S>>
   extends class04507<T, S>
   implements class06252<S, M>,
   class12041,
   LivingEntityRendererAccessor {
   private static final float N = 0.1F;
   protected M y;
   protected final class08943 L;
   protected final List<class06249<S, M>> u = Lists.newArrayList();

   @Override
   public M L() {
      return this.y;
   }

   protected boolean L(S var1) {
      return var1.NM;
   }

   protected int M(S var1) {
      return -1;
   }

   public class02294(class04832 var1, M var2, float var3) {
      super(var1);
      this.L = var1.y();
      this.y = (M)var2;
      this.field_4673 = var3;
   }

   private boolean B(class08476 var1) {
      class10988 class10988 = class10988.N(var1.NE, var1.dataManager().N().N());
      class11938.L().L(class10988);
      return class10988.y();
   }

   protected float i(S var1) {
      return 0.0F;
   }

   protected float method_55831(S var1) {
      return super.method_55831((S)var1) * var1.NL;
   }

   protected void y(S var1, class01421 var2, float var3, float var4) {
      if (this.L((S)var1)) {
         var3 += (float)(Math.cos(class04995.y(var1.P) * 3.25F) * Math.PI * 0.4F);
      }

      if (!var1.N(class01312.field_18078)) {
         var2.N(class02058.u.N(180.0F - var3));
      }

      if (var1.r > 0.0F) {
         float f = (var1.r - 1.0F) / 20.0F * 1.6F;
         f = class04995.N(f);
         if (f > 1.0F) {
            f = 1.0F;
         }

         var2.N(class02058.R.N(f * this.f_()));
      } else if (var1.Nz) {
         var2.N(class02058.y.N(-90.0F - var1.h));
         var2.N(class02058.u.N(var1.P * -75.0F));
      } else if (var1.N(class01312.field_18078)) {
         class07211 class07211 = var1.NW;
         float f1 = class07211 != null ? N(class07211) : var3;
         var2.N(class02058.u.N(f1));
         var2.N(class02058.R.N(this.f_()));
         var2.N(class02058.u.N(270.0F));
      } else if (var1.NR) {
         var2.N(0.0F, (var1.T + 0.1F) / var4, 0.0F);
         var2.N(class02058.R.N(180.0F));
      }
   }

   protected boolean y(S var1) {
      return true;
   }

   protected class00734 method_62358(T var1) {
      class00734 class00734 = super.method_62358((T)var1);
      if (var1.method_6118(class07085.field_6169).N(class06570.GQ)) {
         float f = 0.5F;
         return class00734.L(0.5, 0.5, 0.5);
      } else {
         return class00734;
      }
   }

   protected void y(S var1, class01421 var2) {
   }

   private boolean N(class07438 var1, class08036 var2) {
      class10988 class10988 = class10988.N(var1.method_5756(var2), var1);
      class11938.L().L(class10988);
      return class10988.y();
   }

   private int N(int var1) {
      class10986 class10986 = class10986.N(var1);
      class11938.L().L(class10986);
      return class10986.N();
   }

   protected final boolean N(class06249<S, M> var1) {
      return this.u.add(var1);
   }

   private boolean N(class06584 var1, class07085 var2, Operation var3, class07438 var4) {
      if ((Boolean)var3.call(new Object[]{var1, var2})) {
         return true;
      } else {
         ArmorRenderer armorrenderer = ArmorRendererRegistryImpl.get(var1.B());
         return armorrenderer != null && !armorrenderer.shouldRenderDefaultHeadItem(var4, var1);
      }
   }

   private boolean N(class06584 var1, class07085 var2, Operation var3, LocalRef var4) {
      return this.N(var1, var2, var3, (class07438)var4.get());
   }

   private void N(class07438 var1, double var2, CallbackInfoReturnable var4) {
      if (var1 instanceof class04477 && !SodiumExtraClientMod.options().renderSettings.playerNameTag) {
         var4.setReturnValue(false);
      }
   }

   private void N(class08476 var1, class01421 var2, class01237 var3, class06959 var4, CallbackInfo var5) {
      if (var1 instanceof class02777 && !SodiumExtraClientMod.options().renderSettings.armorStand) {
         var5.cancel();
         if (var1.w != null) {
            this.method_3926((S)var1, var2, var3, var4);
         }
      }
   }

   private float N(class07438 var1, float var2) {
      return var1 instanceof class04453 ? class04995.B(var2, ((class11822)var1).dataManager().u().N(), var1.method_36455()) : var1.method_61414(var2);
   }

   public void method_62354(T var1, S var2, float var3) {
      super.method_62354((T)var1, (S)var2, var3);
      float f = class04995.Z(var3, var1.fields_5212a028292fd3c078969e3ee4c71d9e8_0, var1.fields_4212a028292fd3c078969e3ee4c71d9e8_2);
      var2.x = N(var1, f, var3);
      var2.D = class04995.R(f - var2.x);
      var2.h = this.N(var1, var3);
      var2.NR = this.N((T)var1);
      if (var2.NR) {
         var2.h *= -1.0F;
         var2.D *= -1.0F;
      }

      if (!var1.method_5765() && var1.method_5805()) {
         var2.NN = var1.fields_3212a028292fd3c078969e3ee4c71d9e8_3.L(var3);
         var2.Ny = var1.fields_3212a028292fd3c078969e3ee4c71d9e8_3.y(var3);
      } else {
         var2.NN = 0.0F;
         var2.Ny = 0.0F;
      }

      if (var1.method_5854() instanceof class07438 class07438) {
         var2.Ns = class07438.fields_3212a028292fd3c078969e3ee4c71d9e8_3.L(var3);
      } else {
         var2.Ns = var2.NN;
      }

      var2.NL = var1.method_55693();
      var2.Nu = var1.method_17825();
      var2.Nm = var1.method_18376();
      var2.NW = var1.method_18401();
      if (var2.NW != null) {
         var2.b = var1.method_18381(class01312.field_18076);
      }

      var2.NM = var1.method_32314();
      var2.NB = var1.method_6109();
      var2.NZ = var1.method_5799();
      var2.Nz = var1.method_6123();
      var2.Ni = var1.method_75879(var3);
      var2.NU = var1.fields_2212a028292fd3c078969e3ee4c71d9e8_0 > 0 || var1.fields_2212a028292fd3c078969e3ee4c71d9e8_2 > 0;
      class06584 class06584 = var1.method_6118(class07085.field_6169);
      if (class06584.B() instanceof class06918 class06918 && class06918.L() instanceof class07688 class07688) {
         var2.NT = class07688.y();
         var2.Nb = class06584.method_58694(class02484.Nb);
         var2.NP.y();
      } else {
         var2.NT = null;
         var2.Nb = null;
         class07085 class07085 = class07085.field_6169;
         Operation operation = var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_1799, net.minecraft.class_1304]");
            return class02562.N((class06584)var0[0], (class07085)var0[1]);
         };
         LocalRefImpl localrefimpl = new LocalRefImpl();
         localrefimpl.init(var1);
         boolean flag = this.N(class06584, class07085, operation, localrefimpl);
         var1 = (class07438)localrefimpl.dispose();
         if (!flag) {
            this.L.N(var2.NP, class06584, class03662.field_4316, var1);
         } else {
            var2.NP.y();
         }
      }

      var2.r = var1.fields_2212a028292fd3c078969e3ee4c71d9e8_2 > 0 ? var1.fields_2212a028292fd3c078969e3ee4c71d9e8_2.intValue() + var3 : 0.0F;
      class06202 class06202 = class06202.Nq();
      var2.NE = var2.v && var1.method_5756((class04453)class06202.T_4);
   }

   protected static boolean N(String var0) {
      return "Dinnerbone".equals(var0) || "Grumm".equals(var0);
   }

   public boolean N(T var1) {
      class00392 class00392 = var1.method_5797();
      return class00392 != null && N(class00392.getString());
   }

   protected boolean method_3921(T var1, double var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         if (var1.method_21751()) {
            float f = 32.0F;
            if (var2 >= 1024.0) {
               return false;
            }
         }

         class06202 class06202 = class06202.Nq();
         class04453 class04453 = (class04453)class06202.T_4;
         boolean flag = !this.N(var1, class04453);
         if (var1 != class04453) {
            class00502 class00502x = var1.method_5781();
            class00502 class00502x = class04453.method_5781();
            if (class00502x != null) {
               class06672 class06672 = class00502x.U();
               switch (class06672) {
                  case field_1442:
                     return flag;
                  case field_1443:
                     return false;
                  case field_1444:
                     return class00502x == null ? flag : class00502x.N(class00502x) && (class00502x.z() || flag);
                  case field_1446:
                     return class00502x == null ? flag : !class00502x.N(class00502x) && flag;
                  default:
                     return true;
               }
            }
         }

         return class06202.NB() && var1 != class06202.F() && flag && !var1.method_5782();
      }
   }

   private static float N(class07211 var0) {
      switch (var0) {
         case field_11035:
            return 90.0F;
         case field_11039:
            return 0.0F;
         case field_11043:
            return 270.0F;
         case field_11034:
            return 180.0F;
         default:
            return 0.0F;
      }
   }

   public void method_3936(S var1, class01421 var2, class01237 var3, class06959 var4) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         var2.N();
         if (var1.N(class01312.field_18078)) {
            class07211 class07211 = var1.NW;
            if (class07211 != null) {
               float f = var1.b - 0.1F;
               var2.N(-class07211.P() * f, 0.0F, -class07211.T() * f);
            }
         }

         float f1 = var1.NL;
         var2.y(f1, f1, f1);
         this.y((S)var1, var2, var1.x, f1);
         var2.y(-1.0F, -1.0F, 1.0F);
         this.y((S)var1, var2);
         var2.N(0.0F, -1.501F, 0.0F);
         boolean flag1 = this.R((S)var1);
         boolean flag = !flag1 && !this.B(var1);
         class07311 class07311 = this.N((S)var1, flag1, flag, var1.y());
         if (class07311 != null) {
            int i = N(var1, this.i((S)var1));
            int j = flag ? this.N(654311423) : -1;
            int k = class02566.N(j, this.M((S)var1));
            var3.N(this.y, var1, var2, class07311, var1.G, i, k, null, var1.l, null);
         }

         if (this.y((S)var1) && !this.u.isEmpty()) {
            this.y.method_2819((S)var1);

            for (class06249 class06249 : this.u) {
               class06249.N(var2, var3, var1.G, var1, var1.D, var1.h);
            }
         }

         var2.y();
         super.method_3936((S)var1, var2, var3, var4);
      }
   }

   private static float N(class07438 var0, float var1, float var2) {
      if (var0.method_5854() instanceof class07438 class07438) {
         float f2 = class04995.Z(var2, class07438.fields_4212a028292fd3c078969e3ee4c71d9e8_1, class07438.fields_4212a028292fd3c078969e3ee4c71d9e8_0);
         float f = 85.0F;
         float f1 = class04995.N(class04995.R(var1 - f2), -85.0F, 85.0F);
         f2 = var1 - f1;
         if (Math.abs(f1) > 50.0F) {
            f2 += f1 * 0.2F;
         }

         return f2;
      } else {
         return class04995.Z(var2, var0.fields_4212a028292fd3c078969e3ee4c71d9e8_1, var0.fields_4212a028292fd3c078969e3ee4c71d9e8_0);
      }
   }

   public abstract class01894 N(S var1);

   public static int N(class08476 var0, float var1) {
      return class01384.N(class01384.N(var1), class01384.N(var0.NU));
   }

   @Nullable
   public class07311 N(S var1, boolean var2, boolean var3, boolean var4) {
      class01894 class01894 = this.N((S)var1);
      if (var3) {
         return class06851.Z(class01894);
      } else if (var2) {
         return this.y.method_23500(class01894);
      } else {
         return var4 ? class06851.j(class01894) : null;
      }
   }

   protected boolean R(S var1) {
      return !var1.v;
   }

   protected float f_() {
      return 90.0F;
   }
}
