package minecraft;

import org.joml.Vector3f;

record class00121(class01686 part, class04364 target, class04341[] keyframes) {
   public class04341[] L() {
      return this.keyframes;
   }

   class00121(class01686 part, class04364 target, class04341[] keyframes) {
      super();
      this.part = part;
      this.target = target;
      this.keyframes = keyframes;
   }

   public class04364 y() {
      return this.target;
   }

   public class01686 N() {
      return this.part;
   }

   public void N(float var1, float var2, Vector3f var3) {
      int i = Math.max(0, class04995.N(0, this.keyframes.length, var2x -> var1 <= this.keyframes[var2x].N()) - 1);
      int j = Math.min(this.keyframes.length - 1, i + 1);
      class04341 class04341x = this.keyframes[i];
      class04341 class04341x = this.keyframes[j];
      float f = var1 - class04341x.N();
      float f1;
      if (j != i) {
         f1 = class04995.N(f / (class04341x.N() - class04341x.N()), 0.0F, 1.0F);
      } else {
         f1 = 0.0F;
      }

      class04341x.u().apply(var3, f1, this.keyframes, i, j, var2);
      this.target.apply(this.part, var3);
   }
}
