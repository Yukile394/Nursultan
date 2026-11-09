package minecraft;

import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class class00132 extends class05733 {
   private final MutableObject<class05096> N;

   private class00132(class06202 var1, class08781 var2, MutableObject<class05096> var3) {
      super(var3x -> {
         if (var3x) {
            var2.N(class00134.y);
         } else {
            var1.N((class05096)var3.get());
         }
      }, class00392.L("menu.custom_screen_info.title"), class00392.L("menu.custom_screen_info.contents"), class05220.y(var1.q()), class05220.U);
      this.N = var3;
   }

   public void N(@Nullable class05096 var1) {
      this.N.setValue(var1);
   }

   @Nullable
   public class05096 N() {
      return (class05096)this.N.get();
   }

   public static class05096 N(class06202 var0, class08781 var1, class05096 var2) {
      return new class00132(var0, var1, new MutableObject(var2));
   }
}
