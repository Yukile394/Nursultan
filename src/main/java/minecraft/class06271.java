package minecraft;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricModel;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public abstract class class06271<S> implements FabricModel {
   protected final class01686 field_54014;
   protected final Function<class01894, class07311> field_21343;
   private final List<class01686> field_54013;
   private final Map childPartMap = new Object2ObjectOpenHashMap();

   public class06271(class01686 var1, Function<class01894, class07311> var2) {
      super();
      this.field_54014 = var1;
      this.field_21343 = var2;
      this.field_54013 = var1.i();
      this.m_handler$zom000$fabric_rendering_v1$fillChildPartMap_56(var1, var2, null);
   }

   private void m_handler$zom000$fabric_rendering_v1$fillChildPartMap_56(class01686 var1, Function var2, CallbackInfo var3) {
      var1.fabric$callForEachChild(this.childPartMap::putIfAbsent);
   }

   public final class01686 method_63512() {
      return this.field_54014;
   }

   public void method_2819(S var1) {
      this.method_63514();
   }

   public final class07311 method_23500(class01894 var1) {
      return this.field_21343.apply(var1);
   }

   public final void method_62100(class01421 var1, class01391 var2, int var3, int var4, int var5) {
      this.method_63512().N(var1, var2, var3, var4, var5);
   }

   @Nullable
   public class01686 getChildPart(String var1) {
      return (class01686)this.childPartMap.get(var1);
   }

   public void copyTransforms(class06271 var1) {
      copyTransforms(var1.method_63512(), this.method_63512());
      var1.method_63512().fabric$callForEachChild((var1x, var2) -> {
         class01686 class01686 = this.getChildPart(var1x);
         if (class01686 != null) {
            copyTransforms(var2, class01686);
         }
      });
   }

   private static void copyTransforms(class01686 var0, class01686 var1) {
      var1.y = var0.y;
      var1.L = var0.L;
      var1.u = var0.u;
      var1.i = var0.i;
      var1.R = var0.R;
      var1.M = var0.M;
      var1.B = var0.B;
      var1.Z = var0.Z;
      var1.z = var0.z;
   }

   public final void method_63514() {
      Iterator<class01686> iterator = this.field_54013.iterator();

      while (iterator.hasNext()) {
         iterator.next().L();
      }
   }

   public final List<class01686> method_63513() {
      return this.field_54013;
   }

   public final void method_60879(class01421 var1, class01391 var2, int var3, int var4) {
      this.method_62100(var1, var2, var3, var4, -1);
   }
}
