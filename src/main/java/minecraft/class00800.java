package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Optional;

public record class00800(Optional<class03543<class07304>> enchantments, class00836 level) {
   public static final Codec<class00800> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03541.N(class04227.yR).optionalFieldOf("enchantments").forGetter(class00800::N),
            class00836.u.optionalFieldOf("levels", class00836.L).forGetter(class00800::y)
         )
         .apply(var0, class00800::new)
   );

   public class00800(Optional<class03543<class07304>> enchantments, class00836 level) {
      this.enchantments = enchantments;
      this.level = level;
   }

   public class00800(class03543<class07304> var1, class00836 var2) {
      this(Optional.of(var1), var2);
   }

   public class00800(class03556<class07304> var1, class00836 var2) {
      this(Optional.of(class03543.N(var1)), var2);
   }

   public class00836 y() {
      return this.level;
   }

   private boolean N(class02710 var1, class03556<class07304> var2) {
      int i = var1.N(var2);
      if (i == 0) {
         return false;
      } else {
         return this.level == class00836.L ? true : this.level.u(i);
      }
   }

   public Optional<class03543<class07304>> N() {
      return this.enchantments;
   }

   public boolean N(class02710 var1) {
      if (this.enchantments.isPresent()) {
         for (class03556 class03556 : this.enchantments.get()) {
            if (this.N(var1, class03556)) {
               return true;
            }
         }

         return false;
      } else if (this.level != class00836.L) {
         for (Entry entry : var1.y()) {
            if (this.level.u(entry.getIntValue())) {
               return true;
            }
         }

         return false;
      } else {
         return !var1.u();
      }
   }
}
