package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.apache.commons.lang3.tuple.Pair;

public class class03793 {
   public static final Codec<class03793> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03978.N.lenientOptionalFieldOf("event").forGetter(var0x -> var0x.y.map(Pair::getLeft)),
            Codec.LONG.fieldOf("tick").forGetter(var0x -> var0x.y.<Long>map(Pair::getRight).orElse(-1L))
         )
         .apply(var0, class03793::new)
   );
   private Optional<Pair<class03978, Long>> y;

   public class03793(Optional<class03978> var1, long var2) {
      super();
      this.y = var1.map(var2x -> Pair.of(var2x, var2));
   }

   public class03793() {
      super();
      this.y = Optional.empty();
   }

   private boolean y(class03978 var1, long var2) {
      if (this.y.isEmpty()) {
         return true;
      } else {
         Pair<class03978, Long> pair = this.y.get();
         long i = (Long)pair.getRight();
         if (var2 != i) {
            return false;
         } else {
            class03978 class03978 = (class03978)pair.getLeft();
            if (var1.y() < class03978.y()) {
               return true;
            } else {
               return var1.y() > class03978.y() ? false : class03502.N(var1.N()) > class03502.N(class03978.N());
            }
         }
      }
   }

   public void N() {
      this.y = Optional.empty();
   }

   public void N(class03978 var1, long var2) {
      if (this.y(var1, var2)) {
         this.y = Optional.of(Pair.of(var1, var2));
      }
   }

   public Optional<class03978> N(long var1) {
      if (this.y.isEmpty()) {
         return Optional.empty();
      } else {
         return this.y.get().getRight() < var1 ? Optional.of((class03978)this.y.get().getLeft()) : Optional.empty();
      }
   }
}
