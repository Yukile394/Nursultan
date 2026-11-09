package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00691(class00744 head, class00744 body, class00744 leftArm, class00744 rightArm, class00744 leftLeg, class00744 rightLeg) {
   public static final class00691 N = new class00691(class00681.y, class00681.L, class00681.u, class00681.i, class00681.R, class00681.M);
   public static final Codec<class00691> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00744.u.optionalFieldOf("Head", class00681.y).forGetter(class00691::N),
            class00744.u.optionalFieldOf("Body", class00681.L).forGetter(class00691::y),
            class00744.u.optionalFieldOf("LeftArm", class00681.u).forGetter(class00691::L),
            class00744.u.optionalFieldOf("RightArm", class00681.i).forGetter(class00691::u),
            class00744.u.optionalFieldOf("LeftLeg", class00681.R).forGetter(class00691::i),
            class00744.u.optionalFieldOf("RightLeg", class00681.M).forGetter(class00691::R)
         )
         .apply(var0, class00691::new)
   );

   public class00744 L() {
      return this.leftArm;
   }

   public class00691(class00744 head, class00744 body, class00744 leftArm, class00744 rightArm, class00744 leftLeg, class00744 rightLeg) {
      this.head = head;
      this.body = body;
      this.leftArm = leftArm;
      this.rightArm = rightArm;
      this.leftLeg = leftLeg;
      this.rightLeg = rightLeg;
   }

   public class00744 i() {
      return this.leftLeg;
   }

   public class00744 u() {
      return this.rightArm;
   }

   public class00744 y() {
      return this.body;
   }

   public class00744 N() {
      return this.head;
   }

   public class00744 R() {
      return this.rightLeg;
   }
}
