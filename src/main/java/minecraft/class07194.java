package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.transfer.v1.item.InventoryStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageUtil;
import net.fabricmc.fabric.impl.transfer.TransferApiImpl;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07194 extends class06758 {
   private static final Logger R = LogUtils.getLogger();
   public static final MapCodec<class07194> i = y(class07194::new);
   private static final class00755 M = new class07206();

   public class07194(class01362 var1) {
      super(var1);
   }

   @Override
   protected void N(class04782 var1, class00500 var2, class07209 var3) {
      class07243 class07243 = var1.N(var3, class00404.field_11899).orElse(null);
      if (class07243 == null) {
         R.warn("Ignoring dispensing attempt for Dropper without matching block entity at {}", var3);
      } else {
         class07210 class07210 = new class07210(var1, var3, var2, class07243);
         int ix = class07243.N(var1.field_9229);
         if (ix < 0) {
            var1.N(1001, var3, 0);
         } else {
            class06584 class06584x = class07243.method_5438(ix);
            if (!class06584x.R()) {
               class07211 class07211 = var1.method_8320(var3).L(y);
               class06695 class06695 = class07234.N(var1, var3.method_10093(class07211));
               class06584 class06584x;
               if (class06695 == null) {
                  class00755 class00755 = M;
                  CallbackInfo callbackinfo = new CallbackInfo("", true);
                  this.N(var1, var2, var3, callbackinfo);
                  if (callbackinfo.isCancelled()) {
                     return;
                  }

                  class06584x = class00755.dispense(class07210, class06584x);
               } else {
                  class06584x = class07234.N(class07243, class06695, class06584x.L(1), class07211.b());
                  if (class06584x.R()) {
                     class06584x = class06584x.t();
                     class06584x.B(1);
                  } else {
                     class06584x = class06584x.t();
                  }
               }

               class07243.method_5447(ix, class06584x);
            }
         }
      }
   }

   public void N(class04782 var1, class00500 var2, class07209 var3, CallbackInfo var4) {
      class07243 class07243 = (class07243)var1.method_8321(var3);
      class07211 class07211 = class07243.w().L(class06758.y);
      Storage<ItemVariant> storage = (Storage<ItemVariant>)ItemStorage.SIDED.find(var1, var3.method_10093(class07211), class07211.b());
      if (storage != null) {
         var4.cancel();
         int ix = class07243.N(var1.field_9229);
         if (ix == -1) {
            TransferApiImpl.LOGGER.warn("Skipping dropper transfer because the empty slot is unexpectedly -1.");
            return;
         }

         StorageUtil.move(InventoryStorage.of(class07243, null).getSlot(ix), storage, var0 -> true, 1L, null);
      }
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class07247(var1, var2);
   }

   @Override
   protected class00755 N(class07299 var1, class06584 var2) {
      return M;
   }

   @Override
   public MapCodec<class07194> N() {
      return i;
   }
}
