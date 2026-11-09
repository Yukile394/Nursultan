package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

class class05732 extends class05724<class05762> {
   static final class00392 N = class00392.L("createWorld.customize.flat.tile").N(class06541.field_1073);
   static final class00392 y = class00392.L("createWorld.customize.flat.height").N(class06541.field_1073);

   private void L() {
      this.method_73370(new class05734(this.L.field_22793), (int)(9.0 * 1.5));
      List<class01627> list = this.L.L.i().reversed();

      for (int i = 0; i < list.size(); i++) {
         this.method_25321(new class05749(this, list.get(i), i));
      }
   }

   public class05732(class05737 var1) {
      super(var1.field_22787, var1.field_22789, var1.field_22790 - 103, 43, 24);
      this.L = var1;
      this.L();
   }

   public void y() {
      int i = this.method_25396().indexOf(this.method_25334());
      this.method_25339();
      this.L();
      List<class05762> list = this.method_25396();
      if (i >= 0 && i < list.size()) {
         this.method_25313(list.get(i));
      }
   }

   public void method_25313(@Nullable class05762 var1) {
      super.method_25313(var1);
      this.L.y();
   }

   void N(class05749 var1) {
      List<class01627> list = this.L.L.i();
      int i = this.method_25396().indexOf(var1);
      this.method_25330(var1);
      list.remove(var1.N);
      this.method_25313(list.isEmpty() ? null : this.method_25396().get(Math.min(i, list.size())));
      this.L.L.M();
      this.y();
      this.L.y();
   }
}
