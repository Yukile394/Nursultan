package minecraft;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.sound.v1.FabricSoundInstance;
import net.fabricmc.fabric.mixin.client.sound.SoundInstanceMixin;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public interface class00044 extends FabricSoundInstance, SoundInstanceMixin {
   class01894 L();

   int M();

   float B();

   float Z();

   class04911 i();

   default boolean s() {
      return true;
   }

   boolean m();

   static class06069 v() {
      return class06069.u();
   }

   double U();

   double z();

   @Nullable
   class00002 u();

   double E();

   @Nullable
   class00137 N(class09033 var1);

   class00018 W();

   boolean R();

   default boolean w_() {
      return false;
   }
}
