package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class00802(Optional<class05196> player, Optional<class05196> parent, Optional<class05196> partner, Optional<class05196> child)
   implements class01425 {
   public static final Codec<class00802> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class00802::N),
            class00821.y.optionalFieldOf("parent").forGetter(class00802::L),
            class00821.y.optionalFieldOf("partner").forGetter(class00802::u),
            class00821.y.optionalFieldOf("child").forGetter(class00802::i)
         )
         .apply(var0, class00802::new)
   );

   public Optional<class05196> L() {
      return this.parent;
   }

   public class00802(Optional<class05196> player, Optional<class05196> parent, Optional<class05196> partner, Optional<class05196> child) {
      this.player = player;
      this.parent = parent;
      this.partner = partner;
      this.child = child;
   }

   public Optional<class05196> i() {
      return this.child;
   }

   public Optional<class05196> u() {
      return this.partner;
   }

   public static class06915<class00802> y() {
      return class06912.s.N(new class00802(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
   }

   public static class06915<class00802> N(Optional<class00821> var0, Optional<class00821> var1, Optional<class00821> var2) {
      return class06912.s.N(new class00802(Optional.empty(), class00821.N(var0), class00821.N(var1), class00821.N(var2)));
   }

   @Override
   public void N(class04492 var1) {
      class01425.super.N(var1);
      var1.N(this.parent, "parent");
      var1.N(this.partner, "partner");
      var1.N(this.child, "child");
   }

   private static boolean N(Optional<class05196> var0, class05908 var1) {
      return var0.isEmpty() || ((class05196)var0.get()).N(var1);
   }

   public static class06915<class00802> N(class00810 var0) {
      return class06912.s.N(new class00802(Optional.empty(), Optional.empty(), Optional.empty(), Optional.of(class00821.N(var0))));
   }

   public boolean N(class05908 var1, class05908 var2, @Nullable class05908 var3) {
      return !this.child.isPresent() || var3 != null && this.child.get().N(var3)
         ? N(this.parent, var1) && N(this.partner, var2) || N(this.parent, var2) && N(this.partner, var1)
         : false;
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }
}
