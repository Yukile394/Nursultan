package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Arrays;
import java.util.Optional;

public record class05920(Optional<class05196> player, Optional<class05196> location) implements class01425 {
   public static final Codec<class05920> N = RecordCodecBuilder.create(
      var0 -> var0.group(class00821.y.optionalFieldOf("player").forGetter(class05920::N), class05196.N.optionalFieldOf("location").forGetter(class05920::y))
         .apply(var0, class05920::new)
   );

   private static class05920 L(class00818 var0, class00837 var1) {
      class05196 class05196 = class05196.N(class00859.N(var0).build(), class07795.N(var1).build());
      return new class05920(Optional.empty(), Optional.of(class05196));
   }

   public class05920(Optional<class05196> player, Optional<class05196> location) {
      this.player = player;
      this.location = location;
   }

   public Optional<class05196> y() {
      return this.location;
   }

   public static class06915<class05920> y(class00818 var0, class00837 var1) {
      return class06912.NL.N(L(var0, var1));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public boolean N(class05908 var1) {
      return this.location.isEmpty() || this.location.get().N(var1);
   }

   public static class06915<class05920> N(class05952... var0) {
      class05196 class05196 = class05196.N(Arrays.stream(var0).map(class05952::build).toArray(class05957[]::new));
      return class06912.w.N(new class05920(Optional.empty(), Optional.of(class05196)));
   }

   public static <T extends Comparable<T> & class05033> class06915<class05920> N(class00891 var0, class08092<T> var1, T var2) {
      return N(var0, var1, ((class05033)var2).method_15434());
   }

   public static class06915<class05920> N(class00891 var0, class08092<Integer> var1, int var2) {
      return N(var0, var1, String.valueOf(var2));
   }

   public static class06915<class05920> N(class00891 var0, class08092<Boolean> var1, boolean var2) {
      return N(var0, var1, String.valueOf(var2));
   }

   public static <T extends Comparable<T>> class06915<class05920> N(class00891 var0, class08092<T> var1, String var2) {
      class01408 class01408 = class01408.N().N(var1, var2);
      class05196 class05196 = class05196.N(class00851.N(var0).N(class01408).build());
      return class06912.w.N(new class05920(Optional.empty(), Optional.of(class05196)));
   }

   @Override
   public void N(class04492 var1) {
      class01425.super.N(var1);
      this.location.ifPresent(var1x -> var1.N(var1x, class06925.s, "location"));
   }

   public static class06915<class05920> N(class00891 var0) {
      class05196 class05196 = class05196.N(class00851.N(var0).build());
      return class06912.w.N(new class05920(Optional.empty(), Optional.of(class05196)));
   }

   public static class06915<class05920> N(class00818 var0, class00837 var1) {
      return class06912.X.N(L(var0, var1));
   }
}
