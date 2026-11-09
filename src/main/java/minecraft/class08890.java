package minecraft;

import java.util.Map;
import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.model.loading.BakedModelsHooks;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public final class class08890 implements BakedModelsHooks {
   private class08881 missingModels;
   private Map<class00500, class08887> blockStateModels;
   private Map<class01894, class08910> itemStackModels;
   private Map<class01894, class08906> itemProperties;
   @Nullable
   private Map i;

   public Map<class01894, class08910> L() {
      return this.itemStackModels;
   }

   public class08890(class08881 var1, Map<class00500, class08887> var2, Map<class01894, class08910> var3, Map<class01894, class08906> var4) {
      super();
      this.missingModels = var1;
      this.blockStateModels = var2;
      this.itemStackModels = var3;
      this.itemProperties = var4;
   }

   @Override
   public final boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class08890
            && Objects.equals(this.missingModels, ((class08890)var1).missingModels)
            && Objects.equals(this.blockStateModels, ((class08890)var1).blockStateModels)
            && Objects.equals(this.itemStackModels, ((class08890)var1).itemStackModels)
            && Objects.equals(this.itemProperties, ((class08890)var1).itemProperties);
   }

   @Override
   public final String toString() {
      return "class08890[missingModels="
         + Objects.toString(this.missingModels)
         + ", blockStateModels="
         + Objects.toString(this.blockStateModels)
         + ", itemStackModels="
         + Objects.toString(this.itemStackModels)
         + ", itemProperties="
         + Objects.toString(this.itemProperties)
         + "]";
   }

   @Override
   public final int hashCode() {
      return (((0 * 31 + Objects.hashCode(this.missingModels)) * 31 + Objects.hashCode(this.blockStateModels)) * 31 + Objects.hashCode(this.itemStackModels))
            * 31
         + Objects.hashCode(this.itemProperties);
   }

   public Map<class01894, class08906> u() {
      return this.itemProperties;
   }

   public Map<class00500, class08887> y() {
      return this.blockStateModels;
   }

   public class08881 N() {
      return this.missingModels;
   }

   public void fabric_setExtraModels(@Nullable Map var1) {
      this.i = var1;
   }

   @Nullable
   public Map fabric_getExtraModels() {
      return this.i;
   }
}
