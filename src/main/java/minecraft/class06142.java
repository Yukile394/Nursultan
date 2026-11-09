package minecraft;

import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Set;

public record class06142(class06378 n, class06378 p) implements class06378 {
   public static final MapCodec<class06142> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06339.N.fieldOf("n").forGetter(class06142::L), class06339.N.fieldOf("p").forGetter(class06142::u)).apply(var0, class06142::new)
   );

   public class06378 L() {
      return this.n;
   }

   public class06142(class06378 n, class06378 p) {
      this.n = n;
      this.p = p;
   }

   public class06378 u() {
      return this.p;
   }

   @Override
   public float y(class05908 var1) {
      return this.N(var1);
   }

   @Override
   public Set<class07491<?>> y() {
      return Sets.union(this.n.y(), this.p.y());
   }

   @Override
   public class06341 N() {
      return class06339.u;
   }

   public static class06142 N(int var0, float var1) {
      return new class06142(class04711.N(var0), class04711.N(var1));
   }

   @Override
   public int N(class05908 var1) {
      int i = this.n.N(var1);
      float f = this.p.y(var1);
      class06069 class06069 = var1.y();
      int j = 0;

      for (int k = 0; k < i; k++) {
         if (class06069.z() < f) {
            j++;
         }
      }

      return j;
   }
}
