package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

class class00727<T> implements class00720<T> {
   @Override
   public class01921<T> L() {
      return this.y;
   }

   class00727(class00731 var1, Map var2, class01921 var3, ImmutableMap var4) {
      super();
      this.u = var1;
      this.N = var2;
      this.y = var3;
      this.L = var4;
   }

   @Override
   public void u() {
      this.L.forEach((var1, var2) -> {
         List list = var0.getOrDefault(var1, List.of());
         var2.y(list);
      });
      this.u.L = class00752.N(this.L);
      class00731 class00731 = this.u;
      this.N(null);
      class00731.m();
   }

   @Override
   public int y() {
      return this.N.size();
   }

   @Override
   public class05946<? extends class00751<? extends T>> N() {
      return this.u.i();
   }

   private void N(CallbackInfo var1) {
      this.u.fabric_applyPendingTagAliases();
   }
}
