package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class07682(Optional<class05196> player) implements class01425 {
   public static final Codec<class07682> N = RecordCodecBuilder.create(
      var0 -> var0.group(class00821.y.optionalFieldOf("player").forGetter(class07682::N)).apply(var0, class07682::new)
   );

   public static class06915<class07682> L() {
      return class06912.K.N(new class07682(Optional.empty()));
   }

   public class07682(Optional<class05196> player) {
      this.player = player;
   }

   public static class06915<class07682> i() {
      return class06912.l.N(new class07682(Optional.empty()));
   }

   public static class06915<class07682> u() {
      return class06912.Nu.N(new class07682(Optional.empty()));
   }

   public static class06915<class07682> y() {
      return class06912.b.N(new class07682(Optional.empty()));
   }

   public static class06915<class07682> N(Optional<class00821> var0) {
      return class06912.T.N(new class07682(class00821.N(var0)));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public static class06915<class07682> N(class00818 var0) {
      return class06912.T.N(new class07682(Optional.of(class00821.N(class00810.N().N(var0)))));
   }

   public static class06915<class07682> N(class00810 var0) {
      return class06912.T.N(new class07682(Optional.of(class00821.N(var0.y()))));
   }

   public static class06915<class07682> N(class02055<class00891> var0, class02055<class06581> var1, class00891 var2, class06581 var3) {
      return N(class00810.N().N(class06124.N().u(class00837.N().N(var1, var3))).y(class00818.N().N(class01427.N().N(var0, var2))));
   }
}
