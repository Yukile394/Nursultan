package minecraft;

import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;

public record class02441(
   boolean scaleHead, float babyYHeadOffset, float babyZHeadOffset, float babyHeadScale, float babyBodyScale, float bodyYOffset, Set<String> headParts
) implements class02415 {
   public float L() {
      return this.babyZHeadOffset;
   }

   public Set<String> M() {
      return this.headParts;
   }

   public class02441(Set<String> var1) {
      this(false, 5.0F, 2.0F, var1);
   }

   public class02441(
      boolean scaleHead, float babyYHeadOffset, float babyZHeadOffset, float babyHeadScale, float babyBodyScale, float bodyYOffset, Set<String> headParts
   ) {
      super();
      this.scaleHead = scaleHead;
      this.babyYHeadOffset = babyYHeadOffset;
      this.babyZHeadOffset = babyZHeadOffset;
      this.babyHeadScale = babyHeadScale;
      this.babyBodyScale = babyBodyScale;
      this.bodyYOffset = bodyYOffset;
      this.headParts = headParts;
   }

   public class02441(boolean var1, float var2, float var3, Set<String> var4) {
      this(var1, var2, var3, 2.0F, 2.0F, 24.0F, var4);
   }

   @Override
   public class04792 apply(class04792 var1) {
      float f = this.scaleHead ? 1.5F / this.babyHeadScale : 1.0F;
      float f1 = 1.0F / this.babyBodyScale;
      UnaryOperator unaryoperator = var2x -> var2x.L(0.0F, this.babyYHeadOffset, this.babyZHeadOffset).y(f);
      UnaryOperator unaryoperator1 = var2x -> var2x.L(0.0F, this.bodyYOffset, 0.0F).y(f1);
      class04792 class04792 = new class04792();

      for (Entry entry : var1.N().y()) {
         String s = (String)entry.getKey();
         class04839 class04839 = (class04839)entry.getValue();
         class04792.N().N(s, class04839.N(this.headParts.contains(s) ? unaryoperator : unaryoperator1));
      }

      return class04792;
   }

   public float i() {
      return this.babyBodyScale;
   }

   public float u() {
      return this.babyHeadScale;
   }

   public float y() {
      return this.babyYHeadOffset;
   }

   public boolean N() {
      return this.scaleHead;
   }

   public float R() {
      return this.bodyYOffset;
   }
}
