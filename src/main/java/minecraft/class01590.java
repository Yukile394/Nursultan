package minecraft;

import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.List;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01590 {
   private static final float u = 0.01F;
   private static final float i = 0.01F;
   private static final float R = -0.01F;
   public static final float N = 0.03F;
   public final int y = 9;
   private final class06069 M = class06069.u();
   final class01621 L;
   private final class05228 B;

   public List<class01028> L(class05936 var1, int var2) {
      return class07018.y().N(this.B.y(var1, var2, class00405.N));
   }

   public class01590(class01621 var1) {
      super();
      this.L = var1;
      this.B = new class05228((var1x, var2) -> this.N(var2.E()).N(var1x).N().N(var2.L()));
   }

   public List<class05936> u(class05936 var1, int var2) {
      return this.B.y(var1, var2, class00405.N);
   }

   public class05228 y() {
      return this.B;
   }

   public int y(String var1) {
      return class04995.u(this.B.N(var1));
   }

   public int y(class05936 var1, int var2) {
      return 9 * this.B.y(var1, var2, class00405.N).size();
   }

   public String N(String var1, int var2) {
      return this.B.y(var1, var2, class00405.N);
   }

   public class05936 N(class05936 var1, int var2) {
      return this.B.N(var1, var2, class00405.N);
   }

   private void N(class05936 var1, CallbackInfoReturnable var2) {
      if ((class03448)class06202.Nq().T_3 != null && ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         int ix = 0;

         for (class01028 class01028 : this.L(var1, Integer.MAX_VALUE)) {
            if (this.N(class01028) >= ix) {
               ix = this.N(class01028);
            }
         }

         var2.setReturnValue(class04995.u((float)ix));
      }
   }

   private void N(
      class00392 var1, float var2, float var3, int var4, boolean var5, Matrix4f var6, class01407 var7, class01583 var8, int var9, int var10, CallbackInfo var11
   ) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         List<class01028> list = this.L(var1, Integer.MAX_VALUE);
         if (!list.isEmpty()) {
            var11.cancel();
            int ix = 0;

            for (int j = list.size(); ix < j; ix++) {
               this.N(list.get(ix), var2, var3 - list.size() * (this.y + 2) + ix * (this.y + 2), var4, var5, new Matrix4f(var6), var7, var8, var9, var10);
            }
         }
      }
   }

   private void N(
      String var1, float var2, float var3, int var4, boolean var5, Matrix4f var6, class01407 var7, class01583 var8, int var9, int var10, CallbackInfo var11
   ) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         List<class01028> list = this.L(class05936.R(this.N() ? this.N(var1) : var1), Integer.MAX_VALUE);
         if (!list.isEmpty()) {
            var11.cancel();
            int ix = 0;

            for (int j = list.size(); ix < j; ix++) {
               this.N(list.get(ix), var2, var3 - j * (this.y + 2) + ix * (this.y + 2), var4, var5, new Matrix4f(var6), var7, var8, var9, var10);
            }
         }
      }
   }

   public boolean N() {
      return class07018.y().N();
   }

   public void N(class01028 var1, float var2, float var3, int var4, int var5, Matrix4f var6, class01407 var7, int var8) {
      class01588 class01588x = new class01588(this, 0.0F, 0.0F, var5, false, false);

      for (int ix = -1; ix <= 1; ix++) {
         for (int var11 = -1; var11 <= 1; var11++) {
            if (ix != 0 || var11 != 0) {
               float[] afloat = new float[]{var2};
               int k = ix;
               int l = var11;
               var1.accept((var7x, var8x, var9x) -> {
                  boolean flag = var8x.L();
                  class07948 class07948 = this.N(var9x, var8x);
                  class01588x.N = afloat[0] + k * class07948.N().y();
                  class01588x.y = var3 + l * class07948.N().y();
                  afloat[0] += class07948.N().N(flag);
                  return class01588x.N(var7x, var8x.N(var5), class07948);
               });
            }
         }
      }

      class01609 class01609 = class01609.N(var7, var6, class01583.field_33993, var8);

      for (class07915 class07915 : class01588x.L) {
         class01609.N(class07915);
      }

      class01588 class01588x = new class01588(this, var2, var3, var4, false, true);
      var1.accept(class01588x);
      class01588x.N(class01609.N(var7, var6, class01583.field_33995, var8));
   }

   public void N(class01028 var1, float var2, float var3, int var4, boolean var5, Matrix4f var6, class01407 var7, class01583 var8, int var9, int var10) {
      this.N(var1, var2, var3, var4, var5, false, var9).N(class01609.N(var7, var6, var8, var10));
   }

   public void N(class00392 var1, float var2, float var3, int var4, boolean var5, Matrix4f var6, class01407 var7, class01583 var8, int var9, int var10) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.N(var1.method_30937(), var2, var3, var4, var5, false, var9).N(class01609.N(var7, var6, var8, var10));
      }
   }

   public void N(String var1, float var2, float var3, int var4, boolean var5, Matrix4f var6, class01407 var7, class01583 var8, int var9, int var10) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.N(var1, var2, var3, var4, var5, var9).N(class01609.N(var7, var6, var8, var10));
      }
   }

   public String N(String var1) {
      try {
         Bidi bidi = new Bidi(new ArabicShaping(8).shape(var1), 127);
         bidi.setReorderingMode(0);
         return bidi.writeReordered(2);
      } catch (ArabicShapingException arabicshapingexception) {
         return var1;
      }
   }

   private class08985 N(class00949 var1) {
      return this.L.N(var1);
   }

   public String N(String var1, int var2, boolean var3) {
      return var3 ? this.B.L(var1, var2, class00405.N) : this.B.y(var1, var2, class00405.N);
   }

   public int N(class01028 var1) {
      return class04995.u(this.B.N(var1));
   }

   public int N(class05936 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueI() : class04995.u(this.B.N(var1));
   }

   public class01608 N(class01028 var1, float var2, float var3, int var4, boolean var5, boolean var6, int var7) {
      class01588 class01588 = new class01588(this, var2, var3, var4, var7, var5, var6);
      var1.accept(class01588);
      return class01588;
   }

   public class01608 N(String var1, float var2, float var3, int var4, boolean var5, int var6) {
      if (this.N()) {
         var1 = this.N(var1);
      }

      class01588 class01588 = new class01588(this, var2, var3, var4, var6, var5, false);
      class05232.L(var1, class00405.N, class01588);
      return class01588;
   }

   public class07948 N(int var1, class00405 var2) {
      class08985 class08985 = this.N(var2.E());
      class07948 class07948 = class08985.N(var1);
      if (var2.M() && var1 != 32) {
         int ix = class04995.u(class07948.N().N(false));
         class07948 = class08985.N(this.M, ix);
      }

      return class07948;
   }
}
