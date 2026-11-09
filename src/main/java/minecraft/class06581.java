package minecraft;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import net.fabricmc.fabric.api.item.v1.CustomDamageHandler;
import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.impl.item.FabricItemInternals;
import net.fabricmc.fabric.impl.item.ItemExtensions;
import net.fabricmc.fabric.impl.transfer.item.ItemVariantCache;
import net.fabricmc.fabric.impl.transfer.item.ItemVariantImpl;
import net.fabricmc.fabric.mixin.item.ItemAccessor;
import net.irisshaders.iris.api.v0.item.IrisItemLightProvider;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06581 implements class02995, class07310, FabricItem, ItemExtensions, ItemVariantCache, ItemAccessor, IrisItemLightProvider {
   public static final Codec<class03556<class06581>> u = class04206.B
      .b()
      .validate(var0 -> var0.N(class06570.N.i()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success(var0));
   public static final class02362<class04247, class03556<class06581>> i = class02389.y(class04227.F);
   private static final Logger N = LogUtils.getLogger();
   public static final Map<class00891, class06581> R = Maps.newHashMap();
   public static final class01894 M = class01894.y("base_attack_damage");
   public static final class01894 B = class01894.y("base_attack_speed");
   public static final int Z = 64;
   public static final int z = 99;
   public static final int U = 13;
   protected static final int E = 72000;
   private final class03529<class06581> y;
   private class02695 L;
   @Nullable
   private final class06581 m;
   protected final String W;
   private final class03767 P;
   @Nullable
   private EquipmentSlotProvider s;
   @Nullable
   private CustomDamageHandler T;
   private final ItemVariant b = new ItemVariantImpl(this, class02678.N);

   public boolean L(class06584 var1) {
      return var1.I();
   }

   public void L(class06584 var1, class08036 var2) {
      this.N(var1, var2.method_73183());
   }

   public boolean M(class06584 var1) {
      return false;
   }

   public int M() {
      return this.L.a_(class02484.L, 1);
   }

   public class06581(class06573 var1) {
      super();
      this.y = class04206.B.R(this);
      this.W = var1.u();
      this.L = var1.N(class00392.L(this.W), var1.i());
      this.m = var1.N;
      this.P = var1.y;
      if (class07529.ND) {
         String sx = this.getClass().getSimpleName();
         if (!sx.endsWith("Item")) {
            N.error("Item classes should end with Item and {} doesn't.", sx);
         }
      }

      this.N(var1, null);
   }

   @Override
   public String toString() {
      return class04206.B.i(this).M();
   }

   @Override
   public class06581 B() {
      return this;
   }

   public boolean B(class06584 var1) {
      return var1.m();
   }

   public int Z(class06584 var1) {
      return class04995.N(Math.round(13.0F - var1.P() * 13.0F / var1.s()), 0, 13);
   }

   public final class06584 Z() {
      return this.m == null ? class06584.E : new class06584(this.m);
   }

   @Deprecated
   public class03529<class06581> i() {
      return this.y;
   }

   public final class00392 U() {
      return this.L.a_(class02484.U, class05220.N);
   }

   public Optional<class04830> U(class06584 var1) {
      return Optional.empty();
   }

   public int z(class06584 var1) {
      int ix = var1.s();
      return class04995.M(Math.max(0.0F, ((float)ix - var1.P()) / ix) / 3.0F, 1.0F, 1.0F);
   }

   public final String z() {
      return this.W;
   }

   public boolean u() {
      return true;
   }

   public void y(class06584 var1, class07438 var2, class07438 var3) {
   }

   public static class06581 y(int var0) {
      return class04206.B.N(var0);
   }

   public boolean y(class06584 var1, class00500 var2) {
      class02197 class02197 = var1.method_58694(class02484.O);
      return class02197 != null && class02197.y(var2);
   }

   public class06509 y(class06584 var1) {
      class08209 class08209 = var1.method_58694(class02484.w);
      if (class08209 != null) {
         return class08209.u();
      } else if (var1.L(class02484.H)) {
         return class06509.field_8949;
      } else {
         return var1.L(class02484.X) ? class06509.field_8951 : class06509.field_8952;
      }
   }

   public class06584 E() {
      return new class06584(this);
   }

   public int N(class06584 var1, class07438 var2) {
      class08209 class08209 = var1.method_58694(class02484.w);
      if (class08209 != null) {
         return class08209.N();
      } else {
         return !var1.L(class02484.H) && !var1.L(class02484.X) ? 0 : 72000;
      }
   }

   public boolean N(class06584 var1, class07299 var2, class07438 var3, int var4) {
      return false;
   }

   public void N(class06584 var1, class07299 var2) {
   }

   protected static class06183 N(class07299 var0, class08036 var1, class05835 var2) {
      class06889 class06889x = var1.method_33571();
      class06889 class06889x = class06889x.i(var1.method_5631(var1.method_36455(), var1.method_36454()).L(var1.method_55754()));
      return var0.N(new class05862(class06889x, class06889x, class05849.field_17559, var2, var1));
   }

   private void N(class06573 var1, CallbackInfo var2) {
      FabricItemInternals.onBuild(var1, this);
   }

   public class00392 N(class06584 var1) {
      return var1.y().a_(class02484.U, class05220.N);
   }

   public boolean N(class06584 var1, @Nullable class08036 var2) {
      return false;
   }

   @Deprecated
   public void N(class06584 var1, class06591 var2, class08562 var3, Consumer<class00392> var4, class06497 var5) {
   }

   public class07082 N(class06501 var1) {
      return class07082.i;
   }

   public float N(class06584 var1, class00500 var2) {
      class02197 class02197 = var1.method_58694(class02484.O);
      return class02197 != null ? class02197.N(var2) : 1.0F;
   }

   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      class06584 class06584 = var2.method_5998(var3);
      class08209 class08209 = class06584.method_58694(class02484.w);
      if (class08209 != null) {
         return class08209.N(var2, class06584, var3);
      } else {
         class08725 class08725 = class06584.method_58694(class02484.o);
         if (class08725 != null && class08725.B()) {
            return class08725.N(class06584, var2);
         } else if (class06584.L(class02484.H)) {
            var2.method_6019(var3);
            return class07082.L;
         } else {
            class08174 class08174 = class06584.method_58694(class02484.X);
            if (class08174 != null) {
               var2.method_6019(var3);
               class08174.y(var2);
               return class07082.L;
            } else {
               return class07082.i;
            }
         }
      }
   }

   public class06584 N(class06584 var1, class07299 var2, class07438 var3) {
      class08209 class08209 = var1.method_58694(class02484.w);
      return class08209 != null ? class08209.N(var2, var3, var1) : var1;
   }

   public boolean N(class06584 var1, class06937 var2, class05442 var3, class08036 var4) {
      return false;
   }

   @Deprecated
   public static class06581 N(class00891 var0) {
      return R.getOrDefault(var0, class06570.N);
   }

   public void N(class07299 var1, class07438 var2, class06584 var3, int var4) {
   }

   public void N(class00717 var1) {
   }

   public boolean N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class07438 var5) {
      class02197 class02197 = var1.method_58694(class02484.O);
      return class02197 != null && !class02197.u() ? !(var5 instanceof class08036) || !((class08036)var5).method_31549().u : true;
   }

   public void N(class06584 var1, class04782 var2, class07049 var3, @Nullable class07085 var4) {
   }

   public boolean N(class06584 var1, class07299 var2, class00500 var3, class07209 var4, class07438 var5) {
      class02197 class02197 = var1.method_58694(class02484.O);
      if (class02197 == null) {
         return false;
      } else {
         if (!var2.method_8608() && var3.i(var2, var4) != 0.0F && class02197.L() > 0) {
            var1.N(class02197.L(), var5, class07085.field_6173);
         }

         return true;
      }
   }

   public class07082 N(class06584 var1, class08036 var2, class07438 var3, class07050 var4) {
      return class07082.i;
   }

   public static int N(class06581 var0) {
      return var0 == null ? 0 : class04206.B.N(var0);
   }

   public boolean N(class06584 var1, class06584 var2, class06937 var3, class05442 var4, class08036 var5, class04803 var6) {
      return false;
   }

   public float N(class07049 var1, float var2, class07072 var3) {
      return 0.0F;
   }

   @Deprecated
   @Nullable
   public class07072 N(class07438 var1) {
      return null;
   }

   public void N(class06584 var1, class07438 var2, class07438 var3) {
   }

   public class02695 R() {
      return this.L;
   }

   @Override
   public class03767 method_45322() {
      return this.P;
   }

   @Nullable
   public CustomDamageHandler fabric_getCustomDamageHandler() {
      return this.T;
   }

   @Nullable
   public EquipmentSlotProvider fabric_getEquipmentSlotProvider() {
      return this.s;
   }

   public ItemVariant fabric_getCachedItemVariant() {
      return this.b;
   }

   public void fabric_setCustomDamageHandler(@Nullable CustomDamageHandler var1) {
      this.T = var1;
   }

   public void fabric_setEquipmentSlotProvider(@Nullable EquipmentSlotProvider var1) {
      this.s = var1;
   }
}
