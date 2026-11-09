package minecraft;

import com.mojang.logging.LogUtils;
import net.fabricmc.fabric.impl.transfer.item.SpecialLogicAccess;
import net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class08951 extends class00394 implements class08961, class08974, SpecialLogicAccess, SpecialLogicInventory {
   public static final int N = 3;
   private static final Logger u = LogUtils.getLogger();
   private static final String i = "align_items_to_bottom";
   private final class00743<class06584> R = class00743.method_10213(3, class06584.E);
   private boolean M;
   boolean y;

   public class07269 i() {
      return class07269.N(this);
   }

   @Override
   public float method_73188() {
      return this.w().L(class08968.L).b().U();
   }

   @Override
   public class07299 method_73183() {
      return this.z;
   }

   @Override
   public class06889 method_73189() {
      return this.d().method_46558();
   }

   public class08951(class07209 var1, class00500 var2) {
      super(class00404.field_61437, var1, var2);
   }

   public boolean u() {
      return this.M;
   }

   public class06584 y(int var1, class06584 var2) {
      class06584 class06584 = this.method_5441(var1);
      this.N(var1, var2);
      return class06584;
   }

   @Override
   public void y(class08329 var1) {
      var1.L("Items");
   }

   @Override
   protected void N(class02676 var1) {
      super.N(var1);
      var1.N(class02484.NG, class02854.N(this.R));
   }

   @Override
   public class00743<class06584> N() {
      return this.R;
   }

   @Override
   public class07001 N(class01929 var1) {
      class07001 class07001;
      try (class04495 class04495 = new class04495(this.J(), u)) {
         class08303 class08303 = class08303.N(class04495, var1);
         class06686.N(class08303, this.R, true);
         class08303.N("align_items_to_bottom", this.M);
         class07001 = class08303.y();
      }

      return class07001;
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      class06686.N(var1, this.R, true);
      var1.N("align_items_to_bottom", this.M);
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.R.clear();
      class06686.N(var1, this.R);
      this.M = var1.N("align_items_to_bottom", false);
   }

   @Override
   protected void N_9(class02666 var1) {
      super.N_9(var1);
      var1.a_(class02484.NG, class02854.N).N(this.R);
   }

   public void N(@Nullable class03529<class01194> var1) {
      super.method_5431();
      if (this.z != null) {
         if (var1 != null) {
            this.z.N(var1, this.U, class01164.N(this.w()));
         }

         this.G().method_8413(this.d(), this.w(), this.w(), 3);
      }
   }

   @Override
   public boolean method_5443(class08036 var1) {
      return class06695.N(this, var1);
   }

   @Override
   public void method_5431() {
      this.N(class01194.N);
   }

   public void fabric_onFinalCommit(int var1, class06584 var2, class06584 var3) {
   }

   public void fabric_setSuppress(boolean var1) {
      this.y = var1;
   }

   public boolean fabric_shouldSuppressSpecialLogic() {
      return this.y;
   }
}
