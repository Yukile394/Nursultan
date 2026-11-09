package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableObject;

public class class05268 extends class00453 {
   public static final MapCodec<class05268> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(var0.group(class04821.N.fieldOf("source").forGetter(var0x -> var0x.y), class05644.N.listOf().fieldOf("ops").forGetter(var0x -> var0x.L)))
         .apply(var0, class05268::new)
   );
   private final class04794 y;
   private final List<class05644> L;

   class05268(List<class05957> var1, class04794 var2, List<class05644> var3) {
      super(var1);
      this.y = var2;
      this.L = List.copyOf(var3);
   }

   @Override
   public Set<class07491<?>> y() {
      return this.y.y();
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      class07709 class07709 = this.y.N(var2);
      if (class07709 == null) {
         return var1;
      } else {
         MutableObject mutableobject = new MutableObject();
         Supplier supplier = () -> {
            if (mutableobject.get() == null) {
               mutableobject.setValue(var1.a_(class02484.y, class02837.N).y());
            }

            return (class07709)mutableobject.get();
         };
         this.L.forEach(var2x -> var2x.N(supplier, class07709));
         class07001 class07001 = (class07001)mutableobject.get();
         if (class07001 != null) {
            class02837.N(class02484.y, var1, class07001);
         }

         return var1;
      }
   }

   @Deprecated
   public static class05275 N(class04794 var0) {
      return new class05275(var0);
   }

   public static class05275 N(class05919 var0) {
      return new class05275(class04791.N(var0));
   }

   @Override
   public class05959<class05268> N() {
      return class07439.Q;
   }
}
