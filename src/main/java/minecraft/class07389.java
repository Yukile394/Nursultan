package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public record class07389<T>(
   Optional<URI> reference, List<String> type, Optional<class07389<?>> items, Map<String, class07389<?>> properties, List<String> enumValues, Codec<T> codec
) {
   public static final Codec<? extends class07389<?>> N = Codec.recursive(
         "Schema",
         var0 -> RecordCodecBuilder.create(
            var1 -> var1.group(
                  class06961.N.optionalFieldOf("$ref").forGetter(class07389::i),
                  class06338.N(Codec.STRING).optionalFieldOf("type", List.of()).forGetter(class07389::R),
                  var0.optionalFieldOf("items").forGetter(class07389::M),
                  Codec.unboundedMap(Codec.STRING, var0).optionalFieldOf("properties", Map.of()).forGetter(class07389::B),
                  Codec.STRING.listOf().optionalFieldOf("enum", List.of()).forGetter(class07389::Z)
               )
               .apply(var1, (var0xx, var1x, var2, var3, var4) -> null)
         )
      )
      .validate(var0 -> var0 == null ? DataResult.error(() -> "Should not deserialize schema") : DataResult.success(var0));
   private static final List<class07425<?>> g = new ArrayList<>();
   public static final class07389<Boolean> y = N("boolean", Codec.BOOL);
   public static final class07389<Integer> L = N("integer", Codec.INT);
   public static final class07389<Either<Boolean, Integer>> u = N(List.of("boolean", "integer"), Codec.either(Codec.BOOL, Codec.INT));
   public static final class07389<Float> i = N("number", Codec.FLOAT);
   public static final class07389<String> R = N("string", Codec.STRING);
   public static final class07389<UUID> M = N("string", class01487.N);
   public static final class07389<class07420> B = N("string", class07420.N.codec());
   public static final class07425<class07086> Z = y("difficulty", N(class07086::values, class07086.field_41668));
   public static final class07425<class07282> z = y("game_type", N(class07282::values, class07282.field_41676));
   public static final class07389<class08195> U = N("integer", class08195.field_63202);
   public static final class07425<class07947> E = y("player", N(class07947.N.codec()).N("id", M).N("name", R));
   public static final class07425<class07414> W = y("version", N(class07414.N.codec()).N("name", R).N("protocol", L));
   public static final class07425<class07382> m = y("server_state", N(class07382.N).N("started", y).N("players", E.N().u()).N("version", W.N()));
   public static final class07389<class07411> P = N(class07411::values);
   public static final class07425<class07423<?>> s = y("typed_game_rule", N(class07423.N).N("key", R).N("value", u).N("type", P));
   public static final class07425<class07423<?>> T = y("untyped_game_rule", N(class07423.y).N("key", R).N("value", u));
   public static final class07425<class07415> b = y("message", N(class07415.N).N("literal", R).N("translatable", R).N("translatableParams", R.u()));
   public static final class07425<class07379> j = y("system_message", N(class07379.N).N("message", b.N()).N("overlay", y).N("receivingPlayers", E.N().u()));
   public static final class07425<class07384> v = y("kick_player", N(class07384.y.codec()).N("message", b.N()).N("player", E.N()));
   public static final class07425<class07397> n = y("operator", N(class07397.N.codec()).N("player", E.N()).N("bypassesPlayerLimit", y).N("permissionLevel", L));
   public static final class07425<class07390> t = y(
      "incoming_ip_ban", N(class07390.N.codec()).N("player", E.N()).N("ip", R).N("reason", R).N("source", R).N("expires", R)
   );
   public static final class07425<class07385> G = y("ip_ban", N(class07385.N.codec()).N("ip", R).N("reason", R).N("source", R).N("expires", R));
   public static final class07425<class07395> l = y("user_ban", N(class07395.N.codec()).N("player", E.N()).N("reason", R).N("source", R).N("expires", R));

   public static List<class07425<?>> L() {
      return g;
   }

   public Optional<class07389<?>> M() {
      return this.items;
   }

   public class07389(
      Optional<URI> reference, List<String> type, Optional<class07389<?>> items, Map<String, class07389<?>> properties, List<String> enumValues, Codec<T> codec
   ) {
      super();
      this.reference = reference;
      this.type = type;
      this.items = items;
      this.properties = properties;
      this.enumValues = enumValues;
      this.codec = codec;
   }

   public Map<String, class07389<?>> B() {
      return this.properties;
   }

   public List<String> Z() {
      return this.enumValues;
   }

   public Optional<URI> i() {
      return this.reference;
   }

   public Codec<T> z() {
      return this.codec;
   }

   public class07389<List<T>> u() {
      return N(this, this.codec);
   }

   private static <T> class07425<T> y(String var0, class07389<T> var1) {
      class07425 class07425 = new class07425(var0, class06961.N(var0), var1);
      g.add(class07425);
      return class07425;
   }

   public class07389<T> y() {
      return new class07389<>(
         this.reference,
         this.type,
         this.items.map(class07389::y),
         this.properties.entrySet().stream().collect(Collectors.toMap(Entry::getKey, var0 -> var0.getValue().y())),
         this.enumValues,
         this.codec
      );
   }

   public static <T> class07389<T> y(List<String> var0, Codec<T> var1) {
      return new class07389<>(Optional.empty(), List.of("string"), Optional.empty(), Map.of(), var0, var1);
   }

   public static <E extends Enum<E> & class05033> class07389<E> N(Supplier<E[]> var0) {
      return N(var0, class05033.N(var0));
   }

   public static <T> class07389<T> N(String var0, Codec<T> var1) {
      return N(List.of(var0), var1);
   }

   public static <T> class07389<T> N(List<String> var0, Codec<T> var1) {
      return new class07389<>(Optional.empty(), var0, Optional.empty(), Map.of(), List.of(), var1);
   }

   public static <T> class07389<T> N(Codec<T> var0) {
      return new class07389<>(Optional.empty(), List.of("object"), Optional.empty(), Map.of(), List.of(), var0);
   }

   public static <T> class07389<T> N(URI var0, Codec<T> var1) {
      return new class07389<>(Optional.of(var0), List.of(), Optional.empty(), Map.of(), List.of(), var1);
   }

   private static <T> class07389<T> N(Map<String, class07389<?>> var0, Codec<T> var1) {
      return new class07389<>(Optional.empty(), List.of("object"), Optional.empty(), var0, List.of(), var1);
   }

   public class07389<T> N(String var1, class07389<?> var2) {
      HashMap hashmap = new HashMap<>(this.properties);
      hashmap.put(var1, var2);
      return N(hashmap, this.codec);
   }

   public static <E extends Enum<E> & class05033> class07389<E> N(Supplier<E[]> var0, Codec<E> var1) {
      return y(Stream.<Enum>of((Enum[])var0.get()).map(var0x -> ((class05033)var0x).method_15434()).toList(), var1);
   }

   public static <T> Codec<class07389<T>> N() {
      return (Codec<class07389<T>>)N;
   }

   public static <T> class07389<List<T>> N(class07389<?> var0, Codec<T> var1) {
      return new class07389<>(Optional.empty(), List.of("array"), Optional.of(var0), Map.of(), List.of(), var1.listOf());
   }

   public List<String> R() {
      return this.type;
   }
}
