package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00767(Optional<class05196> player, Optional<class05946<class07299>> from, Optional<class05946<class07299>> to) implements class01425 {
   public static final Codec<class00767> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class00767::N),
            class05946.N(class04227.yg).optionalFieldOf("from").forGetter(class00767::L),
            class05946.N(class04227.yg).optionalFieldOf("to").forGetter(class00767::u)
         )
         .apply(var0, class00767::new)
   );

   public Optional<class05946<class07299>> L() {
      return this.from;
   }

   public class00767(Optional<class05196> player, Optional<class05946<class07299>> from, Optional<class05946<class07299>> to) {
      this.player = player;
      this.from = from;
      this.to = to;
   }

   public Optional<class05946<class07299>> u() {
      return this.to;
   }

   public static class06915<class00767> y() {
      return class06912.G.N(new class00767(Optional.empty(), Optional.empty(), Optional.empty()));
   }

   public static class06915<class00767> y(class05946<class07299> var0) {
      return class06912.G.N(new class00767(Optional.empty(), Optional.of(var0), Optional.empty()));
   }

   public boolean y(class05946<class07299> var1, class05946<class07299> var2) {
      return this.from.isPresent() && this.from.get() != var1 ? false : !this.to.isPresent() || this.to.get() == var2;
   }

   public static class06915<class00767> N(class05946<class07299> var0) {
      return class06912.G.N(new class00767(Optional.empty(), Optional.empty(), Optional.of(var0)));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public static class06915<class00767> N(class05946<class07299> var0, class05946<class07299> var1) {
      return class06912.G.N(new class00767(Optional.empty(), Optional.of(var0), Optional.of(var1)));
   }
}
