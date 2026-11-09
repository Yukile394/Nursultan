package minecraft;

import java.util.Arrays;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents.Load;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents.Unload;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
final class class03455 implements class01109<class07049> {
   public void L(class07049 var1) {
      this.N.y.N(var1);
   }

   public void M(class07049 var1) {
   }

   class03455(class03448 var1) {
      super();
      this.N = var1;
   }

   public void i(class07049 var1) {
      switch (var1) {
         case class04477 class04477:
            this.N.u.add(class04477);
            break;
         case class00690 class00690:
            this.N.i.addAll(Arrays.asList(class00690.E()));
            break;
         default:
      }

      this.N((class07049)var1, null);
   }

   public void u(class07049 var1) {
      this.N.y.y(var1);
   }

   public void y(class07049 var1) {
   }

   private void y(class07049 var1, CallbackInfo var2) {
      ((Unload)ClientEntityEvents.ENTITY_UNLOAD.invoker()).onUnload(var1, this.N);
   }

   private void N(class07049 var1, CallbackInfo var2) {
      ((Load)ClientEntityEvents.ENTITY_LOAD.invoker()).onLoad(var1, this.N);
   }

   public void N(class07049 var1) {
   }

   public void R(class07049 var1) {
      this.y((class07049)var1, null);
      ((class07049)var1).method_18375();
      switch (var1) {
         case class04477 class04477:
            this.N.u.remove(class04477);
            break;
         case class00690 class00690:
            this.N.i.removeAll(Arrays.asList(class00690.E()));
            break;
         default:
      }
   }
}
