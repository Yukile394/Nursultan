package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import net.fabricmc.fabric.impl.resource.PackSourceTracker;
import net.fabricmc.fabric.impl.resource.conditions.OverlayConditionsMetadata;
import net.fabricmc.fabric.impl.resource.pack.FabricPack;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01055 implements FabricPack {
   private static final Logger N = LogUtils.getLogger();
   private final class02267 y;
   private final class01061 L;
   private final class01078 u;
   private final class02268 i;
   private static final Predicate R;
   private Predicate M;

   public class00392 L() {
      return this.u.N();
   }

   public String M() {
      return this.y.N();
   }

   public boolean fabric$isHidden() {
      return this.M != R;
   }

   public class01055(class02267 var1, class01061 var2, class01078 var3, class02268 var4) {
      super();
      this.M = R;
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class01055 class01055) ? false : this.y.equals(class01055.y);
      }
   }

   @Override
   public int hashCode() {
      return this.y.hashCode();
   }

   public class02268 B() {
      return this.i;
   }

   public boolean Z() {
      return this.i.N();
   }

   public class03767 i() {
      return this.u.L();
   }

   public class01090 U() {
      return this.i.y();
   }

   public boolean z() {
      return this.i.L();
   }

   public class01614 u() {
      return this.u.y();
   }

   public class00392 y() {
      return this.y.y();
   }

   public class01283 E() {
      return this.y.L();
   }

   private void N(CallbackInfoReturnable var1) {
      PackSourceTracker.setSource((class01622)var1.getReturnValue(), this.N().L());
   }

   private static List N(List var0, class01622 var1) throws IOException {
      ArrayList arraylist = new ArrayList(var0);
      OverlayConditionsMetadata overlayconditionsmetadata = var1.method_14407(OverlayConditionsMetadata.SERIALIZER);
      if (overlayconditionsmetadata != null) {
         arraylist.addAll(overlayconditionsmetadata.appliedOverlays());
      }

      return List.copyOf(arraylist);
   }

   @Nullable
   public static class01078 N(class02267 var0, class01061 var1, class08735 var2, class01603 var3) {
      try {
         class01078 class01078;
         try (class01622 class01622 = var1.method_52424(var0)) {
            class01612 class01612 = class01622.method_14407(class01612.y(var3));
            if (class01612 == null) {
               class01612 = class01622.method_14407(class01612.L);
            }

            if (class01612 == null) {
               N.warn("Missing metadata in pack {}", var0.N());
               return null;
            }

            class02974 class02974 = class01622.method_14407(class02974.N);
            class03767 class03767 = class02974 != null ? class02974.N() : class03767.N();
            class01614 class01614 = class01614.N(class01612.y(), var2);
            class04150 class04150 = class01622.method_14407(class04150.y(var3));
            List list = class04150 != null ? class04150.N(var2) : List.of();
            list = N(list, class01622);
            class01078 = new class01078(class01612.N(), class01614, class03767, list);
         }

         return class01078;
      } catch (Exception exception) {
         N.warn("Failed to read pack {} metadata", var0.N(), exception);
         return null;
      }
   }

   public class02267 N() {
      return this.y;
   }

   public class00392 N(boolean var1) {
      return this.y.N(var1, this.u.N());
   }

   @Nullable
   public static class01055 N(class02267 var0, class01061 var1, class01603 var2, class02268 var3) {
      class08735 class08735 = class07529.y().method_70592(var2);
      class01078 class01078 = N(var0, var1, class08735, var2);
      return class01078 != null ? new class01055(var0, var1, class01078, var3) : null;
   }

   public boolean fabric$parentsEnabled(Set var1) {
      return this.M.test(var1);
   }

   public class01622 R() {
      class01622 class01622x;
      class01622 class01622x = class01622x = this.L.method_52425(this.y, this.u);
      this.N(new CallbackInfoReturnable("", false, class01622x));
      return class01622x;
   }

   public void fabric$setParentsPredicate(Predicate var1) {
      this.M = var1;
   }
}
