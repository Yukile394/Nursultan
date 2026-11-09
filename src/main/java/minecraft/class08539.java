package minecraft;

import org.joml.Matrix4fc;

record class08539(class08510 parent) implements class04673 {
   class08539(class08510 parent) {
      super();
      this.parent = parent;
   }

   @Override
   public String toString() {
      return "uvLocked[" + this.parent.y.method_15434() + "]";
   }

   public class08510 N() {
      return this.parent;
   }

   @Override
   public Matrix4fc method_68011(class07211 var1) {
      return this.parent.u.getOrDefault(var1, R);
   }

   @Override
   public class01404 method_3509() {
      return this.parent.L;
   }

   @Override
   public Matrix4fc method_68012(class07211 var1) {
      return this.parent.i.getOrDefault(var1, R);
   }
}
