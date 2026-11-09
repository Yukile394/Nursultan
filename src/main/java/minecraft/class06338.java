package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.primitives.UnsignedBytes;
import com.google.gson.JsonElement;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.Codec.ResultFunction;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.floats.FloatArrayList;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Base64;
import java.util.BitSet;
import java.util.Collection;
import java.util.HexFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.LongStream;
import org.apache.commons.lang3.StringEscapeUtils;
import org.joml.AxisAngle4f;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector2f;
import org.joml.Vector2fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector3i;
import org.joml.Vector3ic;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class class06338 {
   public static final Codec<JsonElement> N = N(JsonOps.INSTANCE);
   public static final Codec<Object> y = N(JavaOps.INSTANCE);
   public static final Codec<class07709> L = N(class07713.N);
   public static final Codec<Vector2fc> u = Codec.FLOAT
      .listOf()
      .comapFlatMap(var0 -> class07536.N(var0, 2).map(var0x -> new Vector2f((Float)var0x.get(0), (Float)var0x.get(1))), var0 -> List.of(var0.x(), var0.y()));
   public static final Codec<Vector3fc> i = Codec.FLOAT
      .listOf()
      .comapFlatMap(
         var0 -> class07536.N(var0, 3).map(var0x -> new Vector3f((Float)var0x.get(0), (Float)var0x.get(1), (Float)var0x.get(2))),
         var0 -> List.of(var0.x(), var0.y(), var0.z())
      );
   public static final Codec<Vector3ic> R = Codec.INT
      .listOf()
      .comapFlatMap(
         var0 -> class07536.N(var0, 3).map(var0x -> new Vector3i((Integer)var0x.get(0), (Integer)var0x.get(1), (Integer)var0x.get(2))),
         var0 -> List.of(var0.x(), var0.y(), var0.z())
      );
   public static final Codec<Vector4fc> M = Codec.FLOAT
      .listOf()
      .comapFlatMap(
         var0 -> class07536.N(var0, 4).map(var0x -> new Vector4f((Float)var0x.get(0), (Float)var0x.get(1), (Float)var0x.get(2), (Float)var0x.get(3))),
         var0 -> List.of(var0.x(), var0.y(), var0.z(), var0.w())
      );
   public static final Codec<Quaternionfc> B = Codec.FLOAT
      .listOf()
      .comapFlatMap(
         var0 -> class07536.N(var0, 4)
            .map(var0x -> new Quaternionf((Float)var0x.get(0), (Float)var0x.get(1), (Float)var0x.get(2), (Float)var0x.get(3)).normalize()),
         var0 -> List.of(var0.x(), var0.y(), var0.z(), var0.w())
      );
   public static final Codec<AxisAngle4f> Z = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.FLOAT.fieldOf("angle").forGetter(var0x -> var0x.angle), i.fieldOf("axis").forGetter(var0x -> new Vector3f(var0x.x, var0x.y, var0x.z))
         )
         .apply(var0, AxisAngle4f::new)
   );
   public static final Codec<Quaternionfc> z = Codec.withAlternative(B, Z.xmap(Quaternionf::new, AxisAngle4f::new));
   public static final Codec<Matrix4fc> U = Codec.FLOAT.listOf().comapFlatMap(var0 -> class07536.N(var0, 16).map(var0x -> {
      Matrix4f matrix4f = new Matrix4f();

      for (int ix = 0; ix < var0x.size(); ix++) {
         matrix4f.setRowColumn(ix >> 2, ix & 3, (Float)var0x.get(ix));
      }

      return matrix4f.determineProperties();
   }), var0 -> {
      FloatArrayList floatarraylist = new FloatArrayList(16);

      for (int ix = 0; ix < 16; ix++) {
         floatarraylist.add(var0.getRowColumn(ix >> 2, ix & 3));
      }

      return floatarraylist;
   });
   private static final String F = "#";
   public static final Codec<Integer> E = Codec.withAlternative(Codec.INT, i, var0 -> class02566.N(1.0F, var0.x(), var0.y(), var0.z()));
   public static final Codec<Integer> W = Codec.withAlternative(Codec.INT, M, var0 -> class02566.N(var0.w(), var0.x(), var0.y(), var0.z()));
   public static final Codec<Integer> m = Codec.withAlternative(N(6).xmap(class02566::M, class02566::B), E);
   public static final Codec<Integer> P = Codec.withAlternative(N(8), W);
   public static final Codec<Integer> s = Codec.BYTE
      .flatComapMap(
         UnsignedBytes::toInt,
         var0 -> var0 > 255 ? DataResult.error(() -> "Unsigned byte was too large: " + var0 + " > 255") : DataResult.success(var0.byteValue())
      );
   public static final Codec<Integer> T = N_12(0, Integer.MAX_VALUE, var0 -> "Value must be non-negative: " + var0);
   public static final Codec<Integer> b = N_12(1, Integer.MAX_VALUE, var0 -> "Value must be positive: " + var0);
   public static final Codec<Long> j = N_56(0L, Long.MAX_VALUE, var0 -> "Value must be non-negative: " + var0);
   public static final Codec<Long> v = N_56(1L, Long.MAX_VALUE, var0 -> "Value must be positive: " + var0);
   public static final Codec<Float> n = a(0.0F, Float.MAX_VALUE, var0 -> "Value must be non-negative: " + var0);
   public static final Codec<Float> t = b(0.0F, Float.MAX_VALUE, var0 -> "Value must be positive: " + var0);
   public static final Codec<Pattern> G = Codec.STRING.comapFlatMap(var0 -> {
      try {
         return DataResult.success(Pattern.compile(var0));
      } catch (PatternSyntaxException patternsyntaxexception) {
         return DataResult.error(() -> "Invalid regex pattern '" + var0 + "': " + patternsyntaxexception.getMessage());
      }
   }, Pattern::pattern);
   public static final Codec<Instant> l = N(DateTimeFormatter.ISO_INSTANT).xmap(Instant::from, Function.identity());
   public static final Codec<byte[]> d = Codec.STRING.comapFlatMap(var0 -> {
      try {
         return DataResult.success(Base64.getDecoder().decode(var0));
      } catch (IllegalArgumentException illegalargumentexception) {
         return DataResult.error(() -> "Malformed base64 string");
      }
   }, var0 -> Base64.getEncoder().encodeToString(var0));
   public static final Codec<String> w = Codec.STRING
      .comapFlatMap(var0 -> DataResult.success(StringEscapeUtils.unescapeJava(var0)), StringEscapeUtils::escapeJava);
   public static final Codec<class06359> k = Codec.STRING
      .comapFlatMap(
         var0 -> var0.startsWith("#")
            ? class01894.u(var0.substring(1)).map(var0x -> new class06359(var0x, true))
            : class01894.u(var0).map(var0x -> new class06359(var0x, false)),
         class06359::L
      );
   public static final Function<Optional<Long>, OptionalLong> Y = var0 -> var0.map(OptionalLong::of).orElseGet(OptionalLong::empty);
   public static final Function<OptionalLong, Optional<Long>> Q = var0 -> var0.isPresent() ? Optional.of(var0.getAsLong()) : Optional.empty();
   public static final Codec<BitSet> O = Codec.LONG_STREAM.xmap(var0 -> BitSet.valueOf(var0.toArray()), var0 -> Arrays.stream(var0.toLongArray()));
   public static final int g = 64;
   public static final int I = 32767;
   public static final int J = 1024;
   public static final int o = 16;
   private static final Codec<Property> A = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.sizeLimitedString(64).fieldOf("name").forGetter(Property::name),
            Codec.sizeLimitedString(32767).fieldOf("value").forGetter(Property::value),
            Codec.sizeLimitedString(1024).optionalFieldOf("signature").forGetter(var0x -> Optional.ofNullable(var0x.signature()))
         )
         .apply(var0, (var0x, var1, var2) -> new Property(var0x, var1, (String)var2.orElse(null)))
   );
   public static final Codec<PropertyMap> q = Codec.either(
         Codec.unboundedMap(Codec.STRING, Codec.STRING.listOf())
            .validate(
               var0 -> var0.size() > 16 ? DataResult.error(() -> "Cannot have more than 16 properties, but was " + var0.size()) : DataResult.success(var0)
            ),
         A.sizeLimitedListOf(16)
      )
      .xmap(var0 -> {
         Builder builder = ImmutableMultimap.builder();
         var0.ifLeft(var1x -> var1x.forEach((var1xx, var2) -> {
            for (String sx : var2) {
               builder.put(var1xx, new Property(var1xx, sx));
            }
         })).ifRight(var1x -> {
            for (Property property : var1x) {
               builder.put(property.name(), property);
            }
         });
         return new PropertyMap(builder.build());
      }, var0 -> Either.right(var0.values().stream().toList()));
   public static final Codec<String> K = Codec.string(0, 16)
      .validate(var0 -> class05018.R(var0) ? DataResult.success(var0) : DataResult.error(() -> "Player name contained disallowed characters: '" + var0 + "'"));
   public static final Codec<GameProfile> V = B(class01487.i).codec();
   public static final MapCodec<GameProfile> e = B(class01487.N);
   public static final Codec<String> H = Codec.STRING
      .validate(var0 -> var0.isEmpty() ? DataResult.error(() -> "Expected non-empty string") : DataResult.success(var0));
   public static final Codec<Integer> c = Codec.STRING.comapFlatMap(var0 -> {
      int[] aint = var0.codePoints().toArray();
      return aint.length != 1 ? DataResult.error(() -> "Expected one codepoint, got: " + var0) : DataResult.success(aint[0]);
   }, Character::toString);
   public static final Codec<String> X = Codec.STRING
      .validate(var0 -> !class01894.Z(var0) ? DataResult.error(() -> "Invalid string to use as a resource path element: " + var0) : DataResult.success(var0));
   public static final Codec<URI> a = Codec.STRING.comapFlatMap(var0 -> {
      try {
         return DataResult.success(class07536.N(var0));
      } catch (URISyntaxException urisyntaxexception) {
         return DataResult.error(urisyntaxexception::getMessage);
      }
   }, URI::toString);
   public static final Codec<String> p = Codec.STRING.validate(var0 -> {
      for (int ix = 0; ix < var0.length(); ix++) {
         char c0 = var0.charAt(ix);
         if (!class05018.N(c0)) {
            return DataResult.error(() -> "Disallowed chat character: '" + c0 + "'");
         }
      }

      return DataResult.success(var0);
   });

   public static <E> Codec<List<E>> L(Codec<E> var0, Codec<List<E>> var1) {
      return Codec.either(var1, var0)
         .xmap(var0x -> (List)var0x.map(var0xx -> var0xx, List::of), var0x -> var0x.size() == 1 ? Either.right(var0x.getFirst()) : Either.left(var0x));
   }

   @Deprecated
   public static <E extends Enum<E>> Codec<E> L(Function<String, E> var0) {
      return Codec.STRING.comapFlatMap(var1 -> {
         try {
            return DataResult.success((Enum)var0.apply(var1));
         } catch (IllegalArgumentException illegalargumentexception) {
            return DataResult.error(() -> "No value with id: " + var1);
         }
      }, Enum::toString);
   }

   public static <T> Codec<class03543<T>> L(Codec<class03543<T>> var0) {
      return var0.validate(
         var0x -> var0x.u().right().filter(List::isEmpty).isPresent() ? DataResult.error(() -> "List must have contents") : DataResult.success(var0x)
      );
   }

   public static <A> Codec<Optional<A>> M(Codec<A> var0) {
      return new class06369<>(var0);
   }

   public class06338() {
      super();
   }

   private static MapCodec<GameProfile> B(Codec<UUID> var0) {
      return RecordCodecBuilder.mapCodec(
         var1 -> var1.group(
               var0.fieldOf("id").forGetter(GameProfile::id),
               K.fieldOf("name").forGetter(GameProfile::name),
               q.optionalFieldOf("properties", PropertyMap.EMPTY).forGetter(GameProfile::properties)
            )
            .apply(var1, GameProfile::new)
      );
   }

   public static <A> Codec<A> i(Codec<A> var0) {
      return Codec.of(var0, new class06351(var0));
   }

   public static <M extends Map<?, ?>> Codec<M> u(Codec<M> var0) {
      return var0.validate(var0x -> var0x.isEmpty() ? DataResult.error(() -> "Map must have contents") : DataResult.success(var0x));
   }

   public static Codec<Long> y(int var0, int var1) {
      return N_56(var0, var1, var2 -> "Value must be within range [" + var0 + ";" + var1 + "]: " + var2);
   }

   public static <E> Codec<E> y(Codec<E> var0, Function<E, Lifecycle> var1, Function<E, Lifecycle> var2) {
      return var0.mapResult(new class06356(var1, var2));
   }

   private static Codec<Float> y(float var0, float var1, Function<Float, String> var2) {
      return Codec.FLOAT
         .validate(var3 -> var3.compareTo(var0) > 0 && var3.compareTo(var1) <= 0 ? DataResult.success(var3) : DataResult.error(() -> (String)var2.apply(var3)));
   }

   public static <K, V> class06330<K, V> y(Codec<K> var0, Codec<V> var1) {
      return new class06330<>(var0, var1);
   }

   public static <E, L extends Collection<E>, T> Function<L, DataResult<L>> y(Function<E, T> var0) {
      return var1 -> {
         Iterator iterator = var1.iterator();
         if (iterator.hasNext()) {
            Object object = var0.apply(iterator.next());

            while (iterator.hasNext()) {
               Object object1 = iterator.next();
               Object object2 = var0.apply(object1);
               if (object2 != object) {
                  return DataResult.error(() -> "Mixed type list: element " + object1 + " had type " + object2 + ", but list is of type " + object);
               }
            }
         }

         return DataResult.success(var1, Lifecycle.stable());
      };
   }

   public static <T> Codec<List<T>> y(Codec<List<T>> var0) {
      return var0.validate(var0x -> var0x.isEmpty() ? DataResult.error(() -> "List must have contents") : DataResult.success(var0x));
   }

   public static <E> Codec<E> N(ToIntFunction<E> var0, IntFunction<E> var1, int var2) {
      return Codec.INT
         .flatXmap(
            var1x -> Optional.ofNullable(var1.apply(var1x))
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "Unknown element id: " + var1x)),
            var2x -> {
               int ix = var0.applyAsInt(var2x);
               return ix == var2 ? DataResult.error(() -> "Element with unknown id: " + var2x) : DataResult.success(ix);
            }
         );
   }

   public static Codec<Integer> N(int var0, int var1) {
      return N_12(var0, var1, var2 -> "Value must be within range [" + var0 + ";" + var1 + "]: " + var2);
   }

   private static Codec<Integer> N_12(int var0, int var1, Function<Integer, String> var2) {
      return Codec.INT
         .validate(var3 -> var3.compareTo(var0) >= 0 && var3.compareTo(var1) <= 0 ? DataResult.success(var3) : DataResult.error(() -> (String)var2.apply(var3)));
   }

   public static <I, E> Codec<E> N(Codec<I> var0, Function<I, E> var1, Function<E, I> var2) {
      return var0.flatXmap(var1x -> {
         Object object = var1.apply(var1x);
         return object == null ? DataResult.error(() -> "Unknown element id: " + var1x) : DataResult.success(object);
      }, var1x -> {
         Object object = var2.apply(var1x);
         return object == null ? DataResult.error(() -> "Element with unknown id: " + var1x) : DataResult.success(object);
      });
   }

   public static <E> Codec<E> N(Codec<E> var0, Codec<E> var1) {
      return new class06358<>(var1, var0);
   }

   public static Codec<Float> N(float var0, float var1) {
      return N(var0, var1, var2 -> "Value must be within range [" + var0 + ";" + var1 + "]: " + var2);
   }

   private static Codec<Long> N_56(long var0, long var2, Function<Long, String> var4) {
      return Codec.LONG
         .validate(
            var5 -> var5.compareTo(var0) >= 0L && var5.compareTo(var2) <= 0L ? DataResult.success(var5) : DataResult.error(() -> (String)var4.apply(var5))
         );
   }

   public static <E> MapCodec<E> N(Function<DynamicOps<?>, DataResult<E>> var0) {
      return new class06328<>(var0);
   }

   public static <T> Codec<T> N(DynamicOps<T> var0) {
      return Codec.PASSTHROUGH.xmap(var1 -> var1.convert(var0).getValue(), var1 -> new Dynamic(var0, var1));
   }

   private static Codec<Float> N(float var0, float var1, Function<Float, String> var2) {
      return Codec.FLOAT
         .validate(var3 -> var3.compareTo(var0) >= 0 && var3.compareTo(var1) <= 0 ? DataResult.success(var3) : DataResult.error(() -> (String)var2.apply(var3)));
   }

   public static <K, V> Codec<Map<K, V>> N(Codec<Map<K, V>> var0, int var1) {
      return var0.validate(
         var1x -> var1x.size() > var1
            ? DataResult.error(() -> "Map is too long: " + var1x.size() + ", expected range [0-" + var1 + "]")
            : DataResult.success(var1x)
      );
   }

   public static <P, I> Codec<I> N(Codec<P> var0, String var1, String var2, BiFunction<P, P, DataResult<I>> var3, Function<I, P> var4, Function<I, P> var5) {
      Codec codec = Codec.list(var0).comapFlatMap(var1x -> class07536.N(var1x, 2).flatMap(var1xx -> {
         Object object = var1xx.get(0);
         Object object1 = var1xx.get(1);
         return (DataResult)var3.apply(object, object1);
      }), var2x -> ImmutableList.of(var4.apply(var2x), var5.apply(var2x)));
      Codec codec1 = RecordCodecBuilder.create(
            var3x -> var3x.group(var0.fieldOf(var1).forGetter(Pair::getFirst), var0.fieldOf(var2).forGetter(Pair::getSecond)).apply(var3x, Pair::of)
         )
         .comapFlatMap(var1x -> (DataResult)var3.apply(var1x.getFirst(), var1x.getSecond()), var2x -> Pair.of(var4.apply(var2x), var5.apply(var2x)));
      Codec codec2 = Codec.withAlternative(codec, codec1);
      return Codec.either(var0, codec2)
         .comapFlatMap(var1x -> (DataResult)var1x.map(var1xx -> (DataResult)var3.apply(var1xx, var1xx), DataResult::success), var2x -> {
            Object object = var4.apply(var2x);
            Object object1 = var5.apply(var2x);
            return Objects.equals(object, object1) ? Either.left(object) : Either.right(var2x);
         });
   }

   @Deprecated
   public static <K, V> MapCodec<V> N(
      String var0, String var1, Codec<K> var2, Function<? super V, ? extends K> var3, Function<? super K, ? extends Codec<? extends V>> var4
   ) {
      return new class06354<>(var0, var1, var2, var4, var3);
   }

   public static <A> ResultFunction<A> N(A var0) {
      return new class06349<>(var0);
   }

   private static Codec<Integer> N(int var0) {
      long ix = (1L << var0 * 4) - 1L;
      return Codec.STRING.comapFlatMap(var3 -> {
         if (!var3.startsWith("#")) {
            return DataResult.error(() -> "Hex color must begin with #");
         } else {
            int ixx = var3.length() - "#".length();
            if (ixx != var0) {
               return DataResult.error(() -> "Hex color is wrong size, expected " + var0 + " digits but got " + ixx);
            } else {
               try {
                  long jx = HexFormat.fromHexDigitsToLong(var3, "#".length(), var3.length());
                  return jx >= 0L && jx <= ix ? DataResult.success((int)jx) : DataResult.error(() -> "Color value out of range: " + var3);
               } catch (NumberFormatException numberformatexception) {
                  return DataResult.error(() -> "Invalid color value: " + var3);
               }
            }
         }
      }, var1x -> "#" + HexFormat.of().toHexDigits(var1x.intValue(), var0));
   }

   public static Codec<TemporalAccessor> N(DateTimeFormatter var0) {
      return Codec.STRING.comapFlatMap(var1 -> {
         try {
            return DataResult.success(var0.parse(var1));
         } catch (Exception exception) {
            return DataResult.error(exception::getMessage);
         }
      }, var0::format);
   }

   public static MapCodec<OptionalLong> N(MapCodec<Optional<Long>> var0) {
      return var0.xmap(Y, Q);
   }

   public static <E> Codec<E> N(Codec<E> var0, Function<E, Lifecycle> var1) {
      return y(var0, var1, var1);
   }

   public static <E> Codec<List<E>> N(Codec<E> var0) {
      return L(var0, var0.listOf());
   }

   public static <E> MapCodec<E> N(MapCodec<E> var0, MapCodec<E> var1) {
      return new class06335<>(var1, var0);
   }

   public static <T> Codec<Object2BooleanMap<T>> R(Codec<T> var0) {
      return Codec.unboundedMap(var0, Codec.BOOL).xmap(Object2BooleanOpenHashMap::new, Object2ObjectOpenHashMap::new);
   }

   private static Codec<Float> a(float var0, float var1, Function<Float, String> var2) {
      return Codec.FLOAT
         .validate(var3 -> var3.compareTo(var0) >= 0 && var3.compareTo(var1) <= 0 ? DataResult.success(var3) : DataResult.error(() -> (String)var2.apply(var3)));
   }

   private static Codec<Float> b(float var0, float var1, Function<Float, String> var2) {
      return Codec.FLOAT
         .validate(var3 -> var3.compareTo(var0) > 0 && var3.compareTo(var1) <= 0 ? DataResult.success(var3) : DataResult.error(() -> (String)var2.apply(var3)));
   }
}
