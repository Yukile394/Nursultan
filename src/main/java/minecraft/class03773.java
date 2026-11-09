package minecraft;

import Nursultan.class10236;
import com.mojang.logging.LogUtils;
import java.util.Objects;
import net.caffeinemc.mods.lithium.api.inventory.LithiumTransferConditionInventory;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant;
import net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03773 extends class00394 implements class08974, LithiumTransferConditionInventory, SpecialLogicInventory {
   public static final int N = 6;
   private static final Logger y = LogUtils.getLogger();
   private static final int u = -1;
   private final class00743<class06584> i;
   public int R;
   private boolean M = false;
   private final SnapshotParticipant B = new class10236(this);

   public int L() {
      return this.R;
   }

   public class03773(class07209 var1, class00500 var2) {
      super(class00404.field_40329, var1, var2);
      this.i = class00743.method_10213(6, class06584.E);
      this.R = -1;
   }

   @Override
   public void y(class08329 var1) {
      var1.L("Items");
   }

   @Override
   protected void N_9(class02666 var1) {
      super.N_9(var1);
      var1.a_(class02484.NG, class02854.N).N(this.i);
   }

   public void N(int var1) {
      if (var1 >= 0 && var1 < 6) {
         this.R = var1;
         class00500 class00500 = this.w();

         for (int ix = 0; ix < class03769.Z.size(); ix++) {
            boolean flag = !this.method_5438(ix).R();
            class06667 class06667 = class03769.Z.get(ix);
            class00500 = class00500.y(class06667, flag);
         }

         Objects.requireNonNull(this.z).method_8652(this.U, class00500, 3);
         this.z.N(class01194.L, this.U, class01164.N(class00500));
      } else {
         y.error("Expected slot 0-5, got {}", var1);
      }
   }

   @Override
   public class00743<class06584> N() {
      return this.i;
   }

   @Override
   protected void N(class02676 var1) {
      super.N(var1);
      var1.N(class02484.NG, class02854.N(this.i));
   }

   public void N(int var1, class06584 var2, CallbackInfo var3) {
      if (this.M) {
         this.i.set(var1, var2);
         var3.cancel();
      }
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.yv);
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.i.clear();
      class06686.N(var1, this.i);
      this.R = var1.N("last_interacted_slot", -1);
   }

   @Override
   public boolean N(class06695 var1, int var2, class06584 var3) {
      return var1.N_60(var2x -> var2x.R() ? true : class06584.L(var3, var2x) && var2x.c() + var3.c() <= var1.a_(var2x));
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      class06686.N(var1, this.i, true);
      var1.N("last_interacted_slot", this.R);
   }

   @Override
   public boolean method_5443(class08036 var1) {
      return class06695.N(this, var1);
   }

   @Override
   public int method_5444() {
      return 1;
   }

   @Override
   public void method_5447(int var1, class06584 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (this.N(var2)) {
            this.N().set(var1, var2);
            this.N(var1);
         } else if (var2.R()) {
            this.method_5434(var1, this.method_5444());
         }
      }
   }

   @Override
   public class06584 method_5434(int var1, int var2) {
      class06584 class06584 = Objects.requireNonNullElse(this.N().get(var1), class06584.E);
      this.N().set(var1, class06584.E);
      if (!class06584.R()) {
         this.N(var1);
      }

      return class06584;
   }

   public void fabric_onFinalCommit(int var1, class06584 var2, class06584 var3) {
   }

   public void fabric_onTransfer(int var1, TransactionContext var2) {
      this.B.updateSnapshots(var2);
      this.R = var1;
   }

   public void fabric_setSuppress(boolean var1) {
      this.M = var1;
   }

   public boolean lithium$itemInsertionTestRequiresStackSize1() {
      return true;
   }
}
