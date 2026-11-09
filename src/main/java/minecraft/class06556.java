package minecraft;

import Nursultan.class10621;
import com.google.common.collect.Maps;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06556 {
   public final Map<class01894, class10621> N = Maps.newHashMap();
   public int y;

   public class06556() {
      super();
   }

   public class01894 y(class06584 var1) {
      class08208 class08208 = var1.method_58694(class02484.Y);
      class01894 class01894 = class04206.B.y(var1.B());
      return class08208 == null ? class01894 : class08208.L().orElse(class01894);
   }

   protected void y(class01894 var1, int var2) {
   }

   protected void y(class01894 var1) {
   }

   public void N(class01894 var1, int var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.N.put(var1, new class10621(this.y, this.y + var2));
         this.y(var1, var2);
      }
   }

   public void N(class01894 var1) {
      this.N.remove(var1);
      this.y(var1);
   }

   private void N(CallbackInfo var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         var1.cancel();
      }
   }

   public boolean N(class06584 var1) {
      return this.N(var1, 0.0F) > 0.0F;
   }

   public float N(class06584 var1, float var2) {
      class01894 class01894 = this.y(var1);
      class10621 class10621 = this.N.get(class01894);
      if (class10621 != null) {
         float f = class10621.y() - class10621.N();
         return class04995.N((class10621.y() - (this.y + var2)) / f, 0.0F, 1.0F);
      } else {
         return 0.0F;
      }
   }

   public void N() {
      this.y++;
      if (!this.N.isEmpty()) {
         Iterator<Entry<class01894, class10621>> iterator = this.N.entrySet().iterator();

         while (iterator.hasNext()) {
            Entry entry = iterator.next();
            if (((class10621)entry.getValue()).y() <= this.y) {
               iterator.remove();
               this.y((class01894)entry.getKey());
            }
         }
      }
   }

   public void N(class06584 var1, int var2) {
      this.N(this.y(var1), var2);
   }
}
