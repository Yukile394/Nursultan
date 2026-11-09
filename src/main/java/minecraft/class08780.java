package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class08780(Optional<class08735> min, Optional<class08735> max, Optional<Integer> format, Optional<class04548<Integer>> supported) {
   static final MapCodec<class08780> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class08735.N.optionalFieldOf("min_format").forGetter(class08780::y),
            class08735.y.optionalFieldOf("max_format").forGetter(class08780::L),
            Codec.INT.optionalFieldOf("pack_format").forGetter(class08780::u),
            class04548.N(Codec.INT).optionalFieldOf("supported_formats").forGetter(class08780::i)
         )
         .apply(var0, class08780::new)
   );
   public static final MapCodec<class08780> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class08735.N.optionalFieldOf("min_format").forGetter(class08780::y),
            class08735.y.optionalFieldOf("max_format").forGetter(class08780::L),
            class04548.N(Codec.INT).optionalFieldOf("formats").forGetter(class08780::i)
         )
         .apply(var0, (var0x, var1, var2) -> new class08780(var0x, var1, var0x.map(class08735::y), var2))
   );

   public Optional<class08735> L() {
      return this.max;
   }

   public class08780(Optional<class08735> min, Optional<class08735> max, Optional<Integer> format, Optional<class04548<Integer>> supported) {
      this.min = min;
      this.max = max;
      this.format = format;
      this.supported = supported;
   }

   public Optional<class04548<Integer>> i() {
      return this.supported;
   }

   public Optional<Integer> u() {
      return this.format;
   }

   private DataResult<class04548<class08735>> y(int var1, boolean var2, boolean var3, String var4, String var5) {
      int i = this.min.get().y();
      int j = this.max.get().y();
      if (this.min.get().compareTo(this.max.get()) > 0) {
         return DataResult.error(() -> var4 + " min_format (" + this.min.get() + ") is greater than max_format (" + this.max.get() + ")");
      } else {
         if (i > var1 && !var3) {
            if (this.supported.isPresent()) {
               return DataResult.error(
                  () -> var4 + " key " + var5 + " is deprecated starting from pack format " + (var1 + 1) + ". Remove " + var5 + " from your pack.mcmeta."
               );
            }

            if (var2 && this.format.isPresent()) {
               String s1 = this.N(i, j);
               if (s1 != null) {
                  return DataResult.error(() -> s1);
               }
            }
         } else {
            if (!this.supported.isPresent()) {
               return DataResult.error(
                  () -> var4
                     + " declares support for format "
                     + i
                     + ", but game versions supporting formats 17 to "
                     + var1
                     + " require a "
                     + var5
                     + " field. Add \""
                     + var5
                     + "\": ["
                     + i
                     + ", "
                     + var1
                     + "] or require a version greater or equal to "
                     + (var1 + 1)
                     + ".0."
               );
            }

            class04548 class04548 = this.supported.get();
            if ((Integer)class04548.N() != i) {
               return DataResult.error(
                  () -> var4 + " version declaration mismatch between " + var5 + " (from " + class04548.N() + ") and min_format (" + this.min.get() + ")"
               );
            }

            if ((Integer)class04548.y() != j && (Integer)class04548.y() != var1) {
               return DataResult.error(
                  () -> var4 + " version declaration mismatch between " + var5 + " (up to " + class04548.y() + ") and max_format (" + this.max.get() + ")"
               );
            }

            if (var2) {
               if (!this.format.isPresent()) {
                  return DataResult.error(
                     () -> var4
                        + " declares support for formats up to "
                        + var1
                        + ", but game versions supporting formats 17 to "
                        + var1
                        + " require a pack_format field. Add \"pack_format\": "
                        + i
                        + " or require a version greater or equal to "
                        + (var1 + 1)
                        + ".0."
                  );
               }

               String s = this.N(i, j);
               if (s != null) {
                  return DataResult.error(() -> s);
               }
            }
         }

         return DataResult.success(new class04548<>(this.min.get(), this.max.get()));
      }
   }

   public Optional<class08735> y() {
      return this.min;
   }

   private DataResult<class04548<class08735>> N(int var1, boolean var2, String var3, String var4) {
      class04548 class04548 = this.supported.get();
      int i = (Integer)class04548.N();
      int j = (Integer)class04548.y();
      if (j > var1) {
         return DataResult.error(
            () -> var3 + " declares support for version newer than " + var1 + ", but is missing mandatory fields min_format and max_format"
         );
      } else {
         if (var2) {
            if (!this.format.isPresent()) {
               return DataResult.error(
                  () -> var3
                     + " declares support for formats up to "
                     + var1
                     + ", but game versions supporting formats 17 to "
                     + var1
                     + " require a pack_format field. Add \"pack_format\": "
                     + i
                     + " or require a version greater or equal to "
                     + (var1 + 1)
                     + ".0."
               );
            }

            String s = this.N(i, j);
            if (s != null) {
               return DataResult.error(() -> s);
            }
         }

         return DataResult.success(new class04548<>(i, j).N(class08735::N));
      }
   }

   @Nullable
   private String N(int var1, int var2) {
      int i = this.format.get();
      if (i < var1 || i > var2) {
         return "Pack declared support for versions " + var1 + " to " + var2 + " but declared main format is " + i;
      } else {
         return i < 15
            ? "Multi-version packs cannot support minimum version of less than 15, since this will leave versions in range unable to load pack."
            : null;
      }
   }

   public int N() {
      if (this.min.isPresent()) {
         return this.supported.isPresent() ? Math.min(this.min.get().y(), this.supported.get().N()) : this.min.get().y();
      } else {
         return this.supported.isPresent() ? this.supported.get().N() : Integer.MAX_VALUE;
      }
   }

   public DataResult<class04548<class08735>> N(int var1, boolean var2, boolean var3, String var4, String var5) {
      if (this.min.isPresent() != this.max.isPresent()) {
         return DataResult.error(() -> var4 + " missing field, must declare both min_format and max_format");
      } else if (var3 && this.supported.isEmpty()) {
         return DataResult.error(
            () -> var4 + " missing required field " + var5 + ", must be present in all overlays for any overlays to work across game versions"
         );
      } else if (this.min.isPresent()) {
         return this.y(var1, var2, var3, var4, var5);
      } else if (this.supported.isPresent()) {
         return this.N(var1, var2, var4, var5);
      } else if (var2 && this.format.isPresent()) {
         int i = this.format.get();
         return i > var1
            ? DataResult.error(() -> var4 + " declares support for version newer than " + var1 + ", but is missing mandatory fields min_format and max_format")
            : DataResult.success(new class04548<>(class08735.N(i)));
      } else {
         return DataResult.error(() -> var4 + " could not be parsed, missing format version information");
      }
   }

   public static class08780 N(class04548<class08735> var0, int var1) {
      class04548 class04548 = var0.N(class08735::y);
      return new class08780(
         Optional.of((class08735)var0.N()),
         Optional.of((class08735)var0.y()),
         class04548.N(var1) ? Optional.of((Integer)class04548.N()) : Optional.empty(),
         class04548.N(var1) ? Optional.of(new class04548<>((Integer)class04548.N(), (Integer)class04548.y())) : Optional.empty()
      );
   }
}
