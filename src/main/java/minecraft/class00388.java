package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jerozgen.languagereload.config.Config;
import org.jspecify.annotations.Nullable;

public class class00388 implements class04439 {
   public static final Object[] N = new Object[0];
   private static final Codec<Object> L = class06338.y.validate(class00388::y);
   private static final Codec<Object> u = Codec.either(L, class03748.N)
      .xmap(
         var0 -> var0.map(var0x -> var0x, var0x -> Objects.requireNonNullElse(var0x.N(), var0x)),
         var0 -> var0 instanceof class00392 ? Either.right((class00392)var0) : Either.left(var0)
      );
   public static final MapCodec<class00388> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.STRING.fieldOf("translate").forGetter(var0x -> var0x.M),
            Codec.STRING.lenientOptionalFieldOf("fallback").forGetter(var0x -> Optional.ofNullable(var0x.B)),
            u.listOf().optionalFieldOf("with").forGetter(var0x -> N(var0x.Z))
         )
         .apply(var0, class00388::N)
   );
   private static final class05936 i = class05936.R("%");
   private static final class05936 R = class05936.R("null");
   private final String M;
   @Nullable
   private final String B;
   private final Object[] Z;
   @Nullable
   private class07018 z;
   private List<class05936> U = ImmutableList.of();
   private static final Pattern E = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

   @Nullable
   public String L() {
      return this.B;
   }

   public class00388(String var1, @Nullable String var2, Object[] var3) {
      super();
      this.M = var1;
      this.B = var2;
      this.Z = var3;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class00388 class00388
            && Objects.equals(this.M, class00388.M)
            && Objects.equals(this.B, class00388.B)
            && Arrays.equals(this.Z, class00388.Z);
   }

   @Override
   public String toString() {
      return "translation{key='" + this.M + "'" + (this.B != null ? ", fallback='" + this.B + "'" : "") + ", args=" + Arrays.toString(this.Z) + "}";
   }

   @Override
   public int hashCode() {
      int ix = Objects.hashCode(this.M);
      ix = 31 * ix + Objects.hashCode(this.B);
      return 31 * ix + Arrays.hashCode(this.Z);
   }

   List i() {
      if (!Config.getInstance().multilingualItemSearch) {
         return null;
      } else {
         class07018 class07018 = class07018.y();
         if (class07018 == null) {
            return null;
         } else {
            class08429 class08429 = class07018.languagereload_getTranslationStorage();
            if (class08429 == null) {
               return null;
            } else if (class08429.languagereload_getTargetLanguage() == null) {
               return null;
            } else {
               String s = class08429.languagereload_get(this.M);

               try {
                  Builder builder = new Builder();
                  this.N(s, builder::add);
                  return builder.build();
               } catch (class00386 class00386) {
                  return ImmutableList.of(class05936.R(s));
               }
            }
         }
      }
   }

   public Object[] u() {
      return this.Z;
   }

   public String y() {
      return this.M;
   }

   List y(class00388 var1, Operation var2) {
      List list = this.i();
      return list != null ? list : (List)var2.call(new Object[]{var1});
   }

   private static DataResult<Object> y(@Nullable Object var0) {
      return !N(var0) ? DataResult.error(() -> "This value needs to be parsed as component") : DataResult.success(var0);
   }

   private static Object[] N(Optional<List<Object>> var0) {
      return var0.<Object[]>map(var0x -> var0x.isEmpty() ? N : var0x.toArray()).orElse(N);
   }

   public static boolean N(@Nullable Object var0) {
      return var0 instanceof Number || var0 instanceof Boolean || var0 instanceof String;
   }

   List N(class00388 var1, Operation var2) {
      List list = this.i();
      return list != null ? list : (List)var2.call(new Object[]{var1});
   }

   @Override
   public class05216 N(@Nullable class07701 var1, @Nullable class07049 var2, int var3) throws CommandSyntaxException {
      Object[] aobject = new Object[this.Z.length];

      for (int ix = 0; ix < aobject.length; ix++) {
         Object object = this.Z[ix];
         if (object instanceof class00392 class00392) {
            aobject[ix] = class00390.N(var1, class00392, var2, var3);
         } else {
            aobject[ix] = object;
         }
      }

      return class05216.N(new class00388(this.M, this.B, aobject));
   }

   private static class00388 N(String var0, Optional<String> var1, Optional<List<Object>> var2) {
      return new class00388(var0, (String)var1.orElse(null), N(var2));
   }

   public final class05936 N(int var1) {
      if (var1 >= 0 && var1 < this.Z.length) {
         Object object = this.Z[var1];
         if (object instanceof class00392) {
            return (class00392)object;
         } else {
            return object == null ? R : class05936.R(object.toString());
         }
      } else {
         throw new class00386(this, var1);
      }
   }

   private void N(String var1, Consumer<class05936> var2) {
      Matcher matcher = E.matcher(var1);

      try {
         int ix = 0;
         int j = 0;

         while (matcher.find(j)) {
            int k = matcher.start();
            int l = matcher.end();
            if (k > j) {
               String s = var1.substring(j, k);
               if (s.indexOf(37) != -1) {
                  throw new IllegalArgumentException();
               }

               var2.accept(class05936.R(s));
            }

            String s4 = matcher.group(2);
            String s1 = var1.substring(k, l);
            if ("%".equals(s4) && "%%".equals(s1)) {
               var2.accept(i);
            } else {
               if (!"s".equals(s4)) {
                  throw new class00386(this, "Unsupported format: '" + s1 + "'");
               }

               String s2 = matcher.group(1);
               int i1 = s2 != null ? Integer.parseInt(s2) - 1 : ix++;
               var2.accept(this.N(i1));
            }

            j = l;
         }

         if (j < var1.length()) {
            String s3 = var1.substring(j);
            if (s3.indexOf(37) != -1) {
               throw new IllegalArgumentException();
            }

            var2.accept(class05936.R(s3));
         }
      } catch (IllegalArgumentException illegalargumentexception) {
         throw new class00386(this, illegalargumentexception);
      }
   }

   @Override
   public MapCodec<class00388> N() {
      return y;
   }

   private static Optional<List<Object>> N(Object[] var0) {
      return var0.length == 0 ? Optional.empty() : Optional.of(Arrays.asList(var0));
   }

   private void R() {
      class07018 class07018 = class07018.y();
      if (class07018 != this.z) {
         this.z = class07018;
         String s = this.B != null ? class07018.N(this.M, this.B) : class07018.y(this.M);

         try {
            Builder builder = ImmutableList.builder();
            this.N(s, builder::add);
            this.U = builder.build();
         } catch (class00386 class00386) {
            this.U = ImmutableList.of(class05936.R(s));
         }
      }
   }

   @Override
   public <T> Optional<T> method_27660(class05935<T> var1, class00405 var2) {
      this.R();
      Iterator iterator = this.y(this, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_2588]");
         return ((class00388)var0[0]).U;
      }).iterator();

      while (iterator.hasNext()) {
         Optional optional = ((class05936)iterator.next()).N(var1, var2);
         if (optional.isPresent()) {
            return optional;
         }
      }

      return Optional.empty();
   }

   @Override
   public <T> Optional<T> method_27659(class05977<T> var1) {
      this.R();
      Iterator iterator = this.N(this, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_2588]");
         return ((class00388)var0[0]).U;
      }).iterator();

      while (iterator.hasNext()) {
         Optional optional = ((class05936)iterator.next()).N_8(var1);
         if (optional.isPresent()) {
            return optional;
         }
      }

      return Optional.empty();
   }
}
