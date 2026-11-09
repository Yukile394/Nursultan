package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public record class03562(class01894 id, class03581 provider) {
   public static final class03562 y = new class03562(class01894.y("nether"), new class03586());
   public static final class03562 L = new class03562(class01894.y("overworld"), new class03612());
   static final Map<class01894, class03562> u = Stream.of(y, L).collect(Collectors.toMap(class03562::y, var0 -> (class03562)var0));
   public static final Codec<class03562> i = class01894.N
      .flatXmap(
         var0 -> Optional.ofNullable(u.get(var0)).<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + var0)),
         var0 -> DataResult.success(var0.id)
      );

   public class03581 L() {
      return this.provider;
   }

   public class03562(class01894 id, class03581 provider) {
      this.id = id;
      this.provider = provider;
   }

   public class01894 y() {
      return this.id;
   }

   static <T> class03221<T> N(Function<class05946<class00780>, T> var0) {
      Builder builder = ImmutableList.builder();
      new class01835().N(var2 -> builder.add(var2.mapSecond(var0)));
      return new class03221<>(builder.build());
   }

   public Stream<class05946<class00780>> N() {
      return this.provider.N(var0 -> var0).N().stream().<class05946<class00780>>map(Pair::getSecond).distinct();
   }
}
