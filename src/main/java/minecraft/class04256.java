package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl;

@Environment(EnvType.CLIENT)
public abstract class class04256<T extends class07079, S extends class08467, M extends class01188<S>> extends class02795<T, S, M> {
   private static class07070 L(class07438 var0) {
      class07070 class07070 = var0.method_6068();
      return var0.fields_0212a028292fd3c078969e3ee4c71d9e8_6 == class07050.field_5808 ? class07070 : class07070.N();
   }

   public class04256(class04832 var1, M var2, float var3) {
      this(var1, (M)var2, (M)var2, var3);
   }

   public class04256(class04832 var1, M var2, M var3, float var4, class02221 var5) {
      super(var1, (M)var2, (M)var3, var4);
      this.N(new class02245<>(this, var1.R(), var1.U(), var5));
      this.N(new class02242<>(this, var1.R(), var1.B()));
      this.N(new class02758<>(this));
   }

   public class04256(class04832 var1, M var2, M var3, float var4) {
      this(var1, (M)var2, (M)var3, var4, class02221.N);
   }

   private static boolean N(class06584 var0, class07085 var1, Operation var2) {
      return (Boolean)var2.call(new Object[]{var0, var1}) || ArmorRendererRegistryImpl.get(var0.B()) != null;
   }

   public void method_62354(T var1, S var2, float var3) {
      super.method_62354((T)var1, (S)var2, var3);
      N(var1, var2, var3, this.L);
      var2.NV = this.N((T)var1, class07070.field_6182);
      var2.No = this.N((T)var1, class07070.field_6183);
   }

   public class01180 N(T var1, class07070 var2) {
      class06584 class06584 = var1.method_61420(var2);
      class08186 class08186 = class06584.method_58694(class02484.a);
      if (class08186 != null && class08186.N() == class08155.field_63400 && var1.fields_0212a028292fd3c078969e3ee4c71d9e8_4) {
         return class01180.field_63543;
      } else {
         return class06584.N(class01226.LR) ? class01180.field_63543 : class01180.field_3409;
      }
   }

   public static void N(class07438 var0, class08467 var1, float var2, class08943 var3) {
      class08827.N(var0, var1, var3, var2);
      var1.Z = var0.method_18276();
      var1.g = var0.method_6128();
      var1.I = var0.method_20232();
      var1.J = var0.method_5765();
      var1.u = 1.0F;
      if (var1.g) {
         var1.u = (float)var0.method_18798().B();
         var1.u /= 0.2F;
         var1.u = var1.u * (var1.u * var1.u);
      }

      if (var1.u < 1.0F) {
         var1.u = 1.0F;
      }

      var1.L = var0.method_6024(var2);
      var1.M = L(var0);
      var1.B = var0.method_6058();
      var1.i = class06593.y(var0.method_6030(), var0);
      var1.R = var0.method_75120(var2);
      var1.o = var0.method_6115();
      var1.q = var0.fields_5212a028292fd3c078969e3ee4c71d9e8_1.N(var2);
      var1.K = var0.fields_5212a028292fd3c078969e3ee4c71d9e8_1.y(var2);
      var1.V = var0.fields_5212a028292fd3c078969e3ee4c71d9e8_1.L(var2);
      var1.e = N(var0, class07085.field_6169);
      var1.H = N(var0, class07085.field_6174);
      var1.c = N(var0, class07085.field_6172);
      var1.X = N(var0, class07085.field_6166);
   }

   private static class06584 N(class07438 var0, class07085 var1) {
      class06584 class06584 = var0.method_6118(var1);
      return N(class06584, var1, var0x -> {
         WrapOperationRuntime.checkArgumentCount(var0x, 2, "[net.minecraft.class_1799, net.minecraft.class_1304]");
         return class02562.N((class06584)var0x[0], (class07085)var0x[1]);
      }) ? class06584.t() : class06584.E;
   }
}
