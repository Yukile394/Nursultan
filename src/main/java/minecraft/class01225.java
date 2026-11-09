package minecraft;

import java.util.ArrayList;
import java.util.List;
import net.fabricmc.fabric.impl.datagen.FabricTagBuilder;
import net.fabricmc.fabric.impl.datagen.ForcedTagEntry;

public class class01225 implements FabricTagBuilder {
   private final List<class01215> N;
   private boolean y = false;

   public class01225 L(class01894 var1) {
      return this.N(class01215.method_43945(var1));
   }

   public class01225() {
      super();
      this.N = new ArrayList<>();
   }

   public class01225 u(class01894 var1) {
      return this.N(class01215.method_43947(var1));
   }

   public class01225 y(class01894 var1) {
      return this.N(class01215.method_43942(var1));
   }

   public List<class01215> y() {
      return List.copyOf(this.N);
   }

   public static class01225 N() {
      return new class01225();
   }

   public class01225 N(class01215 var1) {
      this.N.add(var1);
      return this;
   }

   public class01225 N(class01894 var1) {
      return this.N(class01215.method_43937(var1));
   }

   public void fabric_forceAddTag(class01894 var1) {
      this.N(new ForcedTagEntry(var1));
   }

   public void fabric_setReplace(boolean var1) {
      this.y = var1;
   }

   public boolean fabric_isReplaced() {
      return this.y;
   }
}
