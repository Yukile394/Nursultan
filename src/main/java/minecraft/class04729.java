package minecraft;

import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;

public class class04729 extends class05407 {
   static final Logger N = LogUtils.getLogger();
   private static final class00392 u = class00392.L("mco.invites.nopending");
   private final class05096 i;
   private final CompletableFuture<List<class04957>> R = CompletableFuture.supplyAsync(() -> {
      try {
         return class05111.N().U().N();
      } catch (class05097 class05097) {
         N.error("Couldn't list invites", class05097);
         return List.of();
      }
   }, class07536.Z());
   final class03686 y = new class03686(this);
   class04706 L;

   public class04729(class05096 var1, class00392 var2) {
      super(var2);
      this.i = var1;
   }

   @Override
   public void method_25426() {
      class05685.L();
      this.y.N(this.field_22785, this.field_22793);
      this.L = this.y.L(new class04706(this, this.field_22787));
      this.R.thenAcceptAsync(var1 -> {
         List list = var1.stream().map(var1x -> new class04735(this, var1x)).toList();
         this.L.method_25314(list);
         if (list.isEmpty()) {
            this.field_22787.NT().L(u);
         }
      }, this.field_44944);
      this.y.y(class05362.method_46430(class05220.u, var1 -> this.method_25419()).N(200).N());
      this.y.method_48206(var1 -> {
         class06478 class06478 = this.method_37063(var1);
      });
      this.method_48640();
   }

   @Override
   public void method_48640() {
      this.y.N();
      if (this.L != null) {
         this.L.method_57712(this.field_22789, this.y);
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      if (this.R.isDone() && this.L.y()) {
         var1.N(this.field_22793, u, this.field_22789 / 2, this.field_22790 / 2 - 20, -1);
      }
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.i);
   }
}
